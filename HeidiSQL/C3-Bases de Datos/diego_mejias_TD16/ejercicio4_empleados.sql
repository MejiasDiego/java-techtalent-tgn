CREATE DATABASE empleados;
USE empleados;
	
CREATE TABLE departamentos (
	codigo INT(10) NOT NULL,
	nombre VARCHAR(100) DEFAULT NULL,
	presupuesto INT,
	PRIMARY KEY (codigo));
	
CREATE TABLE empleados (
	DNI VARCHAR(8),
	nombre VARCHAR(100),
	Apellidos VARCHAR(255),
	departamento INT DEFAULT NULL,
	PRIMARY KEY (DNI),
	KEY (departamento),
	FOREIGN KEY (departamento)
	REFERENCES departamentos(codigo));

INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES
(1, 'Recursos Humanos', 100000),
(2, 'Desarrollo de Software', 250000),
(3, 'Ventas', 200000),
(4, 'Marketing', 150000),
(5, 'Contabilidad', 180000),
(6, 'Soporte Técnico', 120000),
(7, 'Calidad', 130000),
(8, 'Administración', 170000),
(9, 'Ingeniería', 220000),
(10, 'Logística', 190000);

INSERT INTO empleados (DNI, nombre, Apellidos, departamento) VALUES
('98765432', 'Javier', 'Gómez', 37),
('87654321', 'Carmen', 'Martín', 77),
('23443789', 'Mariona', 'García', 14),
('74954739', 'Teresa', 'Carbón', 14),
('12345678', 'Juan', 'González', 1),
('23456789', 'María', 'López', 2),
('34567890', 'Carlos', 'Martínez', 3),
('45678901', 'Laura', 'Sánchez', 4),
('56789012', 'Pedro', 'Rodríguez', 5),
('67890123', 'Ana', 'García', 6),
('78901234', 'David', 'Fernández', 7),
('89012345', 'Sara', 'Pérez', 8),
('90123456', 'Pablo', 'Díaz', 9),
('01234567', 'Elena', 'Ruiz', 10);


-- Consultas ejercicio TD16 --
-- 2.1 --

SELECT DISTINCT Apellidos FROM empleados;


UPDATE empleados
SET Apellidos = 'López'
WHERE DNI = '90123456'

INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES
(14, 'Diseñadores', 150000),
(37, 'Cocineros', 150000),
(77, 'Calidad', 150000);
-- 2.2 -- ??¿¿

SELECT Apellidos FROM empleados;
-- 2.3 --

SELECT * FROM empleados WHERE Apellidos= 'López';

-- 2.4 --

SELECT * FROM empleados WHERE Apellidos IN ('López', 'Pérez');

-- 2.5 --

SELECT * FROM empleados WHERE departamento IN (14);

-- 2.6 --

SELECT * FROM empleados WHERE departamento IN (37,77);

-- 2.7 --

SELECT *
FROM empleados
WHERE Apellidos LIKE 'P%';

-- 2.7 --

SELECT nombre, presupuesto FROM departamentos;

-- 2.8 --
SELECT empleados.nombre, departamentos.nombre AS nombre_departamento
FROM empleados
JOIN departamentos ON empleados.departamento = departamentos.codigo;

-- 2.9. Obtener el numero de empleados en cada departamento.
SELECT COUNT(nombre) AS numero_empleados
FROM empleados
GROUP BY departamento;

-- 2.10. Obtener un listado completo de empleados, incluyendo por cada empleado los datos del empleado y de su departamento
SELECT e.nombre, e.Apellidos, e.DNI, d.nombre, d.presupuesto
FROM empleados e, departamentos d
WHERE d.codigo = e.departamento;

-- 2.11 Obtener un listado completo de empleados, incluyendo el nombre y apellidos del empleado junto al nombre y presupuesto de su departamento
SELECT e.nombre, e.Apellidos, e.DNI, d.nombre, d.presupuesto AS presupuesto_departamento
FROM empleados e, departamentos d
WHERE d.codigo = e.departamento AND d.presupuesto > 18000;

-- 2.12 Obtener los nombres y apellidos de los empleados que trabajen en departamentos cuyo presupuesto sea mayor de 60.000€ (18.000€ en mi caso).
SELECT e.nombre, e.apellidos, d.nombre, d.presupuesto
FROM empleados e LEFT OUTER JOIN departamentos d 
ON e.departamento = d.codigo;

-- 2.13 Obtener los datos de los departamentos cuyo presupuesto es superior al presupuesto medio de todos los departamentos
SELECT *
FROM departamentos
WHERE presupuesto > 
	(SELECT AVG(presupuesto)
	FROM departamentos);

-- 2.14 Obtener los nombres (únicamente los nombres) de los departamentos que tienen más de dos empleados. (Como en mi caso no hay ningún departamento con más de un empleado, generaré 5 empleados extra) 
INSERT INTO empleados
VALUES 
('11223344', 'Mario', 'Santos', 1),
('22334455', 'Luigi', 'Peña', 2),
('33445566', 'Torneko', 'Taloon', 3),
('44556677', 'Alena', 'Arevna', 4),
('55667788', 'Ann', 'Takamaki', 5);

SELECT d.nombre
FROM empleados em, departamentos d
WHERE em.departamento = d.codigo 
GROUP BY em.departamento
HAVING COUNT(em.dni) >= 2

-- 2.15 Añadir un nuevo departamento: ‘Calidad’, con presupuesto de 40.000€ y código 11. Añadir un empleado vinculado al departamento recién creado: Esther Vázquez, DNI: 89267109
INSERT INTO departamentos (nombre, presupuesto)
VALUES ('Calidad2', 40000)

INSERT INTO empleados 
VALUES ('28593847', 'John', 'Cena', 33)

-- 2.16 Aplicar un recorte presupuestario del 10% a todos los departamentos.
UPDATE departamentos
SET presupuesto = presupuesto * 0.9

-- 2.17 Reasignar a los empleados del departamento de investigación al departamento de informática.(Como yo no tengo departamento de informática los reasignaré al de desarrollo)
UPDATE empleados
SET departamento = 4
WHERE departamento = 9

-- 2.18 Despedira todos los empleados que trabajan para el departamento de informática (Desarrollo) (Yo no los voy a borrar)
DELETE
FROM empleados
WHERE departamento = 4

-- 2.19 Despedir a todos los empleados que trabajen para departamentos cuyo presupuesto sea superior a los 60.000€ (18.000€ en mi caso)
DELETE
FROM empleados e
WHERE e.departamento = 
(
	SELECT d.codigo
	FROM departamentos d
	WHERE d.codigo = e.departamento AND d.presupuesto >= 18000
)

-- 2.20 Despedir a todos los empleados
DELETE
FROM empleados 