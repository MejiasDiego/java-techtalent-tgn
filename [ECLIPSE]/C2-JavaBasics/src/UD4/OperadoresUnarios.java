package UD4;

public class OperadoresUnarios {

	public static void main(String[] args) {
	
		int operador=10, x=0;
		operador++; //operador = 11
		operador++; //operador = 12
		operador--; //operador = 11
		
		x=operador++; //x = 11, operador = 12
		
		x=++operador; //x = 13, operador = 13
	System.out.println(x);
	}

}
