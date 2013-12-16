package cl.juego.pochitos.img;

import java.awt.Image;

import javax.swing.ImageIcon;

public class CargarImagenes {
        public Image cargarImagen(String nombre){
                Image imagen = new ImageIcon(getClass().getResource(nombre+".png")).getImage();
                return imagen;
        }
}