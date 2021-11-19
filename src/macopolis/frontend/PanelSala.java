package macopolis.frontend;

/*******************
última modificación:
	19-11-2021
*******************/

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

public class PanelSala extends JPanel{
	public PanelSala() {
		setLayout(null);
		TitledBorder border = BorderFactory.createTitledBorder("Asientos disponibles");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
	}
}
