package cl.juego.pochitos;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import cl.juego.pochitos.img.CargarImagenes;

@SuppressWarnings("serial")
public class Canvas extends JPanel implements ActionListener{
        
        public final static int GAP = 10;
        public final static int TOTAL_NUMEROS = 5;
        private int seleccionado;


        //NUMEROS A (BINARIOS)
        private static JLabel numA32 = new JLabel();
        private static JLabel numA16 = new JLabel();
        private static JLabel numA8 = new JLabel();
        private static JLabel numA4 = new JLabel();
        private static JLabel numA2 = new JLabel();
        private static JLabel numA1 = new JLabel();


        //NUMEROS B (BINARIOS)
        private static JLabel numB32 = new JLabel();
        private static JLabel numB16 = new JLabel();
        private static JLabel numB8 = new JLabel();
        private static JLabel numB4 = new JLabel();
        private static JLabel numB2 = new JLabel();
        private static JLabel numB1 = new JLabel();
        


        
        
        //IMAGENES DE LOS POLLITOS Y LAS CUERDAS
        private static JLabel lineaPollitos = new JLabel();
        private static JLabel lineaPollitos2 = new JLabel();
		private static JLabel Lpollito1 = new JLabel();
		private static JLabel Lpollito2 = new JLabel();
		private static JLabel Lpollito = new JLabel();
		private static JLabel sigigual = new JLabel();	
        private ArrayList<Numero> numeros;
        
        private static char stringA[]=null;
        private static char stringB[]=null;
        private static JButton comprobar = new JButton("Comprobar");
        
        public Canvas(){
        		this.setLayout(null);
                numeros = new ArrayList<>(TOTAL_NUMEROS);
                for(int i=0;i<TOTAL_NUMEROS;i++){
                	numeros.add(i,new Numero(720,470,"1"));
                }
                for(int i=0;i<TOTAL_NUMEROS;i++){
                	numeros.add(i+TOTAL_NUMEROS,new Numero(765,470,"0"));
                }
                String[] NUMEROS={"101011","000101","110110","101010","011001","100001","101101","001010","011010","000111"};
                Random rand=new Random();
                int a=rand.nextInt(10);
                int A= Integer.parseInt(NUMEROS[a], 2);
                int b=rand.nextInt(10);
                int B= Integer.parseInt(NUMEROS[b], 2);
                for(int i=0;i<NUMEROS[a].length();i++){
                	stringA[i]=NUMEROS[a].charAt(i);
                	stringB[i]=NUMEROS[b].charAt(i);
                }
                iniciarPosiciones();
                cargarIconos();
                agregarObjetos();
                
                super.setSize(900,600);
                Adaptador ad = new Adaptador();
                super.addMouseListener(ad);
                super.addMouseMotionListener(ad);
                System.out.println(A+" "+B);
        }
        
        @Override
        public void paint(Graphics g){
                super.paint(g);
                for (Dibujable carta : numeros) {
                        carta.dibujar(g);
                }
        }
        
        private class Adaptador extends MouseAdapter {
                
                @Override
                public void mouseDragged(MouseEvent e) {
                        if (seleccionado != -1) {
                                numeros.get(seleccionado).setX(e.getX());
                                numeros.get(seleccionado).setY(e.getY());
                                repaint();                                        
                        }
                }
                
                @Override
                public void mouseClicked(MouseEvent e) {
                	Numero carta =numeros.get(seleccionado);
                        if (e.getClickCount() == 2) {
                                carta.setVisible(!carta.isVisible());
                                repaint();
                        }
                }
                
                @Override
                public void mousePressed(MouseEvent e) {
                        seleccionado = -1;
                        for (int i = 0; i < numeros.size(); i++) {
                                int x1,y1;
                                x1 = numeros.get(i).getX()-(Numero.ANCHO/2);
                                y1 = numeros.get(i).getY()-(Numero.ALTO/2);
                                if(!(e.getX() < x1 || e.getX()>(x1+Numero.ANCHO)
                                                || e.getY() < y1 || e.getY() > y1+Numero.ALTO)){
                                        seleccionado = i;
                                }
                        }
                        
                        
                }
        }
        public String random(){
        	Random rnd=new Random();
        	if(rnd.nextInt(2)==1){
        		return "1";
        	}else{
        		return "0";
        	}
        }

        private void cargarIconos(){
                CargarImagenes cargador = new CargarImagenes();
                lineaPollitos.setIcon(new ImageIcon(cargador.cargarImagen("pollit2")));
                lineaPollitos2.setIcon(new ImageIcon(cargador.cargarImagen("poll2")));
                Lpollito.setIcon(new ImageIcon(cargador.cargarImagen("pochito 0")));
                Lpollito1.setIcon(new ImageIcon(cargador.cargarImagen("pochito 22")));
                Lpollito2.setIcon(new ImageIcon(cargador.cargarImagen("pochito 33")));
                sigigual.setIcon(new ImageIcon(cargador.cargarImagen("iguall")));

                numA32.setIcon(new ImageIcon(cargador.cargarImagen(random())));
                numA16.setIcon(new ImageIcon(cargador.cargarImagen(random())));
                numA8.setIcon(new ImageIcon(cargador.cargarImagen(random())));
                numA4.setIcon(new ImageIcon(cargador.cargarImagen(random())));
                numA2.setIcon(new ImageIcon(cargador.cargarImagen(random())));
                numA1.setIcon(new ImageIcon(cargador.cargarImagen(random())));

                numB32.setIcon(new ImageIcon(cargador.cargarImagen(random())));
                numB16.setIcon(new ImageIcon(cargador.cargarImagen(random())));
                numB8.setIcon(new ImageIcon(cargador.cargarImagen(random())));
                numB4.setIcon(new ImageIcon(cargador.cargarImagen(random())));
                numB2.setIcon(new ImageIcon(cargador.cargarImagen(random())));
                numB1.setIcon(new ImageIcon(cargador.cargarImagen(random())));
                
        }
        private void agregarObjetos(){
              
                super.add(lineaPollitos);
                super.add(lineaPollitos2);
                super.add(Lpollito1);
                super.add(Lpollito2);
                super.add(Lpollito);
                super.add(sigigual);
                super.add(comprobar);

                super.add(numA32);
                super.add(numA16);
                super.add(numA8);
                super.add(numA4);
                super.add(numA2);
                super.add(numA1);

                super.add(numB32);
                super.add(numB16);
                super.add(numB8);
                super.add(numB4);
                super.add(numB2);
                super.add(numB1);
                
        }
        private void iniciarPosiciones(){	            
	            lineaPollitos.setBounds(0,100, 900, 100);
	            lineaPollitos2.setBounds(0,300, 900, 100);
	            Lpollito1.setBounds(0,20,200,200);
	            Lpollito2.setBounds(0,200,200,200);
	            Lpollito.setBounds(500,140,400,200);
	            sigigual.setBounds(500,170,200,200);
	            
	            comprobar.setBounds(690,400,110,20);;
	                    
	            numA32.setBounds(180,152,100,100);
	       		numA16.setBounds(220,152,100,100);
	       		numA8.setBounds(260,152,100,100);
	       		numA4.setBounds(300,152,100,100);
	       		numA2.setBounds(340,152,100,100);
	       		numA1.setBounds(380,152,100,100);		
	       		
	       		numB32.setBounds(180,348,100,100);
	       		numB16.setBounds(220,348,100,100);
	       		numB8.setBounds(260,348,100,100);
	       		numB4.setBounds(300,349,100,100);
	       		numB2.setBounds(340,350,100,100);
	       		numB1.setBounds(380,352,100,100);	
        }
        @Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==comprobar){
				
			}
			
		}
}