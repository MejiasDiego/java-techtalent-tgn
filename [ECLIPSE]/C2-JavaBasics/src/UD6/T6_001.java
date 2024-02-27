package UD6;

import javax.swing.JOptionPane;

public class T6_001 {

	public static void main(String[] args) {
		
		String poligono = JOptionPane.showInputDialog("Introduce el polígono cuyo area calcular :");
		
		switch(poligono.toLowerCase()) {
			case "circulo":
			//1. Crear variable(s) de parametro(s)
			//2. Pedir los valores
				double parm1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del circulo:"));
				//3. Llamar al método y mostrar
				double resultado=circulo(parm1);
				JOptionPane.showMessageDialog(null, "El resultado del área del circulo es: " + resultado);
				break;
		
			
			case "triangulo":
				//1. Crear variable(s) de parametro(s)
				//2. Pedir los valores
				double parm2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del triangulo:"));
				double parm3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del triangulo:"));

				//3. Llamar al método
				double resultado2=triangulo(parm2,parm3);
				JOptionPane.showMessageDialog(null, "El resultado del área del triangulo es: " + resultado2);
				break;
	
			case "cuadrado":
				//1. Crear variable(s) de parametro(s)
				//2. Pedir los valores
				double parm4 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado del cuadrado:"));

				//3. Llamar al método
				double resultado3=cuadrado(parm4);
				JOptionPane.showMessageDialog(null, "El resultado del área del cuadrado es: " + resultado3);
				break;
			default:
				JOptionPane.showMessageDialog(null,"Esto no es un polgino");
		
		
		}
		
	}

	public static double circulo(double radio) {

		return (radio * radio) * Math.PI;
	}

	public static double triangulo(double base, double altura) {

		return (base * altura) / 2;
	}

	public static double cuadrado(double lado) {

		return lado * lado;
	}
}
