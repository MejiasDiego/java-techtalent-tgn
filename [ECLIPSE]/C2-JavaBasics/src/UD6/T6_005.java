package UD6;

import java.util.Scanner;

public class T6_005 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa un número decimal: ");
		int decimal = scanner.nextInt();
		
		String bin = convertirABinario(decimal);
		System.out.println("El número binario es: " + bin);
		
		scanner.close();
	}


private static String convertirABinario(int decimalNumber) {
    if (decimalNumber == 0) {
        return "0"; // Caso especial para el número 0
    }

    StringBuilder binaryStringBuilder = new StringBuilder();

    while (decimalNumber > 0) {
        int remainder = decimalNumber % 2;
        binaryStringBuilder.insert(0, remainder); // Insertar el residuo al principio

        decimalNumber /= 2; // Dividir el número por 2 para la próxima iteración
    }

    return binaryStringBuilder.toString();
}
}
