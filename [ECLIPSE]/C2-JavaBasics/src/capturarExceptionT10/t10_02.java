package capturarExceptionT10;


public class t10_02 extends Exception {
	
		public static void main(String[] args) {
			System.out.println("Mensaje mostrado por pantalla");
			try {
				throw new t10_02();
			} catch (t10_02 e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Programa terminado.");
		}

	}