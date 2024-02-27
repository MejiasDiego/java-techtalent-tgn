package EjerciciosEstudiar;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class UD7HashTableApp {
    public static void main(String[] args) {
        // Crear un HashMap con clave de tipo String y valor de tipo Integer
        HashMap<String, Integer> mapa = new HashMap<>();

        // Agregar elementos al HashMap
        mapa.put("Juan", 25);
        mapa.put("María", 30);
        mapa.put("Pedro", 28);

        // Agregar alumnos en un bucle hasta que el usuario decida detenerse
        while (true) {
            agregarAlumno(mapa);
            String respuesta = JOptionPane.showInputDialog("¿Quieres agregar otro alumno? (S/N)");
            if (respuesta != null && respuesta.equalsIgnoreCase("N")) {
                break;
            }
        }

        // Imprimir la lista de alumnos después de salir del bucle
        System.out.println("Lista de Alumnos:");
        for (String nombreAlumno : mapa.keySet()) {
            System.out.println("Nombre: " + nombreAlumno + ", Edad: " + mapa.get(nombreAlumno));
        }

        // Resto de las impresiones que estaban dentro del bucle ahora están aquí


        // Iterar sobre las claves del HashMap
        System.out.println("Claves en el mapa:");
        for (String nombre : mapa.keySet()) {
            System.out.println(nombre);
        }

        // Iterar sobre los valores del HashMap
        System.out.println("Valores en el mapa:");
        for (int edad : mapa.values()) {
            System.out.println(edad);
        }

        // Comprobar si una clave está en el HashMap
        boolean contienePedro = mapa.containsKey("Pedro");
        System.out.println("¿El mapa contiene a Pedro? " + contienePedro);

        // Eliminar un elemento del HashMap
        mapa.remove("María");

        // Obtener el tamaño del HashMap
        int tamaño = mapa.size();
        System.out.println("Tamaño del mapa: " + tamaño);
    }

	private static void agregarAlumno(HashMap<String, Integer> mapa) {
		String nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del alumno:"));
        mapa.put(nombre, edad);
    }
}
		
	

    // Método agregarAlumno aquí...

