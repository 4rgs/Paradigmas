package cl.juego.juegocartas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Canvas extends JPanel {
	
	public final static int x = 200;
	public final static int y = 400;
	public final static int TOTAL_CARTAS = 6;
	private int seleccionado;
	
	private static JButton menu = new JButton ("Menu");
	private static JButton pausa = new JButton ("Pausa");
	private static JButton restaurar = new JButton ("Restaurar");
	private static JButton ayuda = new JButton ("Ayuda");
	
	private static JLabel numBinario= new JLabel("1  0  0  1  0  1");
	private static JLabel numDecimal= new JLabel("37");
	private static Font font = new Font("Verdana",Font.BOLD,72);
	private static Font font2 = new Font("Verdana",Font.BOLD,64);
	
	private static ImageIcon imagenIgual = new ImageIcon("igual.png");
	private static JLabel esIgual = new JLabel(imagenIgual);

	
	private ArrayList<Carta> cartas;
	
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	JPanel panel6;
	
	public Canvas(){
		
		cartas = new ArrayList<>();
		cartas.add(new Carta(x+2,y-2, "carta1"));
		cartas.add(new Carta(x+4,y-4, "carta2"));
		cartas.add(new Carta(x+6,y-6, "carta4"));
		cartas.add(new Carta(x+8,y-8, "carta8"));
		cartas.add(new Carta(x+10,y-10, "carta16"));
		cartas.add(new Carta(x+12,y-12, "carta32"));
	
		panel1 = new JPanel();
	    panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		panel1.add(new JLabel("32"));
		panel1.setBounds(50, 150, 95, 150);
	
		panel2 = new JPanel();
	    panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		panel2.add(new JLabel("16"));
		panel2.setBounds(150, 150, 95, 150);
		
		panel3 = new JPanel();
	    panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		panel3.add(new JLabel("8"));
		panel3.setBounds(250, 150, 95, 150);
		
		panel4 = new JPanel();
	    panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		panel4.add(new JLabel("4"));
		panel4.setBounds(350, 150, 95, 150);
		
		panel5 = new JPanel();
	    panel5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		panel5.add(new JLabel("2"));
		panel5.setBounds(450, 150, 95, 150);
		
		panel6 = new JPanel();
	    panel6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		panel6.add(new JLabel("1"));
		panel6.setBounds(550, 150, 95, 150);
		
		
		super.setSize(x, y);
		Adaptador ad = new Adaptador();
		super.addMouseListener(ad);
		super.addMouseMotionListener(ad);
		
		this.setLayout(null);
		
		numBinario.setFont(font);
		numDecimal.setFont(font2);
		esIgual.setBounds(680, 250, 50, 50);
		
		numBinario.setBounds(70, 50, 600, 100);
		numDecimal.setBounds(750, 220,100, 100);
		
		menu.setBounds(640,500,90,20);
		pausa.setBounds(550,500,90,20);
		restaurar.setBounds(10,20,110,20);
		ayuda.setBounds(130,20,110,20);
		
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		add(pausa);
		add(menu);
		add(restaurar);
		add(ayuda);
		add(numDecimal);
		add(esIgual);
		add(numBinario);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		for (Dibujable carta : cartas) {
			carta.dibujar(g);
		}
	}
	
	private class Adaptador extends MouseAdapter {
		
		@Override
		public void mouseDragged(MouseEvent e) {
			if (seleccionado != -1) {
				cartas.get(seleccionado).setX(e.getX());
				cartas.get(seleccionado).setY(e.getY());
				repaint();					
			}
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			Carta carta =cartas.get(seleccionado);
			if (e.getClickCount() == 2) {
				carta.setVisible(!carta.isVisible());
				repaint();
			}
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			seleccionado = -1;
			for (int i = 0; i < cartas.size(); i++) {
				int x1,y1;
				x1 = cartas.get(i).getX()-(Carta.ANCHO/2);
				y1 = cartas.get(i).getY()-(Carta.ALTO/2);
				if(!(e.getX() < x1 || e.getX()>(x1+Carta.ANCHO)
						|| e.getY() < y1 || e.getY() > y1+Carta.ALTO)){
					seleccionado = i;
				}
			}
			
			
		}
	}
	 
	 
}
	
	



