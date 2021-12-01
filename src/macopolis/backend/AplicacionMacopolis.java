package macopolis.backend;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/*******************
última modificación:
	05-11-2021
*******************/

public class AplicacionMacopolis {
	private ArrayList<Sala> salas;
	
	public ArrayList<Sala> salasDisponibles() {
		ArrayList<Sala> salasDisponibles = new ArrayList<Sala>();
		for (Sala sala : salas) {
			salasDisponibles.add(sala);
		}
		
		return salasDisponibles;
	}
	
	public void imprimeSalasDisponibles() {
		String salas = "";
		
		for(Sala sala : salasDisponibles()) {
			salas.concat(sala.getPeli() + sala.getHorario() + "\n");
		}
		
		JOptionPane.showMessageDialog(null, salas);
	}

	public ArrayList<Sala> getSalas() {
		return salas;
	}

	public void setSalas(ArrayList<Sala> salas) {
		this.salas = salas;
	}
}
