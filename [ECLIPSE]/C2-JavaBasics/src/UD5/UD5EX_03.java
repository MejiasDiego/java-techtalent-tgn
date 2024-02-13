package UD5;

import java.util.Scanner;

public class UD5EX_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        int suma = 0;

        for (int i = numero; i >= 1; i--) {
            suma += i;
        }

        System.out.println("La suma de " + numero + " con todos los anteriores es: " + suma);

        scanner.close();
    }
}

