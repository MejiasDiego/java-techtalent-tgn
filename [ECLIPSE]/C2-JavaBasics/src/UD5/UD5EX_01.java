package UD5;

public class UD5EX_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int multiplicador = 1;
		int limite = 10;
		int i = 0;
		for (i=0; i <= limite; i++) {
			int resultado = multiplicador * i;
			System.out.println(multiplicador + " * " + i + " = " + resultado);
		}
	}
}