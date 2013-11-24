package cl.juego.pochitos.img;

import java.awt.Image;

import javax.swing.ImageIcon;

public class CargarImagenes {
        public Image cargarImagen(String numero){
                Image imagen = new ImageIcon(getClass().getResource(numero+".png")).getImage();
                return imagen;
        }
}