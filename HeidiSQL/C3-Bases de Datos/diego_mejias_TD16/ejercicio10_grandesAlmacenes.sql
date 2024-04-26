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
	

INSERT INTO productos (codigo, nombre, precio) VALUES 
(1, 'Camiseta', 150),
(2, 'Pantalón', 200),
(3, 'Zapatos', 250),
(4, 'Bufanda', 50),
(5, 'Gorra', 30),
(6, 'Calcetines', 20),
(7, 'Vestido', 300),
(8, 'Abrigo', 400),
(9, 'Falda', 180),
(10, 'Chaqueta', 350);


INSERT INTO cajeros (codigo, nomApels) VALUES 
(1, 'Juan Pérez'),
(2, 'María López'),
(3, 'Carlos Martínez'),
(4, 'Laura García'),
(5, 'Pedro Ruiz'),
(6, 'Ana Fernández'),
(7, 'David Gómez'),
(8, 'Elena Rodríguez'),
(9, 'Miguel Sánchez'),
(10, 'Sofía Hernández');


INSERT INTO maquinasRegistradoras (codigo, piso) VALUES 
(1, 1),
(2, 1),
(3, 2),
(4, 2),
(5, 3),
(6, 3),
(7, 4),
(8, 4),
(9, 5),
(10, 5);

INSERT INTO venta (cajero, maquina, producto) VALUES 
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 4, 4),
(5, 5, 5),
(6, 6, 6),
(7, 7, 7),
(8, 8, 8),
(9, 9, 9),
(10, 10, 10);