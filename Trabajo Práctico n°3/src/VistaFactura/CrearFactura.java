package VistaFactura;

import javax.swing.*;

import Interfaz.VentanaPrincipal;
import TrabajoPracticoN3.*;
import VistaArticulo.BuscarArticulo;
import VistaArticulo.CrearArticulo;
import VistaArticulo.EditarArticulo;
import VistaArticulo.EliminarArticulo;
import VistaCliente.BuscarCliente;
import VistaCliente.CrearCliente;
import VistaCliente.EditarCliente;
import VistaCliente.EliminarCliente;
import Controlador.*;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;

public class CrearFactura extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private Controlador control;
	private JTextField textField_8;
	private Factura factura;
	private Cliente cliente;
	private char caracter;
	
	public CrearFactura(Controlador control2) {
		control=control2;
		setSize(700,700);
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
		
		
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(109, 12, 112, 20);
		panel.add(textField);
		
		JLabel lblNewLabel_5 = new JLabel("INGRESE EL DNI:");
		lblNewLabel_5.setBounds(10, 15, 94, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(10, 50, 57, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setBounds(10, 73, 57, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DNI:");
		lblNewLabel_2.setBounds(10, 98, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_3.setBounds(10, 123, 73, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tel\u00E9fono:");
		lblNewLabel_4.setBounds(10, 148, 57, 14);
		panel.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(77, 47, 144, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(77, 70, 144, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(77, 92, 144, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(77, 117, 144, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(77, 142, 144, 20);
		panel.add(textField_5);
		
		JLabel lblNewLabel_6 = new JLabel("Para agregar un articulo elija un articulo, su cantidad y luego aprete en AGREGAR:");
		lblNewLabel_6.setBounds(10, 183, 527, 14);
		panel.add(lblNewLabel_6);
		
		
		
		JList lista = new JList(control.listarArticulos());
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lista.setBorder(UIManager.getBorder("ScrollPane.border"));
		lista.setBounds(10, 208, 664, 122);
		panel.add(lista);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(628, 11, 46, 23);
		panel.add(comboBox);
		
		JLabel lblNewLabel_7 = new JLabel("TIPO DE FACTURA:");
		lblNewLabel_7.setBounds(516, 15, 102, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("FECHA:");
		lblNewLabel_8.setBounds(480, 50, 46, 14);
		panel.add(lblNewLabel_8);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha1= new Date();
		String fecha = sdf.format(fecha1);
		textField_6 = new JTextField(fecha);
		textField_6.setEditable(false);
		textField_6.setBounds(572, 47, 102, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		long n=control.ultimaFactura();
		String s=Long.toString(n);
		textField_7 = new JTextField(s);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(572, 73, 102, 20);
		panel.add(textField_7);
		
		JLabel lblNewLabel_8_1 = new JLabel("NRO FACTURA:");
		lblNewLabel_8_1.setBounds(480, 76, 89, 14);
		panel.add(lblNewLabel_8_1);
		
		
		
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
		btnNewButton_2_1.setBounds(585, 588, 89, 23);
		panel.add(btnNewButton_2_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 383, 664, 166);
		panel.add(textArea);
		
		JLabel lblNewLabel_6_1 = new JLabel("Articulos agregados:");
		lblNewLabel_6_1.setBounds(10, 358, 124, 14);
		panel.add(lblNewLabel_6_1);
		
		JScrollPane scrollPane = new JScrollPane(lista);
		scrollPane.setBounds(10, 208, 539, 122);
		panel.add(scrollPane);
		
		
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(572, 236, 102, 20);
		panel.add(textField_8);
		
		JLabel lblNewLabel_9 = new JLabel("Cantidad:");
		lblNewLabel_9.setBounds(572, 211, 63, 14);
		panel.add(lblNewLabel_9);
		
		
		
		JButton btnNewButton_1 = new JButton("AGREGAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textField_8.getText().equals("")) {
				Articulo articulo1 = (Articulo) lista.getSelectedValue();
				int cantidad = Integer.parseInt(textField_8.getText());
				Item item=new Item(articulo1, cantidad);
				factura.agregarItem(item);
				textArea.append(String.valueOf(lista.getSelectedValue())+"  cantidad:"+cantidad+"\n");
				}
				else {
					JOptionPane.showMessageDialog(null,"POR FAVOR ingresar cantidad y el articulo para agregar a factura");
				}
			}
		});
		btnNewButton_1.setBounds(572, 307, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CREAR FACTURA");
		btnNewButton_2.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				if(!textField_8.getText().equals("")&&!textField.getText().equals("")) {
					String a=(String) comboBox.getSelectedItem();
					caracter = a.charAt(0);
					factura.setLetra(caracter);
					control.crearFactura(factura);
					JOptionPane.showMessageDialog(null,"Factura creada");
					CrearFactura crearf= new CrearFactura(control);
					crearf.setVisible(true);
					setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(null,"POR FAVOR ingresar DNI del cliente,cantidad y el articulo para agregar a factura");
					}
			}
		});
		btnNewButton_2.setBounds(10, 588, 136, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("BUSCAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnNewButton) {
					if(textField.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"POR FAVOR ingresar DNI para Buscar");
					}else{
					cliente=control.buscarCliente(textField.getText());
					textField_1.setText(cliente.getNombre());
					textField_2.setText(cliente.getApellido());
					textField_3.setText(cliente.getDni());
					textField_4.setText(cliente.getDireccion());
					textField_5.setText(cliente.getTelefono());
					factura = new Factura(fecha1,n, caracter, cliente);
					}
				}
			}
		});
		btnNewButton.setBounds(236, 11, 89, 23);
		panel.add(btnNewButton);
		
	}
}
