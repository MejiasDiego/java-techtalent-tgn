package UD8;

public class Persona {
// Atributos
	private String nombre;
	private int edad;
	private String DNI = "34014059D";
	public final String sexo = "Hombre";
	private double peso;
	private double altura;

	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.DNI = "";
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = "";
		this.peso = 0;
		this.altura = 0;

	}

	public Persona(String nombre, int edad, String DNI, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.peso = peso;
		this.altura = altura;
	}

	public void imprimirInformacion() {
		System.out.println("Nombre: " + this.nombre + "\n Edad: " + this.edad + "\n DNI: " + this.DNI + "\n Peso: "
				+ this.peso + "\n Altura: " + this.altura + "\n Sexo: " + this.sexo);

	}
}
