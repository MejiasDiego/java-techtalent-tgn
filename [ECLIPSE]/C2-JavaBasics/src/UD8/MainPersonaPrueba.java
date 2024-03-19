package UD8;
public class MainPersonaPrueba {

	public static void main(String[] args) {
		// Crear objetos de la clase Persona
        Persona persona1 = new Persona("Juan",25,"123458Z",61, 1.75);
        Persona persona2 = new Persona("Pedro",10,"123421Z",84.3,1.35);

        // Imprimir información de las personas
        System.out.println("Información de la Persona 1:");
        persona1.imprimirInformacion();
        System.out.println("\nInformación de la Persona 2:");
        persona2.imprimirInformacion();
      
        // Crear objetos de la clase electrodomestico
        Electrodomestico electrodomestico1 = new Electrodomestico ("azul", 200, 'A',5);
        Electrodomestico electrodomestico2 = new Electrodomestico ();

        // Imprimir información de los electrodomesticos
        System.out.println("\nInformación del electrodomestico1:");
        electrodomestico1.imprimirElectrodomestico();
        System.out.println("\nInformación del electrodomestico2:");
        electrodomestico2.imprimirElectrodomestico();
        
        // Crear objetos de la clase Serie
        Serie serie1 = new Serie ("Frieren","Fantasía","Mangaka",1);
        Serie serie2 = new Serie ("Persona 5 Royale","JRPG","Anime",50);

        // Imprimir información de los electrodomesticos
        System.out.println("\nInformación de la serie:");
        serie1.imprimirSerie();
        System.out.println("\nInformación de la serie:");
        serie2.imprimirSerie();
	}

}
