package UD6;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class T6_004 {

	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Introcue un número para saber su factorial");
		int num = Integer.parseInt(numero);

		JOptionPane.showMessageDialog(null, "El factorial de " + num + " es: " + factorial(num));

	}

public static int factorial (int fac) {
	int resul=1;
	
	for (int operador = fac; operador > 1; operador--) {
		resul*=operador;
	}
	return resul;

}}