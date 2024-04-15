CREATE DATABASE directores;
USE directores;

CREATE TABLE directores (
	DNI VARCHAR(8) NOT NULL,
	nomApels VARCHAR(255) NOT NULL,
	DNIJefe VARCHAR(8),
	despacho INT,
	PRIMARY KEY (DNI),
	KEY (DNIJefe),
	KEY (despacho),
	FOREIGN KEY (DNIJefe)
	REFERENCES directores(DNI),
	FOREIGN KEY (despacho)
	REFERENCES despachos(numero));
	
CREATE TABLE despachos (
	numero INT,
	capacidad INT,
	PRIMARY KEY (numero));