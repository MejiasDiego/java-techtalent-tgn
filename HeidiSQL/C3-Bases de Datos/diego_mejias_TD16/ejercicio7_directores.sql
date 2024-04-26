CREATE DATABASE directores;
USE directores;

CREATE TABLE despachos (
    numero INT,
    capacidad INT,
    PRIMARY KEY (numero)
);

CREATE TABLE directores (
    DNI VARCHAR(8) NOT NULL,
    nomApels VARCHAR(255) NOT NULL,
    DNIJefe VARCHAR(8),
    despacho INT,
    PRIMARY KEY (DNI),
    KEY (DNIJefe),
    KEY (despacho),
    FOREIGN KEY (DNIJefe) REFERENCES directores(DNI),
    FOREIGN KEY (despacho) REFERENCES despachos(numero)
);

INSERT INTO despachos (numero, capacidad) VALUES 
    (6, 33), (3, 3), (5, 5), (8, 8), (16, 16), 
    (4, 4), (7, 7), (9, 9), (11, 11), (33, 33);

INSERT INTO directores (DNI, nomApels, despacho) VALUES 
    ('12345678', 'Diego Mejías', 6), 
    ('12345078', 'Àlex Gil', 3),
    ('10042678', 'Pepito Gil', 5),
    ('12342768', 'Marc Gil', 8),
    ('11242678', 'Carlos Gil', 16),
    ('12342658', 'Manel Gil', 4),
    ('12353478', 'José Gil', 7),
    ('39393938', 'Messi Gil', 9),
    ('12542678', 'Mario Gil', 11),
    ('12342678', 'Pepito Gil', 33),
    ('12342688', 'Pepe Gil', 33);
