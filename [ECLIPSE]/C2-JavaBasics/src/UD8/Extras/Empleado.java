package UD8.Extras;

public class Empleado {
	public String nombre;
	public int edad;
	public double salario;

	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

// Metodo para calcular salario
	public double salarioAnual() {
		return this.salario*12;
		
		}
	public void imprimirEmpleado() {
		System.out.println( "\nNombre del empleado: " + this.nombre + "\nEdad: " + this.edad + "\nSalario: " 
				+ this.salario); 
	}
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Frieren", 30, 1900);
		empleado1.imprimirEmpleado();
		System.out.println("El salario anual de " + empleado1.getNombre() + " es " 
		+ empleado1.salarioAnual()+"€");
	} 
}
