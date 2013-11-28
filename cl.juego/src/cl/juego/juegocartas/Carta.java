package cl.juego.juegocartas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import cl.juego.juegocartas.img.CargarImagenes;

public class Carta implements Dibujable {

	public static final int ANCHO = 100;
	public static final int ALTO = 150;
	public static final int CARTA1 = 32;
	public static final int CARTA2 = 16;
	public static final int CARTA4 = 8;
	public static final int CARTA8 = 4;
	public static final int CARTA16 = 2;
	public static final int CARTA32 = 1;
	
	private int x;
	private int y;
	private int carta;
	private Image imagen;
	private boolean visible;
	private boolean encima;
	
	public Carta(int x, int y, String carta){
		this.setVisible(true);
		this.x = x;
		this.y = y;
		CargarImagenes cargador = new CargarImagenes();
		this.setImagen(cargador.cargarImagen(carta));
		this.encima = false;
		
	}
	
	@Override
	public void dibujar(Graphics g) {
		int[] xPoints = new int[4];
		int[] yPoints = new int[4];
		xPoints[0] = this.x-(ANCHO/2);
		yPoints[0] = this.y-(ALTO/2);
		xPoints[1] = this.x+(ANCHO/2);
		yPoints[1] = this.y-(ALTO/2);
		xPoints[2] = this.x+(ANCHO/2);
		yPoints[2] = this.y+(ALTO/2);
		xPoints[3] = this.x-(ANCHO/2);
		yPoints[3] = this.y+(ALTO/2);
		if (encima) {
			g.setColor(Color.red);
			g.fillPolygon(xPoints, yPoints, 4);
		}else if (!visible) {
			g.setColor(Color.DARK_GRAY);
			g.fillPolygon(xPoints, yPoints, 4);
		} else {
			g.drawImage(imagen, this.x-(ANCHO/2), this.y-(ALTO/2), null);
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCarta() {
		return carta;
	}

	public void setCarta(int carta) {
		this.carta = carta;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image image) {
		this.imagen = image;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public boolean isEncima() {
		return encima;
	}

	public void setEncima(boolean encima) {
		this.encima = encima;
	}

}
