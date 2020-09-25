package Interfaz;

import javax.swing.*;

import java.awt.*;
public class PruebaCliente{
	public static void main(String[] args){

	    VentanaCliente ventana = new VentanaCliente();
	    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ventana.setBounds(0,0,700,700);
	    ventana.setLayout(new GridLayout());
	    ventana.setVisible(true);
	    ventana.setResizable(false);
	    ventana.setLocationRelativeTo(null);
	 }
}