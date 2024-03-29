package EjerciciosEstudiar;

public class Frutas {

	// Atributos
	String nombre;
	String color;
	double precio;

	// Constructores

	public Frutas() {
		this.nombre = "";
		this.color = "";
		this.precio = 0.0;
	}

	public Frutas(String param1) {
		this.nombre = "";
		this.color = "";
		this.precio = 0.0;
	}

	public Frutas(String param1, String param2) {
		this.nombre = "";
		this.color = "";
		this.precio = 0.0;
	}

	public Frutas(String param1, String param2, double param3) {
		this.nombre = param1;
		this.color = param2;
		this.precio = 0;
	}

	// Construcciones

	// Métodos

	public static void main(String[] args) {

		Frutas manzana = new Frutas();
		Frutas platano = new Frutas("Plátano");
		Frutas arandanos = new Frutas("Arándanos", "lila");
		Frutas albaricoque = new Frutas("Albaricoque", "naranja", 10.15);

		System.out.println("Mi primera fruta tiene el nombre:: " + manzana.nombre + " y tiene un color igual a "
				+ manzana.color + " y tiene un precio de " + manzana.precio);

		System.out.println("Mi primera fruta tiene el nombre:: " + platano.nombre + " y tiene un color igual a "
				+ platano.color + " y tiene un precio de " + platano.precio);
		
		System.out.println("Mi primera fruta tiene el nombre:: " + arandanos.nombre + " y tiene un color igual a "
				+ arandanos.color + " y tiene un precio de " + arandanos.precio);
	
		System.out.println("Mi primera fruta tiene el nombre: " + albaricoque.nombre + " y tiene un color igual a "
				+ albaricoque.color + " y tiene un precio de " + albaricoque.precio);
	}

}
