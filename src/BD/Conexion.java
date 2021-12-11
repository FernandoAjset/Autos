package BD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    static Connection conn = null;
//cambie los valores de los corchetes por los necesarios para la conexion a su BD ejemplo de cadena "jdbc:mysql://localhost:3306/automotora"
//el ejemplo anterior supone que la BD esta en el localhost, con puerto 3306 y el nombre de la base de datos es "automotora"
    
    private static final String JDBC_URL = "jdbc:mysql://[direccion]:[puerto]/[nombreBD]";

//Ingrese un usuario para conectar a MySql ejemplo= root 
    private static final String USER = "";

//Ingrese la contraseña del usuario de mySql
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return conn;
    }

    public static void close(Connection conn) throws SQLException {
        conn.close();
    }
}
