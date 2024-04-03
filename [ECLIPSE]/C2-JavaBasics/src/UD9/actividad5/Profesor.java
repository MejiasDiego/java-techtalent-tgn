package UD9.actividad5;


public class Profesor extends Persona {

	private Asignatura Asignatura;

	public Profesor() {
		super();
		this.Asignatura = Asignatura.gimnasia;
	}

	public Profesor(String nombre, int edad, Sexo sexo, Asignatura materia) {
		super(nombre, edad, sexo);
		this.Asignatura = materia;

	}

	@Override
	// 20% true 80% false
	public boolean estaAusente() {
		int random = (int) (Math.random() * 5);
		//System.out.println("Profesor ausente: " + random);
		return (random == 0);
	}

	public Asignatura getMateria() {
		return Asignatura;
	}

	public void setMateria(Asignatura Asignatura) {
		this.Asignatura = Asignatura;
	}

	@Override
	public String toString() {
		return "Profesor [materia=" + Asignatura + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}

	

}