package UD4;

public class CalculoIva {
	public static void main(String[] args) {

	int PrecioProducto = 30;
	final double IVA = 0.21;
	
	System.out.println("Información de "
			+ "producto\n El precio del producto es " +PrecioProducto + "\nEl precio del "
					+ "producto incluyendo el IVA, es "+(PrecioProducto+(PrecioProducto*IVA)));
	
	
	
	}
}