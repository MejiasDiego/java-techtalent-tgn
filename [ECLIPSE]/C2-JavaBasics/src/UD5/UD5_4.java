package UD5;
import java.util.Scanner;

public class UD5_4 {

	public static void main(String[] args) {
		// Declarar la constante PI
		final double PI = Math.PI;

		// Solicitar al usuario el radio del círculo
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el radio del círculo: ");
		String radioString = scanner.nextLine();

		// Convertir el radio de String a double
		double radio = Double.parseDouble(radioString);

		// Calcular el área del círculo usando la fórmula: pi * radio^2
		double area = PI * Math.pow(radio, 2);
		
		//Mostrar el resultado
		System.out.println("El área del circulo con radio " + radio + " saes: " + area);

	}

}
