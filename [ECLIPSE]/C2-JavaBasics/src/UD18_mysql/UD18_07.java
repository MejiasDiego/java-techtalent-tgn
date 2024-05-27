package UD18_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import UD18_mysql.conexionDiego;

public class UD18_07 {

    public static void main(String[] args) {
        conexionDiego c = new conexionDiego();
        String db = "`cientificos`"; // Manteniendo el nombre de la base de datos
        String tabla1 = "cientificos", tabla2 = "proyecto", tabla3 = "asignado_A"; // Cambio de nombres de tablas
        String atributos1 = "(" + "  `DNI` varchar(8) NOT NULL,"
                + "  `nomApels` varchar(255)," + "  PRIMARY KEY (`DNI`)" + ")";
        String atributos2 = "(" + "  `id` char(4),"
                + "  `nombre` varchar(255)," + "  `horas` int," + "  PRIMARY KEY (`id`)" + ")";
        String atributos3 = "(" + "  `cientifico` varchar(8) NOT NULL,"
                + "  `proyecto` char(4) NOT NULL,"
                + "  PRIMARY KEY (`cientifico`, `proyecto`),"
                + "  CONSTRAINT `FK_asignado_A_cientificos`"
                + " FOREIGN KEY (`cientifico`) REFERENCES `cientificos` (`DNI`)"
                + " ON DELETE CASCADE ON UPDATE CASCADE,"
                + "  CONSTRAINT `FK_asignado_A_proyecto`"
                + " FOREIGN KEY (`proyecto`) REFERENCES `proyecto` (`id`)"
                + " ON DELETE CASCADE ON UPDATE CASCADE"
                + ")";
        String values1 = "(`DNI`, `nomApels`) VALUES"
                + "('12345678', 'Alice Smith'),"
                + "('23456789', 'Bob Johnson'),"
                + "('34567890', 'Charlie Williams'),"
                + "('45678901', 'David Brown'),"
                + "('56789012', 'Eva Garcia'),"
                + "('67890123', 'Frank Martinez'),"
                + "('78901234', 'Grace Lopez'),"
                + "('89012345', 'Henry Rodriguez'),"
                + "('90123456', 'Ivy Perez'),"
                + "('01234567', 'Jackie Gomez')";
        String values2 = "(`id`, `nombre`, `horas`) VALUES"
                + "('P001', 'Proyecto A', 100),"
                + "('P002', 'Proyecto B', 150),"
                + "('P003', 'Proyecto C', 120),"
                + "('P004', 'Proyecto D', 200),"
                + "('P005', 'Proyecto E', 180)";
        String values3 = "(`cientifico`, `proyecto`) VALUES"
                + "('12345678', 'P001'),"
                + "('23456789', 'P002'),"
                + "('34567890', 'P003'),"
                + "('45678901', 'P004'),"
                + "('56789012', 'P005'),"
                + "('67890123', 'P001'),"
                + "('78901234', 'P002'),"
                + "('89012345', 'P003'),"
                + "('90123456', 'P004'),"
                + "('01234567', 'P005')";

        c.createDB("cientificosEclipse"); // Llamada a la nueva base de datos

        c.createTable("cientificosEclipse", tabla1, atributos1);
        c.insertData("cientificosEclipse", tabla1, values1);

        c.createTable("cientificosEclipse", tabla2, atributos2);
        c.insertData("cientificosEclipse", tabla2, values2);

        c.createTable("cientificosEclipse", tabla3, atributos3);
        c.insertData("cientificosEclipse", tabla3, values3);

        c.closeConnection();
    }
}
