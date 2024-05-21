package T10_JavaExceptions;

import java.util.Random;

import capturarExceptionT10.miExcepcion;

public class t10_03 {

	public static void main(String[] args) {
		Random random = new Random();
		int numeroRandom = random.nextInt(1000);
		System.out.println("Generando número "
				+ "aleatorio...");
		try {
			System.out.println("El número "
					+ "aleatorio generado es:"
					+numeroRandom);
				throw new miExcepcion(numeroRandom);
			} catch (miExcepcion e) {
				System.out.println(e.recibirMensaje());
			}

		finally {
			System.out.println("Programa terminado.");
		}		
	
}
}