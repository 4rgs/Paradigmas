package cl.juego.pochitos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import cl.juego.pochitos.img.CargarImagenes;

@SuppressWarnings("serial")
public class Canvas extends JPanel implements ActionListener{
        
        public final static int GAP = 10;
        public final static int TOTAL_NUMEROS = 5;
        public final static int LARGO_BINARIO= 6;
        private int seleccionado;
        //NUMEROS A (BINARIOS)
        private static JLabel[] numA = new JLabel[LARGO_BINARIO];
        //NUMEROS B (BINARIOS)
        private static JLabel[] numB = new JLabel[LARGO_BINARIO];
        
        
        //IMAGENES DE LOS POLLITOS Y LAS CUERDAS
        private static JLabel lineaPollitos = new JLabel();
        private static JLabel lineaPollitos2 = new JLabel();
		private static JLabel Lpollito1 = new JLabel();
		private static JLabel Lpollito2 = new JLabel();
		private static JLabel Lpollito = new JLabel();
		private static JLabel sigigual = new JLabel();	
        private ArrayList<Numero> numeros;
        
        private static char[] stringA=new char[6];
        private static char[] stringB=new char[6];
        
        private final static String[] NUMEROS={"001011","000010","000011","000100","000101","000110","000111","001000","001001","001010"};
        private static Random rand=new Random();
        private static int a=rand.nextInt(10);
        private static int A= Integer.parseInt(NUMEROS[a], 2);
        private static int b=rand.nextInt(10);
        private static int B= Integer.parseInt(NUMEROS[b], 2);
        private String[] nombresCartasA=new String[6];
        private String[] nombresCartasB=new String[6];
        private static int resultadoDecimal=A*B;
        private static String resultadoBinario=Integer.toBinaryString(resultadoDecimal);
        private static int largoPaneles=resultadoBinario.length(); 
        private static JButton comprobar = new JButton("Comprobar");
        private static char[] charRespuesta=new char[largoPaneles];
        private static String stringRespuesta="";
        
      //Panel Verificacion
        private static JPanel respuesta=new JPanel();
        private static JPanel[] panelesInternos=new JPanel[largoPaneles];
        
        public Canvas(){
        		this.setLayout(null);
                numeros = new ArrayList<>(TOTAL_NUMEROS);
                for(int i=0;i<TOTAL_NUMEROS;i++){
                	numeros.add(i,new Numero(720,470,"uno"));
                }
                for(int i=0;i<TOTAL_NUMEROS;i++){
                	numeros.add(i+TOTAL_NUMEROS,new Numero(765,470,"cero"));
                }
                for(int i=0;i<6;i++){
                	stringA[i]=NUMEROS[a].charAt(i);
                	stringB[i]=NUMEROS[b].charAt(i);
                }
               
                for(int i=0;i<6;i++){
                	nombresCartasA[i]=binToBin(stringA[i]);
                	nombresCartasB[i]=binToBin(stringB[i]);
                }
                for(int i=0;i<largoPaneles;i++){
                	panelesInternos[i]=new JPanel();
                	panelesInternos[i].setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                	panelesInternos[i].setLayout(null);
                }
                respuesta.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,2));
                
                respuesta.setLayout(new GridLayout(1,largoPaneles));
                for(int i=0;i<largoPaneles;i++){
                	respuesta.add(panelesInternos[i]);
                }
                
                agregarObjetos();
                cargarIconos();
                iniciarPosiciones();
                
                
                super.setSize(900,600);
                Adaptador ad = new Adaptador();
                comprobar.addActionListener(this);
                super.addMouseListener(ad);
                super.addMouseMotionListener(ad);
                for(int i=0;i<6;i++){
                	System.out.println(stringA[i]+"\t"+stringB[i]);
                	System.out.println(nombresCartasA[i]+"\t"+nombresCartasB[i]);
                }
                System.out.println("numero A:"+A+"\nnumero B:"+B);
                System.out.println("resultado Decimal: "+resultadoDecimal);
                System.out.println("resutaldo Binario: "+resultadoBinario);
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
                public void mouseReleased(MouseEvent e){
                	for(int i=0;i<largoPaneles;i++){
                		if(numeros.get(seleccionado).getX()>=550+(40*i) &&
                				numeros.get(seleccionado).getX()<=(550+(40*(i+1))) &&
                				numeros.get(seleccionado).getY()>=262 &&
                				numeros.get(seleccionado).getY()<=362) {
                			charRespuesta[i]=numeros.get(seleccionado).getCarta();
                			numeros.get(seleccionado).setX(572+(39*i));
                			numeros.get(seleccionado).setY(310);
                			System.out.println(charRespuesta);
                		}
                	}
                }
                @Override
                public void mouseClicked(MouseEvent e) {
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
        private String binToBin(char c){
			String nuevo="";
        		if(c=='1'){
        			nuevo="uno";
        		}
        		else if(c=='0'){
        			nuevo="cero";
        		}
        	return nuevo;
        }
        private void cargarIconos(){
                CargarImagenes cargador = new CargarImagenes();
                lineaPollitos.setIcon(new ImageIcon(cargador.cargarImagen("pollit2")));
                lineaPollitos2.setIcon(new ImageIcon(cargador.cargarImagen("poll2")));
                Lpollito.setIcon(new ImageIcon(cargador.cargarImagen("pochito 0")));
                Lpollito1.setIcon(new ImageIcon(cargador.cargarImagen("pochito 22")));
                Lpollito2.setIcon(new ImageIcon(cargador.cargarImagen("pochito 33")));
                sigigual.setIcon(new ImageIcon(cargador.cargarImagen("iguall")));

                for(int i=0;i<6;i++){
                	numA[i].setIcon(new ImageIcon(cargador.cargarImagen(nombresCartasA[i])));
                }
                for(int i=0;i<6;i++){
                	numB[i].setIcon(new ImageIcon(cargador.cargarImagen(nombresCartasB[i])));
                }
        }
        private void agregarObjetos(){
                super.add(lineaPollitos);
                super.add(lineaPollitos2);
                super.add(Lpollito1);
                super.add(Lpollito2);
                super.add(Lpollito);
                super.add(sigigual);
                super.add(comprobar);
                super.add(respuesta);
                for(int i=0;i<6;i++){
                	numA[i]=new JLabel();
                	numB[i]=new JLabel();
                }
                for(int i=0;i<6;i++){
                	super.add(numA[i]);
                	super.add(numB[i]);
                }
        }
        private void iniciarPosiciones(){	            
	            lineaPollitos.setBounds(0,100, 900, 100);
	            lineaPollitos2.setBounds(0,300, 900, 100);
	            Lpollito1.setBounds(0,20,200,200);
	            Lpollito2.setBounds(0,200,200,200);
	            Lpollito.setBounds(500,140,400,200);
	            sigigual.setBounds(500,170,200,200);
	            respuesta.setBounds(550,262,40*largoPaneles,102);
	            comprobar.setBounds(690,400,110,20);
	            
	            int x=180;
	            for(int i=0;i<6;i++){
	            	numA[i].setBounds(x,152,100,100);
	            	x+=40;
	            }
	            x=180;
	            for(int i=0;i<6;i++){
	            	numB[i].setBounds(x,350,100,100);
	            	x+=40;
	            }
        }
        @Override
		public void actionPerformed(ActionEvent e) {
        	stringRespuesta="";
			if(e.getSource()==comprobar){
				for(int i=0;i<largoPaneles;i++){
					stringRespuesta=stringRespuesta+charRespuesta[i];
				}
				System.out.println(stringRespuesta);
				if(stringRespuesta.equals(resultadoBinario)){
					JOptionPane.showMessageDialog(null,null,"Correcto",1,new ImageIcon("Correcto.PNG")); 
				}else{
					JOptionPane.showMessageDialog(null,null,"Incorrecto",0,new ImageIcon("Incorrecto.PNG"));
				}
			}
		}
}