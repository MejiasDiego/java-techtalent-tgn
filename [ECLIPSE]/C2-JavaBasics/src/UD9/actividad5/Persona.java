package UD9.actividad5;


public abstract class Persona {

	protected String nombre;
	protected int edad;
	protected Sexo sexo;

	public Persona() {
		this.nombre = "Juan";
		this.edad = 20;
		this.sexo = Sexo.H;
	}

	public Persona(String nombre, int edad, Sexo sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public abstract boolean estaAusente();

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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}

}