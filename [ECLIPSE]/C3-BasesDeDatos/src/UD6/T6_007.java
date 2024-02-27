package UD6;

import java.util.Scanner;

public class T6_007 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresa la cantidad de euros");

		double cantidadEuros = scanner.nextDouble();

		System.out.println("Ingresa la divisa a la que deseas convertir (libras, dolares o yenes) ");
		String monedaDestino = scanner.next();

		convertirMoneda(cantidadEuros, monedaDestino);

		scanner.close();
	}

	public static void convertirMoneda(double cantidadEuros, String monedaDestino) {
		double tasaCambio = 0.0;
		String monedaNombre = "";

		switch (monedaDestino.toLowerCase()) {

			case "libras":
			tasaCambio = 0.86;
			monedaNombre = "libras";
			break;
		case "dolares":
			tasaCambio = 1.28611;
			monedaNombre = "dólares";
			break;
		case "yenes":
			tasaCambio = 129.852;
			monedaNombre = "yenes";
			break;
		default:
			System.out.println("Moneda no válida");
			return;
		
		}
		double cantidadConvertida= tasaCambio*cantidadEuros;
		System.out.println(cantidadEuros+"€ " + "equivalen a " + cantidadConvertida + "" + monedaNombre);
	
	
	}

	}
