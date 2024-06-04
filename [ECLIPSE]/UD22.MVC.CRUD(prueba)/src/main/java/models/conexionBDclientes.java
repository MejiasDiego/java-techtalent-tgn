/*package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class conexionBDclientes {

    private Connection conexion;
    private String query;
    private Statement st;

    public conexionBDclientes() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientesCrud", "root", "");
            this.query = "";
            System.out.println("Server conectado ");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.print("No se ha podido conectar con mi base de datos");
            System.out.println(e);
        }
    }

    public ArrayList<String> getClientes() {
        ArrayList<String> clientes = new ArrayList<>();
        try {
            useDB("clientesCrud");
            query = "SELECT * FROM cliente";
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String cliente = "ID: " + rs.getInt("id") + ", Nombre: " + rs.getString("nombre") + ", Apellido: " + rs.getString("apellido") + ", Dirección: " + rs.getString("direccion") + ", DNI: " + rs.getInt("dni") + ", Fecha: " + rs.getDate("fecha");
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("Error obteniendo los clientes de la base de datos.");
        }
        return clientes;
    }}
    
    */
