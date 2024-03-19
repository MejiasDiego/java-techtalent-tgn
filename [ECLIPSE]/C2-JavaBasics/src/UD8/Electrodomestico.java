package UD8;

public class Electrodomestico {

	protected final String COLOR_DEFECTO = "blanco";
	protected final double PRECIO_DEFECTO = 100;
	protected final char LETRA_CONSUMO = 'F';
	protected final double PESO_DEFECTO = 5;

	protected String color;
	protected double precio;
	protected char consumo;
	protected double peso;

	public Electrodomestico() {
		this.color = COLOR_DEFECTO;
		this.precio = PRECIO_DEFECTO;
		this.consumo = LETRA_CONSUMO;
		this.peso = PESO_DEFECTO;

	}

	public Electrodomestico(double precio, double peso) {
		this();
		this.precio = precio;
		this.peso = peso;
	}

	public Electrodomestico(String color, double precio, char consumo, double peso) {
		this.precio = precio;

		if 		  (!color.equalsIgnoreCase("azul") 
				&& !color.equalsIgnoreCase("rojo") 
				&& !color.equalsIgnoreCase("blanco")
				&& !color.equalsIgnoreCase("negro") 
				&& !color.equalsIgnoreCase("gris")) {
			this.color = COLOR_DEFECTO;
		} else {
			this.color = color;

		}
		if (consumo < 'A' || 'F' < consumo) {
			this.consumo = LETRA_CONSUMO;
		} else {
			this.consumo = consumo;
		}
		this.peso = peso;
	}

	
	public void imprimirElectrodomestico() {
		System.out.println("Electrodomestico [" + "\nprecio: " + this.precio + "\ncolor: " + this.color + "\nconsumo: " 
				+ this.consumo + "\npeso: " + this.peso +"]"); 

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
