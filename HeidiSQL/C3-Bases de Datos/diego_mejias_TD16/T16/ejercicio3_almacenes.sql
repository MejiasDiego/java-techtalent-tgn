CREATE DATABASE almacenes;
USE almacenes;

CREATE TABLE almacenes (
	codigo INT(10) NOT NULL,
	lugar VARCHAR(100) DEFAULT NULL,
	capacidad INT,
	PRIMARY KEY (codigo));
	
CREATE TABLE cajas (
	numReferencia CHAR(5) NOT NULL,
	contenido VARCHAR(100) DEFAULT NULL,
	valor INT DEFAULT NULL,
	almacen INT DEFAULT NULL,
	PRIMARY KEY (codigo),
	KEY (almacen),
	FOREIGN KEY (almacen)
	REFERENCES almacenes(codigo));
	
	-- Insertar 10 tuplas en la tabla almacenes
INSERT INTO almacenes (codigo, lugar, capacidad) VALUES
(1, 'Almacén Central', 200),
(2, 'Almacén Norte', 150),
(3, 'Almacén Sur', 180),
(4, 'Almacén Este', 170),
(5, 'Almacén Oeste', 190),
(6, 'Almacén Principal', 220),
(7, 'Almacén Secundario', 130),
(8, 'Almacén de Alimentos', 160),
(9, 'Almacén de Electrónicos', 140),
(10, 'Almacén de Ropa', 210);

-- Insertar 10 tuplas en la tabla cajas
INSERT INTO cajas (numReferencia, contenido, valor, almacen) VALUES
('001', 'Ropa de invierno', 50, 10),
('002', 'Electrodomésticos pequeños', 100, 9),
('003', 'Productos alimenticios no perecederos', 80, 8),
('004', 'Electrodomésticos grandes', 200, 9),
('005', 'Productos perecederos', 70, 8),
('006', 'Ropa de verano', 60, 10),
('007', 'Electrónicos de consumo', 150, 9),
('008', 'Accesorios de moda', 40, 10),
('009', 'Juguetes para niños', 30, 7),
('010', 'Herramientas de bricolaje', 120, 6);

-- 3.1 Obtener todos los almacenes
SELECT * 
FROM almacenes

-- 3.2 Obtener todas las cajas cuyo contenido tenga un valor superior a 150€.
SELECT * 
FROM cajas
WHERE valor > 150

-- 3.3 Obtener los tipos de contenidos de las cajas
SELECT DISTINCT contenido
FROM cajas

-- 3.4 Obtener el valor medio de todas las cajas.
SELECT AVG(valor) AS valor_medio
FROM cajas

-- 3.5 Obtener el valor medio de las cajas de cada almacén.
INSERT INTO cajas (numReferencia, contenido, valor, almacen) VALUES
('977', 'Juegos de mesa', 430, 1),
('545', 'Muebles', 214, 2),
('432', 'Herramientas', 432, 3),
('675', 'Disfraces', 675, 4),
('453', 'Audifonía', 345, 5);

SELECT AVG(valor) AS valor_medio, almacen
FROM cajas
GROUP BY almacen

-- 3.6 Obtener los códigos de los almacenes en los cuales el valor medio de las cajas sea superior a 150€ 
INSERT INTO cajas (numReferencia, contenido, valor, almacen) VALUES
('P016', 'Material de embalaje', 50, 6);

SELECT almacen, AVG(valor) AS valor_medio
FROM cajas 
GROUP BY almacen
HAVING AVG(valor) > 150

-- 3.7 Obtener el número de referencia de cada caja junto con el nombre de la ciudad en el que se encuentra.
SELECT c.numReferencia, a.lugar
FROM cajas c, almacenes a
WHERE c.almacen = a.codigo
ORDER BY c.numReferencia

-- 3.8 Obtener el número de cajas que hay en cada almacén.
SELECT almacen, COUNT(numReferencia) AS numero_de_cajas
FROM cajas
GROUP BY almacen

-- 3.9 Obtener los códigos de los almacenes que están saturados (los almacenes donde el número de cajas es superior a la capacidad.
SELECT a.codigo
FROM almacenes a
WHERE capacidad < 
(
	SELECT COUNT(c.numReferencia)
	FROM cajas c
	WHERE c.almacen = a.codigo
	GROUP BY c.almacen
)

-- 3.10 Obtener los números de referencia de las cajas que están en Bilbao (Chicago en mi caso)
SELECT c.numReferencia
FROM cajas c
WHERE 'Chicago' = 
(
	SELECT a.lugar
	FROM almacenes a
	WHERE c.almacen = a.codigo
)

-- 3.11 Insertar un nuevo almacén en Barcelona con capacidad para 3 cajas.
INSERT INTO almacenes (codigo, lugar, capacidad) 
VALUES (12, 'Barcelona', 3);

-- 3.12 Insertar una nueva caja, con número de referencia ‘H5RT’, con contenido ‘Papel’, valor 200, y situada en el almacén 2
INSERT INTO cajas 
VALUES ('543', 'Grapadora', 654, 2);

-- 3.13 Rebajar el valor de todas las cajas un 15%.
UPDATE cajas
SET valor = valor * 0.85

-- 3.14 Rebajar un 20% el valor de todas las cajas cuyo valor sea superior al valor medio de todas las cajas (El valor medio es 167.9474 en mi caso).
UPDATE cajas
SET valor = valor * 0.80
WHERE valor > 
(
	SELECT AVG(valor)
	FROM cajas
)

-- 3.15 Eliminar todas las cajas cuyo valor sea inferior a 100€ (Yo haré un select para no borrarlas).
SELECT *
FROM cajas
WHERE valor < 100

-- 3.16 Vaciar el contenido de los almacenes que están saturados (Yo haré un select para no borrarlos).
SELECT a.*
FROM almacenes a
WHERE capacidad < 
(
	SELECT COUNT(c.numReferencia)
	FROM cajas c
	WHERE c.almacen = a.codigo
	GROUP BY c.almacen
)-biblio