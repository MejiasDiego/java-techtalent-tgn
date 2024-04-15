DROP DATABASE IF EXISTS cientificos;
CREATE DATABASE cientificos;
USE cientificos;

CREATE TABLE cientificos (
    DNI VARCHAR(8) NOT NULL,
    nomApels VARCHAR(255),
    PRIMARY KEY (DNI)
);

CREATE TABLE proyecto (
    id CHAR(4),
    nombre VARCHAR(255),
    horas INT,
    PRIMARY KEY (id)
);

CREATE TABLE asignado_A (
    cientifico VARCHAR(8),
    proyecto CHAR(4),
    PRIMARY KEY (cientifico, proyecto),
    FOREIGN KEY (cientifico) REFERENCES cientificos(DNI),
    FOREIGN KEY (proyecto) REFERENCES proyecto(id)
);

