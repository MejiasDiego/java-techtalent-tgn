package UD18_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import UD18_mysql.conexionDiego;

public class UD18_09 {

    public static void main(String[] args) {
        conexionDiego c = new conexionDiego();
        String db = "`investigadores`"; // Manteniendo el nombre de la base de datos
        String tabla1 = "facultad", tabla2 = "investigadores", tabla3 = "equipos", tabla4 = "reserva"; // Cambio de nombres de tablas
        String atributos1 = "(" + "  `codigo` int NOT NULL,"
                + "  `nombre` varchar(100)," + "  PRIMARY KEY (`codigo`)" + ")";
        String atributos2 = "(" + "  `DNI` varchar(8) NOT NULL,"
                + "  `nomApels` varchar(255)," + "  `facultad` int," + "  PRIMARY KEY (`DNI`),"
                + "  KEY `FK_investigadores_facultad` (`facultad`),"
                + "  CONSTRAINT `FK_investigadores_facultad` FOREIGN KEY (`facultad`) REFERENCES `facultad` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE"
                + ")";
        String atributos3 = "(" + "  `numSerie` char(4) NOT NULL,"
                + "  `nombre` varchar(100),"
                + "  `facultad` int,"
                + "  PRIMARY KEY (`numSerie`),"
                + "  KEY `FK_equipos_facultad` (`facultad`),"
                + "  CONSTRAINT `FK_equipos_facultad` FOREIGN KEY (`facultad`) REFERENCES `facultad` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE"
                + ")";
        String atributos4 = "(" + "  `DNI` varchar(8),"
                + "  `numSerie` char(4),"
                + "  `comienzo` DATETIME,"
                + "  `fin` DATETIME,"
                + "  PRIMARY KEY (`DNI`, `numSerie`),"
                + "  CONSTRAINT `FK_reserva_investigadores` FOREIGN KEY (`DNI`) REFERENCES `investigadores` (`DNI`) ON DELETE CASCADE ON UPDATE CASCADE,"
                + "  CONSTRAINT `FK_reserva_equipos` FOREIGN KEY (`numSerie`) REFERENCES `equipos` (`numSerie`) ON DELETE CASCADE ON UPDATE CASCADE"
                + ")";
        String values1 = "(`codigo`, `nombre`) VALUES"
                + "(1, 'Facultad de Ciencias'),"
                + "(2, 'Facultad de Ingeniería'),"
                + "(3, 'Facultad de Medicina'),"
                + "(4, 'Facultad de Humanidades'),"
                + "(5, 'Facultad de Derecho')";
        String values2 = "(`DNI`, `nomApels`, `facultad`) VALUES"
                + "('12345678', 'Juan Pérez', 1),"
                + "('23456789', 'María López', 2),"
                + "('34567890', 'Carlos Martínez', 3),"
                + "('45678901', 'Laura García', 1),"
                + "('56789012', 'Pedro Ruiz', 2),"
                + "('67890123', 'Ana Fernández', 3),"
                + "('78901234', 'David Gómez', 1),"
                + "('89012345', 'Elena Rodríguez', 2),"
                + "('90123456', 'Miguel Sánchez', 3),"
                + "('01234567', 'Sofía Hernández', 1)";
        String values3 = "(`numSerie`, `nombre`, `facultad`) VALUES"
                + "('0001', 'Equipo 1', 1),"
                + "('0002', 'Equipo 2', 2),"
                + "('0003', 'Equipo 3', 3),"
                + "('0004', 'Equipo 4', 1),"
                + "('0005', 'Equipo 5', 2),"
                + "('0006', 'Equipo 6', 3),"
                + "('0007', 'Equipo 7', 1),"
                + "('0008', 'Equipo 8', 2),"
                + "('0009', 'Equipo 9', 3),"
                + "('0010', 'Equipo 10', 1)";
        String values4 = "(`DNI`, `numSerie`, `comienzo`, `fin`) VALUES"
                + "('12345678', '0001', '2024-04-16 10:00:00', '2024-04-16 12:00:00'),"
                + "('23456789', '0002', '2024-04-17 09:00:00', '2024-04-17 11:00:00'),"
                + "('34567890', '0003', '2024-04-18 08:00:00', '2024-04-18 10:00:00'),"
                + "('45678901', '0004', '2024-04-19 07:00:00', '2024-04-19 09:00:00'),"
                + "('56789012', '0005', '2024-04-20 11:00:00', '2024-04-20 13:00:00'),"
                + "('67890123', '0006', '2024-04-21 12:00:00', '2024-04-21 14:00:00'),"
                + "('78901234', '0007', '2024-04-22 13:00:00', '2024-04-22 15:00:00'),"
                + "('89012345', '0008', '2024-04-23 14:00:00', '2024-04-23 16:00:00'),"
                + "('90123456', '0009', '2024-04-24 15:00:00', '2024-04-24 17:00:00'),"
                + "('01234567', '0010', '2024-04-25 16:00:00', '2024-04-25 18:00:00')";

        c.createDB("investigadoresEclipse"); // Llamada a la nueva base de datos

        c.createTable("investigadoresEclipse", tabla1, atributos1);
        c.insertData("investigadoresEclipse", tabla1, values1);

        c.createTable("investigadoresEclipse", tabla2, atributos2);
        c.insertData("investigadoresEclipse", tabla2, values2);
        c.createTable("investigadoresEclipse", tabla3, atributos3);
        c.insertData("investigadoresEclipse", tabla3, values3);

        c.createTable("investigadoresEclipse", tabla4, atributos4);
        c.insertData("investigadoresEclipse", tabla4, values4);

        System.out.println("Base de datos 'investigadoresEclipse' creada correctamente.");
    }
}

