package macopolis.backend;

/*******************
última modificación:
	29-11-2021
*******************/

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Sala {
	private Pelicula peli;
	private ArrayList<Boleto> boletos;
	private String horario;
	
	private final static int NUM_ASIENTOS = 60;
	private final static float PRECIO_BOLETO = 60;
	
	public Sala(Pelicula peli) {
		this.peli = peli;
		boletos = new ArrayList<Boleto>();
		
		for (int i = 0; i<NUM_ASIENTOS; i++) {
			boletos.add(new Boleto(i+1));
		}
	}
	
	public Sala() {
		
	}
	
	public Pelicula getPeli() {
		return peli;
	}
	public void setPeli(Pelicula peli) {
		this.peli = peli;
	}
	public ArrayList<Boleto> getBoletos() {
		return boletos;
	}
	public void setBoletos(ArrayList<Boleto> boletos) {
		this.boletos = boletos;
	}
	
	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public ArrayList<Boleto> boletosDisponibles() {
		ArrayList<Boleto> disponibles = new ArrayList<Boleto>();
		for (Boleto boleto : boletos) {
			if(! boleto.isComprado()) {
				disponibles.add(boleto);
			}
		}
		
		return disponibles;
	}
	
	public void imprimeBoletosDisponibles() {
		String posicion = "";
		int i = 1;
		for (Boleto boleto : boletosDisponibles()) {
			if(i%15 != 0)
				posicion += ((Integer) boleto.getLugar()).toString() + ", ";
			else
				posicion += ((Integer) boleto.getLugar()).toString() + "\n";

			i++;
		}
		
		JOptionPane.showMessageDialog(null, posicion);
	}
	
	public float compraBoleto(int edad, int lugar) {
		
		boletos.get(lugar-1).setComprado(true);
		if (edad < 12) {
			return (float) (PRECIO_BOLETO * 0.8);
		}else if(edad > 65) {
			return (float) (PRECIO_BOLETO * 0.4);
		}
		
		return PRECIO_BOLETO;
	}
	
/*******Main para hacer pruebas*************/
	
	public static void main(String[] args) {
		Sala sala1 = new Sala(new Pelicula("La la land"));
		sala1.compraBoleto(30, 5);
		sala1.compraBoleto(30, 24);
		sala1.imprimeBoletosDisponibles();
	}
}
