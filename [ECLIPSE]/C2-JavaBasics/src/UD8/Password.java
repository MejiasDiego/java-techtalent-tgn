package UD8;

import java.util.Random;
import java.util.Scanner;

public class Password {

	// Atributos
	private int longitud = 8;
	private String contraseña;

	public Password() {
		this.longitud = 0;
		this.contraseña = "";
		generarPass();
	}

	public Password(int longitud) {
		this.longitud = longitud;
		generarPass();
	}

	// Método para generar contraseña aleatoria
	private void generarPass() {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();

		// Caracteres que se pueden incluir en la contraseña
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		for (int i = 0; i < longitud; i++) {
			int index = random.nextInt(caracteres.length());
			sb.append(caracteres.charAt(index));
		}

		contraseña = sb.toString();

	}

	// Método para obtener la contraseña generada
	public String getContraseña() {
		return contraseña;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese la longitud de la contraseña: ");
		int longitud = scanner.nextInt();
		 Password password1 = new Password(longitud);
	        System.out.println("Contraseña generada: " + password1.getContraseña());
	}

}