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
public class Menu extends JFrame implements ActionListener{

	// declaracion de botones con nombre y panel(fondo)
	//declarar tipo de dato, tipo de boton, nombre boton, instanciar (new JButton)
	private static JButton boton2 = new JButton("Ayuda");
	private static JButton btnIdentificar = new JButton("Inicio Sesion");
	private static JButton btnJugar = new JButton("Jugar");
	private static JButton boton5 = new JButton("Trofeo");
	private static JButton boton6 = new JButton("Perfil");
	
	static ImageIcon imagen1 = new ImageIcon("iconojuego.png");
	static ImageIcon imagen2 = new ImageIcon("iconoAvion.png");
	static ImageIcon imagen3 = new ImageIcon("iconoPochito.png");
	static ImageIcon imagen4 = new ImageIcon("iconoglobos.png");
	
	private  static JButton dec_bin = new JButton(imagen1);
	private  static JButton suma_resta = new JButton(imagen2);
	private  static JButton multiplicaacion = new JButton(imagen3);
	private  static JButton cartas = new JButton(imagen4);
	
	
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
		dec_bin.setBounds(130, 20,100,100);
		suma_resta.setBounds(350, 20,100,100);
		multiplicaacion.setBounds(130, 150,100,100);
		cartas.setBounds(350, 150,100,100);
		p1.add(dec_bin);
		p1.add(suma_resta);
		p1.add(multiplicaacion);
		p1.add(cartas);
		
		dec_bin.addActionListener(this);
		suma_resta.addActionListener(this);
		multiplicaacion.addActionListener(this);
		cartas.addActionListener(this);
		pestana.setBounds(150, 90, 600, 300);
		pestana.addTab("Todos", p1);
		pestana.addTab("Decimal a Binario", p2);
		pestana.addTab("Binario a Decimal", p3);
		pestana.addTab("Suma y Resta", p4);
		pestana.addTab("Multiplicacion", p5);
		this.add(pestana);
		boton2.setBounds(10,15,110,20);
		boton2.addActionListener(this);
		this.add(boton2);
		btnIdentificar.setBounds(730,15,150,20);
		this.add(btnIdentificar);
		btnIdentificar.addActionListener(this);
		btnJugar.setBounds(350,420,200,40);
		this.add(btnJugar);	
		boton5.setBounds(350,470,95,20);
		this.add(boton5);
		boton6.setBounds(455,470,95,20);
		this.add(boton6);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Menu();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==dec_bin){
			new VentanaJuegoCartas();
			this.dispose();
		}
		if(e.getSource()==suma_resta){
			new VentanaJuegoAvion();
			this.dispose();
		}
		if(e.getSource()==multiplicaacion){
			new VentanaJuegoPajaros();
			this.dispose();
		}
		if(e.getSource()==cartas){
			new VentanaJuegoGlobos();
			this.dispose();
		}
		if (e.getSource()==boton2) {
	        new Ayuda();
	    }
		if(e.getSource()==btnIdentificar){
			new VentanaEmergenteUsuario();
			this.dispose();
		}
	}

}

