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

public class VentanaJuegoPajaros extends JFrame implements ActionListener {
	
	private static JButton menu = new JButton ("Menu");
	private static JButton pausa = new JButton ("Pausa");
	private static JButton restaurar = new JButton ("Restaurar");
	private static JButton ayuda = new JButton ("Ayuda");
	
	private final JLabel cerocero = new JLabel ("0 + 0 = 0");
	private final JLabel cerouno = new JLabel ("0 + 1 = 1");
	private final JLabel unocero = new JLabel ("1 + 0 = 1");
	private final JLabel unouno = new JLabel ("1 + 1 = 0");
	
	private static JPanel p2=new JPanel();
	private static JTabbedPane  ayudaa =new JTabbedPane(1);
	private static JTabbedPane  cerun =new JTabbedPane(1);
	
	
	private static ImageIcon Bin1 = new ImageIcon("unito1.png"); 
	private static ImageIcon Bin2 = new ImageIcon("cerapio1.png"); 
	
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
	
	public Random rand = new Random(); 
	
	private static ImageIcon linPoll = new ImageIcon("pollit2.png");
	private static JLabel lineaPollitos = new JLabel(linPoll);
	
	private static ImageIcon linPoll2 = new ImageIcon("poll2.png");
	private static JLabel lineaPollitos2 = new JLabel(linPoll2);
	
	private static ImageIcon pollito1 = new ImageIcon("pochito 22.png");
	private static JLabel Lpollito1 = new JLabel(pollito1);
	private static ImageIcon pollito2 = new ImageIcon("pochito 33.png");
	private static JLabel Lpollito2 = new JLabel(pollito2);
	
	private static ImageIcon pollito = new ImageIcon("pochito 0.png");
	private static JLabel Lpollito = new JLabel(pollito);
	
	private static ImageIcon igual = new ImageIcon("iguall.png");
	private static JLabel sigigual = new JLabel(igual);	
	
	
	public VentanaJuegoPajaros(){
		
	super("Juego de los Pochitos");
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
	
	
	menu.setBounds(640,20,90,20);
	pausa.setBounds(550,20,90,20);
	restaurar.setBounds(10,20,110,20);
	ayuda.setBounds(130,20,110,20);
	ayuda.addActionListener(this);
	
	menu.addActionListener(this);
	
	ayudaa.setBounds(50,400, 100, 100);
	ayudaa.addTab("Ayuda", p2);
	
	cerun.setBounds(750,400, 100, 100);
	
	lineaPollitos.setBounds(0,100, 900, 100);
	lineaPollitos2.setBounds(0,300, 900, 100);
	
	Lpollito1.setBounds(0,20,200,200);
	Lpollito2.setBounds(0,200,200,200);
	
	Lpollito.setBounds(500,140,400,200);
	
	sigigual.setBounds(400,170,200,200);
	
	bin1.setBounds(180,152,100,100);
	bin2.setBounds(220,152,100,100);
	bin3.setBounds(260,152,100,100);
	bin4.setBounds(300,152,100,100);
	bin5.setBounds(340,152,100,100);
	bin6.setBounds(380,152,100,100);		
	
	Sbin1.setBounds(180,348,100,100);
	Sbin2.setBounds(220,348,100,100);
	Sbin3.setBounds(260,348,100,100);
	Sbin4.setBounds(300,349,100,100);
	Sbin5.setBounds(340,350,100,100);
	Sbin6.setBounds(380,352,100,100);	
	
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
	
	
	
	add(cerocero);
	add(cerouno);
	add(unocero);
	add(unouno);
	
	add(menu);
	add(pausa);
	add(restaurar);
	add(ayuda);
	add(ayudaa);
	add(cerun);
	
	add(lineaPollitos);
	add(lineaPollitos2);
	
	add(Lpollito1);
	add(Lpollito2);
	
	add(Lpollito);
	
	add(sigigual);
	
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
	
	  if (e.getSource()==ayuda) {
      	
      	new Ayuda();
      	
      }
	  if (e.getSource()==menu) {
			
   	   new VentanaEmergenteVolverMenu();
		    this.dispose();
       }
}
}
