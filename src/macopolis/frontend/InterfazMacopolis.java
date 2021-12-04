package macopolis.frontend;

/*******************
�ltima modificaci�n:

	03-12-2021
*******************/

import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

import macopolis.backend.AplicacionMacopolis;

public class InterfazMacopolis extends JFrame{
	
	private PanelPelicula panelPelicula;
	private PanelSala panelSala;
	private PanelNavegacion panelNavegacion;
	private AplicacionMacopolis aplicacionMacopolis;

	public InterfazMacopolis() {
		setTitle("Aplicaci�n Macopolis");
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

	}
	
	public static void main(String[] args) {
		InterfazMacopolis interfaz = new InterfazMacopolis();
		interfaz.setVisible(true);

	}

//	//M�todo encargado de invocar el m�todo que regresa la sala siguiente
//		public void siguiente() {
//			Sala salas = .getSalaSiguiente();
//			//mostrarInformacionSala(sala);
//		}
//		
//	//M�todo encargado de invocar el m�todo que regresa la sala anterior
//		public void anterior() {
//			Sala salas= aplicacionCursos.getSalaAnterior();
//			//mostrarInformacionSala(sala);
//		}

}