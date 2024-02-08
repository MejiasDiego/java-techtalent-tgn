package UD5;

import javax.swing.JOptionPane;

public class UD5_6 {

	public static void main(String[] args) {
		// Lee un número por teclado que pida el precio de un producto (puede tener
		// decimales) y
		// calcule el precio final con IVA. El IVA sera una constante que sera del 21%
		// declarar e iniciar constante del IVA

		final double IVA = 0.21;

		// Solicitar al usuario que introduzca el precio del producto utilizando
		// JOptionPane
		String precioString = JOptionPane.showInputDialog(null, "Introduce el precio del producto: ");

		//Convertir el precio introducido por el usuario de String a double
		double precioProducto = Double.parseDouble(precioString);
		
		//Calcular el precio final con IVA
		double precioFinal = precioProducto * (1+IVA);

		//Mostrar el resultado utilizando JOptionPane
		JOptionPane.showMessageDialog(null, "El precio final con IVA es: " + precioFinal);
	}

}
