package cl.juego;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class VentanaEmergenteUsuario extends JFrame implements ActionListener {
	private static JTextField campo_usuario = new JTextField( 17 );
	private static JLabel volver = new JLabel ("¿Cuál es tu nombre?");

	private static JButton Continuar = new JButton ("Continuar");
	private static JButton Salir = new JButton ("Salir");
	
	public VentanaEmergenteUsuario(){
		
		super("¿Cuál es tu nombre?");
		setSize(400,150);
		setLocationRelativeTo(null);
		setResizable(false);
		this.setLayout(null);
		
		Continuar.setBounds(105,60,95,25);
		Continuar.addActionListener(this);
		Salir.setBounds(210,60,95,25);
		Salir.addActionListener(this);
		volver.setBounds(100,10,400,20);
		volver.setFont(new Font( "Calibri",Font.BOLD, 25)); 		
		volver.setForeground( Color.BLACK);
		campo_usuario.setForeground( new Color(105,80,255));
		campo_usuario.setFont( new Font( "Arial",Font.BOLD, 15));
		campo_usuario.setBounds(105,35, 200, 20);
		add(Continuar);
		add(Salir);
		add(volver);
		add (campo_usuario);

		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==Continuar){
			new Menu();
			this.dispose();
		}
		
		if(e.getSource()==Salir){
			new Menu();
			this.dispose();
		}
	}

}
