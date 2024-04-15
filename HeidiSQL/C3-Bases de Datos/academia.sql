CREATE DATABASE academia;
USE academia;

CREATE TABLE Alumnos (
    codigo_alumno INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    apellidos VARCHAR(100),
    direccion VARCHAR(255),
    fecha_nacimiento DATE,
    sexo ENUM('H', 'M') NOT NULL
);

CREATE TABLE Cursos (
    codigo_curso INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) UNIQUE, -- Restricción: Los cursos no pueden tener el mismo nombre
    max_alumnos INT,
    profesor VARCHAR(100), -- Aquí podrías usar una clave foránea a la tabla de profesores si los profesores tienen un código único
    fecha_inicio DATE,
    fecha_finalizacion DATE,
    horas_curso INT NOT NULL, -- Restricción: Las horas del curso son imprescindibles
    CONSTRAINT fk_profesor FOREIGN KEY (profesor) REFERENCES Profesores(DNI)
);

CREATE TABLE Profesores (
    DNI VARCHAR(9) PRIMARY KEY,
    nombre VARCHAR(100) UNIQUE, -- Restricción: Los profesores no pueden tener el mismo nombre
    direccion VARCHAR(255),
    titulacion VARCHAR(100),
    cuota_hora DECIMAL(8,2),
    GANA DECIMAL(8,2) NOT NULL -- Restricción: El campo GANA no puede estar vacío
);

-- Restricción: No es posible dar de alta un alumno si no se matricula en un curso
CREATE TABLE Alumnos_Cursos (
    codigo_alumno INT,
    codigo_curso INT,
    PRIMARY KEY (codigo_alumno, codigo_curso),
    FOREIGN KEY (codigo_alumno) REFERENCES Alumnos(codigo_alumno),
    FOREIGN KEY (codigo_curso) REFERENCES Cursos(codigo_curso)
);

-- Restricción: Cumplir la relación normal entre fecha comienzo y fecha fin (orden cronológico)
ALTER TABLE Cursos ADD CONSTRAINT chk_fechas CHECK (fecha_inicio < fecha_finalizacion);
