package UD5;

import javax.swing.JOptionPane;

public class UD5_13 {

    public static void main(String[] args) {
        // Solicitar al usuario los operandos y el signo aritmético
        int operando1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer operando (entero):"));
        int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo operando (entero):"));
        String signo = JOptionPane.showInputDialog("Introduce el signo aritmético (+, -, *, /, ^, %):");

        // Realizar la operación correspondiente
        double resultado = realizarOperacion(operando1, operando2, signo);

        // Mostrar el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }

    // Método para realizar la operación según el signo aritmético
    public static double realizarOperacion(int operando1, int operando2, String signo) {
        double resultado = 0;

        switch (signo) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                if (operando2 != 0) {
                    resultado = (double) operando1 / operando2;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: División por cero.");
                }
                break;
            case "^":
                resultado = Math.pow(operando1, operando2);
                break;
            case "%":
                if (operando2 != 0) {
                    resultado = operando1 % operando2;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Módulo por cero.");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Signo aritmético no válido.");
        }

        return resultado;
    }
}
