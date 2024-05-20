package T10_JavaExceptions;

import java.util.Scanner;

public class t10_05mainPassword {

	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar el tamaño del array de contraseñas
	        System.out.print("Ingrese el tamaño del array de Passwords: ");
	        int tamaño = scanner.nextInt();

	        // Crear el array de Passwords
	        password[] passwordsArray = new password[tamaño];
	        String[] passwordsValues = new String[tamaño];
	        String[] fuertesArray = new String[tamaño];

	        // Llenar el array de Passwords y verificar si son fuertes
	        for (int i = 0; i < tamaño; i++) {
	            System.out.print("Ingresa la longitud de la contraseña: ");
	            int longitud = scanner.nextInt();
	            passwordsArray[i] = new password(longitud);
	            passwordsValues[i] = passwordsArray[i].getContraseña();
	            fuertesArray[i] = passwordsArray[i].esFuerte();
	        }

	        // Mostrar la contraseña y si es o no fuerte
	        for (int i = 0; i < tamaño; i++) {
	            System.out.println(passwordsValues[i] + " " + fuertesArray[i]);
	        }

	        scanner.close();
	    }
	}