package cl.juego.pochitos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import cl.juego.*;
@SuppressWarnings("serial")
public class VentanaPochitos extends JFrame implements ActionListener{
        
	    //BOTONES DEL MENU
	    private static JButton menu = new JButton ("Menu");
	    private static JButton pausa = new JButton ("Pausa");
	    private static JButton restaurar = new JButton ("Restaurar");
	    private static JButton ayuda = new JButton ("Ayuda");
	
        private Canvas canvas;
        
        public VentanaPochitos(){
        	super("Juego de los Pochitos");
                canvas = new Canvas();
                
                canvas.add(menu);
                canvas.add(pausa);
                canvas.add(restaurar);
                canvas.add(ayuda);
                
                menu.setBounds(740,20,90,20);
	        pausa.setBounds(650,20,90,20);
	        restaurar.setBounds(10,20,110,20);        
	        ayuda.setBounds(130,20,110,20);
                
	        menu.addActionListener(this);
	        pausa.addActionListener(this);
	        restaurar.addActionListener(this);
	        ayuda.addActionListener(this);
	           
	            
                
                super.setSize(900,600);
                super.add(canvas);
                super.setLocationRelativeTo(null);
                super.setVisible(true);
                super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        }

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==menu){
				new VentanaEmergenteVolverMenu();
				this.dispose();
			}
			if(e.getSource()==restaurar){
				this.canvas = new Canvas();
			}
			if(e.getSource()==ayuda){
				new Ayuda();
			}
		}
}
