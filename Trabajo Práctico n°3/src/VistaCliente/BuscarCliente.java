package VistaCliente;

import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.*;
import com.jgoodies.forms.layout.*;
import net.miginfocom.swing.MigLayout;
import java.awt.event.*;
import Controlador.*;
import Interfaz.VentanaPrincipal;
import TrabajoPrácticoN3.*;
import VistaArticulo.BuscarArticulo;
import VistaArticulo.CrearArticulo;
import VistaArticulo.EditarArticulo;
import VistaArticulo.EliminarArticulo;
import VistaFactura.CrearFactura;
import VistaFactura.ListaFactura;

public class BuscarCliente extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private Controlador contro;
	
	
	public BuscarCliente() {
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
					CrearCliente crearc= new CrearCliente();
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
					BuscarCliente buscarc= new BuscarCliente();
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
					EditarCliente editarc= new EditarCliente();
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
					EliminarCliente eliminarc= new EliminarCliente();
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
					CrearArticulo crearc= new CrearArticulo();
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
					BuscarArticulo buscara= new BuscarArticulo();
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
					EditarArticulo editara= new EditarArticulo();
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
					EliminarArticulo elimia= new EliminarArticulo();
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
					CrearFactura crearf= new CrearFactura();
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
					ListaFactura listaf= new ListaFactura();
					listaf.setVisible(true);
					setVisible(false);
				}
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_9);
		
		
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 139, 664, 42);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(114, 232, 467, 292);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(10, 222, 46, 14);
		panel_2.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(66, 219, 185, 20);
		textField.setEditable(false);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setBounds(10, 269, 46, 14);
		panel_2.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(66, 266, 185, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DNI");
		lblNewLabel_2.setBounds(10, 341, 46, 14);
		panel_2.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(66, 338, 185, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tel\u00E9fono:");
		lblNewLabel_4.setBounds(10, 391, 46, 14);
		panel_2.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(66, 363, 185, 20);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_3.setBounds(10, 366, 50, 14);
		panel_2.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(66, 388, 185, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("INGRESE EL DNI:");
		lblNewLabel_5.setBounds(137, 139, 100, 14);
		panel_1.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(225, 136, 195, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("BUSCAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton) {
					if(textField_5.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"POR FAVOR ingresar DNI para Buscar");
					}else{
					TrabajoPrácticoN3.Cliente cliente;
					cliente=contro.buscarCliente(textField_5.getText());
					textField.setText(cliente.getNombre());
					textField_1.setText(cliente.getApellido());
					textField_2.setText(cliente.getDni());
					textField_3.setText(cliente.getDireccion());
					textField_4.setText(cliente.getTelefono());
					}
				}
			}
		});
		btnNewButton.setBounds(430, 135, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("VOLVER");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnNewButton_2) {
					VentanaPrincipal ventanaprincipal= new VentanaPrincipal();
					ventanaprincipal.setVisible(true);
					setVisible(false);
				}
			}
		});
		btnNewButton_2.setBounds(283, 556, 100, 40);
		panel.add(btnNewButton_2);
		
		
		
	}
}
