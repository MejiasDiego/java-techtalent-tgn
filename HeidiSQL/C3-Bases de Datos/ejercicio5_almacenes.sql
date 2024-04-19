CREATE DATABASE almacenes;
USE almacenes;

CREATE TABLE almacenes (
	codigo INT(10) NOT NULL,
	lugar VARCHAR(100) DEFAULT NULL,
	capacidad INT,
	PRIMARY KEY (codigo));
	
CREATE TABLE cajas (
	numReferencia CHAR(5) NOT NULL,
	contenido VARCHAR(100) DEFAULT NULL,
	valor INT DEFAULT NULL,
	almacen INT DEFAULT NULL,
	PRIMARY KEY (codigo),
	KEY (almacen),
	FOREIGN KEY (almacen)
	REFERENCES almacenes(codigo));