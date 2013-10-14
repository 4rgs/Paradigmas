package cl.juego;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class VentanaJuegoSuma extends JFrame{
	
	private static JButton menu = new JButton ("Menu");
	private static JButton pausa = new JButton ("Pausa");
	private static JButton restaurar = new JButton ("Restaurar");
	private static JButton ayuda = new JButton ("Ayuda");
	
	private static ImageIcon Avion = new ImageIcon("avion.png"); 
	private static JLabel avion = new JLabel (Avion);
	
	
	private static ImageIcon Linea = new ImageIcon("linea.png"); 
	private static ImageIcon Lineas = new ImageIcon("lineass.png"); 
	private static JLabel linea1 = new JLabel (Linea);
	private static JLabel linea2 = new JLabel (Lineas);
	
	private static ImageIcon Bin1 = new ImageIcon("1.png"); 
	private static ImageIcon Bin2 = new ImageIcon("0.png"); 
	
	private static JLabel bin1 = new JLabel (Bin2);
	private static JLabel bin2 = new JLabel (Bin2);
	private static JLabel bin3 = new JLabel (Bin1);
	private static JLabel bin4 = new JLabel (Bin2);
	private static JLabel bin5 = new JLabel (Bin1);
	private static JLabel bin6 = new JLabel (Bin2);
	
	private static JLabel Sbin1 = new JLabel (Bin2);
	private static JLabel Sbin2 = new JLabel (Bin2);
	private static JLabel Sbin3 = new JLabel (Bin1);
	private static JLabel Sbin4 = new JLabel (Bin2);
	private static JLabel Sbin5 = new JLabel (Bin1);
	private static JLabel Sbin6 = new JLabel (Bin2);
	

	private static JComboBox campo1 = new JComboBox();
	private static JComboBox campo2 = new JComboBox();
	private static JComboBox campo3 = new JComboBox();
	private static JComboBox campo4 = new JComboBox();
	private static JComboBox campo5 = new JComboBox();
	private static JComboBox campo6 = new JComboBox();
	
	private static JTabbedPane  pestana =new JTabbedPane(1);
	private static JTabbedPane  ayudaa =new JTabbedPane(1);
	
	private static JPanel p1=new JPanel();
	private static JPanel p2=new JPanel();
	
	private final JLabel cerocero = new JLabel ("0 + 0 = 0");
	private final JLabel cerouno = new JLabel ("0 + 1 = 1");
	private final JLabel unocero = new JLabel ("1 + 0 = 1");
	private final JLabel unouno = new JLabel ("1 + 1 = 0");
	
	
	public VentanaJuegoSuma(){
		
		super("Juego de el avion");
		setSize(900,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
        
		
		cerocero.setFont(new Font( "Arial",Font.ITALIC, 20));
		cerouno.setFont(new Font( "Arial",Font.ITALIC, 20));
		unocero.setFont(new Font( "Arial",Font.ITALIC, 20));
		unouno.setFont(new Font( "Arial",Font.ITALIC, 20));
		
		cerocero.setBounds(55,420,100,30);
		cerouno.setBounds(55,437,100,30);
		unocero.setBounds(55,454,100,30);
		unouno.setBounds(55,471,100,30);
		
		
		menu.setBounds(640,500,90,20);
		pausa.setBounds(550,500,90,20);
		restaurar.setBounds(10,20,110,20);
		ayuda.setBounds(130,20,110,20);
		
		pestana.setBounds(280, 300, 590, 100);
		pestana.addTab("Suma de numeros binarios", p1);
		
		ayudaa.setBounds(50,400, 100, 100);
		ayudaa.addTab("Ayuda", p2);
		
		bin1.setBounds(270,90,100,100);
		bin2.setBounds(370,100,100,100);
		bin3.setBounds(470,90,100,100);
		bin4.setBounds(570,80,100,100);
		bin5.setBounds(670,70,100,100);
		bin6.setBounds(770,100,100,100);		
		
		Sbin1.setBounds(270,190,100,100);
		Sbin2.setBounds(370,200,100,100);
		Sbin3.setBounds(470,190,100,100);
		Sbin4.setBounds(570,180,100,100);
		Sbin5.setBounds(670,170,100,100);
		Sbin6.setBounds(770,200,100,100);		
		
		avion.setBounds(20,80,200,200);
		
		linea1.setBounds(150,120,200,100);
		linea2.setBounds(150,170,200,100);	
		
		campo1.setBounds(300,350,40,20);
		campo2.setBounds(400,350,40,20);
		campo3.setBounds(500,350,40,20);
		campo4.setBounds(600,350,40,20);
		campo5.setBounds(700,350,40,20);
		campo6.setBounds(800,350,40,20);
		
		campo1.addItem("0");
		campo1.addItem("1");

		campo2.addItem("0");
		campo2.addItem("1");

		campo3.addItem("0");
		campo3.addItem("1");
		
		campo4.addItem("0");
		campo4.addItem("1");
		
		campo5.addItem("0");
		campo5.addItem("1");

		campo6.addItem("0");
		campo6.addItem("1");

		add(cerocero);
		add(cerouno);
		add(unocero);
		add(unouno);
		
		add(menu);
		add(pausa);
		add(restaurar);
		add(ayuda);
		add(avion);
		
		add(bin1);
		add(bin2);
		add(bin3);
		add(bin4);
		add(bin5);
		add(bin6);
		
		add(Sbin1);
		add(Sbin2);
		add(Sbin3);
		add(Sbin4);
		add(Sbin5);
		add(Sbin6);
		
		add(linea1);
		add(linea2);
		
		add(campo1);
		add(campo2);
		add(campo3);
		add(campo4);
		add(campo5);
		add(campo6);
		add(pestana);
		add(ayudaa);
		
		menu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				new VentanaEmergenteVolverMenu();
				setVisible(false);
			}
		});
		
		this.setVisible(true);
	}
	
	

} 