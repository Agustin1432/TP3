package VistaArticulo;

import javax.swing.*;

import Controlador.Controlador;
import Interfaz.VentanaPrincipal;
import TrabajoPrácticoN3.Cliente;
import TrabajoPrácticoN3.Domiciliaria;
import TrabajoPrácticoN3.Herramientas;
import TrabajoPrácticoN3.Industrial;
import VistaCliente.BuscarCliente;
import VistaCliente.CrearCliente;
import VistaCliente.EditarCliente;
import VistaCliente.EliminarCliente;
import VistaFactura.CrearFactura;
import VistaFactura.ListaFactura;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EditarArticulo extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private Controlador contro;
	private JTextField textField_4;
	private JTextField textField_7;
	private Herramientas herramienta1;
	private Industrial industrial1;
	private Domiciliaria domiciliaria11;
	Controlador control;
	public EditarArticulo(Controlador control2) {
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(98, 113, 495, 47);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(15, 30, 46, 14);
		panel_2.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(66, 27, 86, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(98, 330, 498, 276);
		panel.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo:");
		lblNewLabel_2.setBounds(98, 197, 46, 14);
		panel.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_3 = new JLabel("DESCRIPCION:");
		lblNewLabel_3.setBounds(0, 92, 249, 46);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setVisible(false);
		
		JTextField textField_6 = new JTextField();
		textField_6.setBounds(249, 92, 249, 46);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		textField_6.setVisible(false);
		
		
		JLabel lblNewLabel_9 = new JLabel("POTENCIA MAXIMA:");
		lblNewLabel_9.setBounds(0, 92, 249, 46);
		panel_1.add(lblNewLabel_9);
		lblNewLabel_9.setVisible(false);

		
		textField_4 = new JTextField();
		textField_4.setBounds(249, 92, 249, 46);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setVisible(false);
		
		JLabel lblNewLabel_10 = new JLabel("TEMPERATURA MINIMA:");
		lblNewLabel_10.setBounds(0, 138, 249, 46);
		panel_1.add(lblNewLabel_10);
		lblNewLabel_10.setVisible(false);
		
		JTextField textField_10 = new JTextField();
		textField_10.setBounds(249, 138, 249, 46);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		textField_10.setVisible(false);
		
		JLabel lblTemperaturaMaxima = new JLabel("TEMPERATURA MAXIMA: ");
		lblTemperaturaMaxima.setBounds(0, 184, 249, 46);
		panel_1.add(lblTemperaturaMaxima);
		lblTemperaturaMaxima.setVisible(false);
		
		textField_7 = new JTextField();
		textField_7.setBounds(249, 184, 249, 46);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		textField_7.setVisible(false);

		

	
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if("Domiciliaria".equals(comboBox.getSelectedItem())) {
			
					lblTemperaturaMaxima.setVisible(false);
					textField_7.setVisible(false);
					lblNewLabel_10.setVisible(false);
					textField_10.setVisible(false);
	
				}else {
					lblTemperaturaMaxima.setVisible(true);
					textField_7.setVisible(true);
					lblNewLabel_10.setVisible(true);
					textField_10.setVisible(true);
				}
			}
		});
		comboBox.setEnabled(false);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Domiciliaria", "Industrial"}));
		comboBox.setBounds(504, 193, 89, 22);
		panel.add(comboBox);
		
		JRadioButton rdbtnElectricidad = new JRadioButton("Electricidad");
		rdbtnElectricidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox.setEnabled(true);
				lblNewLabel_9.setVisible(true);
				textField_4.setVisible(true);
				lblNewLabel_3.setVisible(false);
				textField_6.setVisible(false);
			}
		});
		rdbtnElectricidad.setBounds(398, 193, 100, 23);
		panel.add(rdbtnElectricidad);
	
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Herramienta");
		rdbtnNewRadioButton_1.addItemListener(new ItemListener() {
	
			public void itemStateChanged(ItemEvent arg0) {
			
					lblNewLabel_3.setVisible(true);
					textField_6.setVisible(true);
					
					comboBox.setEnabled(false);
					
					lblNewLabel_9.setVisible(false);
					textField_4.setVisible(false);
					lblTemperaturaMaxima.setVisible(false);
					textField_7.setVisible(false);
					lblNewLabel_10.setVisible(false);
					textField_10.setVisible(false);
			
			}
		});
		rdbtnNewRadioButton_1.setBounds(287, 193, 109, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnBuscar) {
					if(textField.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"POR FAVOR ingresar DNI para Buscar");
					}else{
					TrabajoPrácticoN3.Herramientas herramienta;
					TrabajoPrácticoN3.Industrial industrial;
					TrabajoPrácticoN3.Domiciliaria domiciliaria;
					
					
					herramienta=contro.buscarHerramienta(textField.getText());
					industrial=contro.buscarIndustrial(textField.getText());
					domiciliaria=contro.buscarDomiciliaria(textField.getText());
					
					String precio = String.valueOf(domiciliaria.getPrecio());
					String potencia = String.valueOf(domiciliaria.getPotenciaMaxima());
					String temmin = String.valueOf(industrial.getTemperatiraMinima());
					String temmax = String.valueOf(industrial.getTemperaturaMaxima());
					
					textField_2.setText(domiciliaria.getNombre());
					textField_5.setText(precio);
					textField_4.setText(potencia);
					textField_6.setText(herramienta.getDescripcion());
					textField_10.setText(temmin);
					textField_7.setText(temmax);
					}
				}
				
			}
		});
		btnBuscar.setBounds(504, 269, 89, 33);
		panel.add(btnBuscar);
		panel_1.setLayout(null);
		
		ButtonGroup grupoRadioBotones= new ButtonGroup();
		grupoRadioBotones.add(rdbtnElectricidad);
		grupoRadioBotones.add(rdbtnNewRadioButton_1);
		
		JLabel lblNombre = new JLabel("NOMBRE: ");
		lblNombre.setBounds(0, 0, 249, 46);
		panel_1.add(lblNombre);
		
		textField_2 = new JTextField();
		textField_2.setBounds(249, 0, 249, 46);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PRECIO:");
		lblNewLabel_1.setBounds(0, 46, 249, 46);
		panel_1.add(lblNewLabel_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(249, 46, 249, 46);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnVolver) {
					VentanaPrincipal ventanaprincipal= new VentanaPrincipal(control);
					ventanaprincipal.setVisible(true);
					setVisible(false);
				}
			}
		});
		btnVolver.setBounds(409, 242, 89, 34);
		panel_1.add(btnVolver);
		
		JButton btnEditar = new JButton("EDITAR");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().equals("")&&!textField_6.getText().equals("")&&!textField_5.getText().equals("")) {
					
					double doble = Double.parseDouble(textField_5.getText());
					herramienta1= new Herramientas(textField_2.getText(),doble,textField_6.getText());
					contro.editarHerramienta(textField.getText(),herramienta1);;
				}else {
					if(!textField.getText().equals("")&&!textField_7.getText().equals("")&&!textField_5.getText().equals("")&&!textField_10.getText().equals("")&&!textField_4.getText().equals("")){
						
						double doble = Double.parseDouble(textField_5.getText());
						double doble1 = Double.parseDouble(textField_7.getText());
						double doble2 = Double.parseDouble(textField_10.getText());
						double doble3 = Double.parseDouble(textField_4.getText());
						
						industrial1= new Industrial(textField_2.getText(),doble,doble3,doble2,doble1);
						contro.editarIndustrial(textField.getText(),industrial1);;
						
					}else{
						if(!textField.getText().equals("")&&!textField_4.getText().equals("")&&!textField_5.getText().equals("")){
							double doble = Double.parseDouble(textField_5.getText());
							double doble1 = Double.parseDouble(textField_4.getText());
							
							domiciliaria11= new Domiciliaria(textField_2.getText(),doble,doble1);
							contro.editarDomiciliaria(textField.getText(),domiciliaria11);;
						}
					}
				
				}
			}
		});
		btnEditar.setBounds(0, 241, 89, 35);
		panel_1.add(btnEditar);


	
	}
	
}
