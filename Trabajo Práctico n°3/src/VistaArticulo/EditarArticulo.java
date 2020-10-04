package VistaArticulo;

import javax.swing.*;

import Controlador.Controlador;
import Interfaz.VentanaPrincipal;
import TrabajoPracticoN3.Cliente;
import TrabajoPracticoN3.Domiciliaria;
import TrabajoPracticoN3.Herramientas;
import TrabajoPracticoN3.Industrial;
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
	public EditarArticulo(Controlador control2) {
		contro=control2;
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
					CrearCliente crearc= new CrearCliente(contro);
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
					BuscarCliente buscarc= new BuscarCliente(contro);
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
					EditarCliente editarc= new EditarCliente(contro);
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
					EliminarCliente eliminarc= new EliminarCliente(contro);
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
					CrearArticulo crearc= new CrearArticulo(contro);
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
					BuscarArticulo buscara= new BuscarArticulo(contro);
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
					EditarArticulo editara= new EditarArticulo(contro);
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
					EliminarArticulo elimia= new EliminarArticulo(contro);
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
					CrearFactura crearf= new CrearFactura(contro);
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
					ListaFactura listaf= new ListaFactura(contro);
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
		panel_2.setBounds(98, 113, 299, 47);
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
		panel_1.setBounds(98, 185, 498, 276);
		panel.add(panel_1);
		
		
		JLabel lblNewLabel_3 = new JLabel("DESCRIPCION:");
		lblNewLabel_3.setBounds(0, 92, 249, 46);
		panel_1.add(lblNewLabel_3);
	
		
		JTextField textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(249, 92, 249, 46);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		
		
		JLabel lblNewLabel_9 = new JLabel("POTENCIA MAXIMA:");
		lblNewLabel_9.setBounds(0, 140, 249, 46);
		panel_1.add(lblNewLabel_9);
		

		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(249, 140, 249, 46);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		
		JLabel lblNewLabel_10 = new JLabel("TEMPERATURA MINIMA:");
		lblNewLabel_10.setBounds(0, 185, 249, 46);
		panel_1.add(lblNewLabel_10);
		
		
		JTextField textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBounds(249, 185, 249, 46);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		
		JLabel lblTemperaturaMaxima = new JLabel("TEMPERATURA MAXIMA: ");
		lblTemperaturaMaxima.setBounds(0, 230, 249, 46);
		panel_1.add(lblTemperaturaMaxima);
		
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(249, 230, 249, 46);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
	
		
		
		
		ButtonGroup grupoRadioBotones= new ButtonGroup();
		
		JLabel lblNombre = new JLabel("NOMBRE: ");
		
		lblNombre.setBounds(0, 0, 249, 46);
		panel_1.add(lblNombre);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(249, 0, 249, 46);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PRECIO:");
		lblNewLabel_1.setBounds(0, 46, 249, 46);
		panel_1.add(lblNewLabel_1);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(249, 46, 249, 46);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnBuscar) {
					if(textField.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"POR FAVOR ingresar NOMBRE para Buscar");
					}else{
						TrabajoPracticoN3.Articulo articulo;
						articulo=contro.buscarArticulo(textField.getText());
						if(articulo instanceof Herramientas) {
							textField_2.setEditable(true);
							textField_2.setText(articulo.getNombre());
							textField_5.setEditable(true);
							String cadena = String.valueOf(articulo.getPrecio());
							textField_5.setText(cadena);
							textField_6.setEditable(true);
							textField_6.setText(((Herramientas)articulo).getDescripcion());
							
							
						}
						if(articulo instanceof Domiciliaria) {
							textField_2.setEditable(true);
							textField_2.setText(articulo.getNombre());
							textField_5.setEditable(true);
							String cadena = String.valueOf(articulo.getPrecio());
							textField_5.setText(cadena);
							textField_6.setEditable(false);
							textField_4.setEditable(true);
							String cadena1 = String.valueOf(((Domiciliaria)articulo).getPotenciaMaxima());
							textField_4.setText(cadena1);
							
							
						}
						if(articulo instanceof Industrial) {
							textField_2.setEditable(true);
							textField_2.setText(articulo.getNombre());
							textField_5.setEditable(true);
							String cadena = String.valueOf(articulo.getPrecio());
							textField_5.setText(cadena);
							textField_6.setEditable(false);
							textField_4.setEditable(true);
							String cadena1 = String.valueOf(((Industrial)articulo).getPotenciaMaxima());
							textField_4.setText(cadena1);
							textField_10.setEditable(true);
							String cadena2 = String.valueOf(((Industrial)articulo).getTemperatiraMinima());
							textField_10.setText(cadena2);
							textField_7.setEditable(true);
							String cadena3 = String.valueOf(((Industrial)articulo).getTemperaturaMaxima());
							textField_7.setText(cadena3);
							
							
							
						}
					}
				}
				
			}
		});
		btnBuscar.setBounds(503, 113, 93, 47);
		panel.add(btnBuscar);
		panel_1.setLayout(null);
		
		
		JButton btnEditar = new JButton("EDITAR");
		btnEditar.setBounds(98, 570, 89, 35);
		panel.add(btnEditar);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().equals("")&&!textField_6.getText().equals("")&&!textField_5.getText().equals("")) {
					
					double doble = Double.parseDouble(textField_5.getText());
					herramienta1= new Herramientas(textField_2.getText(),doble,textField_6.getText());
					contro.editarArticulo(textField.getText(),herramienta1);;
					
					JOptionPane.showMessageDialog(null,"ARTICULO editado");
					textField_2.setText("");
					textField.setText("");
					textField_6.setText("");
					textField_5.setText("");
					
					textField.setText("");
				
					
				}else {
					if(!textField.getText().equals("")&&!textField_7.getText().equals("")&&!textField_5.getText().equals("")&&!textField_10.getText().equals("")&&!textField_4.getText().equals("")){
						
						double doble = Double.parseDouble(textField_5.getText());
						double doble1 = Double.parseDouble(textField_7.getText());
						double doble2 = Double.parseDouble(textField_10.getText());
						double doble3 = Double.parseDouble(textField_4.getText());
						
						industrial1= new Industrial(textField_2.getText(),doble,doble3,doble2,doble1);
						contro.editarArticulo(textField.getText(),industrial1);;
						
						JOptionPane.showMessageDialog(null,"ARTICULO editado");
						textField_2.setText("");
						textField.setText("");
						textField_7.setText("");
						textField_5.setText("");
						textField_10.setText("");
						textField_4.setText("");
						
						textField.setText("");
						
					}else{
						if(!textField.getText().equals("")&&!textField_4.getText().equals("")&&!textField_5.getText().equals("")){
							double doble = Double.parseDouble(textField_5.getText());
							double doble1 = Double.parseDouble(textField_4.getText());
							
							domiciliaria11= new Domiciliaria(textField_2.getText(),doble,doble1);
							contro.editarArticulo(textField.getText(),domiciliaria11);;
							
							JOptionPane.showMessageDialog(null,"ARTICULO editado");
							textField_2.setText("");
							textField.setText("");
							textField_4.setText("");
							textField_5.setText("");
							
							textField.setText("");
						}
					}
				
				}
			}
		});
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(507, 570, 89, 34);
		panel.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnVolver) {
					VentanaPrincipal ventanaprincipal= new VentanaPrincipal(contro);
					ventanaprincipal.setVisible(true);
					setVisible(false);
				}
			}
		});
		
		


	
	}
	
}
