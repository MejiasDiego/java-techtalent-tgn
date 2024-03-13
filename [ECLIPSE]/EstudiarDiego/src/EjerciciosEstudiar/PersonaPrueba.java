package EjerciciosEstudiar;

// Definir clase Persona
class Persona {
	// Atributos
	private String nombre;
	private	int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// Método para imprimir info 
	// de cada Persona

	public void imprimirInformacion() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);

	}
	
}
