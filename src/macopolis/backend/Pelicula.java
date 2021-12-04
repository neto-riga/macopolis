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
	private String foto;

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

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
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
	
	public String sinopsisSaltosLinea() {
		String cambiada = "";
		for (int i = 0; i< sinopsis.length(); i++) {
			cambiada += sinopsis.substring(i, i+1);
			if (i%60 == 0 && i!= 0) {
				cambiada += "\n";
			}
		}
		
		return cambiada;
	}

	public Pelicula(String titulo, Integer duracion, Integer edadMinima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}
	public Pelicula(String titulo, Integer duracion, Genero genero, String director, String sinopsis, String foto) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.genero = genero;
		this.director = director;
		this.sinopsis = sinopsis;
		this.foto = foto;
	}
	public Pelicula(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	
	public static void main(String[] args) {
		String sinopsisA = "Once upon a time, in a far away swamp, there lived an ogre named Shrek (Mike Myers) whose precious solitude is suddenly shattered by an invasion of annoying fairy tale characters. They were all banished from their kingdom by the evil Lord Farquaad (John Lithgow). Determined to save their home -- not to mention his -- Shrek cuts a deal with Farquaad and sets out to rescue Princess Fiona (Cameron Diaz) to be Farquaad's bride. Rescuing the Princess may be small compared to her deep, dark secret.";
		Pelicula test = new Pelicula(sinopsisA);
		System.out.print(test.sinopsisSaltosLinea());
	}
}