package cl.juego;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class Ventana4 extends JFrame {
	
	private final JLabel volver = new JLabel ("¿Volver al menu Principal?");

	private final JButton si = new JButton ("si");
	private final JButton no = new JButton ("no");
	
	public Ventana4(){
		
		setTitle("¿Volver al menu Principal?");
		setSize(400,100);
		setLocationRelativeTo(null);
		setResizable(false);
		
		Container contenedor = getContentPane();
		SpringLayout layout = new SpringLayout();
		contenedor.setLayout(layout);
		
		
		si.setBackground(Color.RED );
		no.setBackground(new Color (0,255,0));
		
		si.setPreferredSize(new Dimension (110,30));
		no.setPreferredSize(new Dimension (110,30));
		
		
		volver.setFont(new Font( "Arial",Font.ITALIC, 25)); 		
		volver.setForeground( Color.BLUE);
		

		layout.putConstraint(SpringLayout.WEST,si,10,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,si,100,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,no,10,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,no,300,SpringLayout.NORTH,contenedor);
		
		contenedor.add(si);
		contenedor.add(no);
		contenedor.add(volver);
		
		
		this.setVisible(true);
	}

}
