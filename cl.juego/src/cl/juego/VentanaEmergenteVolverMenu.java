package cl.juego;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

 
@SuppressWarnings("serial")
public class VentanaEmergenteVolverMenu extends JFrame implements ActionListener {
	
	private static JLabel volver = new JLabel ("Deseas Regresar?");

	private static JButton si = new JButton ("si");
	private static JButton no = new JButton ("no");
	
	public VentanaEmergenteVolverMenu(){
		
		super("Deseas Regresar?");
		setSize(400,150);
		setLocationRelativeTo(null);
		setResizable(false);
		this.setLayout(null);
		
		si.setBounds(100,60,95,25);
		no.setBounds(205,60,95,25);
		volver.setBounds(100,10,400,20);
		volver.setFont(new Font( "Calibri",Font.BOLD, 25)); 		
		volver.setForeground( Color.BLACK);
		si.addActionListener(this);
		no.addActionListener(this);
		
		add(si);
		add(no);
		add(volver);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==si) {
			
	    	   new Menu();
			   this.dispose();
	        }
		if (e.getSource()==no) {
			
	    	   new VentanaJuegoGlobos();
			   this.dispose();
	        }
		
	}

}
