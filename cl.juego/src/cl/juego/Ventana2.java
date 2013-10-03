package cl.juego;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class Ventana2 extends JFrame {
	
	private final JButton menu = new JButton ("Menu");
	private final JButton pausa = new JButton ("Pausa");
	private final JButton comprobar = new JButton ("comprobar");
	private final JButton restaurar = new JButton ("Restaurar");
	private final JButton ayuda = new JButton ("Ayuda");
	private final JButton sesion = new JButton ("Cerrar sesi�n");
	
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
	
	
	private final JLabel bin1 = new JLabel ();
	private final JLabel bin2 = new JLabel ();
	private final JLabel bin3 = new JLabel ();
	private final JLabel bin4 = new JLabel ();
	private final JLabel bin5 = new JLabel ();
	private final JLabel bin6 = new JLabel ();
	
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
	
	private final JButton sum1 = new JButton (Sum1);
	private final JButton sum2 = new JButton (Sum2);
	private final JButton sum3 = new JButton (Sum3);
	private final JButton sum4 = new JButton (Sum4);
	private final JButton sum5 = new JButton (Sum5);

	
	private final JButton igual = new JButton (Igual);
	
	private final JLabel Ususario = new JLabel ("Usuario");
	private final JTextField Decimal= new JTextField(2);

	
	
	public Ventana2(){
		setTitle("Binarios a Decimales");
		setSize(900,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contenedor = getContentPane();
		SpringLayout layout = new SpringLayout();
		contenedor.setLayout(layout);
		
		
		Ususario.setFont(new Font( "Arial",Font.ITALIC, 20));
		Ususario.setForeground( Color.BLUE);

		
		menu.setBackground( Color.LIGHT_GRAY);
		pausa.setBackground(Color.LIGHT_GRAY);
		comprobar.setBackground(Color.LIGHT_GRAY);
		restaurar.setBackground(Color.LIGHT_GRAY);
		ayuda.setBackground(Color.LIGHT_GRAY);
		sesion.setBackground(Color.LIGHT_GRAY);

		
		menu.setPreferredSize(new Dimension (90,20));
		pausa.setPreferredSize(new Dimension (90,20));
		comprobar.setPreferredSize(new Dimension (108,20));
		restaurar.setPreferredSize(new Dimension (110,20));
		ayuda.setPreferredSize(new Dimension (110,20));
		sesion.setPreferredSize(new Dimension (150,20));
		
		bin1.setIcon(Bin1);
		bin1.setPreferredSize(new Dimension (100,100));
		bin2.setIcon(Bin2);
		bin2.setPreferredSize(new Dimension (100,100));
		bin3.setIcon(Bin3);
		bin3.setPreferredSize(new Dimension (100,100));
		bin4.setIcon(Bin4);
		bin4.setPreferredSize(new Dimension (100,100));
		bin5.setIcon(Bin5);
		bin5.setPreferredSize(new Dimension (100,100));
		bin6.setIcon(Bin6);
		bin6.setPreferredSize(new Dimension (100,100));
		
		Ebin1.setPreferredSize(new Dimension (30,40));
		Ebin2.setPreferredSize(new Dimension (30,40));
		Ebin3.setPreferredSize(new Dimension (30,40));
		Ebin4.setPreferredSize(new Dimension (30,40));
		Ebin5.setPreferredSize(new Dimension (30,40));
		Ebin6.setPreferredSize(new Dimension (30,40));
		Ebin7.setPreferredSize(new Dimension (30,40));
		Ebin8.setPreferredSize(new Dimension (30,40));
		Ebin9.setPreferredSize(new Dimension (30,40));
		Ebin0.setPreferredSize(new Dimension (30,40));
		
		Rbin1.setPreferredSize(new Dimension (50,50));
		Rbin2.setPreferredSize(new Dimension (50,50));
		Rbin3.setPreferredSize(new Dimension (50,50));
		Rbin4.setPreferredSize(new Dimension (50,50));
		Rbin5.setPreferredSize(new Dimension (50,50));
		Rbin6.setPreferredSize(new Dimension (50,50));
		
		sum1.setPreferredSize(new Dimension (30,30));
		sum2.setPreferredSize(new Dimension (30,30));
		sum3.setPreferredSize(new Dimension (30,30));
		sum4.setPreferredSize(new Dimension (30,30));
		sum5.setPreferredSize(new Dimension (30,30));
		
		igual.setPreferredSize(new Dimension (40,40));
		
		Decimal.setPreferredSize(new Dimension(100,100));
		Decimal.setFont(new Font("Verdana",1,48));
		
		layout.putConstraint(SpringLayout.WEST,menu,640,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,menu,500,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,pausa,550,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,pausa,500,SpringLayout.NORTH,contenedor);

		
		layout.putConstraint(SpringLayout.WEST,comprobar,760,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,comprobar,320,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,restaurar,10,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,restaurar,20,SpringLayout.NORTH,contenedor);
		
		
		layout.putConstraint(SpringLayout.WEST,ayuda,120,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,ayuda,20,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Ususario,600,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Ususario,20,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,sesion,700,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,sesion,20,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,bin1,100,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,bin1,200,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,bin2,200,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,bin2,200,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,bin3,300,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,bin3,200,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,bin4,400,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,bin4,200,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,bin5,500,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,bin5,200,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,bin6,600,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,bin6,200,SpringLayout.NORTH,contenedor);
		
		
		
		layout.putConstraint(SpringLayout.WEST,Ebin1,200,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Ebin1,100,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Ebin2,240,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Ebin2,100,SpringLayout.NORTH,contenedor);

		layout.putConstraint(SpringLayout.WEST,Ebin3,280,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Ebin3,100,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Ebin4,320,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Ebin4,100,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Ebin5,360,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Ebin5,100,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Ebin6,400,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Ebin6,100,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Ebin7,440,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Ebin7,100,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Ebin8,480,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Ebin8,100,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Ebin9,520,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Ebin9,100,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Ebin0,560,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Ebin0,100,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,igual,710,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,igual,230,SpringLayout.NORTH,contenedor);
		
		
		layout.putConstraint(SpringLayout.WEST,Rbin6,125,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Rbin6,320,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Rbin5,225,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Rbin5,320,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Rbin4,325,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Rbin4,320,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Rbin3,425,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Rbin3,320,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Rbin2,525,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Rbin2,320,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Rbin1,625,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Rbin1,320,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,Decimal,760,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,Decimal,210,SpringLayout.NORTH,contenedor);
		
		
		
		layout.putConstraint(SpringLayout.WEST,sum1,185,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,sum1,330,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,sum2,285,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,sum2,330,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,sum3,385,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,sum3,330,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,sum4,485,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,sum4,330,SpringLayout.NORTH,contenedor);
		
		layout.putConstraint(SpringLayout.WEST,sum5,585,SpringLayout.WEST,contenedor);
		layout.putConstraint(SpringLayout.NORTH,sum5,330,SpringLayout.NORTH,contenedor);
		
		
		
		contenedor.add(menu);
		contenedor.add(pausa);
		contenedor.add(comprobar);
		contenedor.add(restaurar);
		contenedor.add(ayuda);
		contenedor.add(sesion);
		contenedor.add(Ususario);
		contenedor.add(bin1);
		contenedor.add(bin2);
		contenedor.add(bin3);
		contenedor.add(bin4);
		contenedor.add(bin5);
		contenedor.add(bin6);
		
		contenedor.add(Ebin1);
		contenedor.add(Ebin2);
		contenedor.add(Ebin3);
		contenedor.add(Ebin4);
		contenedor.add(Ebin5);
		contenedor.add(Ebin6);
		contenedor.add(Ebin7);
		contenedor.add(Ebin8);
		contenedor.add(Ebin9);
		contenedor.add(Ebin0);
		
		contenedor.add(Rbin1);
		contenedor.add(Rbin2);
		contenedor.add(Rbin3);
		contenedor.add(Rbin4);
		contenedor.add(Rbin5);
		contenedor.add(Rbin6);
		
		contenedor.add(sum1);
		contenedor.add(sum2);
		contenedor.add(sum3);
		contenedor.add(sum4);
		contenedor.add(sum5);

		contenedor.add(Decimal);
		contenedor.add(igual);
		
		menu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				new Menu();
				setVisible(false);
			}
		});
		
		this.setVisible(true);
	}

}



