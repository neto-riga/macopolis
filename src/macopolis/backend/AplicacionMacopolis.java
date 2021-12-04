package macopolis.backend;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

/*******************
última modificación:
	04-12-2021
*******************/

public class AplicacionMacopolis {
	private ArrayList<Sala> salas;
	private Integer posicionSalaActual;
//	private ArrayList<Pelicula> peliculas;
	
	public AplicacionMacopolis(){
		posicionSalaActual=0;
		
		salas = new ArrayList<Sala>();
		
		String sinopsisLalaland = "La película cuenta la historia de Mia, una empleada de un bar que aspira a ser una gran actriz y Sebastian, un pianista de jazz desempleado con grandes ambiciones. A pesar de sus diferencias y sus distintas personalidades, gracias a una serie de acontecimientos harán que sus caminos acaben cruzándose.";
		Pelicula lalaland = new Pelicula("La la land", 120, Genero.B, "Damien Chazelle", sinopsisLalaland, "LALALAND");
		salas.add(new Sala(lalaland, new Date()));
		
		String sinopsisShrek = "Once upon a time, in a far away swamp, there lived an ogre named Shrek (Mike Myers) whose precious solitude is suddenly shattered by an invasion of annoying fairy tale characters. They were all banished from their kingdom by the evil Lord Farquaad (John Lithgow). Determined to save their home -- not to mention his -- Shrek cuts a deal with Farquaad and sets out to rescue Princess Fiona (Cameron Diaz) to be Farquaad's bride. Rescuing the Princess may be small compared to her deep, dark secret.";
		Pelicula shrek = new Pelicula("Shrek", 132, Genero.A, "Vicky Jenson", sinopsisShrek, "SHREK");
		salas.add(new Sala(shrek, new Date()));
	}
	
	public Sala getSalaActual() {
		return salas.get(posicionSalaActual);
	}
	
	public Sala getSalaAnterior() {
		if (posicionSalaActual == 0) {
			posicionSalaActual = salas.size() - 1;
			return salas.get(posicionSalaActual);
		}
		
		posicionSalaActual--;
		return salas.get(posicionSalaActual);
	}
	
	public Sala getSalaSiguiente() {
		if (posicionSalaActual == salas.size() - 1) {
			posicionSalaActual = 0;
			return salas.get(posicionSalaActual);
		}
		posicionSalaActual++;
		return salas.get(posicionSalaActual);
	}
	
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
	
	
	public void imprimeSalasDisponibles() {
		String salas = "";
		
		for(Sala sala : this.salas) {
			salas.concat(sala.getPeli() + sdf.format(sala.getHorario()) + "\n");
		}
		
		JOptionPane.showMessageDialog(null, salas);
	}

	public ArrayList<Sala> getSalas() {
		return salas;
	}

	public void setSalas(ArrayList<Sala> salas) {
		this.salas = salas;
	}

//	public ArrayList<Pelicula> getPeliculas() {
//		return peliculas;
//	}
//
//	public void setPeliculas(ArrayList<Pelicula> peliculas) {
//		this.peliculas = peliculas;
//	}
}
