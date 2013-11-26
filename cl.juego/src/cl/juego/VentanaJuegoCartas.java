package cl.juego;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class VentanaJuegoCartas extends JFrame implements ActionListener{
	
	private static JButton menu = new JButton ("Menu");
	private static JButton pausa = new JButton ("Pausa");
	private static JButton restaurar = new JButton ("Restaurar");
	private static JButton ayuda = new JButton ("Ayuda");
	
	private static JLabel numBinario= new JLabel("100101");
	private static JLabel numDecimal= new JLabel("37");
	private static Font font = new Font("Verdana",Font.BOLD,72);
	private static Font font2 = new Font("Verdana",Font.BOLD,64);
	
	private static ImageIcon imagenIgual = new ImageIcon("igual.png");
	private static JLabel esIgual = new JLabel(imagenIgual);
	private static JPanel panelCartas = new JPanel();
	
	private static JLabel basurero = new JLabel(new ImageIcon("basurero.png"));
	
	
	private static ImageIcon imagenCarta1=new ImageIcon("carta1.png");
	private static ImageIcon imagenCarta2=new ImageIcon("carta2.png");
	private static ImageIcon imagenCarta4=new ImageIcon("carta4.png");
	private static ImageIcon imagenCarta8=new ImageIcon("carta8.png");
	private static ImageIcon imagenCarta16=new ImageIcon("carta16.png");
	private static ImageIcon imagenCarta32=new ImageIcon("carta32.png");
	
	private static JLabel carta1=new JLabel(imagenCarta1);
	private static JLabel carta2=new JLabel(imagenCarta2);
	private static JLabel carta4=new JLabel(imagenCarta4);
	private static JLabel carta8=new JLabel(imagenCarta8);
	private static JLabel carta16=new JLabel(imagenCarta16);
	private static JLabel carta32=new JLabel(imagenCarta32);
	
	
	public VentanaJuegoCartas(){
		super("Juego de las Cartas");
		this.setSize(900,600);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		numBinario.setFont(font);
		numDecimal.setFont(font2);
		esIgual.setBounds(630, 250, 50, 50);
		panelCartas.setBounds(10, 200, 640, 400);
		panelCartas.setLayout(new FlowLayout());
		
		numBinario.setBounds(300, 50, 400, 100);
		numDecimal.setBounds(700, 220,100, 100);
		
		menu.setBounds(640,500,90,20);
		pausa.setBounds(550,500,90,20);
		restaurar.setBounds(10,20,110,20);
		ayuda.setBounds(130,20,110,20);
		
		menu.addActionListener(this);
		
		this.add(pausa);
		this.add(menu);
		this.add(restaurar);
		this.add(ayuda);
		this.add(numDecimal);
		this.add(esIgual);
		this.add(numBinario);
		this.add(panelCartas);
		panelCartas.add(carta32);
		panelCartas.add(carta16);
		panelCartas.add(carta8);
		panelCartas.add(carta4);
		panelCartas.add(carta2);
		panelCartas.add(carta1);
		panelCartas.add(basurero);
		
		
		this.setVisible(true);
		
	}


	public void actionPerformed(ActionEvent e) {
    
		if (e.getSource()==menu) {
			
			new VentanaEmergenteVolverMenu();
		    this.dispose();
        }
		
	}
}
