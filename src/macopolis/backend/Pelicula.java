package macopolis.backend;

/*******************
última modificación:
	04-12-2021
*******************/
public class Pelicula {

	private String titulo;
	private Integer duracion;
	private Integer edadMinima;
	private String director;
	private Genero genero;
	private String sinopsis;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public Integer getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(Integer edadMinima) {
		this.edadMinima = edadMinima;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public void minEdadToGenero() {
		if (edadMinima == 0) {
			genero = Genero.A;
		}else if (edadMinima == 12) {
			genero = Genero.B;
		}else if(edadMinima == 15) {
			genero = Genero.B15;
		}else {
			genero = Genero.C;
		}
	}

	public Pelicula(String titulo, Integer duracion, Integer edadMinima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}
	public Pelicula(String titulo) {
		this.titulo = titulo;
	}
}