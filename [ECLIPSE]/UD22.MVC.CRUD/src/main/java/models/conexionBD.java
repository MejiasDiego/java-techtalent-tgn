package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionBD {
    private String dbName;

    public conexionBD(String dbName) {
        this.dbName = dbName;
    }

    public Connection estableceConexion() {
        try {
            // Supongamos que estás usando MySQL
            String url = "jdbc:mysql://localhost:3306/" + dbName;
            String user = "root"; // Cambia esto según tus credenciales
            String password = "root"; // Cambia esto según tus credenciales
            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.toString());
            return null;
        }
    }
}


