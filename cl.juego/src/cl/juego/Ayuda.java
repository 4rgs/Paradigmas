package cl.juego;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ayuda extends JFrame implements ActionListener{
	private static JButton sumaYRestaBinaria= new JButton("Aprender como sumar y restar Binarios :D");
	private static JButton multiplicacionBinaria= new JButton("Aprender como multiplicar numeros Binarios :D");
	private static JButton transformacionBintoDec= new JButton("Aprende a transformar Binarios a Decimales");
	private static JButton transformacionDecToBin= new JButton("Aprende a transformar Decimales a Binarios");
	private static JButton divisionBinaria=new JButton("Aprende a hacer divisiones entre numeros Binarios");
	
	private static JButton volver = new JButton("CERRAR");
	
	private static final long serialVersionUID = 1L;

	public Ayuda(){
		super("Ayuda y Tutoriales");
		this.setSize(500, 410);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		
		this.add(sumaYRestaBinaria);
		this.add(multiplicacionBinaria);
		this.add(transformacionBintoDec);
		this.add(divisionBinaria);
		this.add(transformacionDecToBin);
		this.add(volver);
		
		sumaYRestaBinaria.setBounds(40,20,400,30);
		multiplicacionBinaria.setBounds(40,70,400,30);
		transformacionBintoDec.setBounds(40,120,400,30);
		divisionBinaria.setBounds(40,170,400,30);
		transformacionDecToBin.setBounds(40,220,400,30);
		volver.setBounds(40,300,400,30);
		
		sumaYRestaBinaria.addActionListener(this);
		multiplicacionBinaria.addActionListener(this);
		transformacionBintoDec.addActionListener(this);
		divisionBinaria.addActionListener(this);
		transformacionDecToBin.addActionListener(this);
		volver.addActionListener(this);
		
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sumaYRestaBinaria){
			try {
				Desktop.getDesktop().browse(new URI("http://youtu.be/l7Gj_2zdH2k"));
			} catch (IOException | URISyntaxException e1) {
				System.out.println("Error URL");
			}
		}
		if(e.getSource()==multiplicacionBinaria){
			try {
				Desktop.getDesktop().browse(new URI("http://youtu.be/BC4dDav4Q7U"));
			} catch (IOException | URISyntaxException e1) {
				System.out.println("Error URL");
			}
		}
		if(e.getSource()==transformacionBintoDec){
			try {
				Desktop.getDesktop().browse(new URI("http://youtu.be/ygwIcthTgsM"));
			} catch (IOException | URISyntaxException e1) {
				System.out.println("Error URL");
			}
		}
		if(e.getSource()==divisionBinaria){
			try {
				Desktop.getDesktop().browse(new URI("http://youtu.be/M93AzR_3TaM"));
			} catch (IOException | URISyntaxException e1) {
				System.out.println("Error URL");
			}
		}
		if(e.getSource()==transformacionDecToBin){
			try {
				Desktop.getDesktop().browse(new URI("http://youtu.be/L9T75y-VxTM"));
			} catch (IOException | URISyntaxException e1) {
				System.out.println("Error URL");
			
		        }
			}
		if (e.getSource()==volver) {
		    this.dispose();
		}
	}
	
}
