package macopolis.backend;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/*******************
última modificación:
	04-12-2021
*******************/

public class AplicacionMacopolis {
	private ArrayList<Sala> salas;
	private Integer posicionSalaActual;
	private ArrayList<Pelicula> peliculas;
	
	public AplicacionMacopolis(){
		posicionSalaActual=0;
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
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
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

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
}
