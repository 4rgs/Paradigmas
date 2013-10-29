package cl.juego;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


@SuppressWarnings("serial")
public class Menu extends JFrame{

	// declaracion de botones con nombre y panel(fondo)
	//declarar tipo de dato, tipo de boton, nombre boton, instanciar (new JButton)
	private static JButton boton1 = new JButton("Restaurar");
	private static JButton boton2 = new JButton("Ayuda");
	private static JButton btnIdentificar = new JButton("Inicio Sesion");
	private static JButton btnJugar = new JButton("Jugar");
	private static JButton boton5 = new JButton("Trofeo");
	private static JButton boton6 = new JButton("Perfil");
	
	static ImageIcon imagen = new ImageIcon("iconojuego.png");
	
	private  static JButton dec_bin = new JButton(imagen);
	
	BorderLayout borderLayout1 = new BorderLayout();
	private static JTabbedPane  pestana =new JTabbedPane(1);
	private static JPanel p1=new JPanel();
	private static JPanel p2=new JPanel();
	private static JPanel p3=new JPanel();
	private static JPanel p4=new JPanel();
	private static JPanel p5=new JPanel();

	public Menu(){
		super("Menu");
		this.setSize (900,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		p1.setLayout(null);
		dec_bin.setBounds(30, 20,100,100);
		p1.add(dec_bin);
		pestana.setBounds(150, 90, 600, 300);
		pestana.addTab("Todos", p1);
		pestana.addTab("Decimal a Binario", p2);
		pestana.addTab("Binario a Decimal", p3);
		pestana.addTab("Suma y Resta", p4);
		pestana.addTab("Multiplicacion", p5);
		this.add(pestana);
		boton1.setBounds(12,15,110,20);
		this.add(boton1);
		boton2.setBounds(125,15,110,20);
		this.add(boton2);
		btnIdentificar.setBounds(730,15,150,20);
		this.add(btnIdentificar);
		btnJugar.setBounds(350,420,200,40);
		this.add(btnJugar);	
		boton5.setBounds(350,470,95,20);
		this.add(boton5);
		boton6.setBounds(455,470,95,20);
		this.add(boton6);
		btnJugar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new VentanaJuegoCartas();
				setVisible(false);
			}
		});
		btnIdentificar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new VentanaEmergenteInicioSesion();				
			}
			
		});
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Menu();
	}

}

