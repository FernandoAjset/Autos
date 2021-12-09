package BD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    static Connection conn = null;
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/automotora?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "F0011244";

    public static Connection getConnection() {
        try {
            conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return conn;
    }
}
