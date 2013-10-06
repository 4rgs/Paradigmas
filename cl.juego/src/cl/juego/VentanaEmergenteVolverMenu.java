package cl.juego;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class VentanaEmergenteVolverMenu extends JFrame {
	
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
		
		add(si);
		add(no);
		add(volver);
		
		si.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new Menu();
				setVisible(false);
			}
		});
		no.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new VentanaJuegoCartas();
				setVisible(false);
			}
		});
		
		this.setVisible(true);
	}

}
