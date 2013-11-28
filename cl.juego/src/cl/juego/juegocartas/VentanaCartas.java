package cl.juego.juegocartas;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaCartas extends JFrame {

	private Canvas canvas;
	
	public VentanaCartas(){
		canvas = new Canvas();
		super.setSize(900, 600);
		super.add(canvas);
		super.setVisible(true);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
