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
