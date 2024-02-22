package UD6;

import java.util.Scanner;

public class T6_006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese un número entero positivo
		System.out.print("Ingresa un número entero positivo: ");

		// Validar que se ingrese un número entero positivo
		while (!scanner.hasNextInt()) {
			System.out.println("Por favor, ingresa un número entero positivo.");
			System.out.print("Ingresa un número entero positivo: ");
			scanner.next(); // Limpiar el buffer de entrada
		}

		int numero = scanner.nextInt();

		// Verificar si el número es positivo
		if (numero < 0) {
			System.out.println("Por favor, ingresa un número entero positivo.");
		} else {
			// Llamar al método para contar las cifras y mostrar el resultado
			int cantidadCifras = contarCifras(numero);
			System.out.println("El número de cifras es: " + cantidadCifras);
		}

		scanner.close();
	}

	// Método para contar las cifras de un número
	public static int contarCifras(int num) {
		// Convertir el número a cadena y obtener su longitud
		return Integer.toString(num).length();
	}
}
