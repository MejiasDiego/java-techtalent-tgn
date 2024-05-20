package capturarExceptionT10;

public class miExcepcion extends Exception{
	
	private int i;
	public miExcepcion(int i) {
		super();
		this.i=i;
	}
	
	public String recibirMensaje() {
		String mensaje="";
		if (this.i%2==0) {
			mensaje = "El número es par.";
		} else {
			mensaje="El número es impar";
		}
		return mensaje;
	}
		
	}
	

