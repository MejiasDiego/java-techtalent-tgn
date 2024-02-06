package UD5;
import java.util.Scanner;

public class UD5_5 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca un número
        System.out.print("Introduce un número: ");

        // Leer la línea completa de texto introducido por el usuario
        String input = scanner.nextLine();

        try {
            // Convertir el input a un número entero
            int numero = Integer.parseInt(input);

            // Verificar si el número es divisible por 2
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es divisible por 2.");
            } else {
                System.out.println("El número " + numero + " no es divisible por 2.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingresa un número válido.");
        }

        // Cerrar el scanner para evitar pérdida de recursos
        scanner.close();
    }
}
