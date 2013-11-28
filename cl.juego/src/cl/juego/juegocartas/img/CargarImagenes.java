package cl.juego.juegocartas.img;

import java.awt.Image;

import javax.swing.ImageIcon;

public class CargarImagenes {
	public Image cargarImagen(String carta){
		Image imagen = new ImageIcon(
				getClass().getResource(carta+".png")).getImage();
		return imagen;
	}
}
