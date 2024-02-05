package UD4;

public class T04_5App {
    public static void main(String[] args) {
        // Declarar y asignar valores a las variables
        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;

        // Mostrar valores originales
        System.out.println("Valores originales:");
        System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", d: " + d);

        // Realizar intercambio de valores
       int temp=b;
        b = c;
        c = a;
        a = d;
        d = temp;

        // Mostrar valores después del intercambio
        System.out.println("\nValores después del intercambio:");
        System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", d: " + d);
    }
}
