CREATE DATABASE bibliotecaCuidatge;
USE bibliotecaCuidatge;

-- Tabla para almacenar la información de los libros
CREATE TABLE Libros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255),
    revista VARCHAR(255),
    issn VARCHAR(20),
    volumen_descripcion VARCHAR(255),
    disponibilidad VARCHAR(255),
    resumen TEXT,
    numero_registro INT
);

-- Insertar el libro en la tabla Libros
INSERT INTO Libros (titulo, autor, revista, issn, volumen_descripcion, disponibilidad, resumen, numero_registro)
VALUES ('Motivación de las personas con diabetes mellitus tipo 2 en la realización de una dieta saludable',
        'González Méndez X, Papín Cano C, Martín Payo R',
        'RIDEC',
        '1988-5474',
        'Vol. 11 - Núm. 1, Juny-Novembre 2018',
        'Disponible en línea',
        'L''objectiu de l''article és descriure el tipus de motivació i les necessitats psicològiques bàsiques per seguir les recomanacions d''una dieta saludable en una mostra de malalts amb diabetis tipus II. Es conclou que les persones que pateixen aquesta malaltia podrien dur a terme canvis de conducta que els permetessin seguir una dieta saludable si les intervencions educatives s''adaptessin a la seva motivació i necessitats.',
        12457);
