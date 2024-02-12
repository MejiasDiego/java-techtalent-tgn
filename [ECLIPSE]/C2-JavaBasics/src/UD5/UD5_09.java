package UD5;

public class UD5_09 {

    public static void main(String[] args) {
        System.out.println("Números del 1 al 100 divisibles entre 2 y 3:");

        // Utilizar un bucle for para encontrar los números divisibles entre 2 y 3
        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 2 == 0 || numero % 3 == 0) {
                System.out.println(numero);
            }
        }
    }
}

