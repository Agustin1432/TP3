package VistaArticulo;

import javax.swing.*;

import Controlador.Controlador;
import Interfaz.VentanaPrincipal;
import TrabajoPracticoN3.*;
import TrabajoPracticoN3.Herramientas;
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

public class BuscarArticulo extends JFrame {
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField nombre;
	private JTextField textField_3;
	private JTextField precio;
	private Controlador contro;
	private JTextField PotenMax;
	private JTextField temMax;

	
	
	public BuscarArticulo(Controlador control2) {
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
		panel_2.setBounds(98, 113, 317, 47);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("INGRESE NOMBRE:");
		lblNewLabel.setBounds(15, 30, 46, 14);
		panel_2.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(66, 27, 86, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(98, 181, 498, 276);
		panel.add(panel_1);
		
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION:");
		lblDescripcion.setVisible(false);
		lblDescripcion.setBounds(0, 92, 249, 46);
		panel_1.add(lblDescripcion);
		lblDescripcion.setVisible(false);
		
		JTextField potenMaxi = new JTextField();
		potenMaxi.setVisible(false);
		potenMaxi.setEditable(false);
		potenMaxi.setBounds(249, 92, 249, 46);
		panel_1.add(potenMaxi);
		potenMaxi.setColumns(10);
		potenMaxi.setVisible(false);
		
		
		JLabel lblPotenMax = new JLabel("POTENCIA MAXIMA:");
		lblPotenMax.setVisible(false);
		lblPotenMax.setBounds(0, 92, 249, 46);
		panel_1.add(lblPotenMax);
		lblPotenMax.setVisible(false);

		
		PotenMax = new JTextField();
		PotenMax.setVisible(false);
		PotenMax.setEditable(false);
		PotenMax.setBounds(249, 92, 249, 46);
		panel_1.add(PotenMax);
		PotenMax.setColumns(10);
		PotenMax.setVisible(false);
		
		JLabel lblTempMin = new JLabel("TEMPERATURA MINIMA:");
		lblTempMin.setVisible(false);
		lblTempMin.setBounds(0, 138, 249, 46);
		panel_1.add(lblTempMin);
		lblTempMin.setVisible(false);
		
		JTextField tempMin = new JTextField();
		tempMin.setVisible(false);
		tempMin.setEditable(false);
		tempMin.setBounds(249, 138, 249, 46);
		panel_1.add(tempMin);
		tempMin.setColumns(10);
		tempMin.setVisible(false);
		
		JLabel lblTemperaturaMaxima = new JLabel("TEMPERATURA MAXIMA: ");
		lblTemperaturaMaxima.setVisible(false);
		lblTemperaturaMaxima.setBounds(0, 184, 249, 46);
		panel_1.add(lblTemperaturaMaxima);
		lblTemperaturaMaxima.setVisible(false);
		
		temMax = new JTextField();
		temMax.setVisible(false);
		temMax.setEditable(false);
		temMax.setBounds(249, 184, 249, 46);
		panel_1.add(temMax);
		temMax.setColumns(10);
		temMax.setVisible(false);
		
		JLabel lblNombre = new JLabel("NOMBRE: ");
		lblNombre.setVisible(false);
		lblNombre.setBounds(0, 0, 249, 46);
		panel_1.add(lblNombre);
		
		nombre = new JTextField();
		nombre.setVisible(false);
		nombre.setEditable(false);
		nombre.setBounds(249, 0, 249, 46);
		panel_1.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblPrecio = new JLabel("PRECIO:");
		lblPrecio.setVisible(false);
		lblPrecio.setBounds(0, 46, 249, 46);
		panel_1.add(lblPrecio);
		
		precio = new JTextField();
		precio.setVisible(false);
		precio.setEditable(false);
		precio.setBounds(249, 46, 249, 46);
		panel_1.add(precio);
		precio.setColumns(10);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnBuscar) {
					if(textField.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"POR FAVOR ingresar DNI para Buscar");
					}else{
					TrabajoPracticoN3.Articulo articulo;
					articulo=contro.buscarArticulo(textField.getText());
					if(articulo instanceof Herramientas) {
						lblNombre.setVisible(true);
						nombre.setVisible(true);
						lblPrecio.setVisible(true);
						precio.setVisible(true);
						lblDescripcion.setVisible(true);
						potenMaxi.setVisible(true);
						nombre.setText(articulo.getNombre());
						String cadena = String.valueOf(articulo.getPrecio());
						precio.setText(cadena);
						potenMaxi.setText(((Herramientas)articulo).getDescripcion());
					}
					if(articulo instanceof Domiciliaria) {
						lblNombre.setVisible(true);
						nombre.setVisible(true);
						lblPrecio.setVisible(true);
						precio.setVisible(true);
						lblDescripcion.setVisible(false);
						potenMaxi.setVisible(false);
						nombre.setText(articulo.getNombre());
						String cadena = String.valueOf(articulo.getPrecio());
						precio.setText(cadena);
						lblPotenMax.setVisible(true);
						PotenMax.setVisible(true);
						String cadena2 = String.valueOf(((Domiciliaria)articulo).getPotenciaMaxima());
						PotenMax.setText(cadena2);
					}
					if(articulo instanceof Industrial) {
						lblNombre.setVisible(true);
						nombre.setVisible(true);
						lblPrecio.setVisible(true);
						precio.setVisible(true);
						lblDescripcion.setVisible(false);
						potenMaxi.setVisible(false);
						nombre.setText(articulo.getNombre());
						String cadena = String.valueOf(articulo.getPrecio());
						precio.setText(cadena);
						lblPotenMax.setVisible(true);
						PotenMax.setVisible(true);
						String cadena2 = String.valueOf(((Industrial)articulo).getPotenciaMaxima());
						PotenMax.setText(cadena2);
						lblTempMin.setVisible(true);
						tempMin.setVisible(true);
						String cadena3 = String.valueOf(((Industrial)articulo).getTemperatiraMinima());
						tempMin.setText(cadena3);
						lblTemperaturaMaxima.setVisible(true);
						temMax.setVisible(true);
						String cadena4 = String.valueOf(((Industrial)articulo).getTemperaturaMaxima());
						temMax.setText(cadena4);
					}
					
					}
				}
		
				}
				
			
		});
		btnBuscar.setBounds(452, 113, 88, 47);
		panel.add(btnBuscar);
		panel_1.setLayout(null);
		
		ButtonGroup grupoRadioBotones= new ButtonGroup();

		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(507, 566, 89, 34);
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
