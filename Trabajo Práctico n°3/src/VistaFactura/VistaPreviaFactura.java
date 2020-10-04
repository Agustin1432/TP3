package VistaFactura;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D.Double;
import java.text.SimpleDateFormat;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Controlador.Controlador;
import Interfaz.VentanaPrincipal;
import TrabajoPracticoN3.Articulo;
import TrabajoPracticoN3.Factura;
import TrabajoPracticoN3.Item;
import VistaArticulo.BuscarArticulo;
import VistaArticulo.CrearArticulo;
import VistaArticulo.EditarArticulo;
import VistaArticulo.EliminarArticulo;
import VistaCliente.BuscarCliente;
import VistaCliente.CrearCliente;
import VistaCliente.EditarCliente;
import VistaCliente.EliminarCliente;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class VistaPreviaFactura extends JFrame {
	private Controlador control;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	
	public VistaPreviaFactura(Controlador control2,Factura factura) {
		control=control2;
		setSize(700, 700);
		setLocationRelativeTo(null);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cliente");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Crear");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==mntmNewMenuItem) {
					CrearCliente crearc= new CrearCliente(control);
					crearc.setVisible(true);
					setVisible(false);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Buscar");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==mntmNewMenuItem_2) {
					BuscarCliente buscarc= new BuscarCliente(control);
					buscarc.setVisible(true);
					setVisible(false);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Editar");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==mntmNewMenuItem_3) {
					EditarCliente editarc= new EditarCliente(control);
					editarc.setVisible(true);
					setVisible(false);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Eliminar");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==mntmNewMenuItem_1) {
					EliminarCliente eliminarc= new EliminarCliente(control);
					eliminarc.setVisible(true);
					setVisible(false);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Art\u00EDculo");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Crear");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==mntmNewMenuItem_4) {
					CrearArticulo crearc= new CrearArticulo(control);
					crearc.setVisible(true);
					setVisible(false);
				}
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Buscar");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==mntmNewMenuItem_5) {
					BuscarArticulo buscara= new BuscarArticulo(control);
					buscara.setVisible(true);
					setVisible(false);
				}
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Editar");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==mntmNewMenuItem_7) {
					EditarArticulo editara= new EditarArticulo(control);
					editara.setVisible(true);
					setVisible(false);
				}
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Eliminar");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==mntmNewMenuItem_6) {
					EliminarArticulo elimia= new EliminarArticulo(control);
					elimia.setVisible(true);
					setVisible(false);
				}
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_2 = new JMenu("Factura");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Crear");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==mntmNewMenuItem_8) {
					CrearFactura crearf= new CrearFactura(control);
					crearf.setVisible(true);
					setVisible(false);
				}
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("ListarFacturas");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==mntmNewMenuItem_9) {
					ListaFactura listaf= new ListaFactura(control);
					listaf.setVisible(true);
					setVisible(false);
				}
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_9);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField(factura.getCliente().getTelefono());
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(77, 106, 144, 20);
		panel.add(textField);
		
		textField_1 = new JTextField(factura.getCliente().getDireccion());
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(77, 81, 144, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField(factura.getCliente().getDni());
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(77, 56, 144, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField(factura.getCliente().getApellido());
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(77, 34, 144, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField(factura.getCliente().getNombre());
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(77, 11, 144, 20);
		panel.add(textField_4);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(10, 14, 57, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setBounds(10, 37, 57, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DNI:");
		lblNewLabel_2.setBounds(10, 62, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_3.setBounds(10, 87, 73, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tel\u00E9fono:");
		lblNewLabel_4.setBounds(10, 112, 57, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("TIPO DE FACTURA:");
		lblNewLabel_7.setBounds(467, 14, 121, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("FECHA:");
		lblNewLabel_8.setBounds(467, 37, 59, 14);
		panel.add(lblNewLabel_8);
		
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		textField_5 = new JTextField(sdf.format(factura.getFecha()));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(572, 34, 102, 20);
		panel.add(textField_5);
		
		String s=String.valueOf(factura.getNroFactura());
		textField_6 = new JTextField(s);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(572, 60, 102, 20);
		panel.add(textField_6);
		
		JLabel lblNewLabel_8_1 = new JLabel("NRO FACTURA:");
		lblNewLabel_8_1.setBounds(467, 63, 102, 14);
		panel.add(lblNewLabel_8_1);
		
		String cadena = Character.toString(factura.getLetra());
		textField_7 = new JTextField(cadena);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(572, 11, 102, 20);
		panel.add(textField_7);
		
		JLabel lblNewLabel_5 = new JLabel("Articulos:");
		lblNewLabel_5.setBounds(10, 150, 89, 14);
		panel.add(lblNewLabel_5);
		
		
		Iterator <Item> iterador = factura.getItem().iterator();
		
		
		DefaultListModel<Item> modelo = new DefaultListModel<Item>();
		double total;
		total=0;
		while(iterador.hasNext()) {
			modelo.addElement(iterador.next());
		}
		
			
		JList<Item> list = new JList<Item>(modelo);
		list.setBounds(10, 175, 664, 402);
		panel.add(list);
		
		JLabel lblNewLabel_6 = new JLabel("TOTAL:");
		lblNewLabel_6.setBounds(10, 588, 46, 14);
		panel.add(lblNewLabel_6);
		
		String cadena1 = String.valueOf(total);
		textField_8 = new JTextField(cadena1);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(66, 585, 102, 20);
		panel.add(textField_8);
		
		JButton btnNewButton_2_1 = new JButton("VOLVER");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnNewButton_2_1) {
					VentanaPrincipal ventanaprincipal= new VentanaPrincipal(control);
					ventanaprincipal.setVisible(true);
					setVisible(false);
				}
			}
		});
		btnNewButton_2_1.setBounds(585, 582, 89, 23);
		panel.add(btnNewButton_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 175, 664, 402);
		panel.add(scrollPane);
	}
}
