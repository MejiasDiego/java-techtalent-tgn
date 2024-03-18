package UD7;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class T7_002 {
	public static void main(String[] args) {
		HashMap<String, Double> carrito = new HashMap<>();

		String respuesta;
		do {
			añadirCarrito(carrito);
			respuesta = JOptionPane.showInputDialog("¿Quieres introducir otro producto? (S/N) ");
		} while (respuesta != null && respuesta.equalsIgnoreCase("S"));

		// Suma total de los productos
		System.out.println(carrito);
		System.out.println("Precio total con IVA: " + totalConIVA(carrito) + "€");
		System.out.println("IVA aplicado: 21%");

		JOptionPane.showMessageDialog(null, "El importe total son " + totalConIVA(carrito) + "€");
		double cartera = Double.parseDouble(JOptionPane.showInputDialog("Introduce " + 
		"con cuanto dinero pagará: "));
		if (cartera < totalConIVA(carrito)) {
			;
			System.out.println("No tienes dinero para pagar la compra");
		} else if (cartera >= totalConIVA(carrito)) {
			double cambio = 0;
			cambio = cartera - totalConIVA(carrito);
			cambio = Math.round(cambio * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null, "Recibes " + cambio + "€ de "
					+ "cambio");
			System.out.println("Recibes" + cambio + "€ de cambio");

		}
	};

	private static void añadirCarrito(HashMap<String, Double> mapa) {
		// Añadir producto y precio con el JOptionPane
		String producto = JOptionPane.showInputDialog("Introduce el nombre del producto:");
		producto = producto.toUpperCase();
		double precioProducto = Double.parseDouble(JOptionPane.showInputDialog("Introduce "
			+ "el precio del producto"));
		System.out.println("Producto: " + producto + ", Precio sin IVA: " + precioProducto + "€");
		/*
		 * Añadir IVA al precio de los productos final double IVA = 0.21;
		 * System.out.println("Producto: " + producto + ", Precio CON IVA: " +
		 * (precioProducto+(precioProducto*IVA)+"€"));
		 */
		mapa.put(producto, precioProducto);
	}

	private static double totalConIVA(HashMap<String, Double> carrito) {
		final double IVA = 0.21;
		double sumaTotalConIVA = 0;

		for (double precio : carrito.values()) {
			sumaTotalConIVA += precio + (precio * IVA);
		}
		return sumaTotalConIVA;
	}
}