package UD6;

import java.util.Scanner;

public class T6_008 {

	public static void main(String[] args) {
	int arrayEpico[] = new int[10];
	rellenarArray(arrayEpico);
	mostrarArray(arrayEpico);

	}
	
	
	public static void rellenarArray (int[]array) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa valores para el array");
		
		for (int i =0; i<array.length;i++){
			System.out.println("Ingresa el valor de la posición " + i + ": ");
			array[i]=scanner.nextInt();

		}
		}
		public static void mostrarArray(int[]array) {
			System.out.println("Índice\tValor");
			for (int i = 0; i<array.length;i++) {
				System.out.println(i + "\t" + array[i]);
			}
		
}
}