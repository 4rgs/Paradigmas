package cl.juego.pochitos;

import javax.swing.JFrame;
@SuppressWarnings("serial")
public class Ventana extends JFrame {
        
        private Canvas canvas;
        
        public Ventana(){
        		super("Juego de los Pochitos");
                canvas = new Canvas();
                super.setSize(900,600);
                super.add(canvas);
                super.setLocationRelativeTo(null);
                super.setVisible(true);
                super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        }
        
        public static void main(String[] args) {
                new Ventana();
        }
        
        
}