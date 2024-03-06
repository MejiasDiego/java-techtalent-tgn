package EjerciciosEstudiar;

import java.util.ArrayList;
import java.util.Iterator;

public class HashComplexPruebas {
	public static void main(String[] args) {

		ArrayList<String> listaAsistencia = new ArrayList<>();

		// Metodo .add añade elementos a nuestra lista
		listaAsistencia.add("Diego");
		listaAsistencia.add("Joker");
		listaAsistencia.add("Morgana");
		System.out.println("ADD");
		System.out.println(listaAsistencia.toString());

		// Metodo .remove, elimina elementos de nuestra lista mediante indice
		listaAsistencia.remove("Joker"); // Elimino el último elemento, no el elemento 2
		System.out.println("REMOVE");
		System.out.println(listaAsistencia.toString());

		// Metodo .size, indica el número de elementos de la lista

		System.out.println("SIZE");
		System.out.println(listaAsistencia.size());

		// Metodo get, devolvemos un elemento de un indice

		System.out.println("GET");
		System.out.println(listaAsistencia.get(0)); // Primer elemento

		// Metodo indexOf, util para saber la posición de un elemento

		System.out.println("INDEXOF");
		System.out.println(listaAsistencia.indexOf("Diego"));

		// Metodo Iterator, util para recorrer un arrayList

		System.out.println("ITERATOR");
		Iterator<String> it = listaAsistencia.iterator();
		boolean nombre;
		while (it.hasNext()) {
			nombre = it.hasNext();
//			System.out.println(nombre);
		}
		//Metodo Clear, elimina todos los elementos
		listaAsistencia.clear();
		System.out.println("CLEAR");
		System.out.println(listaAsistencia.toString());
	}
}