package UD5;

public class UD5EX_02 {
public static void main(String[] args) {
 for (int multiplicador = 1; multiplicador<=9; multiplicador++) {
	 System.out.println("Tabla de multiplicar del " + multiplicador + ":");
	 for (int i=0; i<=10; i++) { 
		 int resultado = multiplicador * i;
		 System.out.println(multiplicador + "*" + i + "="+ resultado);
	 }
 }
}
	
}
