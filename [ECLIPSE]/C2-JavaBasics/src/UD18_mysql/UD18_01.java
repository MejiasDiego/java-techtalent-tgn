package UD18_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import UD18_mysql.conexionDiego;

public class UD18_01 {

	public static void main(String[] args) {
		 conexionDiego c = new conexionDiego();
	        String db = "`tienda de informatica 2`";
	        String tabla1 = "articulos", tabla2 = "fabricantes";
	        String atributos1 = "(" + "  `codigo` int(10) NOT NULL AUTO_INCREMENT,"
	                + "  `nombre` varchar(100) DEFAULT NULL," + "  `precio` int DEFAULT NULL,"
	                + "  `fabricante` int DEFAULT NULL," + "  PRIMARY KEY (`codigo`),"
	                + "  KEY (`fabricante`),"
	                + "  FOREIGN KEY (`fabricante`) REFERENCES `fabricantes` (`codigo`)"
	                + ")";
	        String atributos2 = "(" + "  `codigo` int(10) NOT NULL AUTO_INCREMENT,"
	                + "  `nombre` varchar(100) DEFAULT NULL," + "  PRIMARY KEY (`codigo`)" + ") ";
	        String values2 = "(`codigo`, `nombre`) VALUES" + 
	                " (1, 'Apple')," + 
	                " (2, 'Samsung')," + 
	                " (3, 'Microsoft')," + 
	                " (4, 'Lenovo')," + 
	                " (5, 'HP')," + 
	                " (6, 'Dell')," + 
	                " (7, 'Asus')," + 
	                " (8, 'Acer')," + 
	                " (9, 'Sony')," + 
	                " (10, 'Toshiba');";
	        String values1 = "(`codigo`, `nombre`, `precio`, `fabricante`) VALUES" + 
	                " (1, 'MacBook Pro', 2000, 1)," + 
	                " (2, 'iPhone 13 Pro', 1000, 1)," + 
	                " (3, 'Galaxy S21 Ultra', 1200, 2)," + 
	                " (4, 'Surface Laptop 4', 1500, 3)," + 
	                " (5, 'ThinkPad X1 Carbon', 1800, 4)," + 
	                " (6, 'Spectre x360', 1300, 5)," + 
	                " (7, 'XPS 15', 1600, 6)," + 
	                " (8, 'ROG Zephyrus G14', 1400, 7)," + 
	                " (9, 'Swift 5', 1100, 8)," + 
	                " (10, 'PlayStation 5', 500, 9);";

	        c.createDB(db);

	        c.createTable(db, tabla2, atributos2);
	        c.insertData(db, tabla2, values2);

	        c.createTable(db, tabla1, atributos1);
	        c.insertData(db, tabla1, values1);

	        c.closeConnection();
	    }
	}
