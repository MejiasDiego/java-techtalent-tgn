package UD18_mysql;

public class UD18_04 {
    public static void main(String[] args) {
        conexionDiego c = new conexionDiego();
        String db = "peliculasYsalasEclipse";
        String tabla1 = "salas", tabla2 = "peliculas";
        
        String atributos2 = "(" + 
            "  `codigo` INT(10) NOT NULL," + 
            "  `nombre` VARCHAR(100)," + 
            "  `calificacionedad` INT," + 
            "  PRIMARY KEY (`codigo`)" + 
            ")";
        
        String atributos1 = "(" + 
            "  `codigo` INT(10) AUTO_INCREMENT NOT NULL," + 
            "  `nombre` VARCHAR(100) DEFAULT NULL," + 
            "  `pelicula` INT," + 
            "  PRIMARY KEY (`codigo`)," + 
            "  KEY (`pelicula`)," + 
            "  FOREIGN KEY (`pelicula`) REFERENCES `peliculas`(`codigo`)" + 
            ")";
        
        String values2 = "(`codigo`, `nombre`, `calificacionedad`) VALUES" + 
            "(1, 'El Padrino', 18)," + 
            "(2, 'Titanic', 12)," + 
            "(3, 'El Señor de los Anillos: La Comunidad del Anillo', 12)," + 
            "(4, 'Matrix', 14)," + 
            "(5, 'Forrest Gump', 12)," + 
            "(6, 'La Lista de Schindler', 16)," + 
            "(7, 'El Rey León', 0)," + 
            "(8, 'Avatar', 12)," + 
            "(9, 'La La Land', 12)," + 
            "(10, 'Pulp Fiction', 18)";
        
        String values1 = "(`nombre`, `pelicula`) VALUES" + 
            "('Sala 1', 1)," + 
            "('Sala 2', 2)," + 
            "('Sala 3', 3)," + 
            "('Sala 4', 4)," + 
            "('Sala 5', 5)," + 
            "('Sala 6', 6)," + 
            "('Sala 7', 7)," + 
            "('Sala 8', 8)," + 
            "('Sala 9', 9)," + 
            "('Sala 10', 10)";
        
        c.createDB(db);
        c.createTable(db, tabla2, atributos2);
        c.insertData(db, tabla2, values2);
        
        c.createTable(db, tabla1, atributos1);
        c.insertData(db, tabla1, values1);
        
        c.closeConnection();
    }
}
