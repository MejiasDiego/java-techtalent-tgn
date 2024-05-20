package T10_JavaExceptions;

import java.util.Scanner;

public class t10_04main {

    public static void main(String[] args) {
        int op1 = 0;
        int op2 = 0;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Introduce el primer operando de la operación");
            op1 = scanner.nextInt();

            System.out.println("Introduce el segundo operando de la operación");
            op2 = scanner.nextInt();

            t10_04 operacion = new t10_04(op1, op2);

            System.out.println("Suma: "+ op1 + " + " + op2 + " = " + operacion.sumar() + "\n" + 
            						"Resta: "+op1 + " - " + op2 + " = " + operacion.restar() + "\n" + 
            						"Multiplicación: "+ op1 + " * " + op2 + " = " + operacion.multiplicar() + "\n" + 
            						"Potencia: "+ op1 + " ^ " + op2 + " = " + operacion.potencia() + "\n" + 
                               "Raíz cuadrada(" + op1 + ") = " + operacion.raizCuadrada() + "\n" + 
                               "Raíz cúbica(" + op1 + ") = " + operacion.raizCubica() + "\n" + 
                               "Divisón: "+   op1 + " / " + op2 + " = " + operacion.dividir());

        } catch (Exception e) {
            System.out.println("Error en una operación: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Programa terminado.");
        }
    }
}

