package Controlador;

import BD.Conexion;
import java.sql.*;
import Modelo.Vehiculo;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Registro {

    public boolean agregar(Vehiculo vehiculo) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String SQL_INSERT = "INSERT INTO vehiculo values(?, ?, ?, ?, ?, ?, ?)";
        String SQL_SELECT = "SELECT patente from vehiculo";
        boolean existe = false, estado = false;
        conn = Conexion.getConnection();
        try {
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString(1).equalsIgnoreCase(vehiculo.getPatente())) {
                    existe = true;
                    estado = false;
                }
            }
            if (existe == false) {
                ps = conn.prepareStatement(SQL_INSERT);
                ps.setString(1, vehiculo.getPatente());
                ps.setString(2, vehiculo.getMarca());
                ps.setString(3, vehiculo.getModelo());
                ps.setInt(4, vehiculo.getAnno());
                ps.setString(5, vehiculo.getNumero_motor());
                ps.setString(6, vehiculo.getNumero_chasis());
                ps.setInt(7, vehiculo.getEstado());
                ps.executeUpdate();
                estado = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return estado;
    }

    public static boolean eliminar(String patente) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String SQL_DELETE = "DELETE FROM vehiculo WHERE patente=? LIMIT 1";
        String SQL_SELECT = "SELECT patente from vehiculo";
        boolean existe = false, estado = false;

        conn = Conexion.getConnection();
        try {
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString(1).equalsIgnoreCase(patente)) {
                    existe = true;
                }
            }
            if (existe) {
                ps = conn.prepareStatement(SQL_DELETE);
                ps.setString(1, patente);
                ps.executeUpdate();
                estado = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return estado;
    }

    public boolean modificar(Vehiculo vehiculo) {
        boolean r = false;
        Connection conn = null;
        PreparedStatement ps = null;
        String SQL_UPDATE = "UPDATE vehiculo SET patente=?, marca=?, modelo=?, anno=?, numero_motor=?, numero_chasis=?, estado=? WHERE patente='" + vehiculo.getPatente() + "'";
        try {
            conn = Conexion.getConnection();
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, vehiculo.getPatente());
            ps.setString(2, vehiculo.getMarca());
            ps.setString(3, vehiculo.getModelo());
            ps.setInt(4, vehiculo.getAnno());
            ps.setString(5, vehiculo.getNumero_motor());
            ps.setString(6, vehiculo.getNumero_chasis());
            ps.setInt(7, vehiculo.getEstado());
            ps.executeUpdate();
            conn.commit();
            r = true;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return r;
    }

    public static Vector buscarPorPatente(String patente) {
        Vector resultado = new Vector();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String SELECT = "SELECT patente, marca, modelo, anno, numero_motor, numero_chasis, estado FROM vehiculo where patente='" + patente + "'";

        conn = Conexion.getConnection();
        try {
            ps = conn.prepareStatement(SELECT);
            rs = ps.executeQuery();
            if (!rs.next()) {
            } else {
                resultado.add(rs.getString(1));
                resultado.add(rs.getString(2));
                resultado.add(rs.getString(3));
                resultado.add(rs.getInt(4));
                resultado.add(rs.getString(5));
                resultado.add(rs.getString(6));
                if (rs.getInt(7) == 1) {
                    resultado.add("Nuevo");
                } else {
                    resultado.add("Usado");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return resultado;
    }

    public static ArrayList buscarTodos() {
        ArrayList registros = new ArrayList();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String SELECT = "SELECT patente, marca, modelo, anno, numero_motor, numero_chasis, estado FROM vehiculo";
        conn = Conexion.getConnection();
        try {
            ps = conn.prepareStatement(SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                Vector resultado = new Vector();
                resultado.add(rs.getString(1));
                resultado.add(rs.getString(2));
                resultado.add(rs.getString(3));
                resultado.add(rs.getInt(4));
                resultado.add(rs.getString(5));
                resultado.add(rs.getString(6));
                if (rs.getInt(7) == 1) {
                    resultado.add("Nuevo");
                } else {
                    resultado.add("Usado");
                }
                registros.add(resultado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registros;
    }
}
