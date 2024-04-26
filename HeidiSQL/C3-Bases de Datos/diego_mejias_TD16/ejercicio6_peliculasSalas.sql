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

