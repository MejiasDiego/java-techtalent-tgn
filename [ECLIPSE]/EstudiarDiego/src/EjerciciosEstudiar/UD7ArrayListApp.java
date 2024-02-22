package EjerciciosEstudiar;

import java.util.ArrayList;

public class UD7ArrayListApp {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		lista.add("Elemento 3");
		lista.add("Elemento 4");
		lista.add("Elemento 5");
		for(Object o:lista) {
			System.out.println(o);
		}
		System.out.println(lista.toString());

		ArrayList<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(3);
		listaNumeros.add(4);
		listaNumeros.add(5);
		for(Object o:lista) {
			System.out.println("______\n Añadir número");
	}

}
}