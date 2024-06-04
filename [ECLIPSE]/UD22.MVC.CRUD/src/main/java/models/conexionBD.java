package models;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class conexionBD {


	Connection conexion = null;
	String usuario = "root";
    String pass = "";
	String bd ="clientesCrud";
	String ip = "localhost";
	String puerto = "3306";
	
	String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
	
	 public Connection estableceConexion() {
		 
		 try {
			 
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 conexion = DriverManager.getConnection(cadena, usuario, pass);

			 JOptionPane.showMessageDialog(null,"La conexión a la base de datos se ha realizado con éxito.");

			 
			 
		 } catch (Exception e) {
			 JOptionPane.showMessageDialog(null,"Error al conectarse con la base de datos, error: " + e.toString());
		 }
		 return conexion;

	 }	
	}


