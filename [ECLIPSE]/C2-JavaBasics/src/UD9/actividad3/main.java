package UD9.actividad3;


public class main {

	public static void main(String[] args) {
		Libro l1 = new Libro("12345", "Luz", "Juan", 200);
		Libro l2 = new Libro("56789", "Oscuridad", "Pedro", 150);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		System.out.println("\nEl libro con más páginas:\n" + l1.compararPaginas(l2).toString());
	}

}