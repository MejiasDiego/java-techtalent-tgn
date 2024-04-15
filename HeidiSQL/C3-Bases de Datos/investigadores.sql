CREATE DATABASE investigadores;
USE investigadores;

CREATE TABLE facultad (
    codigo INT NOT NULL,
    nombre VARCHAR(100),
    PRIMARY KEY (codigo)
);

CREATE TABLE investigadores (
    DNI VARCHAR(8) NOT NULL,
    nomApels VARCHAR(255),
    facultad INT,
    PRIMARY KEY (DNI),
    KEY (facultad),
    FOREIGN KEY (facultad) REFERENCES facultad(codigo)
);

CREATE TABLE equipos (
    numSerie CHAR(4) NOT NULL,
    nombre VARCHAR(100),
    facultad INT,
    PRIMARY KEY (numSerie),
    KEY (facultad),
    FOREIGN KEY (facultad) REFERENCES facultad(codigo));

CREATE TABLE reserva (
    DNI VARCHAR(8),
    numSerie CHAR(4),
    comienzo DATETIME,
    fin DATETIME,
    PRIMARY KEY (DNI, numSerie),
    FOREIGN KEY (DNI) REFERENCES investigadores(DNI),
    FOREIGN KEY (numSerie) REFERENCES equipos(numSerie));

