package UD4;

public class OperadoresRelacion {

	public static void main(String[] args) {
		
		double operador1=10;
		
		double operador2=20;
		
		double operador3=10;
		
		boolean resultado;
		
	
		resultado= operador1==operador2; //¿10 es igual a 20? Falso
		System.out.println(resultado);
		
		resultado= operador1==operador3; //¿10 es igual a 10? True
		System.out.println(resultado);

		resultado= operador1!=operador2; //¿10 es distinto a 20? True
		System.out.println(resultado);		
		
		resultado= operador1>operador2; //¿10 es mayor que 10? False
		System.out.println(resultado);	
		
		resultado= operador1>operador3; //¿10 es menor a 20? True
		System.out.println(resultado);	
		
		resultado= operador1<operador2; //¿10 es mayor o igual que 10? False
		System.out.println(resultado);
		
		resultado= operador1<=operador3; //¿10 es menor o igual que 20? True
		System.out.println(resultado);	
		
		
		
		
		
	}

}
