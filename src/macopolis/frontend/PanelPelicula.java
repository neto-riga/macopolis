package macopolis.frontend;

/*******************
última modificación:
	19-11-2021
*******************/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import java.text.SimpleDateFormat;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

public class PanelPelicula extends JPanel{
	
	private JLabel lbTitulo;
	private JLabel lbDuracion;
	private JLabel lbClasificacion;
	private JLabel lbDirector;
	private JLabel lbSinopsis;
	
	private JTextField txtTitulo;
	private JTextField txtDuracion;
	private JTextField  txtClasificacion;
	private JTextField txtDirector;
	private JTextField txtSinopsis;
	
	private JLabel lbImagen;
	
	public PanelPelicula() {
		BorderLayout borderLayout = new BorderLayout();
	
		setLayout(borderLayout);
		borderLayout.setHgap(20);
		
		TitledBorder border = BorderFactory.createTitledBorder("Película");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		JPanel panelDatosPelicula = new JPanel();
		JPanel panelPosterPelicula = new JPanel();
		JPanel panelSinopsisPelicula = new JPanel();
		
		add(panelDatosPelicula, BorderLayout.WEST);
		add(panelSinopsisPelicula, BorderLayout.CENTER);
		add(panelPosterPelicula, BorderLayout.EAST);
		
		lbTitulo = new JLabel("Título: ");
		lbDuracion = new JLabel("Duración: ");
		lbClasificacion = new JLabel("Clasificación: ");
		lbDirector = new JLabel("Director: ");
		lbSinopsis = new JLabel("Sinopsis: ");
		
		txtTitulo = new JTextField();
		txtTitulo.setEditable(false);
		txtTitulo.setBackground(Color.LIGHT_GRAY);
		txtTitulo.setForeground(Color.BLUE);

		txtDuracion = new JTextField();
		txtDuracion.setEditable(false);
		txtDuracion.setBackground(Color.LIGHT_GRAY);
		txtDuracion.setForeground(Color.BLUE);

		txtClasificacion = new JTextField();
		txtClasificacion.setEditable(false);
		txtClasificacion.setBackground(Color.LIGHT_GRAY);
		txtClasificacion.setForeground(Color.BLUE);
		
		txtDirector = new JTextField();
		txtDirector.setEditable(false);
		txtDirector.setBackground(Color.LIGHT_GRAY);
		txtDirector.setForeground(Color.BLUE);

		txtSinopsis = new JTextField();
		txtSinopsis.setEditable(false);
		txtSinopsis.setBackground(Color.LIGHT_GRAY);
		txtSinopsis.setForeground(Color.BLUE);
		
		panelDatosPelicula.setLayout(new GridLayout(5,2));
		panelSinopsisPelicula.setLayout(new GridLayout(2,1));
		
		panelDatosPelicula.add(lbTitulo);
		panelDatosPelicula.add(txtTitulo);
		panelDatosPelicula.add(lbDuracion);
		panelDatosPelicula.add(txtDuracion);
		panelDatosPelicula.add(lbClasificacion);
		panelDatosPelicula.add(txtClasificacion);
		panelDatosPelicula.add(lbDirector);
		panelDatosPelicula.add(txtDirector);
		
		panelSinopsisPelicula.add(lbSinopsis);
		panelSinopsisPelicula.add(txtSinopsis);
		
		lbImagen = new JLabel("Poster Película");
		panelPosterPelicula.add(lbImagen);

	}
	
}
