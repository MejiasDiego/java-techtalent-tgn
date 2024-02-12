package UD5;


	import java.util.Scanner;

	public class UD5_10 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Pedir al usuario el número de ventas
	        System.out.print("Introduce el número de ventas: ");
	        int numeroVentas = scanner.nextInt();

	        // Variables para almacenar la suma total de ventas
	        double sumaVentas = 0;

	        // Pedir al usuario las ventas y calcular la suma
	        for (int i = 1; i <= numeroVentas; i++) {
	            System.out.print("Introduce la venta #" + i + ": ");
	            double venta = scanner.nextDouble();
	            sumaVentas += venta;
	        }

	        // Mostrar la suma total de ventas
	        System.out.println("La suma total de ventas es: " + sumaVentas);

	        scanner.close();
	    }
	}


