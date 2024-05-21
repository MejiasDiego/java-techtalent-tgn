package UD18_mysql;

public class UD18_03 {
    public static void main(String[] args) {
        conexionDiego c = new conexionDiego();
        String db = "almacenes2eclipse";
        String tabla1 = "almacenes", tabla2 = "cajas";
        
        String atributos1 = "(" + 
            "  `codigo` INT(10) NOT NULL," + 
            "  `lugar` VARCHAR(100) DEFAULT NULL," + 
            "  `capacidad` INT," + 
            "  PRIMARY KEY (`codigo`)" + 
            ")";
        
        String atributos2 = "(" + 
            "  `numReferencia` CHAR(5) NOT NULL," + 
            "  `contenido` VARCHAR(100) DEFAULT NULL," + 
            "  `valor` INT DEFAULT NULL," + 
            "  `almacen` INT DEFAULT NULL," + 
            "  PRIMARY KEY (`numReferencia`)," + 
            "  KEY (`almacen`)," + 
            "  FOREIGN KEY (`almacen`) REFERENCES `almacenes`(`codigo`)" + 
            ")";
        
        String values1 = "(`codigo`, `lugar`, `capacidad`) VALUES" + 
            "(1, 'Almacén Central', 200)," + 
            "(2, 'Almacén Norte', 150)," + 
            "(3, 'Almacén Sur', 180)," + 
            "(4, 'Almacén Este', 170)," + 
            "(5, 'Almacén Oeste', 190)," + 
            "(6, 'Almacén Principal', 220)," + 
            "(7, 'Almacén Secundario', 130)," + 
            "(8, 'Almacén de Alimentos', 160)," + 
            "(9, 'Almacén de Electrónicos', 140)," + 
            "(10, 'Almacén de Ropa', 210)";
        
        String values2 = "(`numReferencia`, `contenido`, `valor`, `almacen`) VALUES" + 
            "('001', 'Ropa de invierno', 50, 10)," + 
            "('002', 'Electrodomésticos pequeños', 100, 9)," + 
            "('003', 'Productos alimenticios no perecederos', 80, 8)," + 
            "('004', 'Electrodomésticos grandes', 200, 9)," + 
            "('005', 'Productos perecederos', 70, 8)," + 
            "('006', 'Ropa de verano', 60, 10)," + 
            "('007', 'Electrónicos de consumo', 150, 9)," + 
            "('008', 'Accesorios de moda', 40, 10)," + 
            "('009', 'Juguetes para niños', 30, 7)," + 
            "('010', 'Herramientas de bricolaje', 120, 6)";
        
        c.createDB(db);
        c.createTable(db, tabla1, atributos1);
        c.insertData(db, tabla1, values1);
        
        c.createTable(db, tabla2, atributos2);
        c.insertData(db, tabla2, values2);
        
        c.closeConnection();
    }
}
