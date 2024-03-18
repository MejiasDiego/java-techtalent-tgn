package UD8;
public class MainPersonaPrueba {

	public static void main(String[] args) {
		// Crear objetos de la clase Persona
        Persona persona1 = new Persona("Joker",25,"123458Z",61, 1.75);
        Persona persona2 = new Persona("Pedro",10,"123421Z",84.3,1.35);

        // Imprimir información de las personas
        System.out.println("Información de la Persona 1:");
        persona1.imprimirInformacion();
        System.out.println("\nInformación de la Persona 2:");
        persona2.imprimirInformacion();
		
	}

}
