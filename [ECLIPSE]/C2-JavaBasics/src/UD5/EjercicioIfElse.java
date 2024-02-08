package UD5;

public class EjercicioIfElse {

	public static void main(String[] args) {

		int hora = 20;

		if (hora >=6 && hora <=12) {
			System.out.println("Buenos dias");
		} else if (hora > 12 && hora < 20) {
			System.out.println("Buenas tardes");
		} else {
			System.out.println("Buenas noches");
		}

	}

}
