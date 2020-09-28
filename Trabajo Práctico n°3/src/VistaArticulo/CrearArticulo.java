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

public class CrearArticulo extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	public CrearArticulo() {
		setSize(700,700);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cliente");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Crear");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Buscar");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Editar");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Eliminar");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Art\u00EDculo");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Crear");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Buscar");
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Editar");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Eliminar");
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_2 = new JMenu("Factura");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Crear");
		mnNewMenu_2.add(mntmNewMenuItem_8);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(10, 30, 46, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(66, 27, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Precio:");
		lblNewLabel_1.setBounds(10, 55, 46, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 52, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Tipo:");
		lblNewLabel_2.setBounds(10, 83, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Potencia M\u00E1xima:");
		lblNewLabel_3.setEnabled(false);
		lblNewLabel_3.setBounds(10, 133, 100, 14);
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setBounds(120, 130, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Temperatura M\u00E1xima:");
		lblNewLabel_4.setEnabled(false);
		lblNewLabel_4.setBounds(10, 158, 110, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Temperatura Minima:");
		lblNewLabel_5.setEnabled(false);
		lblNewLabel_5.setBounds(10, 183, 110, 14);
		panel.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setBounds(120, 155, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setBounds(120, 180, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("AGREGAR");
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(274, 130, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VOLVER");
		btnNewButton_1.setBounds(274, 188, 89, 23);
		panel.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEnabled(false);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Domiciliaria", "Industrial"}));
		comboBox.setBounds(274, 79, 89, 22);
		panel.add(comboBox);
		
		JRadioButton rdbtnElectricidad = new JRadioButton("Electricidad");
		rdbtnElectricidad.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				comboBox.setEnabled(true);
			}
		});
		
		rdbtnElectricidad.setBounds(182, 79, 86, 23);
		panel.add(rdbtnElectricidad);
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Herramienta");
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				btnNewButton.setEnabled(true);
			}
		});
		
		
		rdbtnNewRadioButton.setBounds(66, 79, 86, 23);
		panel.add(rdbtnNewRadioButton);
		
		ButtonGroup grupoRadioBotones= new ButtonGroup();
		grupoRadioBotones.add(rdbtnElectricidad);
		grupoRadioBotones.add(rdbtnNewRadioButton);
	}
	
	
}
