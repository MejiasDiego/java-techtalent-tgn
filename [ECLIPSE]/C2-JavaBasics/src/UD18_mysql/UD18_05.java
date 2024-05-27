package UD18_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import UD18_mysql.conexionDiego;

public class UD18_05 {

    public static void main(String[] args) {
        conexionDiego c = new conexionDiego();
        String db = "los directores2"; // Manteniendo el nombre de la base de datos
        String tabla1 = "directores", tabla2 = "despachos"; // Cambio de nombres de tablas
        String atributos1 = "(" + "  `DNI` varchar(8) NOT NULL,"
                + "  `nomApels` varchar(255) NOT NULL," + "  `DNIJefe` varchar(8),"
                + "  `despacho` int," + "  PRIMARY KEY (`DNI`),"
                + "  KEY `FK_directores_directores` (`DNIJefe`),"
                + "  KEY `FK_directores_despachos` (`despacho`),"
                + "  CONSTRAINT `FK_directores_directores` "
                + "FOREIGN KEY (`DNIJefe`) REFERENCES `directores` (`DNI`) "
                + "ON DELETE CASCADE ON UPDATE CASCADE,"
                + "  CONSTRAINT `FK_directores_despachos` "
                + "FOREIGN KEY (`despacho`) REFERENCES `despachos` (`numero`)"
                + " ON DELETE CASCADE ON UPDATE CASCADE"
                + ")";
        String atributos2 = "(" + "  `numero` int NOT NULL,"
                + "  `capacidad` int," + "  PRIMARY KEY (`numero`)" + ") ";
        String values2 = "(`numero`, `capacidad`) VALUES" + "(101, 4)," + 
                "(102, 6)," + "(103, 8)," + "(104, 10),"
                + "(105, 5)," + "(106, 7)," + "(107, 9)," + "(108, 3);";
        String values1 = "(`DNI`, `nomApels`, `DNIJefe`, `despacho`) VALUES"
                + "('45678901', 'Juan Martínez', '23456789', 104),"
                + "('56789012', 'Laura Fernández', '23456789', 105),"
                + "('67890123', 'Carlos Gómez', '34567890', 106),"
                + "('78901234', 'Sofía López', '34567890', 107),"
                + "('89012345', 'Pedro Díaz', '45678901', 108);";

        c.createDB("directoresEclipse"); // Llamada a la nueva base de datos

        c.createTable("directoresEclipse", tabla2, atributos2);
        c.insertData("directoresEclipse", tabla2, values2);

        c.createTable("directoresEclipse", tabla1, atributos1);
        c.insertData("directoresEclipse", tabla1, values1);

        c.closeConnection();
    }
}
