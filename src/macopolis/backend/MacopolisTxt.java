package macopolis.backend;

/*******************
última modificación:
	06-12-2021
*******************/

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class MacopolisTxt{
	
	public MacopolisTxt(Sala salas) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy-HH-mm");
		String root = "C:\\AplicacionMacopolis\\"+salas.getPeli().getFoto()+sdf.format(salas.getHorario()).toString()+".txt";
		System.out.println(root);
		
	FileWriter flwriter = null;
	 try{
		//crea el flujo para escribir en el archivo
		flwriter = new FileWriter(root, true);
		//crea un buffer o flujo intermedio antes de escribir directamente en el archivo
		BufferedWriter bfwriter = new BufferedWriter(flwriter);
		
		bfwriter.write(salas.getPeli().getTitulo()+"\n"
				+salas.getPeli().getDuracion()+"\n"
				+salas.getPeli().getEdadMinima()+"\n"
				+salas.getPeli().getDirector()+"\n"
				+salas.getPeli().getGenero()+"\n"
				+sdf.format(salas.getHorario())+"\n");
		for(Boleto boleto : salas.getBoletos()) {
			if(boleto.isComprado()) {
				bfwriter.write(boleto.getLugar().toString() + "\n");
			}
			
		}
		bfwriter.close();
		System.out.println("Archivo creado");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {//cierra el flujo principal
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

	

}
