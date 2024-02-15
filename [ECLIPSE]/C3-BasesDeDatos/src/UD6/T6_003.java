package UD6;
import java.util.Scanner;
public class T6_003 {

	public static void main(String[] args) {

		//Pedir un número por teclado
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número ");
		int numero =scanner.nextInt();
	
		// Verificar si el número es primo
		boolean verificarPrimo = esNumeroPrimo(numero);
		
		//Mostrar el resultado
		if(verificarPrimo) {
			System.out.println(numero + " es un número primo.");
		} else {
			System.out.println(numero + " 2no es un número primo.");
		}
	}



		// Método para verificar si un número es primo
	public static boolean esNumeroPrimo (int num) {
		if (num<=1) {
			return false; // Los números menores o iguales a 1 no son primos
		}
	

		for (int i=2;i<=Math.sqrt(num);i++) {
			if (num % i ==0 ) {
			return false; //El número es divisible, por lo tanto, no es primo
		}
	}
	
	return true; //Si no se encontraron divisores, el número es primo
	}
}