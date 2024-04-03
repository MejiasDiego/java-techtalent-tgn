package UD9;

import UD8.Electrodomestico;

public class Main {

	public static void main(String[] args) {
		// Crear objetos de la clase electrodomestico
        Electrodomestico electrodomestico1 = new Electrodomestico ("azul", 200, 'A',5);
        Electrodomestico electrodomestico2 = new Electrodomestico ();

        // Imprimir información de los electrodomesticos
        System.out.println("\nInformación del electrodomestico1:");
        electrodomestico1.imprimirElectrodomestico();
        System.out.println("\nInformación del electrodomestico2:");
        electrodomestico2.imprimirElectrodomestico();
	}

}
	

