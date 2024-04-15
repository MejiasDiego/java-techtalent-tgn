CREATE DATABASE grandesAlmacenes;
USE grandesAlmacenes;

CREATE TABLE productos (
    codigo INT NOT NULL,
    nombre VARCHAR(100),
    precio INT,
    PRIMARY KEY (codigo));

CREATE TABLE cajeros (
    codigo INT NOT NULL,
    nomApels VARCHAR(255),
    PRIMARY KEY (codigo));
    
CREATE TABLE maquinasRegistradoras (
  	 codigo INT NOT NULL,
    piso INT,
    PRIMARY KEY (codigo));
    
CREATE TABLE venta (
	cajero INT,
	maquina INT,
	producto INT,
    PRIMARY KEY (cajero, maquina,producto),
    FOREIGN KEY (cajero) REFERENCES cajeros(codigo),
    FOREIGN KEY (maquina) REFERENCES maquinasRegistradoras(codigo),
    FOREIGN KEY (producto) REFERENCES productos(codigo));
	

