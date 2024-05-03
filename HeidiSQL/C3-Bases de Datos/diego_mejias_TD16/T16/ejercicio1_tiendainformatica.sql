CREATE DATABASE tiendainformatica;
USE tiendainformatica;

CREATE TABLE fabricantes (
	codigo INT(10) NOT NULL,
	nombre VARCHAR(100) DEFAULT NULL,
	PRIMARY KEY (codigo));
	
CREATE TABLE articulos (
	codigo INT(10) NOT NULL,
	nombre VARCHAR(100) DEFAULT NULL,
	precio INT DEFAULT NULL,
	fabricante INT DEFAULT NULL,
	PRIMARY KEY (codigo),
	KEY (fabricante),
	FOREIGN KEY (fabricante)
	REFERENCES fabricantes(codigo));
	

INSERT INTO fabricantes (codigo, nombre) VALUES
(1, 'Apple'),
(2, 'Samsung'),
(3, 'Microsoft'),
(4, 'Lenovo'),
(5, 'HP'),
(6, 'Dell'),
(7, 'Asus'),
(8, 'Acer'),
(9, 'Sony'),
(10, 'Toshiba');


INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES
(1, 'MacBook Pro', 2000, 1),
(2, 'iPhone 13 Pro', 1000, 1),
(3, 'Galaxy S21 Ultra', 1200, 2),
(4, 'Surface Laptop 4', 1500, 3),
(5, 'ThinkPad X1 Carbon', 1800, 4),
(6, 'Spectre x360', 1300, 5),
(7, 'XPS 15', 1600, 6),
(8, 'ROG Zephyrus G14', 1400, 7),
(9, 'Swift 5', 1100, 8),
(10, 'PlayStation 5', 500, 9);

-- 1.1 Selecciona los nombres de los productos de la tienda
UPDATE articulos SET precio = 100 WHERE codigo = 8;

SELECT nombre FROM articulos;

-- 1.2 Obtener los nombres y los precios de los artículos de la tienda.
SELECT nombre, precio FROM articulos;

-- 1.3 Obtener los nombres de los productos cuyo precio sea menor o igual a 50€.
SELECT nombre, precio FROM articulos WHERE precio <= 200;

-- 1.4 Obtener todos los datos de los artículos cuyo precio esté enre los 60€ y los 120€ (ambas cantidades incluidas).
SELECT * FROM articulos WHERE precio BETWEEN 60 AND 120;

-- 1.5 Obtener el nombre y el precio en pesetas (es decir, el precio en euros multiplicado por 166,386)
SELECT nombre, precio * 166.386 AS precio_pesetas FROM articulos;

-- 1.6 Seleccionar el precio medio de todos los productos
SELECT AVG(precio) AS precio_medio FROM articulos;

-- 1.7 Obtener el precio medio de los artículos cuyo código de fabricante sea 2.
SELECT AVG(precio) AS precio_medio FROM articulos WHERE fabricante = 2;

-- 1.8 Obtener el número de artículos cuyo precio sea mayor o igual a 180€ 
SELECT nombre, precio FROM articulos WHERE precio >= 180

-- 1.9 Obtener el nombre y precio de los artículos cuyo precio sea mayor o igual a 180€ y ordenarlos descendentemente por precio, y luego ascendentemente por nombre.
SELECT * FROM articulos WHERE precio >= 180 ORDER BY precio DESC, nombre ASC;

-- 1.10 Obtener un listado completo de artículos, incluyendo por cada artículo los datos del artículo y de su fabricante.
SELECT a.codigo, a.nombre AS nombre_articulo, a.precio, f.nombre AS nombre_fabricante
FROM articulos AS a
JOIN fabricantes AS f ON a.fabricante = f.codigo;

 -- 1.11 Obtener un listado de artículos, incluyendo el nombre del artículo, su precio, y el nombre de su fabricante
SELECT articulos.nombre AS nombre_articulo, articulos.precio, fabricantes.nombre AS nombre_fabricante
FROM articulos
JOIN fabricantes ON articulos.fabricante = fabricantes.codigo;

-- 1.12 Obtener el precio medio de los productos de cada fabricante, mostrando solo los códigos de fabricante.
SELECT fabricante, AVG(precio) AS precio_medio
FROM articulos
GROUP BY fabricante;

-- 1.13 Obtener el precio medio de los productos de cada fabricante, mostrando el nombre del fabricante
SELECT fabricantes.nombre AS nombre_fabricante, AVG(articulos.precio) AS precio_medio 
FROM fabricantes 
LEFT JOIN articulos ON fabricantes.codigo = articulos.fabricante
GROUP BY fabricantes.nombre;

-- 1.14 Obtener los nombres de los fabricantes que ofrezcan productos cuyo precio medio sea mayor o igual a 80€
SELECT articulos.fabricante, fabricantes.nombre, AVG(articulos.precio) AS precio_medio
FROM fabricantes
INNER JOIN articulos ON articulos.fabricante = fabricantes.codigo
WHERE (
	SELECT AVG(precio)
	FROM articulos
	WHERE fabricante = fabricantes.codigo
	GROUP BY fabricante
) >= 80
GROUP BY articulos.fabricante;

-- 1.15 Obtener el nombre y el precio del artículo más barato.
SELECT nombre, precio FROM articulos
order by precio
LIMIT 1;

-- 1.16 Obtener una lista con el nombre y precio de los artículos más caros de cada proveedor (incluyendo el nombre del proveedor).
SELECT a.nombre AS nombre_articulo, a.precio AS precio_articulo, f.nombre AS nombre_fabricante
FROM articulos AS a
INNER JOIN fabricantes AS f ON a.fabricante = f.codigo
WHERE (
    SELECT COUNT(*) 
    FROM articulos AS a2 
    WHERE a2.fabricante = a.fabricante AND a2.precio >= a.precio
) <= 2
ORDER BY a.fabricante, a.precio DESC;

-- 1.17 Añadir un nuevo producto: Altavoces de 70€ (del fabricante 2)
INSERT INTO articulos (nombre, precio, fabricante)
VALUES ('Altavoz', 70, 2)

-- 1.18 Cambiar el nombre del producto 8 a ‘Impresora Laser’
UPDATE articulos 
SET nombre = 'Impresora Laser'
WHERE codigo = 8

-- 1.19 Aplicar un descuento del 10% (multiplicar el precio por 0,9) a todos los productos
UPDATE articulos 
SET precio = precio * 0.9 

-- 1.20 Aplicar un descuento de 10€ a todos los productos cuyo precio sea mayor o igual a 120€
UPDATE articulos
SET precio = precio - 10
WHERE precio >= 120;