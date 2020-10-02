package VistaArticulo;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import Controlador.*;
import Interfaz.VentanaPrincipal;
import TrabajoPrácticoN3.*;
import VistaCliente.BuscarCliente;
import VistaCliente.CrearCliente;
import VistaCliente.EditarCliente;
import VistaCliente.EliminarCliente;
import VistaFactura.CrearFactura;
import net.miginfocom.swing.MigLayout;

public class CrearArticulo extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private	Controlador control;
	
	public CrearArticulo() {
		
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
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(98, 375, 495, 142);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(98, 86, 495, 89);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(10, 30, 46, 14);
		panel_2.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(66, 27, 86, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Precio:");
		lblNewLabel_1.setBounds(10, 55, 46, 14);
		panel_2.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 52, 86, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Tipo:");
		lblNewLabel_2.setBounds(98, 197, 46, 14);
		panel.add(lblNewLabel_2);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Potencia M\u00E1xima:");
		lblNewLabel_3.setEnabled(false);
		lblNewLabel_3.setBounds(10, 133, 100, 14);
		panel_1.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setBounds(120, 130, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Temperatura M\u00E1xima:");
		lblNewLabel_4.setEnabled(false);
		lblNewLabel_4.setBounds(10, 158, 110, 14);
		panel_1.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setBounds(120, 155, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Temperatura Minima:");
		lblNewLabel_5.setEnabled(false);
		lblNewLabel_5.setBounds(10, 183, 110, 14);
		panel_1.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setBounds(120, 180, 86, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		
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
		btnNewButton_2.setBounds(494, 538, 100, 40);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("Descripcion de la Herramienta:");
		lblNewLabel_6.setEnabled(false);
		lblNewLabel_6.setBounds(98, 222, 203, 14);
		panel.add(lblNewLabel_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setBounds(98, 239, 495, 125);
		panel.add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if("Domiciliaria".equals(comboBox.getSelectedItem())) {
					lblNewLabel_3.setEnabled(true);
					textField_2.setEnabled(true);
					textField_3.setEnabled(false);
					textField_4.setEnabled(false);
					lblNewLabel_4.setEnabled(false);
					lblNewLabel_5.setEnabled(false);
					lblNewLabel_6.setEnabled(false);
					textArea.setEnabled(false);
				}else {
					lblNewLabel_3.setEnabled(true);
					lblNewLabel_4.setEnabled(true);
					lblNewLabel_5.setEnabled(true);
					textField_2.setEnabled(true);
					textField_3.setEnabled(true);
					textField_4.setEnabled(true);
					lblNewLabel_6.setEnabled(false);
					textArea.setEnabled(false);
				}
			}
		});
		comboBox.setEnabled(false);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Domiciliaria", "Industrial"}));
		comboBox.setBounds(380, 193, 89, 22);
		panel.add(comboBox);
		
		JRadioButton rdbtnElectricidad = new JRadioButton("Electricidad");
		rdbtnElectricidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox.setEnabled(true);
				textArea.setEnabled(false);
				lblNewLabel_6.setEnabled(false);
			}
		});
		rdbtnElectricidad.setBounds(270, 193, 100, 23);
		panel.add(rdbtnElectricidad);
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Herramienta");
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				lblNewLabel_6.setEnabled(true);
				textArea.setEnabled(true);
				comboBox.setEnabled(false);
				lblNewLabel_3.setEnabled(false);
				lblNewLabel_4.setEnabled(false);
				lblNewLabel_5.setEnabled(false);
				textField_2.setEnabled(false);
				textField_3.setEnabled(false);
				textField_4.setEnabled(false);
			}
		});
		
		
		rdbtnNewRadioButton.setBounds(154, 193, 100, 23);
		panel.add(rdbtnNewRadioButton);
		
		ButtonGroup grupoRadioBotones= new ButtonGroup();
		grupoRadioBotones.add(rdbtnElectricidad);
		grupoRadioBotones.add(rdbtnNewRadioButton);
		
		JButton btnNewButton_1 = new JButton("AGREGAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton.isSelected()==true) {
					if(!textField.getText().equals("")&&!textField_1.getText().equals("")&&!textArea.getText().equals("")) {
						double doble = Double.parseDouble(textField_1.getText());
						Herramientas herra= new Herramientas(textField.getText(),doble, textArea.getText());
						control.crearherramienta(herra);
					}else
						JOptionPane.showMessageDialog(null,"POR FAVOR ingresar Nombre de la Herramienta, el precio y la descripcion");
				}
				if(rdbtnElectricidad.isSelected()==true) {
					if("Domiciliaria".equals(comboBox.getSelectedItem())) {
						if(!textField.getText().equals("")&&!textField_1.getText().equals("")&&!textField_2.getText().equals("")) {
							double doble = Double.parseDouble(textField_1.getText());
							double doble1 = Double.parseDouble(textField_2.getText());
							Domiciliaria domi = new Domiciliaria(textField.getText(), doble, doble1);
							control.crearDomiciliaria(domi);
						}else
							JOptionPane.showMessageDialog(null,"POR FAVOR ingresar Nombre de la Herramienta, el precio y la potencia máxima");
					}
					else {
						if(!textField.getText().equals("")&&!textField_1.getText().equals("")&&!textField_2.getText().equals("")&&!textField_3.getText().equals("")&&!textField_4.getText().equals("")) {
							double doble = Double.parseDouble(textField_1.getText());
							double doble1 = Double.parseDouble(textField_2.getText());
							double doble2 = Double.parseDouble(textField_3.getText());
							double doble3 = Double.parseDouble(textField_4.getText());
							Industrial indu = new Industrial(textField_1.getText(), doble, doble1, doble2, doble3);
							control.crearIndustrial(indu);
						}else
							JOptionPane.showMessageDialog(null,"POR FAVOR ingresar Nombre de la Herramienta, el precio, la potencia máxima, temperatura minima y la temperatura máxima");
					}
					
				}
			}
		});
		btnNewButton_1.setBounds(98, 538, 100, 40);
		panel.add(btnNewButton_1);
		
		
		
		
	}
}
