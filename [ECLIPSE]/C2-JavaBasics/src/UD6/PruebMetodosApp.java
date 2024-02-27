package UD6;

public class PruebMetodosApp{

	public static void main(String[] args) {
		int operador1=-6, operador2=5;
		int resultado = sumarNumeros(operador1, operador2);
		System.out.println("El resultado de la suma es: " +resultado);
		
		if (positivo(resultado)) {
			System.out.println("El resultado de la suma es: ");
		} else {
			System.out.println("El resultado es negativo");
		}

	}
	
	public static int sumarNumeros(int num1, int num2) {
		
		
		return num1+num2;
		}
		
	public static boolean positivo (int param1) {
		if (param1 >=0) {
		return true;
		} else {
		return false;
		}
		//Ejercicio: divide este método sumaNumeros() en dos,
		//El primero se llama sumaNumeros(int num1, int num2) y
		//Devuelve un int del cálculo de la suma
		//El segundo se llama  postivo(int param1) pero devuelve
		//un booleano 
	}
	
	

}