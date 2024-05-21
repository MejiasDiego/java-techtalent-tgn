package UD18_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import UD18_mysql.conexionDiego;

public class UD18_08 {

    public static void main(String[] args) {
        conexionDiego c = new conexionDiego();
        String db = "`grandesAlmacenes`"; // Manteniendo el nombre de la base de datos
        String tabla1 = "productos", tabla2 = "cajeros", tabla3 = "maquinasRegistradoras", tabla4 = "venta"; // Cambio de nombres de tablas
        String atributos1 = "(" + "  `codigo` int NOT NULL,"
                + "  `nombre` varchar(100)," + "  `precio` int," + "  PRIMARY KEY (`codigo`)" + ")";
        String atributos2 = "(" + "  `codigo` int NOT NULL,"
                + "  `nomApels` varchar(255)," + "  PRIMARY KEY (`codigo`)" + ")";
        String atributos3 = "(" + "  `codigo` int NOT NULL,"
                + "  `piso` int," + "  PRIMARY KEY (`codigo`)" + ")";
        String atributos4 = "(" + "  `cajero` int NOT NULL,"
                + "  `maquina` int NOT NULL,"
                + "  `producto` int NOT NULL,"
                + "  PRIMARY KEY (`cajero`, `maquina`, `producto`),"
                + "  CONSTRAINT `FK_venta_cajeros` FOREIGN KEY (`cajero`) REFERENCES `cajeros` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,"
                + "  CONSTRAINT `FK_venta_maquinasRegistradoras` FOREIGN KEY (`maquina`) REFERENCES `maquinasRegistradoras` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,"
                + "  CONSTRAINT `FK_venta_productos` FOREIGN KEY (`producto`) REFERENCES `productos` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE"
                + ")";
        String values1 = "(`codigo`, `nombre`, `precio`) VALUES"
                + "(1, 'Camiseta', 150),"
                + "(2, 'Pantalón', 200),"
                + "(3, 'Zapatos', 250),"
                + "(4, 'Bufanda', 50),"
                + "(5, 'Gorra', 30),"
                + "(6, 'Calcetines', 20),"
                + "(7, 'Vestido', 300),"
                + "(8, 'Abrigo', 400),"
                + "(9, 'Falda', 180),"
                + "(10, 'Chaqueta', 350)";
        String values2 = "(`codigo`, `nomApels`) VALUES"
                + "(1, 'Juan Pérez'),"
                + "(2, 'María López'),"
                + "(3, 'Carlos Martínez'),"
                + "(4, 'Laura García'),"
                + "(5, 'Pedro Ruiz'),"
                + "(6, 'Ana Fernández'),"
                + "(7, 'David Gómez'),"
                + "(8, 'Elena Rodríguez'),"
                + "(9, 'Miguel Sánchez'),"
                + "(10, 'Sofía Hernández')";
        String values3 = "(`codigo`, `piso`) VALUES"
                + "(1, 1),"
                + "(2, 1),"
                + "(3, 2),"
                + "(4, 2),"
                + "(5, 3),"
                + "(6, 3),"
                + "(7, 4),"
                + "(8, 4),"
                + "(9, 5),"
                + "(10, 5)";
        String values4 = "(`cajero`, `maquina`, `producto`) VALUES"
                + "(1, 1, 1),"
                + "(2, 2, 2),"
                + "(3, 3, 3),"
                + "(4, 4, 4),"
                + "(5, 5, 5),"
                + "(6, 6, 6),"
                + "(7, 7, 7),"
                + "(8, 8, 8),"
                + "(9, 9, 9),"
                + "(10, 10, 10)";

        c.createDB("grandesAlmacenesEclipse"); // Llamada a la nueva base de datos

        c.createTable("grandesAlmacenesEclipse", tabla1, atributos1);
        c.insertData("grandesAlmacenesEclipse", tabla1, values1);

        c.createTable("grandesAlmacenesEclipse", tabla2, atributos2);
        c.insertData("grandesAlmacenesEclipse", tabla2, values2);

        c.createTable("grandesAlmacenesEclipse", tabla3, atributos3);
        c.insertData("grandesAlmacenesEclipse", tabla3, values3);

        c.createTable("grandesAlmacenesEclipse", tabla4, atributos4);
        c.insertData("grandesAlmacenesEclipse", tabla4, values4);

        c.closeConnection();
    }
}
