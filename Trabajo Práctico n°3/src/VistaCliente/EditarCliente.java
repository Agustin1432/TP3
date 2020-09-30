package VistaCliente;

import javax.swing.*;

import TrabajoPrácticoN3.Cliente;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Controlador.*;
import Interfaz.VentanaPrincipal;
import TrabajoPrácticoN3.*;

public class EditarCliente extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private Controlador control;
	private Cliente editar;
	public EditarCliente() {
		setSize(700,700);
		setLocationRelativeTo(null);
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(98, 254, 485, 237);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(5, 7, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(10, 72, 46, 14);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(66, 69, 185, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setBounds(10, 97, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBounds(66, 94, 185, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DNI");
		lblNewLabel_2.setBounds(10, 122, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setBounds(66, 119, 185, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_3.setBounds(10, 147, 50, 14);
		panel_1.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setBounds(66, 144, 185, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tel\u00E9fono:");
		lblNewLabel_4.setBounds(10, 172, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setBounds(66, 169, 185, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("BUSCAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField_5.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"POR FAVOR ingresar DNI para Buscar");
				}else{
					editar=control.buscarCliente(textField_5.getText());
					textField.setText(editar.getNombre());
					textField_1.setText(editar.getApellido());
					textField_2.setText(editar.getDni());
					textField_3.setText(editar.getDireccion());
					textField_4.setText(editar.getTelefono());
				}
			}
		});
		btnNewButton.setBounds(441, 150, 89, 23);
		panel.add(btnNewButton);
		
		textField_5 = new JTextField();
		textField_5.setBounds(236, 151, 195, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("INGRESE EL DNI:");
		lblNewLabel_5.setBounds(136, 154, 100, 14);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("EDITAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textField.getText().equals("")&&!textField_1.getText().equals("")&&!textField_2.getText().equals("")&&!textField_3.getText().equals("")&&!textField_4.getText().equals("")) {
					editar= new Cliente(textField.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText(), textField_4.getText());
					control.editarCliente(textField_5.getText(),editar);;
				}else {
					JOptionPane.showMessageDialog(null,"Primero necesita buscar");
				}
			}
		});
		btnNewButton_1.setBounds(98, 538, 100, 40);
		panel.add(btnNewButton_1);
		
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
		
		
	}
	
}
