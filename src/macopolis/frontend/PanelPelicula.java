package macopolis.frontend;

/*******************
última modificación:
	04-12-2021
*******************/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import java.text.SimpleDateFormat;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

import macopolis.backend.Sala;

public class PanelPelicula extends JPanel{
	
	private JLabel lbTitulo;
	private JLabel lbDuracion;
	private JLabel lbClasificacion;
	private JLabel lbDirector;
//	private JLabel lbSinopsis;
	private JLabel lbHorario;
	
	private JTextField txtTitulo;
	private JTextField txtDuracion;
	private JTextField txtClasificacion;
	private JTextField txtDirector;
	private JTextArea txtSinopsis;
	private JTextField txtHorario;
	
	private JLabel lbImagen;
	
	public PanelPelicula() {
		BorderLayout borderLayout = new BorderLayout();
	
		setLayout(borderLayout);
		borderLayout.setHgap(20);
		
		TitledBorder border = BorderFactory.createTitledBorder("Información Película");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		JPanel panelDatosPelicula = new JPanel();
		JPanel panelPosterPelicula = new JPanel();
		JPanel panelSinopsisPelicula = new JPanel();
		
		add(panelDatosPelicula, BorderLayout.WEST);
		add(panelSinopsisPelicula, BorderLayout.CENTER);
		add(panelPosterPelicula, BorderLayout.EAST);
		
		TitledBorder border2 = BorderFactory.createTitledBorder("Sinopsis");
		border2.setTitleColor(Color.BLACK);
		panelSinopsisPelicula.setBorder(border2);
		
		lbTitulo = new JLabel("Título: ");
		lbDuracion = new JLabel("Duración: ");
		lbClasificacion = new JLabel("Clasificación: ");
		lbDirector = new JLabel("Director: ");
//		lbSinopsis = new JLabel("Sinopsis: ");
		lbHorario = new JLabel("Horario: ");
		
		txtTitulo = new JTextField();
		txtTitulo.setEditable(false);
		txtTitulo.setBackground(Color.LIGHT_GRAY);
		txtTitulo.setForeground(Color.BLACK);

		txtDuracion = new JTextField();
		txtDuracion.setEditable(false);
		txtDuracion.setBackground(Color.LIGHT_GRAY);
		txtDuracion.setForeground(Color.BLACK);

		txtClasificacion = new JTextField();
		txtClasificacion.setEditable(false);
		txtClasificacion.setBackground(Color.LIGHT_GRAY);
		txtClasificacion.setForeground(Color.BLACK);
		
		txtDirector = new JTextField();
		txtDirector.setEditable(false);
		txtDirector.setBackground(Color.LIGHT_GRAY);
		txtDirector.setForeground(Color.BLACK);

		txtSinopsis = new JTextArea();
		txtSinopsis.setEditable(false);
		txtSinopsis.setBackground(Color.LIGHT_GRAY);
		txtSinopsis.setForeground(Color.BLACK);
		
		txtHorario = new JTextField();
		txtHorario.setEditable(false);
		txtHorario.setBackground(Color.LIGHT_GRAY);
		txtHorario.setForeground(Color.black);
		
		panelDatosPelicula.setLayout(new GridLayout(6,2));
		panelSinopsisPelicula.setLayout(new GridLayout(1,1));
		
		panelDatosPelicula.add(lbTitulo);
		panelDatosPelicula.add(txtTitulo);
		panelDatosPelicula.add(lbDuracion);
		panelDatosPelicula.add(txtDuracion);
		panelDatosPelicula.add(lbClasificacion);
		panelDatosPelicula.add(txtClasificacion);
		panelDatosPelicula.add(lbDirector);
		panelDatosPelicula.add(txtDirector);
		panelDatosPelicula.add(lbHorario);
		panelDatosPelicula.add(txtHorario);
		
//		panelSinopsisPelicula.add(lbSinopsis);
		panelSinopsisPelicula.add(txtSinopsis);
		
		lbImagen = new JLabel("Poster Película");
		panelPosterPelicula.add(lbImagen);

	}
	
	public void actualizarPanel(Sala sala) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy  HH:mm");
		
		txtTitulo.setText(sala.getPeli().getTitulo());
		txtDuracion.setText(sala.getPeli().getDuracion().toString());
		txtClasificacion.setText(sala.getPeli().getGenero().toString());
		txtDirector.setText(sala.getPeli().getDirector());
		txtHorario.setText(sdf.format(sala.getHorario()));
		
		txtSinopsis.setText(sala.getPeli().sinopsisSaltosLinea());
		
		
		ImageIcon imagenOriginal = new ImageIcon("fotos/" + sala.getPeli().getFoto() + ".png");
//		ImageIcon imagenOriginal = new ImageIcon("fotos/SHREK.png");
		Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120, 150,
				Image.SCALE_SMOOTH);
		lbImagen.setText("");
		lbImagen.setIcon(new ImageIcon(imagenAjustada));
	}
	
}
