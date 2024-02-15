package EjerciciosEstudiar;

public class HojaDePruebas2 {
	

public static void main(String[] args) {
	// Crear una cadena (String)
	String mensaje = "Hola, mundo!";
	
	// Obtener la longitud de la cadena
	int longitud = mensaje.length();
	
	// Obtener un carácter en una posición específica
	char primerCaracter = mensaje.charAt(7);
	System.out.println("Primer carácter: " + primerCaracter);
	
	// Concatenar cadenas
	String nuevaCadena = mensaje + "Bienvenido";
	System.out.println("Nueva cadena: "+nuevaCadena);
	
	// Comparar cadenas
	String otraCadena ="Hola, mundo!";
	boolean sonIguales =mensaje.equals(otraCadena);
	System.out.println("¿Son iguales?" +sonIguales);
	
	
	
}
	
}	
