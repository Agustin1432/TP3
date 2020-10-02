package VistaCliente;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import Controlador.*;
import Interfaz.VentanaPrincipal;
import TrabajoPrácticoN3.*;
import VistaArticulo.BuscarArticulo;
import VistaArticulo.CrearArticulo;
import VistaArticulo.EditarArticulo;
import VistaArticulo.EliminarArticulo;
import VistaFactura.CrearFactura;

public class CrearCliente extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	JPanel panel;
	Controlador control;
	

	public CrearCliente() {
		setSize(700,700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setEnabled(false);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cliente");
		menuBar.add(mnNewMenu);
		this.paintAll(getGraphics());
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
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Editar");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==mntmNewMenuItem_1) {
					EditarCliente editarc= new EditarCliente();
					editarc.setVisible(true);
					setVisible(false);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Eliminar");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==mntmNewMenuItem_3) {
					EliminarCliente eliminarc= new EliminarCliente();
					eliminarc.setVisible(true);
					setVisible(false);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		
		JMenu mnNewMenu_1 = new JMenu("Art\u00EDculo");
		menuBar.add(mnNewMenu_1);
		this.paintAll(getGraphics());
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
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Buscar");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==mntmNewMenuItem_6) {
					BuscarArticulo buscara= new BuscarArticulo();
					buscara.setVisible(true);
					setVisible(false);
				}
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
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
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Eliminar");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==mntmNewMenuItem_6) {
					EliminarArticulo elimia= new EliminarArticulo();
					elimia.setVisible(true);
					setVisible(false);
				}
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_2 = new JMenu("Factura");
		menuBar.add(mnNewMenu_2);
		this.paintAll(getGraphics());
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
		
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(76, 134, 529, 290);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(185, 255, 46, 14);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField("");
		textField.setBounds(241, 252, 188, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setBounds(185, 280, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(241, 277, 188, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DNI:");
		lblNewLabel_2.setBounds(185, 305, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(241, 302, 188, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_3.setBounds(185, 330, 50, 14);
		panel_1.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(241, 327, 188, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tel\u00E9fono:");
		lblNewLabel_4.setBounds(185, 355, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(241, 352, 188, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("AGREGAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textField.getText().equals("")&&!textField_1.getText().equals("")&&!textField_2.getText().equals("")&&!textField_3.getText().equals("")&&!textField_4.getText().equals("")) {
					TrabajoPrácticoN3.Cliente crear= new TrabajoPrácticoN3.Cliente(textField.getText(), textField_1.getText(), textField_2.getText(),textField_3.getText(), textField_4.getText());
					control.crearCliente(crear);
				}else {
					JOptionPane.showMessageDialog(null,"POR FAVOR ingresar todos los campos");
				}
			}
		});
		btnNewButton.setEnabled(true);
		btnNewButton.setBounds(76, 511, 100, 40);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VOLVER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnNewButton_1) {
					VentanaPrincipal ventanaprincipal= new VentanaPrincipal();
					ventanaprincipal.setVisible(true);
					setVisible(false);
				}
			}
		});
		btnNewButton_1.setBounds(504, 511, 100, 40);
		panel.add(btnNewButton_1);
			
		
	}
	
	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
}
