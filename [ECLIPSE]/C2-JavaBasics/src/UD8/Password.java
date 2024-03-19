package UD8;

import java.util.Random;
import java.util.Scanner;

public class Password {

	// Atributos
	private int longitud = 8;
	private String contraseña;

	public Password() {
		this.longitud = 8;
		this.contraseña = "";
		generarPass();
	}

	public Password(int longitud) {
		this.longitud = longitud;
		generarPass();
	}

	// Método para generar contraseña aleatoria
	private void generarPass() {
		Random aleatorio = new Random();
		StringBuilder cadena = new StringBuilder();

		// Caracteres que se pueden incluir en la contraseña
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		for (int i = 0; i < longitud; i++) {
			int indice = aleatorio.nextInt(caracteres.length());
			cadena.append(caracteres.charAt(indice));
		}

		contraseña = cadena.toString();

	}

	// Método para obtener la contraseña generada
	public String getContraseña() {
		return contraseña;

	}

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la longitud de la contraseña (o Enter para contraseña por defecto): ");
	        String entrada = scanner.nextLine();

	        int longitud;
	        if (entrada.isEmpty()) {
	            longitud = 8; // Longitud por defecto de 8 si no se proporciona ninguna longitud
	        } else {
	            longitud = Integer.parseInt(entrada);
	        }

	        Password password = new Password(longitud);
	        System.out.println("Contraseña generada: " + password.getContraseña());
	}

}