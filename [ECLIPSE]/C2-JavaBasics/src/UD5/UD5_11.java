package UD5;

import java.util.Scanner;

public class UD5_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca un día de la semana
        System.out.print("Introduce un día de la semana: ");
        String dia = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para hacer la comparación más flexible

        // Utilizar un switch para determinar si es un día laboral
        switch (dia) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un día laboral.");
                break;
            case "sábado":
            case "sabado":
            case "domingo":
                System.out.println("No es un día laboral.");
                break;
            default:
                System.out.println("Día no válido.");
        }

        scanner.close();
    }
}
