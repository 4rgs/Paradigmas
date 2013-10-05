package cl.juego;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class VentanaEmergenteInicioSesion extends JFrame {
	
	private final JLabel usuario = new JLabel ("Usuario       ");
	
	private final JTextField campo_usuario = new JTextField( 17 );
	
	private final JButton Registrarse = new JButton ("Registrarse");
	private final JButton aceptar = new JButton ("aceptar");
	
	
	public VentanaEmergenteInicioSesion(){
		
	setTitle("Inicio de sesion");
	setSize(400,300);
	setLocationRelativeTo(null);
	setResizable(false);
	
	Container contenedor = getContentPane();
	SpringLayout layout = new SpringLayout();
	contenedor.setLayout(layout);
	
	Registrarse.setBackground(Color.RED );
	aceptar.setBackground(new Color (0,255,0));
	
	Registrarse.setPreferredSize(new Dimension (110,30));
	aceptar.setPreferredSize(new Dimension (110,30));
	
	usuario.setFont(new Font( "Arial",Font.ITALIC, 25)); 
	
	usuario.setForeground( Color.BLUE);
	
	campo_usuario.setForeground( new Color(105,80,255));
	
	campo_usuario.setPreferredSize(new Dimension(50,30));
	
	campo_usuario.setFont( new Font( "Arial",Font.BOLD, 15));
	
	
	
	aceptar.addActionListener ( new  ActionListener(){
		
		public void actionPerformed (ActionEvent evento)
		{
			
			if(campo_usuario.getText().isEmpty())
			{
			JOptionPane.showMessageDialog( getContentPane(),"Debe ingresar los 2  campos",
										   "Error" , JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog( getContentPane(),"Error en Contrase�a", "Lo Sentimos" , JOptionPane.PLAIN_MESSAGE);
			}
		}
	});
	
Registrarse.addActionListener ( new  ActionListener(){
				
				public void actionPerformed (ActionEvent evento)
				{
					new VentanaExtraRegistro();
					setVisible(false); 
				}
				}	
			);
	
	
	
	
	layout.putConstraint(SpringLayout.WEST,usuario,10,SpringLayout.WEST,contenedor);
	layout.putConstraint(SpringLayout.NORTH,usuario,50,SpringLayout.NORTH,contenedor);
	
	
	layout.putConstraint(SpringLayout.WEST,campo_usuario,150,SpringLayout.WEST,contenedor);
	layout.putConstraint(SpringLayout.NORTH,campo_usuario,50,SpringLayout.NORTH,contenedor);
	
	
	layout.putConstraint(SpringLayout.WEST,aceptar,70,SpringLayout.WEST,contenedor);
	layout.putConstraint(SpringLayout.NORTH,aceptar,200,SpringLayout.NORTH,contenedor);
	
	layout.putConstraint(SpringLayout.WEST,Registrarse,200,SpringLayout.WEST,contenedor);
	layout.putConstraint(SpringLayout.NORTH,Registrarse,200,SpringLayout.NORTH,contenedor);
	
	
	contenedor.add(usuario);
	contenedor.add(aceptar);
	contenedor.add(Registrarse);
	contenedor.add(campo_usuario);
	
	this.setVisible(true);
	
	}

}
