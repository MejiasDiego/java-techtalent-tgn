package UD9.actividad2;

public class serie implements launcher{

	private String titulo;
	private int nTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	public serie() {
		this.titulo = "";
		this.nTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	public serie(String titulo, String creador) {
		this();
		this.titulo = titulo;
		this.creador = creador;
	}

	public serie(String titulo, int nTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.nTemporadas = nTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getnTemporadas() {
		return nTemporadas;
	}

	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", nTemporadas=" + nTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public Object compareTo(Object a) {
		serie s = (serie) a;
		int temporadas1 = this.nTemporadas;
		int temporadas2 = s.nTemporadas;
		
		if (temporadas1 >= temporadas2) {
			return this;
		} 
		
		return s;
		
	}

	
}