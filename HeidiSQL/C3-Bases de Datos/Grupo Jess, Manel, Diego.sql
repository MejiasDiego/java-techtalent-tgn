CREATE DATABASE supermercado;
USE supermercado;

CREATE TABLE proveedor (
id_proveedores INT,
nombre_proveedor VARCHAR(250),
ubicacion_sede VARCHAR(250),
PRIMARY KEY (id_proveedores));

CREATE TABLE producto (
id_producto INT,
nombre_producto VARCHAR(250),
qty_producto INT,
iva INT,
precio DOUBLE,
PRIMARY KEY (id_producto));

CREATE TABLE suministrar (
id_producto INT,
id_proveedores INT,
PRIMARY KEY (id_producto,id_proveedores),
FOREIGN KEY (id_producto) 
REFERENCES producto (id_producto)
ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (id_proveedores) 
REFERENCES proveedor (id_proveedores)
ON DELETE CASCADE ON UPDATE CASCADE);

CREATE TABLE cliente (
id_cliente INT,
DNI VARCHAR(9),
fecha_nacimiento DATE,
PRIMARY KEY (id_cliente));


CREATE TABLE compra (
id_compra INT,
precio_total DOUBLE,
cambio DOUBLE,
fecha_compra DATE,
id_cliente INT,
PRIMARY KEY (id_compra),
FOREIGN KEY (id_cliente)ç
REFERENCES cliente (id_cliente)
ON DELETE CASCADE ON UPDATE CASCADE);


CREATE TABLE se_compone (
id_compra INT,
id_producto INT,
qty_prod_comprado INT,
PRIMARY KEY (id_compra, id_producto),
FOREIGN KEY (id_compra) 
REFERENCES compra (id_compra) 
ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (id_producto) 
REFERENCES producto (id_producto) 
ON DELETE CASCADE ON UPDATE CASCADE);


INSERT INTO proveedor (id_proveedores, nombre_proveedor, ubicacion_sede) 
VALUES 
(1, 'Distribuidora Alimentos S.A.', 'New York'),
(2, 'Green Farms', 'Los Angeles'),
(3, 'Fresh Produce Co.', 'Chicago'),
(4, 'Global Seafoods', 'Miami'),
(5, 'Bakery Delights', 'San Francisco'),
(6, 'Healthy Harvest', 'Houston'),
(7, 'Meat Masters', 'Dallas'),
(8, 'Beverage World', 'Atlanta'),
(9, 'Gourmet Grocers', 'Seattle'),
(10, 'Tropical Fruits Inc.', 'Orlando');


INSERT INTO producto (id_producto, nombre_producto, qty_producto, iva, precio) 
VALUES 
(1, 'Apples', 100, 21, 1.50),
(2, 'Avocados', 150, 10, 2.75),
(3, 'Tomatoes', 200, 4, 1.25),
(4, 'Salmon Fillet', 80, 21, 10.00),
(5, 'Baguettes', 120, 10, 1.50),
(6, 'Quinoa', 90, 4, 3.75),
(7, 'Beef Steaks', 180, 21, 12.50),
(8, 'Wine Bottles', 210, 10, 15.00),
(9, 'Dark Chocolate', 95, 4, 4.75),
(10, 'Pineapples', 130, 21, 2.25);


INSERT INTO suministrar (id_producto, id_proveedores) 
VALUES 
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10);


INSERT INTO cliente (id_cliente, DNI, fecha_nacimiento) 
VALUES 
(1, '123456789', '1990-05-15'),
(2, '987654321', '1985-08-20'),
(3, '456123789', '2000-12-10'),
(4, '789456123', '1978-03-25'),
(5, '321654987', '1995-06-30'),
(6, '654321987', '1982-09-05'),
(7, '789123456', '1998-11-12'),
(8, '321789654', '1970-02-28'),
(9, '456789123', '1989-04-17'),
(10, '987321654', '1993-07-22');


INSERT INTO compra (id_compra, precio_total, cambio, fecha_compra, id_cliente) 
VALUES 
(11, 80.00, 200.00, '2024-05-12', 9),
(1, 50.00, 100.00, '2024-04-22', 1),
(2, 75.50, 120.00, '2024-04-21', 2),
(3, 100.25, 80.00, '2024-04-20', 3),
(4, 45.75, 60.00, '2024-04-19', 4),
(5, 80.00, 150.00, '2024-04-18', 5),
(6, 25.50, 30.00, '2024-04-17', 6),
(7, 60.25, 90.00, '2024-04-16', 7),
(8, 95.00, 200.00, '2024-04-15', 8),
(9, 110.75, 90.00, '2024-04-14', 9),
(10, 65.25, 100.00, '2024-04-13', 10);


INSERT INTO se_compone (id_compra, id_producto, qty_prod_comprado) 
VALUES 
(1, 1, 20),
(1, 2, 15),
(2, 3, 30),
(2, 4, 8),
(3, 5, 25),
(3, 6, 10),
(4, 7, 12),
(4, 8, 15),
(5, 9, 20),
(5, 10, 10);


-- CONSULTAS UPDATE --
UPDATE proveedor
SET ubicaciOn_sede = 'Houston'
WHERE id_proveedores = 10;

UPDATE cliente
SET DNI = '00000000T'
WHERE id_cliente = 3;

UPDATE producto 
SET nombre_producto='Cacaolat'
WHERE id_producto=10;

-- CONSULTAS DELETE --
SELECT * FROM producto 
WHERE id_producto=5;
DELETE FROM producto 
WHERE nombre_producto='Baguettes';

SELECT * FROM cliente 
WHERE id_cliente=8;
DELETE FROM cliente 
WHERE id_cliente=8;

SELECT * FROM proveedor 
WHERE id_proveedores=1;
DELETE FROM proveedor 
WHERE id_proveedores=1;

-- CONSULTAS DELETE --	
-- 1. mostrar DNI de persona con su id_cliente, que la compra es superior a la media de todas las compras ordenado ASC -- 

SELECT c.DNI, c.id_cliente, precio_total,fecha_compra
FROM cliente c, compra co, se_compone se
WHERE c.id_cliente= co.id_cliente 
AND co.id_compra= se.id_compra 
AND co.precio_total>
		(SELECT AVG(precio_total) FROM compra) 
ORDER BY co.precio_total;

-- 2. mostrar media del precio de proveedores de HOUSTON (mostrando nombre proveeedor) -- 

SELECT AVG(pro.precio) AS MEDIA_PRODUCTOS, ubicacion_sede
FROM proveedor p, producto pro, suministrar s
WHERE p.id_proveedores=s.id_proveedores 
AND s.id_producto=pro.id_producto 
AND ubicacion_sede = 'Houston';

-- 3. mostrar productos con X iva y su proveedor --

SELECT pro.nombre_producto, pro.iva, p.nombre_proveedor
FROM producto pro, proveedor p, suministrar s
WHERE p.id_proveedores=s.id_proveedores 
AND s.id_producto=pro.id_producto AND pro.iva=21;