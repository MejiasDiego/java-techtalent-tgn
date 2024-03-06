package UD7;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class T7_001 {

	public static void main(String[] args) {

		HashMap<String, Double> evaluacionAlumnos = new HashMap<>();

		String respuesta;
		do {
			agregarAlumno(evaluacionAlumnos);
			respuesta = JOptionPane.showInputDialog("¿Quieres introducir otro alumno? (S/N) ");
		} while (respuesta != null && respuesta.equalsIgnoreCase("S"));

		System.out.println("Información de Evaluación de Alumnos:");
		for (Map.Entry<String, Double> entry : evaluacionAlumnos.entrySet()) {
			String nombreAlumno = entry.getKey();
			Double notaMedia = entry.getValue();
			System.out.println("Nombre: " + nombreAlumno + ", Nota Media: " + notaMedia);
		}
		System.out.println("Media aritmética " + "de cada alumno: \n" + evaluacionAlumnos);
		JOptionPane.showMessageDialog(null, "Media aritmética " + "de cada alumno: \n" + evaluacionAlumnos);

	}

	// metodo para añadir alumno + numero notas + introducir notas + hacer media
	// nota
	// y luego asocia el alumno con su nota media en el hashmap
	private static void agregarAlumno(HashMap<String, Double> mapa) {

		String nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno:");

		int cantidadNotas = Integer
				.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de notas para el alumno " + nombre + ":"));

		double sumaNotas = 0;
		for (int i = 0; i < cantidadNotas; i++) {
			double nota = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota " + (i + 1) + ":"));
			sumaNotas += nota;

		}
		double notaMedia = sumaNotas / cantidadNotas;
		notaMedia = Math.round(notaMedia * 100.0) / 100.0;

		mapa.put(nombre, notaMedia);
	}

}
