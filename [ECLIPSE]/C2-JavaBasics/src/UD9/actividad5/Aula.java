package UD9.actividad5;

import java.util.Arrays;

public class Aula {

	private int id;
	private int maxEstudiantes;
	private Asignatura Asignatura;
	private Alumno[] alumnos;
	private Profesor profesor;

	public Aula() {
		this.id = 0;
		this.maxEstudiantes = 10;
		this.Asignatura = Asignatura.gimnasia;
		this.alumnos = new Alumno[this.maxEstudiantes];
		this.profesor = null;
	}

	public Aula(int id, int maxEstudiantes, Asignatura materia, Profesor profesor) {
		this.id = id;
		this.maxEstudiantes = maxEstudiantes;
		this.Asignatura = materia;
		this.alumnos = new Alumno[maxEstudiantes];
		this.profesor = profesor;
	}

	public Aula(int id, int maxEstudiantes, Asignatura materia, Alumno[] alumnos, Profesor profesor) {
		this.id = id;
		this.maxEstudiantes = maxEstudiantes;
		this.Asignatura = materia;
		this.alumnos = alumnos;
		this.profesor = profesor;
	}

	public boolean darClase() {
		return ((!this.profesor.estaAusente()) && (this.profesor.getMateria() == this.Asignatura)
				&& (alumnosDisponibles()));
	}

	public boolean alumnosDisponibles() {
		int count = 0;
		for (int i = 0; i < this.alumnos.length; i++) {
			if (this.alumnos[i].estaAusente()) {
				count++;
			}
		}
		// System.out.println("cuenta " + count);
		return (count < (this.alumnos.length / 2));
	}

	public void entregarNotas() {
		if (darClase()) {
			int hombresAprobados = 0, mujeresAprobadas = 0;
			for (int i = 0; i < this.alumnos.length; i++) {
				if (this.alumnos[i].getSexo() == Sexo.H) {
					if (this.alumnos[i].getNota() >= 5) {
						hombresAprobados++;
					}
				} else {
					if (this.alumnos[i].getNota() >= 5) {
						mujeresAprobadas++;
					}
				}

				// System.out.println(this.alumnos[i].getNombre() + ": " +
				// this.alumnos[i].getNota());
			}
			System.out.println("Hombres aprobados: " + hombresAprobados);
			System.out.println("Mujeres aprobadas: " + mujeresAprobadas + "\n");
		} else {
			System.out.println("No se ha podido dar clase\n");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxEstudiantes() {
		return maxEstudiantes;
	}

	public void setMaxEstudiantes(int maxEstudiantes) {
		this.maxEstudiantes = maxEstudiantes;
	}

	public Asignatura getMateria() {
		return Asignatura;
	}

	public void setMateria(Asignatura materia) {
		this.Asignatura = materia;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		return "Aula [id=" + id + ", maxEstudiantes=" + maxEstudiantes + ", materia=" + Asignatura + ", alumnos="
				+ Arrays.toString(alumnos) + ", profesor=" + profesor + "]";
	}

}
