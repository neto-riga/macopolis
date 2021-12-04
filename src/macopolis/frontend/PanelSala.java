package macopolis.frontend;

/*******************
última modificación:
	04-12-2021
	12:38 p.m.
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
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;


public class PanelSala extends JPanel implements ActionListener{
	

	private ArrayList<JButton> asientosBotones;
	private ArrayList<String> asientos;
	private JLabel lblPantalla ;
	private JLabel lblEdad;
	private JTextArea cajaEdad;
	private JButton btnEdad;
	private static final String ACEPTAR_EDAD = "ACEPTAR EDAD";
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JButton btnCompra;
	private static final String COMPRAR_BOLETO = "COMPRAR BOLETO";
	private Integer seleccionado;
	private InterfazMacopolis ventanaPrincipal; 
	
	
public PanelSala(InterfazMacopolis ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		asientos=new ArrayList<String>();
		llenadoAsientos();
		setLayout(new BorderLayout());
		TitledBorder border = BorderFactory.createTitledBorder("Asientos sala");
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
		lblEdad = new JLabel("Edad: ",SwingConstants.RIGHT);
//		lblEdad.setBounds(50, 50, 100, 25); 
		
		cajaEdad = new JTextArea();
//		cajaEdad.setBounds(150, 50, 100, 25);
		
		btnEdad = new JButton("Aceptar");
		btnEdad.setActionCommand(ACEPTAR_EDAD);
		btnEdad.addActionListener(this);
		
		lblPrecio = new JLabel("Total: $", SwingConstants.RIGHT);
//		lblPrecio.setBounds(300, 50, 100, 25);
		
		txtPrecio = new JTextField("0.0");
		txtPrecio.setEditable(false);
		txtPrecio.setBackground(Color.LIGHT_GRAY);
		txtPrecio.setForeground(Color.BLUE);
//		txtPrecio.setBounds(400, 50, 100, 25);
		
		btnCompra = new JButton("Comprar");
		btnCompra.setActionCommand(COMPRAR_BOLETO);
		btnCompra.addActionListener(this);
		
		// Agregar y mostrar los botones de los asientos
		asientosBotones = new ArrayList<JButton>();
		
		for (Integer i = 1; i <= 60 ; i++) {
			asientosBotones.add(new JButton(i.toString()));
			panelAsientos.add(asientosBotones.get(i-1));
			asientosBotones.get(i-1).setActionCommand(asientos.get(i-1));
			asientosBotones.get(i-1).addActionListener(this);
		}
		
		panelPantalla.add(lblPantalla);
		
		panelCompra.add(lblEdad);
		panelCompra.add(cajaEdad);
		panelCompra.add(btnEdad);
		panelCompra.add(lblPrecio);
		panelCompra.add(txtPrecio);
		panelCompra.add(btnCompra);
		
	}
	
	
	
	public void llenadoAsientos() {
		//Constantes para los botones
		for(Integer i = 1; i <= 60 ; i++) {
			 asientos.add("asiento"+i.toString());
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nombreEvento = e.getActionCommand();
		
		Double descuento = 1.0;
		Double precioTotal=70*descuento;
		
		int tamaño = nombreEvento.length();
		String i = null;
		
		if(tamaño==8) {
			i = nombreEvento.substring(tamaño-1);
		}else if(tamaño==9){
			i = nombreEvento.substring(tamaño-2);
		}
				
		if(nombreEvento.equals("asiento"+i)) {
			
			if(asientosBotones.get(Integer.parseInt(i)-1).getBackground()!=Color.RED && seleccionado == null) {
				asientosBotones.get(Integer.parseInt(i)-1).setBackground(Color.GREEN);
				seleccionado = Integer.parseInt(i);
				
			}else if(asientosBotones.get(Integer.parseInt(i)-1).getBackground()!=Color.RED && seleccionado != null){
				asientosBotones.get(seleccionado-1).setBackground(null);
				asientosBotones.get(Integer.parseInt(i)-1).setBackground(Color.GREEN);
				seleccionado = Integer.parseInt(i);
				
			}else if(asientosBotones.get(Integer.parseInt(i)-1).getBackground() == Color.RED){
				JOptionPane.showMessageDialog(null, "Boleto ocupado");
				
			}
			
			
		}else if(nombreEvento.equals(COMPRAR_BOLETO)){
			
			if (seleccionado != null) {
				asientosBotones.get(seleccionado-1).setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, "El boleto número "
						+ seleccionado.toString()
						+ " fue comprado con éxito");
				seleccionado = null;
				precioTotal=0.0;
				txtPrecio.setText(precioTotal.toString());
				cajaEdad.setText(null);
			}else if(seleccionado == null) {
				JOptionPane.showMessageDialog(null, "Seleccione un asiento antes");
			}
			
		}else if(nombreEvento.equals(ACEPTAR_EDAD)) {
			if(Integer.parseInt(cajaEdad.getText())<13) {
				descuento=0.9;
			}else if(Integer.parseInt(cajaEdad.getText())>64) {
				descuento=0.85;
			}else {
				descuento=1.0;
			}
			
			precioTotal = 70*descuento;
			txtPrecio.setText(precioTotal.toString());
		}
		
	}
}