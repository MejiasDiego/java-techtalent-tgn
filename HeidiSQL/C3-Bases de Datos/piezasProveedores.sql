CREATE DATABASE piezasProveedores;
USE piezasProveedores;

CREATE TABLE piezas (
	codigo INT NOT NULL,
	nombre VARCHAR(100),
	PRIMARY KEY (codigo));
	
CREATE TABLE suministra (
	codigoPieza INT,
	idProveedor CHAR(4),
	precio INT,
	PRIMARY KEY (codigoPieza,idProveedor),
	KEY (codigoPieza),
	KEY (idProveedor),
	FOREIGN KEY (codigoPieza) 
	REFERENCES piezas(codigo),
	FOREIGN KEY (idProveedor)
	REFERENCES proveedores(id));
	
CREATE TABLE proveedores (
	id CHAR(4),
	nombre VARCHAR(100),
	PRIMARY KEY (id));