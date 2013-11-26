package cl.juego;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class VentanaJuegoAvion extends JFrame implements ActionListener{
 
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
	
	private static JLabel bin1 = new JLabel();
	private static JLabel bin2 = new JLabel();
	private static JLabel bin3 = new JLabel();
	private static JLabel bin4 = new JLabel();
	private static JLabel bin5 = new JLabel();
	private static JLabel bin6 = new JLabel();
	
	private static JLabel Sbin1 = new JLabel();
	private static JLabel Sbin2 = new JLabel();
	private static JLabel Sbin3 = new JLabel();
	private static JLabel Sbin4 = new JLabel();
	private static JLabel Sbin5 = new JLabel();
	private static JLabel Sbin6 = new JLabel();
	
	private static JTabbedPane  pestana =new JTabbedPane(1);
	private static JTabbedPane  ayudaa =new JTabbedPane(1);
	
	private static JPanel p1=new JPanel();
	private static JPanel p2=new JPanel();
	
	private final JLabel cerocero = new JLabel ("0 + 0 = 0");
	private final JLabel cerouno = new JLabel ("0 + 1 = 1");
	private final JLabel unocero = new JLabel ("1 + 0 = 1");
	private final JLabel unouno = new JLabel ("1 + 1 = 0");
	
	private static ImageIcon bot0 = new ImageIcon("0 boton.png"); 
	private static ImageIcon bot1 = new ImageIcon("1 boton.png"); 
	
	private JButton boton1 = new JButton (bot0);
    private JButton boton2 = new JButton (bot0);
    private JButton boton3 = new JButton (bot0);
    private JButton boton4 = new JButton (bot0);
    private JButton boton5 = new JButton (bot0);
    private JButton boton6 = new JButton (bot0);

    public Random rand = new Random(); 
    
	public VentanaJuegoAvion(){
		
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
		
		pestana.setBounds(280, 300, 600, 129);
		pestana.addTab("Suma de numeros binarios", p1);
		
		ayudaa.setBounds(50,400, 100, 100);
		ayudaa.addTab("Ayuda", p2);

		Rand(bin1);
		Rand(bin2);
		Rand(bin3);
		Rand(bin4);
		Rand(bin5);
		Rand(bin6);
		
		Rand(Sbin1);
		Rand(Sbin2);
		Rand(Sbin3);
		Rand(Sbin4);
		Rand(Sbin5);
		Rand(Sbin6);
		
		
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
		
		boton1.setBounds(280,325,100,100);
		boton2.setBounds(380,325,100,100);
		boton3.setBounds(480,325,100,100);
		boton4.setBounds(580,325,100,100);
		boton5.setBounds(680,325,100,100);
		boton6.setBounds(780,325,100,100);
		

		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);
		boton4.addActionListener(this);
		boton5.addActionListener(this);
		boton6.addActionListener(this);
		
		ayuda.addActionListener(this);
		menu.addActionListener(this);

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
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
		add(boton6);
		add(pestana);
		add(ayudaa);
		
		this.setVisible(true);
	}

	
	
	public JLabel Rand (JLabel var ){
		
		
		int x = rand.nextInt(2); 
		
		if(x == 1){
			 
		    var.setIcon(Bin1);
			return var;
		}
		
		var.setIcon(Bin2);
		return var;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()==boton1) {
			
			if(boton1.getIcon().equals(bot0)){
			boton1.setIcon(bot1); 
			 
			}
			
			else{
			boton1.setIcon(bot0); 
			  
			}
        }
		
        if (e.getSource()==boton2) {
        	
        	  if(boton2.getIcon().equals(bot0)){
    			boton2.setIcon(bot1); 
    			 
    			}
    			
    			else{
    			boton2.setIcon(bot0); 
    			 
    			}
        }
        
        if (e.getSource()==boton3) {
        	
        	if(boton3.getIcon().equals(bot0)){
    			boton3.setIcon(bot1); 
    			 
    			}
    			
    			else{
    			boton3.setIcon(bot0); 
    			 
    			}
        }        
        
        if (e.getSource()==boton4) {
        	
        	if(boton4.getIcon().equals(bot0)){
    			boton4.setIcon(bot1); 
    			 
    			}
    			
    			else{
    			boton4.setIcon(bot0); 
    			 
    			}
        }        
        
        if (e.getSource()==boton5) {
        	
        	if(boton5.getIcon().equals(bot0)){
    			boton5.setIcon(bot1); 
    			 
    			}
    			
    			else{
    			boton5.setIcon(bot0); 
    			 
    			}
        }        
		
        if (e.getSource()==boton6) {

        	if(boton6.getIcon().equals(bot0)){
    			boton6.setIcon(bot1); 
    			 
    			}
    			
    			else{
    			boton6.setIcon(bot0); 
    			 
    			} 
        }
        
        if (e.getSource()==ayuda) {
        	
        	new Ayuda();
        	
        }
        
       if (e.getSource()==menu) {
			
    	   new VentanaEmergenteVolverMenu();
		    this.dispose();
        }
		
	
	}
	
	

} 