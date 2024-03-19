package UD8;

public class Serie {

	public String titulo;
	public String creador;
	public String genero;
	public int temporadas;
	public boolean entregado;

	public Serie() {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = genero;
		this.temporadas = 3;
		this.entregado = false;

	}

	public Serie(String titulo, String creador) {
		this();
		this.titulo = "Frieren";
		this.creador = "Kanehito Yamada";
	}

	public Serie(String titulo, String creador, String genero, int temporadas) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = genero;
		this.temporadas = temporadas;
}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	
	public void imprimirSerie() {
		System.out.println("Serie [" + "\nTítulo: " + this.titulo + "\ntemporadas: " + this.temporadas + "\ngenero: " 
				+ this.genero + "\ncreador: " + this.creador +"]"); 
}
}