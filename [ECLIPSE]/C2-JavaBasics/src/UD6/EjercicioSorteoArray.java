package UD6;

import javax.swing.JOptionPane;

public class EjercicioSorteoArray {

	public static void main(String[] args) {
		
		// Pedir nombres de participantes
		String[] participantes = new String [3];
		for (int i=0; i< participantes.length; i++) {
			participantes[i] =JOptionPane.showInputDialog("Ingrese el nombre del participante #" +(i+1));
		}
	
	// Mostrar los participantes 
		StringBuilder participantesList = new StringBuilder("Participantes:\n");
		for (String participante : participantes) {
			participantesList.append("- ").append(participante).append("\n");
		}
		
	JOptionPane.showMessageDialog(null, participantesList.toString(), "Participantes", JOptionPane.INFORMATION_MESSAGE);
	
	// Realizar el sorteo
	int indiceGanador = (int) (Math.random() * participantes.length);
	String ganador = participantes [indiceGanador];
	
	// Mostrar al ganador
	JOptionPane.showMessageDialog(null, "El ganador es; " + ganador + "!","Resultado del Sorteo", JOptionPane.INFORMATION_MESSAGE);
	}
	
	}


