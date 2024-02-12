package UD5;

import java.util.Scanner;

public class UD5_12 {

    public static void main(String[] args) {
        // Definir la contraseña
        String contrasenaCorrecta = "provacontrasenya";

        // Inicializar el contador de intentos
        int intentos = 3;

        // Utilizar un bucle while para solicitar la contraseña hasta que se acierten o se agoten los intentos
        Scanner scanner = new Scanner(System.in);

        while (intentos > 0) {
            System.out.print("Introduce la contraseña: ");
            String intentoContrasena = scanner.nextLine();

            // Verificar si la contraseña es correcta
            if (intentoContrasena.equals(contrasenaCorrecta)) {
                System.out.println("¡Enhorabuena! Contraseña correcta.");
                break;  // Salir del bucle si la contraseña es correcta
            } else {
                intentos--;
                System.out.println("Contraseña incorrecta. Intentos restantes: " + intentos);
            }
        }

        // Si se agotan los intentos, mostrar un mensaje
        if (intentos == 0) {
            System.out.println("Se agotaron los intentos. Acceso denegado.");
        }

        scanner.close();
    }
}

