package macopolis.frontend;

/*******************
última modificación:
	30-11-2021
*******************/

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InterfazMacopolis extends JFrame{
	
	private PanelPelicula panelPelicula;
	private PanelSala panelSala;
	private PanelNavegacion panelNavegacion;

	public InterfazMacopolis() {
		setTitle("Aplicación Macopolis");
		setSize(800, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout( new BorderLayout());
		
//		aplicacionCurso = new AplicacionCurso();
//		
		panelPelicula = new PanelPelicula();
		panelSala = new PanelSala();
		panelNavegacion = new PanelNavegacion();
		
		add(panelPelicula, BorderLayout.NORTH);
		add(panelSala, BorderLayout.CENTER);
		add(panelNavegacion, BorderLayout.SOUTH);
//		
//		mostrarInformacionAlumno(aplicacionCurso.getAlumnoActual());
	}
	
	public static void main(String[] args) {
		InterfazMacopolis interfaz = new InterfazMacopolis();
		interfaz.setVisible(true);

	}

}
