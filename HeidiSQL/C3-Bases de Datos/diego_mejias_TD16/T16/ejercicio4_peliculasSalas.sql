CREATE DATABASE peliculasSalas;
USE peliculasSalas;

CREATE TABLE salas (
	codigo INT(10) AUTO_INCREMENT NOT NULL,
	nombre VARCHAR(100) DEFAULT NULL,
	pelicula INT,
	PRIMARY KEY (codigo),
	KEY (pelicula),
	FOREIGN KEY (pelicula)
	REFERENCES peliculas(codigo));
	
CREATE TABLE peliculas (
	codigo INT(10) NOT NULL,
	nombre VARCHAR(100),
	calificacionEdad INT,
	PRIMARY KEY (codigo));

-- Insertar datos en la tabla peliculas
INSERT INTO peliculas (codigo, nombre, calificaciondad) VALUES
(1, 'El Padrino', 18),
(2, 'Titanic', 12),
(3, 'El Señor de los Anillos: La Comunidad del Anillo', 12),
(4, 'Matrix', 14),
(5, 'Forrest Gump', 12),
(6, 'La Lista de Schindler', 16),
(7, 'El Rey León', 0),
(8, 'Avatar', 12),
(9, 'La La Land', 12),
(10, 'Pulp Fiction', 18);

-- Insertar datos en la tabla salas
INSERT INTO salas (nombre, pelicula) VALUES
('Sala 1', 1),
('Sala 2', 2),
('Sala 3', 3),
('Sala 4', 4),
('Sala 5', 5),
('Sala 6', 6),
('Sala 7', 7),
('Sala 8', 8),
('Sala 9', 9),
('Sala 10', 10);

-- 4.1 Mostrar el nombre de todas las películas.
SELECT nombre
FROM peliculas

-- 4.2 Mostrar las distintas calificaciones de edad que existen.
SELECT DISTINCT calificacion_edad
FROM peliculas 

-- 4.3 Mostrar todas las películas que no han sido calificadas (Voy a añadir una película sin calificación para comprobar que funciona)
INSERT INTO peliculas (nombre, calificacion_edad) 
VALUES ('Interstellar', NULL);

SELECT *
FROM peliculas
WHERE calificacion_edad IS NULL 

-- 4.4 Mostrar todas las salas que no proyectan ninguna película (Voy a añadir una sala que no proyecte ninguna película para comprobar que funciona).
INSERT INTO salas (nombre, pelicula) 
VALUES ('Sala 11', NULL);

SELECT *
FROM salas
WHERE pelicula IS NULL

-- 4.5 Mostrar la información de todas las salas y, si se proyecta alguna película en la sala, mostrar también la información de la película.

-- 4.6 Mostrar la información de todas las películas y, si se proyecta en alguna sala, mostrar también la información de la sala.

-- 4.7 Mostrar los nombres de las películas que no se proyectan en ninguna sala.

-- 4.8 Añadir una nueva película ‘Uno, Dos, Tres’, para mayores de 7 años.
INSERT INTO peliculas (nombre, calificacion_edad)
VALUES ('Uno, Dos, Tres', 7)

-- 4.9 Hacer constar que todas las películas no calificadas han sido calificadas ‘no recomendables para menores de 13 años’.

-- 4.10 Eliminar todas las salas que proyectan películas recomendadas para todos los públicos.
