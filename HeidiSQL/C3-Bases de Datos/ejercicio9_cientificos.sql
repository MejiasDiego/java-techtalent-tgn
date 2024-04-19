CREATE DATABASE cientificos;
USE cientificos;

CREATE TABLE cientificos (
    DNI VARCHAR(8) NOT NULL,
    nomApels VARCHAR(255),
    PRIMARY KEY (DNI)
);

CREATE TABLE proyecto (
    id CHAR(4),
    nombre VARCHAR(255),
    horas INT,
    PRIMARY KEY (id)
);

CREATE TABLE asignado_A (
    cientifico VARCHAR(8),
    proyecto CHAR(4),
    PRIMARY KEY (cientifico, proyecto),
    FOREIGN KEY (cientifico) REFERENCES cientificos(DNI),
    FOREIGN KEY (proyecto) REFERENCES proyecto(id)
);

INSERT INTO cientificos (DNI, nomApels) VALUES 
('12345678', 'Alice Smith'),
('23456789', 'Bob Johnson'),
('34567890', 'Charlie Williams'),
('45678901', 'David Brown'),
('56789012', 'Eva Garcia'),
('67890123', 'Frank Martinez'),
('78901234', 'Grace Lopez'),
('89012345', 'Henry Rodriguez'),
('90123456', 'Ivy Perez'),
('01234567', 'Jackie Gomez');

INSERT INTO proyecto (id, nombre, horas) VALUES
('P001', 'Proyecto A', 100),
('P002', 'Proyecto B', 150),
('P003', 'Proyecto C', 120),
('P004', 'Proyecto D', 200),
('P005', 'Proyecto E', 180);

INSERT INTO asignado_A (cientifico, proyecto) VALUES
('12345678', 'P001'),
('23456789', 'P002'),
('34567890', 'P003'),
('45678901', 'P004'),
('56789012', 'P005'),
('67890123', 'P001'),
('78901234', 'P002'),
('89012345', 'P003'),
('90123456', 'P004'),
('01234567', 'P005');