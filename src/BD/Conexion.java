package BD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    static Connection conn = null;
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/automotora?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

//Ingrese un usuario para conectar a MySql ejemplo= root 
    private static final String USER = "";

//Ingrese la contraseña del usuario de mySql
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return conn;
    }
}
