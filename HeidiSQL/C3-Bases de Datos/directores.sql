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
	PRIMARY KEY (numero));despachos

INSERT INTO `despachos` (`numero`, `capacidad`) VALUES ('6', '33');
INSERT INTO `directores` (`DNI`, `nomApels`, `DNIJefe`, `despacho`) VALUES ('12345678', 'Diego Mejías', NULL, '6');
INSERT INTO despachos (capacidad) VALUES 
    (3),(5),(8),(16),(4),(7),(9),(3),(11),(33);

INSERT INTO directores (DNI, nomApels) VALUES 
    (12345078,'Àlex Gil'),(10042678,'Pepito Gil'),(12342768,'Marc Gil'),(11242678,'Carlos Gil'),(12342658,'Manel Gil'),(12353478,'José Gil'),(39393938,'Messi Gil'),(12542678,'Mario Gil'),(12342678,'Pepito Gil'),(12342688,'Pepe Gil');