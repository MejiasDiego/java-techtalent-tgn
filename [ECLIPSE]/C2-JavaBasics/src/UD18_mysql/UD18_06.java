package UD18_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import UD18_mysql.conexionDiego;

public class UD18_06 {

    public static void main(String[] args) {
        conexionDiego c = new conexionDiego();
        String db = "`piezasProveedores`"; // Manteniendo el nombre de la base de datos
        String tabla1 = "piezas", tabla2 = "proveedores", tabla3 = "suministra"; // Cambio de nombres de tablas
        String atributos1 = "(" + "  `codigo` int NOT NULL,"
                + "  `nombre` varchar(100)," + "  PRIMARY KEY (`codigo`)" + ")";
        String atributos2 = "(" + "  `id` char(4),"
                + "  `nombre` varchar(100)," + "  PRIMARY KEY (`id`)" + ")";
        String atributos3 = "(" + "  `codigoPieza` int NOT NULL,"
                + "  `precio` int," + "  `idProveedor` char(4) NOT NULL,"
                + "  PRIMARY KEY (`codigoPieza`, `idProveedor`),"
                + "  KEY `FK_suministra_piezas` (`codigoPieza`),"
                + "  KEY `FK_suministra_proveedores` (`idProveedor`),"
                + "  CONSTRAINT `FK_suministra_piezas`"
                + " FOREIGN KEY (`codigoPieza`) REFERENCES `piezas` (`codigo`)"
                + " ON DELETE CASCADE ON UPDATE CASCADE,"
                + "  CONSTRAINT `FK_suministra_proveedores`"
                + " FOREIGN KEY (`idProveedor`) REFERENCES `proveedores` (`id`)"
                + " ON DELETE CASCADE ON UPDATE CASCADE"
                + ")";
        String values1 = "(`codigo`, `nombre`) VALUES"
                + "(1,'martillo'),(2,'canicas'),(3,'peonza'),(4,'dragon quest iv'),"
                + "(5,'smash bros 3ds'),(6,'el archivo de las tormentas'),"
                + "(7,'saitama'),(8,'coulant'),(9,'trenecito'),(10,'conductor')";
        String values2 = "(`id`) VALUES"
                + "('A'),('X'),('C'),('G'),('N'),('B'),('V'),('U'),('J'),('Z')";
        String values3 = "(`codigoPieza`, `precio`, `idProveedor`) VALUES"
                + "(1,11,'A'),(2,22,'B'),(3,33,'C'),(4,44,'G'),(5,55,'N'),"
                + "(6,66,'B'),(7,77,'V'),(8,88,'U'),(9,99,'J'),(10,100,'Z')";

        c.createDB("piezasYproveedoresEclipse"); // Llamada a la nueva base de datos

        c.createTable("piezasYproveedoresEclipse", tabla1, atributos1);
        c.insertData("piezasYproveedoresEclipse", tabla1, values1);

        c.createTable("piezasYproveedoresEclipse", tabla2, atributos2);
        c.insertData("piezasYproveedoresEclipse", tabla2, values2);

        c.createTable("piezasYproveedoresEclipse", tabla3, atributos3);
        c.insertData("piezasYproveedoresEclipse", tabla3, values3);

        c.closeConnection();
    }
}
