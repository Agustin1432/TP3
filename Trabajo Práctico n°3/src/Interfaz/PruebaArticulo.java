package Interfaz;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class PruebaArticulo {
	public static void main(String[] args){

	    VentanaArticulo ventana = new VentanaArticulo();
	    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ventana.setBounds(0,0,700,700);
	    ventana.setLayout(new GridLayout());
	    ventana.setVisible(true);
	    ventana.setResizable(false);
	    ventana.setLocationRelativeTo(null);
	 }
}
