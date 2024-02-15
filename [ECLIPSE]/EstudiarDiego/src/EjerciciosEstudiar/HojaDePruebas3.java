package EjerciciosEstudiar;

import javax.swing.JOptionPane;

public class HojaDePruebas3 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;
		String operando = JOptionPane.showInputDialog(null, "Introduce el operando: +, -, *, / ");
		
	switch (operando) {
	case "+":
	JOptionPane.showMessageDialog(null,"El resultado de la suma es: " + (num1+num2));
	break;

	case "-":
		JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + (num1-num2));
		break;
	
	case "/":
		JOptionPane.showMessageDialog(null,"El resultado de la división es: " + (num1/num2));
	break;

	case "*":
		JOptionPane.showMessageDialog(null,"El resultado de la multiplicación es: " + (num1*num2));
	break;
	}
	
	}

}
