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

UPDATE articulos SET precio = 100 WHERE codigo = 8;

SELECT nombre FROM articulos;

SELECT nombre, precio FROM articulos;

SELECT nombre, precio FROM articulos WHERE precio <= 200;

SELECT * FROM articulos WHERE precio BETWEEN 60 AND 120;

SELECT nombre, precio * 166.386 AS precio_pesetas FROM articulos;

SELECT AVG(precio) AS precio_medio FROM articulos;

SELECT AVG(precio) AS precio_medio FROM articulos WHERE fabricante = 2;

SELECT nombre, precio FROM articulos WHERE precio >= 180

SELECT * FROM articulos WHERE precio >= 180 ORDER BY precio DESC, nombre ASC;

SELECT a.codigo, a.nombre AS nombre_articulo, a.precio, f.nombre AS nombre_fabricante
FROM articulos AS a
JOIN fabricantes AS f ON a.fabricante = f.codigo;

SELECT articulos.nombre AS nombre_articulo, articulos.precio, fabricantes.nombre AS nombre_fabricante
FROM articulos
JOIN fabricantes ON articulos.fabricante = fabricantes.codigo;

SELECT fabricante, AVG(precio) AS precio_medio
FROM articulos
GROUP BY fabricante;

SELECT fabricante, AVG(precio) AS precio_medio
FROM articulos
GROUP BY fabricante;

SELECT fabricantes.nombre AS nombre_fabricante, AVG(articulos.precio) AS precio_medio 
FROM fabricantes 
LEFT JOIN articulos ON fabricantes.codigo = articulos.fabricante
GROUP BY fabricantes.nombre;

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

SELECT nombre, precio FROM articulos
order by precio
LIMIT 1;

SELECT a.nombre AS nombre_articulo, a.precio AS precio_articulo, f.nombre AS nombre_fabricante
FROM articulos AS a
INNER JOIN fabricantes AS f ON a.fabricante = f.codigo
WHERE (
    SELECT COUNT(*) 
    FROM articulos AS a2 
    WHERE a2.fabricante = a.fabricante AND a2.precio >= a.precio
) <= 2
ORDER BY a.fabricante, a.precio DESC;



SELECT articulos.nombre AS Producto, fabricantes.nombre AS Fabricante
FROM articulos
JOIN fabricantes ON articulos.fabricante= fabricantes.codigo;