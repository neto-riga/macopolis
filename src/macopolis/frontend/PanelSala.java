package macopolis.frontend;

/*******************
última modificación:
	19-11-2021
*******************/

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;


public class PanelSala extends JPanel{
	
	private ArrayList<JButton> asientosBotones;
	private JLabel lblPantalla;
	private JLabel lblEdad;
	private JTextArea cajaEdad;
	private JButton btnEdad;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JButton btnCompra;
	
	public PanelSala() {
		setLayout(new BorderLayout());
		TitledBorder border = BorderFactory.createTitledBorder("Asientos disponibles");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		JPanel panelAsientos = new JPanel();
		JPanel panelCompra= new JPanel();
		JPanel panelPantalla = new JPanel();
		
		add(panelPantalla, BorderLayout.NORTH);
		add(panelAsientos, BorderLayout.CENTER);
		add(panelCompra, BorderLayout.SOUTH);
		
		panelAsientos.setLayout(new GridLayout(10,6));
		panelCompra.setLayout(new GridLayout(1, 6));
		
		
		// Agregar los atributos del panel pantalla
		lblPantalla = new JLabel("Pantalla");
		
		//Agregar los campos de compra
		lblEdad = new JLabel("Edad");
//		lblEdad.setBounds(50, 50, 100, 25); 
		
		cajaEdad = new JTextArea();
//		cajaEdad.setBounds(150, 50, 100, 25);
		
		btnEdad = new JButton("Aceptar");
		
		lblPrecio = new JLabel("Total: ");
//		lblPrecio.setBounds(300, 50, 100, 25);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBackground(Color.LIGHT_GRAY);
		txtPrecio.setForeground(Color.BLUE);
//		txtPrecio.setBounds(400, 50, 100, 25);
		
		btnCompra = new JButton("Comprar");
//		btnCompra.setBounds(550, 50, 100, 25);
		
		// Agregar y mostrar los botones de los asientos
		asientosBotones = new ArrayList<JButton>();
		
		for (Integer i = 1; i <= 60 ; i++) {
			asientosBotones.add(new JButton(i.toString()));
			panelAsientos.add(asientosBotones.get(i-1));
		}
		
		panelPantalla.add(lblPantalla);
		
		panelCompra.add(lblEdad);
		panelCompra.add(cajaEdad);
		panelCompra.add(btnEdad);
		panelCompra.add(lblPrecio);
		panelCompra.add(txtPrecio);
		panelCompra.add(btnCompra);
		
	}
}
