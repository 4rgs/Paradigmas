package cl.juego;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class VentanaJuegoCartas extends JFrame {
	
	private final JButton menu = new JButton ("Menu");
	private final JButton pausa = new JButton ("Pausa");
	private final JButton comprobar = new JButton ("comprobar");
	private final JButton restaurar = new JButton ("Restaurar");
	private final JButton ayuda = new JButton ("Ayuda");
	
	ImageIcon Bin1 = new ImageIcon("0 azul.png"); 
	ImageIcon Bin2 = new ImageIcon("0 celeste.png"); 
	ImageIcon Bin3 = new ImageIcon("0 naranja.png"); 
	ImageIcon Bin4 = new ImageIcon("0 rosado.png"); 
	ImageIcon Bin5 = new ImageIcon("1 amarillo.png"); 
	ImageIcon Bin6 = new ImageIcon("1 verde.png"); 
	
	ImageIcon EBin1 = new ImageIcon("1-numerillo.png"); 
	ImageIcon EBin2 = new ImageIcon("2-numerillo.png"); 
	ImageIcon EBin3 = new ImageIcon("3-numerillo.png"); 
	ImageIcon EBin4 = new ImageIcon("4-numerillo.png"); 
	ImageIcon EBin5 = new ImageIcon("5-numerillo.png"); 
	ImageIcon EBin6 = new ImageIcon("6-numerillo.png"); 
	ImageIcon EBin7 = new ImageIcon("7-numerillo.png"); 
	ImageIcon EBin8 = new ImageIcon("8-numerillo.png"); 
	ImageIcon EBin9 = new ImageIcon("9-numerillo.png"); 
	ImageIcon EBin0 = new ImageIcon("0-numerillo.png"); 

	
	ImageIcon RBin1 = new ImageIcon("boton 1 encendido.png"); 
	ImageIcon RBin2 = new ImageIcon("boton 2 on.png"); 
	ImageIcon RBin3 = new ImageIcon("boton4off.png"); 
	ImageIcon RBin4 = new ImageIcon("boton8off.png"); 
	ImageIcon RBin5 = new ImageIcon("boton16off.png"); 
	ImageIcon RBin6 = new ImageIcon("boton32on.png"); 
	
	ImageIcon Sum1 = new ImageIcon("s_+.png"); 
	ImageIcon Sum2 = new ImageIcon("s_+.png"); 
	ImageIcon Sum3 = new ImageIcon("s_+.png"); 
	ImageIcon Sum4 = new ImageIcon("s_+.png"); 
	ImageIcon Sum5 = new ImageIcon("s_+.png"); 

	
	ImageIcon Igual = new ImageIcon("igual.png"); 
	
	
	private final JLabel bin1 = new JLabel (Bin1);
	private final JLabel bin2 = new JLabel (Bin2);
	private final JLabel bin3 = new JLabel (Bin3);
	private final JLabel bin4 = new JLabel (Bin4);
	private final JLabel bin5 = new JLabel (Bin5);
	private final JLabel bin6 = new JLabel (Bin6);
	
	private final JButton Ebin1 = new JButton (EBin1);
	private final JButton Ebin2 = new JButton (EBin2);
	private final JButton Ebin3 = new JButton (EBin3);
	private final JButton Ebin4 = new JButton (EBin4);
	private final JButton Ebin5 = new JButton (EBin5);
	private final JButton Ebin6 = new JButton (EBin6);
	private final JButton Ebin7 = new JButton (EBin3);
	private final JButton Ebin8 = new JButton (EBin4);
	private final JButton Ebin9 = new JButton (EBin5);
	private final JButton Ebin0 = new JButton (EBin0);
	
	private final JButton Rbin1 = new JButton (RBin1);
	private final JButton Rbin2 = new JButton (RBin2);
	private final JButton Rbin3 = new JButton (RBin3);
	private final JButton Rbin4 = new JButton (RBin4);
	private final JButton Rbin5 = new JButton (RBin5);
	private final JButton Rbin6 = new JButton (RBin6);
	
	private final JLabel sum1 = new JLabel (Sum1);
	private final JLabel sum2 = new JLabel (Sum2);
	private final JLabel sum3 = new JLabel (Sum3);
	private final JLabel sum4 = new JLabel (Sum4);
	private final JLabel sum5 = new JLabel (Sum5);

	
	private final JLabel igual = new JLabel (Igual);
	
	private final JLabel Ususario = new JLabel ("Usuario");
	private final JTextField Decimal= new JTextField(2);

	
	
	public VentanaJuegoCartas(){
		super("Juego de las Cartas");
		setSize(900,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		
		Ususario.setFont(new Font( "Verdana",Font.BOLD, 20));
		Ususario.setForeground( Color.BLACK);
		
		menu.setBounds(640,500,90,20);
		pausa.setBounds(550,500,90,20);
		comprobar.setBounds(760,320,108,20);
		restaurar.setBounds(10,20,110,20);
		ayuda.setBounds(130,20,110,20);
		
		bin1.setBounds(100,200,100,100);
		bin2.setBounds(200,200,100,100);
		bin3.setBounds(300,200,100,100);
		bin4.setBounds(400,200,100,100);
		bin5.setBounds(500,200,100,100);
		bin6.setBounds(600,200,100,100);		
		
		Ebin1.setBounds(200,100,30,40);
		Ebin2.setBounds(240,100,30,40);
		Ebin3.setBounds(280,100,30,40);
		Ebin4.setBounds(320,100,30,40);
		Ebin5.setBounds(360,100,30,40);
		Ebin6.setBounds(400,100,30,40);
		Ebin7.setBounds(440,100,30,40);
		Ebin8.setBounds(480,100,30,40);
		Ebin9.setBounds(520,100,30,40);
		Ebin0.setBounds(560,100,30,40);
		
		igual.setBounds(710,230,40,40);
		Rbin6.setBounds(125,320,50,50);
		Rbin5.setBounds(225,320,50,50);
		Rbin4.setBounds(325,320,50,50);
		Rbin3.setBounds(425,320,50,50);
		Rbin2.setBounds(525,320,50,50);
		Rbin1.setBounds(625,320,50,50);
		Decimal.setBounds(760,210,100,100);
		Decimal.setFont(new Font("Verdana",1,48));
		
		
		sum1.setBounds(185,330,30,30);
		sum2.setBounds(285,330,30,30);
		sum3.setBounds(385,330,30,30);
		sum4.setBounds(485,330,30,30);
		sum5.setBounds(585,330,30,30);
		
		add(menu);
		add(pausa);
		add(comprobar);
		add(restaurar);
		add(ayuda);
		add(Ususario);
		add(bin1);
		add(bin2);
		add(bin3);
		add(bin4);
		add(bin5);
		add(bin6);
		
		add(Ebin1);
		add(Ebin2);
		add(Ebin3);
		add(Ebin4);
		add(Ebin5);
		add(Ebin6);
		add(Ebin7);
		add(Ebin8);
		add(Ebin9);
		add(Ebin0);
		
		add(Rbin1);
		add(Rbin2);
		add(Rbin3);
		add(Rbin4);
		add(Rbin5);
		add(Rbin6);
		
		add(sum1);
		add(sum2);
		add(sum3);
		add(sum4);
		add(sum5);

		add(Decimal);
		add(igual);
		
		menu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				new VentanaEmergenteVolverMenu();
				setVisible(false);
			}
		});
		
		this.setVisible(true);
	}

}



