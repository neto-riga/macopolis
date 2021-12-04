package macopolis.frontend;

/*******************
última modificación:

	03-12-2021
	16:45
*******************/

import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

import macopolis.backend.AplicacionMacopolis;
import macopolis.backend.Sala;

public class InterfazMacopolis extends JFrame{
	
	private PanelPelicula panelPelicula;
	private PanelSala panelSala;
	private PanelNavegacion panelNavegacion;
	private AplicacionMacopolis aplicacionMacopolis;

	public InterfazMacopolis() {
		setTitle("Aplicación Macopolis");
		setSize(800, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout( new BorderLayout());
		
		aplicacionMacopolis = new AplicacionMacopolis();
		
		panelPelicula = new PanelPelicula();
		panelSala = new PanelSala(this);
		panelNavegacion = new PanelNavegacion(this);
		
		add(panelPelicula, BorderLayout.NORTH);
		add(panelSala, BorderLayout.CENTER);
		add(panelNavegacion, BorderLayout.SOUTH);
		
		mostrarInformacionSala(aplicacionMacopolis.getSalaActual());

	}
	
	public static void main(String[] args) {
		InterfazMacopolis interfaz = new InterfazMacopolis();
		interfaz.setVisible(true);

	}
	
	public void comprarAsiento(Integer k) {
		aplicacionMacopolis.getSalaActual().getBoletos().get(k-1).setComprado(true);
	}
	
	public void mostrarInformacionSala(Sala sala) {
		panelPelicula.actualizarPanel(sala);
		panelSala.actualizarAsientos(sala);
	}
	
	public void siguiente() {
		Sala sala = aplicacionMacopolis.getSalaSiguiente();
		mostrarInformacionSala(sala);
	}
	
	public void anterior() {
		Sala sala = aplicacionMacopolis.getSalaAnterior();
		mostrarInformacionSala(sala);
	}

//	//Método encargado de invocar el método que regresa la sala siguiente
//		public void siguiente() {
//			Sala salas = .getSalaSiguiente();
//			//mostrarInformacionSala(sala);
//		}
//		
//	//Método encargado de invocar el método que regresa la sala anterior
//		public void anterior() {
//			Sala salas= aplicacionCursos.getSalaAnterior();
//			//mostrarInformacionSala(sala);
//		}

}