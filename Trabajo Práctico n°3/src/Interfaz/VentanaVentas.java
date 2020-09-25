package Interfaz;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.Font;
//import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;


public class VentanaVentas extends JFrame  {
	/*tipos de interfaces
	 * JButton			BOTON
	 * JTextField		CUADRO DE TEXTO
	 * JTextArea		CUARO GRANDE DE TEXTO
	 * JFrame			VENTANAS
	 * JPanel			PANELES
	 * JLabel			ETIQUETAS
	 * JRadioButton 	BOTON DE OPCIONes multiples
	 * JComboBox		Lista desplegable
	 * JList			PAra mostrar una lista
	 */
	public JPanel p1;
	public Container cp;
	private JButton b1;
	
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
		listaDesplegable();
	}
	
	private void listaDesplegable() {
		//JComboBox com1 =new JComboBox(VECTOR STRING);
		//com1.addItem("Nombre"); //para agregar un objeto mas a la lista
		//com1.setSelectedItem("nombre"); //te indica lo que muestra al iniciar
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
		
		JLabel eti1 =new JLabel("DNI del Cliente: ");
		eti1.setBounds(10, 10,100, 20);
		p1.add(eti1);
		JTextField tex1 =new JTextField();
		tex1.setBounds(100, 10,100, 20);
		p1.add(tex1);
					
					
		JLabel eti2 =new JLabel("Nombre: ");
		eti2.setBounds(10, 30,90, 20);
		p1.add(eti2);
		JLabel eti3 =new JLabel("Apellido: ");
		eti3.setBounds(10, 50,90, 20);
		p1.add(eti3);
		JLabel eti4 =new JLabel("Direccion: ");
		eti4.setBounds(10, 70,90, 20);
		p1.add(eti4);
		JLabel eti5 =new JLabel("Telefono: ");
		eti5.setBounds(10, 90,90, 20);
		p1.add(eti5);
					
					
		JComboBox com1= new JComboBox();
		com1.addItem("A");
		com1.addItem("B");
		com1.addItem("C");
		com1.setBounds(600, 10,50, 20);
		p1.add(com1);
		JLabel eti6 =new JLabel("Tipo de Factura: ");
		eti6.setBounds(500, 10,100, 20);
		p1.add(eti6);
					
					
		JLabel eti7 =new JLabel("Selecciona el articulo que quieras agregar y apreta en 'AGREGAR' : ");
		eti7.setBounds(10, 120,380, 20);
		p1.add(eti7);
		JButton b2= new JButton("AGREGAR");
		b2.setBounds(550,115,100,30);
		p1.add(b2);
		String [] articulos={"banana","manzana","Pera","Zanahoria"};
		JList l1=new JList(articulos);
		l1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		Object[] seleccion = l1.getSelectedValues();
		int[] indices = l1.getSelectedIndices();
		JScrollPane barraDesplazamiento = new JScrollPane(l1);
		barraDesplazamiento.setBounds(10,150,650,150);
		p1.add(barraDesplazamiento);
				
				
			
		
		
	}
}
