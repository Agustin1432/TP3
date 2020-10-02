package Interfaz;

import Controlador.Controlador;

public class Programa {
	public static void main(String[] args) {
		Controlador control= new Controlador();
		VentanaPrincipal v1 = new VentanaPrincipal(control);
		v1.setVisible(true);
	}
}
