package UD4;

public class OperadoresEnJavaPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operador1= 20;
		int operador2= 15;
		double resultado= 0; 
		
		//SUMA
		resultado= operador1+operador2; //resultado 35
		System.out.println("El resultado de la suma es "+ resultado);
		
		//RESTA
		resultado= operador1-operador2; //resultado 5
		System.out.println("El resultado de la resta es "+ resultado);
		
		//MULTIPLICACIÓN
		resultado= operador1*operador2; //resultado 300
		System.out.println("El resultado de la multiplicación es "+ resultado);	
		
		//DIVISIÓN
		resultado= operador1/operador2; //resultado 300
		System.out.println("El resultado de la división es "+ resultado);	
		
		//MODULO
		resultado= operador1%operador2; //resultado 300
		System.out.println("El resultado de la división es "+ resultado);	
	}

}
