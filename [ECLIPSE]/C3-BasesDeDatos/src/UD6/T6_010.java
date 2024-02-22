package UD6;
import java.util.Scanner;

public class T6_010 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un tamaño de array: ");
		int size = scanner.nextInt();
		int array9[]=new int [size];
		for (int i =0; i< array9.length;i++) {
			array9[i]=(int) (Math.random()*10);
		}
		
		for (int i =0; i< array9.length;i++)
		System.out.println("{"+array9[i]);
		}
}
