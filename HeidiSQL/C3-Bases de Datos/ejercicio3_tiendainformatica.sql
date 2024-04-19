CREATE DATABASE tiendainformatica;
USE tiendainformatica;

CREATE TABLE fabricantes (
	codigo INT(10) NOT NULL,
	nombre VARCHAR(100) DEFAULT NULL,
	PRIMARY KEY (codigo));
	
CREATE TABLE articulos (
	codigo INT(10) NOT NULL,
	nombre VARCHAR(100) DEFAULT NULL,
	precio INT DEFAULT NULL,
	fabricante INT DEFAULT NULL,
	PRIMARY KEY (codigo),
	KEY (fabricante),
	FOREIGN KEY (fabricante)
	REFERENCES fabricantes(codigo));