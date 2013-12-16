package cl.juego.pochitos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import cl.juego.pochitos.img.*;

public class Numero implements Dibujable {

        public static final int ANCHO = 40;
        public static final int ALTO = 98;
        public static final int NUMERO1 = 1;
        public static final int NUMERO0 = 0;
        
        private int x;
        private int y;
        private char numero;
        private Image imagen;
        private boolean visible;
        private boolean encima;
        
        public Numero(int x, int y, String nombre){
                this.setVisible(true);
                this.x = x;
                this.y = y;
                if(nombre=="uno"){
                	numero='1';
                }else{
                	numero='0';
                }
                CargarImagenes cargador = new CargarImagenes();
                this.setImagen(cargador.cargarImagen(nombre));
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
                        g.setColor(Color.black);
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

        public char getCarta() {
                return numero;
        }

        public void setNumero(char numero) {
                this.numero = numero;
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

        public void setEncima(boolean encima) {
                this.encima = encima;
        }

}