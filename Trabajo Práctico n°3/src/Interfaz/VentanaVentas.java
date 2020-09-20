package Interfaz;

import java.awt.Container;
//import java.awt.Font;
//import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class VentanaVentas extends JFrame {
	/*tipos de interfaces
	 * JButton			BOTON
	 * JTextField		CUADRO DE TEXTO
	 * JFrame			VENTANAS
	 * JPanel			PANELES
	 * JLabel			ETIQUETAS
	 * JRadioButton 	BOTON DE OPCION
	 * 
	 */
	public JPanel p1;
	public Container cp;
	
	public  VentanaVentas () {
		setSize(700,700);//ESTABLECE EL TAMAÑO DE LA VENTANA
		setDefaultCloseOperation(EXIT_ON_CLOSE);//DEJA DE EJECUTARSE  AL APRETAR LA CRUZ
		setTitle("Programa"); //AGREGA EL TIRULO
		setLocationRelativeTo(null);//COLOCA LA VENTANA EN EL CENTRO
		cp = getContentPane();
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		paneles();
		botones();
		etiquetas();
		cuadroDeTexto();
	}
	
	private void cuadroDeTexto() {
		//getText //para extraer el texto
	}
	private void paneles() {
		p1= new JPanel ();
		p1.setLayout(null);
		cp.add(p1);
	}
	
	private void etiquetas() {
		//VARIABLE DE TEXTO.setHorizontalAlignment(SwingConstants.CENTER);// ALINEA UN TEXTO
		//b1.setFont(new Font("arial",Font.ITALIC,20));//ESTABLECEMOS LA FUENTE DE TEXTO
		//ImagenIcon imagen= new ImagenIcon("nombre de la imagen");
		//DESPUES DE ESTABLECER EL TAMAÑO DE LA ETIQUETA etiqueta.setIcon(new ImagenIcon(imagen.getImagen().getScalendInstance(ancho,largo,imagen.escalado))//AGREGA IMAGEN
	}
	
	private void botones() {
		//setEnable(); //PARA HABILITAR O DESABILITAR EL BOTON
		//setForeground(Color.);// cambiar el color de la letra
		//setFont // cambiar la fuente del texto
		//setOpaque(true);//para habilitar el cambio delboton
		//setBackgrond(Color.);// color del boton
		
		JButton b1= new JButton("FACTURA");
		b1.setBounds(10, 10,100,20);
		p1.add(b1);
		
		
	}
}
