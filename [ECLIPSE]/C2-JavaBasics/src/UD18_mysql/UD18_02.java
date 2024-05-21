package UD18_mysql;

public class UD18_02 {
    public static void main(String[] args) {
    	conexionDiego c = new conexionDiego();
        String db = "empleados2eclipse";
        String tabla1 = "departamentos", tabla2 = "empleados";
        
        String atributos1 = "(" + 
            "  `codigo` INT(10) NOT NULL," + 
            "  `nombre` VARCHAR(100) DEFAULT NULL," + 
            "  `presupuesto` INT," + 
            "  PRIMARY KEY (`codigo`)" + 
            ")";
        
        String atributos2 = "(" + 
            "  `DNI` VARCHAR(8)," + 
            "  `nombre` VARCHAR(100)," + 
            "  `Apellidos` VARCHAR(255)," + 
            "  `departamento` INT DEFAULT NULL," + 
            "  PRIMARY KEY (`DNI`)," + 
            "  KEY (`departamento`)," + 
            "  FOREIGN KEY (`departamento`) REFERENCES `departamentos`(`codigo`)" + 
            ")";
        
        String values1 = "(`codigo`, `nombre`, `presupuesto`) VALUES" + 
            "(1, 'Recursos Humanos', 100000)," + 
            "(2, 'Desarrollo de Software', 250000)," + 
            "(3, 'Ventas', 200000)," + 
            "(4, 'Marketing', 150000)," + 
            "(5, 'Contabilidad', 180000)," + 
            "(6, 'Soporte Técnico', 120000)," + 
            "(7, 'Calidad', 130000)," + 
            "(8, 'Administración', 170000)," + 
            "(9, 'Ingeniería', 220000)," + 
            "(10, 'Logística', 190000)";
        
        String values2 = "(`DNI`, `nombre`, `Apellidos`, `departamento`) VALUES" + 
            "('12345678', 'Juan', 'González', 1)," + 
            "('23456789', 'María', 'López', 2)," + 
            "('34567890', 'Carlos', 'Martínez', 3)," + 
            "('45678901', 'Laura', 'Sánchez', 4)," + 
            "('56789012', 'Pedro', 'Rodríguez', 5)," + 
            "('67890123', 'Ana', 'García', 6)," + 
            "('78901234', 'David', 'Fernández', 7)";
        
        c.createDB(db);
        c.createTable(db, tabla1, atributos1);
        c.insertData(db, tabla1, values1);
        
        c.createTable(db, tabla2, atributos2);
        c.insertData(db, tabla2, values2);
        
        c.closeConnection();
    }
}
