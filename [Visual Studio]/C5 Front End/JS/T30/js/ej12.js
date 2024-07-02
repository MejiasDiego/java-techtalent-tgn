// Crear un array para almacenar el número de apariciones de cada suma
let apariciones = new Array(11).fill(0);

// Realizar 36,000 lanzamientos de los dados
for (let i = 0; i < 36000; i++) {
    // Obtener números aleatorios entre 1 y 6 para cada dado
    let dado1 = Math.floor(Math.random() * 6) + 1;
    let dado2 = Math.floor(Math.random() * 6) + 1;

    // Calcular la suma de los dados
    let suma = dado1 + dado2;

    // Incrementar el contador de apariciones de la suma correspondiente
    apariciones[suma - 2]++;
}

// Imprimir el número de apariciones de cada suma
for (let i = 0; i < apariciones.length; i++) {
    console.log(`Suma ${i + 2}: ${apariciones[i]} apariciones`);
}