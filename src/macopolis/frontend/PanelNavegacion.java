package macopolis.frontend;

/*******************
última modificación:
	04-12-2021
*******************/

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;


	
public class PanelNavegacion extends JPanel implements ActionListener{
	
	//Constante para los botones
	//Constante para el evento del btnSiguiente
	private final static String SIGUIENTE = "SIGUIENTE";
	//Constante para el evento del btnAnterior
	private final static String ANTERIOR = "ANTERIOR";
	
	private JButton btnSiguiente;
	private JButton btnAnterior;
	
	//Instancia de la ventana principal
	private InterfazMacopolis ventanaPrincipal; 
	
	//Constructor del panel
	
	
	public PanelNavegacion(InterfazMacopolis ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		setLayout(new FlowLayout());
		TitledBorder border = BorderFactory.createTitledBorder("Navegación");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		//Creacion de botones
		btnSiguiente = new JButton(">");
		btnSiguiente.setActionCommand(SIGUIENTE);
		btnSiguiente.addActionListener(this);//Se indica que este panel será el encargado de atender el evento
		
		btnAnterior = new JButton("<");
		btnAnterior.setActionCommand(ANTERIOR);
		btnAnterior.addActionListener(this);//Se indica que este panel será el encargado de atender el evento
		
		//Se agregan los botones
		add(btnAnterior);
		add(btnSiguiente);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nombreEvento = e.getActionCommand();
		
		if(nombreEvento.equals(SIGUIENTE)) {
			ventanaPrincipal.siguiente();
			
		}else if(nombreEvento.equals(ANTERIOR)) {
			ventanaPrincipal.anterior();
			
		}
		
	}
}