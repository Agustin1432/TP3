package VistaFactura;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import VistaArticulo.BuscarArticulo;
import VistaArticulo.CrearArticulo;
import VistaArticulo.EditarArticulo;
import VistaArticulo.EliminarArticulo;
import VistaCliente.BuscarCliente;
import VistaCliente.CrearCliente;
import VistaCliente.EditarCliente;
import VistaCliente.EliminarCliente;
import javax.swing.JPanel;

import Interfaz.VentanaPrincipal;
import TrabajoPracticoN3.Articulo;
import TrabajoPracticoN3.Factura;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;

import Controlador.Controlador;

public class ListaFactura extends JFrame {
	Controlador control;
	public ListaFactura(Controlador control2) {
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
		
		
		
		JList list = new JList(control.listarFactura());
		list.setBounds(10, 84, 664, 391);
		panel.add(list);
		
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
		btnVolver.setBounds(585, 498, 89, 34);
		panel.add(btnVolver);
		
		JLabel lblNewLabel = new JLabel("LISTA DE FACTURAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(214, 41, 260, 32);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 84, 664, 391);
		panel.add(scrollPane);
		
		JButton btnNewButton = new JButton("Vista Previa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Factura factura1 = (Factura) list.getSelectedValue();
				if(arg0.getSource()==btnNewButton) {
					VistaPreviaFactura vistaf= new VistaPreviaFactura(control,factura1);
					vistaf.setVisible(true);
					setVisible(false);
				}
			}
		});
		btnNewButton.setBounds(10, 498, 111, 35);
		panel.add(btnNewButton);
	}
}
