package macopolis.frontend;

/*******************
�ltima modificaci�n:
	19-11-2021
*******************/

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

public class PanelNavegacion extends JPanel{
		
	public PanelNavegacion(){
		setLayout( new FlowLayout());
		TitledBorder border = BorderFactory.createTitledBorder("Navegaci�n");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
	}
}
