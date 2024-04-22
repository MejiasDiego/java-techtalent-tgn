CREATE DATABASE piezasProveedores;
USE piezasProveedores;

CREATE TABLE piezas (
    codigo INT NOT NULL,
    nombre VARCHAR(100),
    PRIMARY KEY (codigo)
);

CREATE TABLE proveedores (
    id CHAR(4),
    nombre VARCHAR(100),
    PRIMARY KEY (id)
);

CREATE TABLE suministra (
    codigoPieza INT,
    idProveedor CHAR(4),
    precio INT,
    PRIMARY KEY (codigoPieza, idProveedor),
    KEY (codigoPieza),
    KEY (idProveedor),
    FOREIGN KEY (codigoPieza) REFERENCES piezas(codigo),
    FOREIGN KEY (idProveedor) REFERENCES proveedores(id)
);

INSERT INTO piezas (codigo, nombre) VALUES 
    (1,'martillo'),
    (2,'canicas'),
    (3,'peonza'),
    (4,'dragon quest iv'),
    (5,'smash bros 3ds'),
    (6,'el archivo de las tormentas'),
    (7,'saitama'),
    (8,'coulant'),
    (9,'trenecito'),
    (10,'conductor');
    
INSERT INTO proveedores (id) VALUES 
    ('A'),
    ('X'),
    ('C'),
    ('G'),
    ('N'),
    ('B'),
    ('V'),
    ('U'),
    ('J'),
    ('Z');

INSERT INTO suministra (codigoPieza, precio, idProveedor) VALUES 
    (1, 11, 'A'),
    (2, 22, 'B'),
    (3, 33, 'C'),
    (4, 44, 'G'),
    (5, 55, 'N'),
    (6, 66, 'B'),
    (7, 77, 'V'),
    (8, 88, 'U'),
    (9, 99, 'J'),
    (10, 100, 'Z');
