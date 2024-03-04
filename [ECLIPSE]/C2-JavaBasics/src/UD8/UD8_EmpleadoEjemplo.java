package UD8;

public class UD8_EmpleadoEjemplo {
	// Atributos

	private String nombre;
	private String apellido;
	private int edad;
	private double salario;

	// Metodos
	public boolean plus (double sueldoPlus) {
		boolean aumento=false;
		if (edad>40) {
			salario+=sueldoPlus;
			aumento=true;
		}	
		return aumento;
		
	
		}
	}
