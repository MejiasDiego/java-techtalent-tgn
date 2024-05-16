// Para crear las bases de datos he usado el comando use <nombreBD>. A diferencia del lenguaje SQL, en MongoDB no es necesario crear la base de datos antes de insertar datos en ella. Si la base de datos no existe, MongoDB la creará automáticamente al insertar datos en ella.También sucede lo mismo con las colecciones. No es necesario crearlas antes de insertar datos en ellas. Si la colección no existe, MongoDB la creará automáticamente al insertar datos en ella. En este caso, he usado el comando db.<nombreColeccion>.insertMany() para insertar varios documentos en una colección, y su vez, crear la misma colección si no existe.

use tiendainformatica;

db.fabricantes.insertMany([
    { codigo: 1, nombre: 'Apple' },
    { codigo: 2, nombre: 'Samsung' },
    { codigo: 3, nombre: 'Microsoft' },
    { codigo: 4, nombre: 'Lenovo' },
    { codigo: 5, nombre: 'HP' },
    { codigo: 6, nombre: 'Dell' },
    { codigo: 7, nombre: 'Asus' },
    { codigo: 8, nombre: 'Acer' },
    { codigo: 9, nombre: 'Sony' },
    { codigo: 10, nombre: 'Toshiba' }
]);

db.articulos.insertMany([
    { codigo: 1, nombre: 'MacBook Pro', precio: 2000, fabricante: 1 },
    { codigo: 2, nombre: 'iPhone 13 Pro', precio: 1000, fabricante: 1 },
    { codigo: 3, nombre: 'Galaxy S21 Ultra', precio: 1200, fabricante: 2 },
    { codigo: 4, nombre: 'Surface Laptop 4', precio: 1500, fabricante: 3 },
    { codigo: 5, nombre: 'ThinkPad X1 Carbon', precio: 1800, fabricante: 4 },
    { codigo: 6, nombre: 'Spectre x360', precio: 1300, fabricante: 5 },
    { codigo: 7, nombre: 'XPS 15', precio: 1600, fabricante: 6 },
    { codigo: 8, nombre: 'ROG Zephyrus G14', precio: 1400, fabricante: 7 },
    { codigo: 9, nombre: 'Swift 5', precio: 1100, fabricante: 8 },
    { codigo: 10, nombre: 'PlayStation 5', precio: 500, fabricante: 9 }
]);

use almacenes;

db.almacenes.insertMany([
    { codigo: 1, lugar: 'Almacén Central', capacidad: 200 },
    { codigo: 2, lugar: 'Almacén Norte', capacidad: 150 },
    { codigo: 3, lugar: 'Almacén Sur', capacidad: 180 },
    { codigo: 4, lugar: 'Almacén Este', capacidad: 170 },
    { codigo: 5, lugar: 'Almacén Oeste', capacidad: 190 },
    { codigo: 6, lugar: 'Almacén Principal', capacidad: 220 },
    { codigo: 7, lugar: 'Almacén Secundario', capacidad: 130 },
    { codigo: 8, lugar: 'Almacén de Alimentos', capacidad: 160 },
    { codigo: 9, lugar: 'Almacén de Electrónicos', capacidad: 140 },
    { codigo: 10, lugar: 'Almacén de Ropa', capacidad: 210 }
]);

db.cajas.insertMany([
    { numReferencia: '001', contenido: 'Ropa de invierno', valor: 50, almacen: 10 },
    { numReferencia: '002', contenido: 'Electrodomésticos pequeños', valor: 100, almacen: 9 },
    { numReferencia: '003', contenido: 'Productos alimenticios no perecederos', valor: 80, almacen: 8 },
    { numReferencia: '004', contenido: 'Electrodomésticos grandes', valor: 200, almacen: 9 },
    { numReferencia: '005', contenido: 'Productos perecederos', valor: 70, almacen: 8 },
    { numReferencia: '006', contenido: 'Ropa de verano', valor: 60, almacen: 10 },
    { numReferencia: '007', contenido: 'Electrónicos de consumo', valor: 150, almacen: 9 },
    { numReferencia: '008', contenido: 'Accesorios de moda', valor: 40, almacen: 10 },
    { numReferencia: '009', contenido: 'Juguetes para niños', valor: 30, almacen: 7 },
    { numReferencia: '010', contenido: 'Herramientas de bricolaje', valor: 120, almacen: 6 }
]);

use empleados;

db.departamentos.insertMany([
    { codigo: 1, nombre: 'Recursos Humanos', presupuesto: 100000 },
    { codigo: 2, nombre: 'Desarrollo de Software', presupuesto: 250000 },
    { codigo: 3, nombre: 'Ventas', presupuesto: 200000 },
    { codigo: 4, nombre: 'Marketing', presupuesto: 150000 },
    { codigo: 5, nombre: 'Contabilidad', presupuesto: 180000 },
    { codigo: 6, nombre: 'Soporte Técnico', presupuesto: 120000 },
    { codigo: 7, nombre: 'Calidad', presupuesto: 130000 },
    { codigo: 8, nombre: 'Administración', presupuesto: 170000 },
    { codigo: 9, nombre: 'Ingeniería', presupuesto: 220000 },
    { codigo: 10, nombre: 'Logística', presupuesto: 190000 }
]);

db.empleados.insertMany([
    { DNI: '12345678', nombre: 'Juan', Apellidos: 'González', departamento: 1 },
    { DNI: '23456789', nombre: 'María', Apellidos: 'López', departamento: 2 },
    { DNI: '34567890', nombre: 'Carlos', Apellidos: 'Martínez', departamento: 3 },
    { DNI: '45678901', nombre: 'Laura', Apellidos: 'Sánchez', departamento: 4 },
    { DNI: '56789012', nombre: 'Pedro', Apellidos: 'Rodríguez', departamento: 5 },
    { DNI: '67890123', nombre: 'Ana', Apellidos: 'García', departamento: 6 },
    { DNI: '78901234', nombre: 'David', Apellidos: 'Fernández', departamento: 7 }
]);

use peliculasSalas;

db.peliculas.insertMany([
    { codigo: 1, nombre: 'El Padrino', calificacionEdad: 18 },
    { codigo: 2, nombre: 'Titanic', calificacionEdad: 12 },
    { codigo: 3, nombre: 'El Señor de los Anillos: La Comunidad del Anillo', calificacionEdad: 12 },
    { codigo: 4, nombre: 'Matrix', calificacionEdad: 14 },
    { codigo: 5, nombre: 'Forrest Gump', calificacionEdad: 12 },
    { codigo: 6, nombre: 'La Lista de Schindler', calificacionEdad: 16 },
    { codigo: 7, nombre: 'El Rey León', calificacionEdad: 0 },
    { codigo: 8, nombre: 'Avatar', calificacionEdad: 12 },
    { codigo: 9, nombre: 'La La Land', calificacionEdad: 12 },
    { codigo: 10, nombre: 'Pulp Fiction', calificacionEdad: 18 }
]);
use peliculasSalas;

db.peliculas.insertMany([
    { codigo: 1, nombre: 'El Padrino', calificacionEdad: 18 },
    { codigo: 2, nombre: 'Titanic', calificacionEdad: 12 },
    { codigo: 3, nombre: 'El Señor de los Anillos: La Comunidad del Anillo', calificacionEdad: 12 },
    { codigo: 4, nombre: 'Matrix', calificacionEdad: 14 },
    { codigo: 5, nombre: 'Forrest Gump', calificacionEdad: 12 },
    { codigo: 6, nombre: 'La Lista de Schindler', calificacionEdad: 16 },
    { codigo: 7, nombre: 'El Rey León', calificacionEdad: 0 },
    { codigo: 8, nombre: 'Avatar', calificacionEdad: 12 },
    { codigo: 9, nombre: 'La La Land', calificacionEdad: 12 },
    { codigo: 10, nombre: 'Pulp Fiction', calificacionEdad: 18 }
]);

use peliculasSalas;

db.peliculas.insertMany([
    { codigo: 1, nombre: 'El Padrino', calificacionEdad: 18 },
    { codigo: 2, nombre: 'Titanic', calificacionEdad: 12 },
    { codigo: 3, nombre: 'El Señor de los Anillos: La Comunidad del Anillo', calificacionEdad: 12 },
    { codigo: 4, nombre: 'Matrix', calificacionEdad: 14 },
    { codigo: 5, nombre: 'Forrest Gump', calificacionEdad: 12 },
    { codigo: 6, nombre: 'La Lista de Schindler', calificacionEdad: 16 },
    { codigo: 7, nombre: 'El Rey León', calificacionEdad: 0 },
    { codigo: 8, nombre: 'Avatar', calificacionEdad: 12 },
    { codigo: 9, nombre: 'La La Land', calificacionEdad: 12 },
    { codigo: 10, nombre: 'Pulp Fiction', calificacionEdad: 18 }
]);

db.salas.insertMany([
    { nombre: 'Sala 1', pelicula: 1 },
    { nombre: 'Sala 2', pelicula: 2 },
    { nombre: 'Sala 3', pelicula: 3 },
    { nombre: 'Sala 4', pelicula: 4 },
    { nombre: 'Sala 5', pelicula: 5 },
    { nombre: 'Sala 6', pelicula: 6 },
    { nombre: 'Sala 7', pelicula: 7 },
    { nombre: 'Sala 8', pelicula: 8 },
    { nombre: 'Sala 9', pelicula: 9 },
    { nombre: 'Sala 10', pelicula: 10 }
]);

use directores;

db.despachos.insertMany([
    { numero: 6, capacidad: 33 },
    { capacidad: 3 }, // Generará un número automáticamente
    { capacidad: 5 },
    { capacidad: 8 },
    { capacidad: 16 },
    { capacidad: 4 },
    { capacidad: 7 },
    { capacidad: 9 },
    { capacidad: 3 },
    { capacidad: 11 },
    { capacidad: 33 }
]);

db.directores.insertMany([
    { DNI: '12345678', nomApels: 'Diego Mejías', DNIJefe: null, despacho: 6 },
    { DNI: '12345078', nomApels: 'Àlex Gil', DNIJefe: null, despacho: null },
    { DNI: '10042678', nomApels: 'Pepito Gil', DNIJefe: null, despacho: null },
    { DNI: '12342768', nomApels: 'Marc Gil', DNIJefe: null, despacho: null },
    { DNI: '11242678', nomApels: 'Carlos Gil', DNIJefe: null, despacho: null },
    { DNI: '12342658', nomApels: 'Manel Gil', DNIJefe: null, despacho: null },
    { DNI: '12353478', nomApels: 'José Gil', DNIJefe: null, despacho: null },
    { DNI: '39393938', nomApels: 'Messi Gil', DNIJefe: null, despacho: null },
    { DNI: '12542678', nomApels: 'Mario Gil', DNIJefe: null, despacho: null },
    { DNI: '12342678', nomApels: 'Pepito Gil', DNIJefe: null, despacho: null },
    { DNI: '12342688', nomApels: 'Pepe Gil', DNIJefe: null, despacho: null }
]);

var despacho6 = db.despachos.findOne({ numero: 6 })._id;
db.directores.updateOne({ DNI: '12345678' }, { $set: { despacho: despacho6 } });

use piezasProveedores;

db.piezas.insertMany([
    { codigo: 1, nombre: 'martillo' },
    { codigo: 2, nombre: 'canicas' },
    { codigo: 3, nombre: 'peonza' },
    { codigo: 4, nombre: 'dragon quest iv' },
    { codigo: 5, nombre: 'smash bros 3ds' },
    { codigo: 6, nombre: 'el archivo de las tormentas' },
    { codigo: 7, nombre: 'saitama' },
    { codigo: 8, nombre: 'coulant' },
    { codigo: 9, nombre: 'trenecito' },
    { codigo: 10, nombre: 'conductor' }
]);

db.proveedores.insertMany([
    { id: 'A', nombre: '' },
    { id: 'X', nombre: '' },
    { id: 'C', nombre: '' },
    { id: 'G', nombre: '' },
    { id: 'N', nombre: '' },
    { id: 'B', nombre: '' },
    { id: 'V', nombre: '' },
    { id: 'U', nombre: '' },
    { id: 'J', nombre: '' },
    { id: 'Z', nombre: '' }
]);

db.suministra.insertMany([
    { codigoPieza: 1, idProveedor: 'A', precio: 11 },
    { codigoPieza: 2, idProveedor: 'B', precio: 22 },
    { codigoPieza: 3, idProveedor: 'C', precio: 33 },
    { codigoPieza: 4, idProveedor: 'G', precio: 44 },
    { codigoPieza: 5, idProveedor: 'N', precio: 55 },
    { codigoPieza: 6, idProveedor: 'B', precio: 66 },
    { codigoPieza: 7, idProveedor: 'V', precio: 77 },
    { codigoPieza: 8, idProveedor: 'U', precio: 88 },
    { codigoPieza: 9, idProveedor: 'J', precio: 99 },
    { codigoPieza: 10, idProveedor: 'Z', precio: 100 }
]);

use grandesAlmacenes;

db.productos.insertMany([
    { codigo: 1, nombre: 'Camiseta', precio: 150 },
    { codigo: 2, nombre: 'Pantalón', precio: 200 },
    { codigo: 3, nombre: 'Zapatos', precio: 250 },
    { codigo: 4, nombre: 'Bufanda', precio: 50 },
    { codigo: 5, nombre: 'Gorra', precio: 30 },
    { codigo: 6, nombre: 'Calcetines', precio: 20 },
    { codigo: 7, nombre: 'Vestido', precio: 300 },
    { codigo: 8, nombre: 'Abrigo', precio: 400 },
    { codigo: 9, nombre: 'Falda', precio: 180 },
    { codigo: 10, nombre: 'Chaqueta', precio: 350 }
]);

db.cajeros.insertMany([
    { codigo: 1, nomApels: 'Juan Pérez' },
    { codigo: 2, nomApels: 'María López' },
    { codigo: 3, nomApels: 'Carlos Martínez' },
    { codigo: 4, nomApels: 'Laura García' },
    { codigo: 5, nomApels: 'Pedro Ruiz' },
    { codigo: 6, nomApels: 'Ana Fernández' },
    { codigo: 7, nomApels: 'David Gómez' },
    { codigo: 8, nomApels: 'Elena Rodríguez' },
    { codigo: 9, nomApels: 'Miguel Sánchez' },
    { codigo: 10, nomApels: 'Sofía Hernández' }
]);

db.maquinasRegistradoras.insertMany([
    { codigo: 1, piso: 1 },
    { codigo: 2, piso: 1 },
    { codigo: 3, piso: 2 },
    { codigo: 4, piso: 2 },
    { codigo: 5, piso: 3 },
    { codigo: 6, piso: 3 },
    { codigo: 7, piso: 4 },
    { codigo: 8, piso: 4 },
    { codigo: 9, piso: 5 },
    { codigo: 10, piso: 5 }
]);

db.venta.insertMany([
    { cajero: 1, maquina: 1, producto: 1 },
    { cajero: 2, maquina: 2, producto: 2 },
    { cajero: 3, maquina: 3, producto: 3 },
    { cajero: 4, maquina: 4, producto: 4 },
    { cajero: 5, maquina: 5, producto: 5 },
    { cajero: 6, maquina: 6, producto: 6 },
    { cajero: 7, maquina: 7, producto: 7 },
    { cajero: 8, maquina: 8, producto: 8 },
    { cajero: 9, maquina: 9, producto: 9 },
    { cajero: 10, maquina: 10, producto: 10 }
]);

use investigadores;

db.facultad.insertMany([
    { codigo: 1, nombre: 'Facultad de Ciencias' },
    { codigo: 2, nombre: 'Facultad de Ingeniería' },
    { codigo: 3, nombre: 'Facultad de Medicina' },
    { codigo: 4, nombre: 'Facultad de Humanidades' },
    { codigo: 5, nombre: 'Facultad de Derecho' }
]);

db.investigadores.insertMany([
    { DNI: '12345678', nomApels: 'Juan Pérez', facultad: 1 },
    { DNI: '23456789', nomApels: 'María López', facultad: 2 },
    { DNI: '34567890', nomApels: 'Carlos Martínez', facultad: 3 },
    { DNI: '45678901', nomApels: 'Laura García', facultad: 1 },
    { DNI: '56789012', nomApels: 'Pedro Ruiz', facultad: 2 },
    { DNI: '67890123', nomApels: 'Ana Fernández', facultad: 3 },
    { DNI: '78901234', nomApels: 'David Gómez', facultad: 1 },
    { DNI: '89012345', nomApels: 'Elena Rodríguez', facultad: 2 },
    { DNI: '90123456', nomApels: 'Miguel Sánchez', facultad: 3 },
    { DNI: '01234567', nomApels: 'Sofía Hernández', facultad: 1 }
]);

db.equipos.insertMany([
    { numSerie: '0001', nombre: 'Equipo 1', facultad: 1 },
    { numSerie: '0002', nombre: 'Equipo 2', facultad: 2 },
    { numSerie: '0003', nombre: 'Equipo 3', facultad: 3 },
    { numSerie: '0004', nombre: 'Equipo 4', facultad: 1 },
    { numSerie: '0005', nombre: 'Equipo 5', facultad: 2 },
    { numSerie: '0006', nombre: 'Equipo 6', facultad: 3 },
    { numSerie: '0007', nombre: 'Equipo 7', facultad: 1 },
    { numSerie: '0008', nombre: 'Equipo 8', facultad: 2 },
    { numSerie: '0009', nombre: 'Equipo 9', facultad: 3 },
    { numSerie: '0010', nombre: 'Equipo 10', facultad: 1 }
]);

db.reserva.insertMany([
    { DNI: '12345678', numSerie: '0001', comienzo: new Date('2024-04-16T10:00:00Z'), fin: new Date('2024-04-16T12:00:00Z') },
    { DNI: '23456789', numSerie: '0002', comienzo: new Date('2024-04-17T09:00:00Z'), fin: new Date('2024-04-17T11:00:00Z') },
    { DNI: '34567890', numSerie: '0003', comienzo: new Date('2024-04-18T08:00:00Z'), fin: new Date('2024-04-18T10:00:00Z') },
    { DNI: '45678901', numSerie: '0004', comienzo: new Date('2024-04-19T07:00:00Z'), fin: new Date('2024-04-19T09:00:00Z') },
    { DNI: '56789012', numSerie: '0005', comienzo: new Date('2024-04-20T11:00:00Z'), fin: new Date('2024-04-20T13:00:00Z') },
    { DNI: '67890123', numSerie: '0006', comienzo: new Date('2024-04-21T12:00:00Z'), fin: new Date('2024-04-21T14:00:00Z') },
    { DNI: '78901234', numSerie: '0007', comienzo: new Date('2024-04-22T13:00:00Z'), fin: new Date('2024-04-22T15:00:00Z') },
    { DNI: '89012345', numSerie: '0008', comienzo: new Date('2024-04-23T14:00:00Z'), fin: new Date('2024-04-23T16:00:00Z') },
    { DNI: '90123456', numSerie: '0009', comienzo: new Date('2024-04-24T15:00:00Z'), fin: new Date('2024-04-24T17:00:00Z') },
    { DNI: '01234567', numSerie: '0010', comienzo: new Date('2024-04-25T16:00:00Z'), fin: new Date('2024-04-25T18:00:00Z') }
]);

use cientificos;

db.cientificos.insertMany([
    { DNI: '12345678', nomApels: 'Alice Smith' },
    { DNI: '23456789', nomApels: 'Bob Johnson' },
    { DNI: '34567890', nomApels: 'Charlie Williams' },
    { DNI: '45678901', nomApels: 'David Brown' },
    { DNI: '56789012', nomApels: 'Eva Garcia' },
    { DNI: '67890123', nomApels: 'Frank Martinez' },
    { DNI: '78901234', nomApels: 'Grace Lopez' },
    { DNI: '89012345', nomApels: 'Henry Rodriguez' },
    { DNI: '90123456', nomApels: 'Ivy Perez' },
    { DNI: '01234567', nomApels: 'Jackie Gomez' }
]);

db.proyecto.insertMany([
    { id: 'P001', nombre: 'Proyecto A', horas: 100 },
    { id: 'P002', nombre: 'Proyecto B', horas: 150 },
    { id: 'P003', nombre: 'Proyecto C', horas: 120 },
    { id: 'P004', nombre: 'Proyecto D', horas: 200 },
    { id: 'P005', nombre: 'Proyecto E', horas: 180 }
]);

db.asignado_A.insertMany([
    { cientifico: '12345678', proyecto: 'P001' },
    { cientifico: '23456789', proyecto: 'P002' },
    { cientifico: '34567890', proyecto: 'P003' },
    { cientifico: '45678901', proyecto: 'P004' },
    { cientifico: '56789012', proyecto: 'P005' },
    { cientifico: '67890123', proyecto: 'P001' },
    { cientifico: '78901234', proyecto: 'P002' },
    { cientifico: '89012345', proyecto: 'P003' },
    { cientifico: '90123456', proyecto: 'P004' },
    { cientifico: '01234567', proyecto: 'P005' }
]);

