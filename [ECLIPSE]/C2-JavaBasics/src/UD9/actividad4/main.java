package UD9.actividad4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		Raices r = new Raices(a, b, c);
		r.calcular();
	}

}