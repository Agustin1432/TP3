package Interfaz;

import javax.swing.*;

import VistaArticulo.*;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;

import VistaCliente.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
	
	JPanel panel;
	JLabel lblBienvenido;
	public VentanaPrincipal() {
		setBounds(0,0, 700, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Principal");
		
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		lblBienvenido = new JLabel("BIENVENIDO");
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 95));
		panel.add(lblBienvenido, BorderLayout.CENTER);
		
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
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==mntmNewMenuItem_3) {
					EditarCliente editarc= new EditarCliente();
					editarc.setVisible(true);
					setVisible(false);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Eliminar");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==mntmNewMenuItem_1) {
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
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==mntmNewMenuItem_4) {
					CrearArticulo crearc= new CrearArticulo();
					crearc.setVisible(true);
					setVisible(false);
				}
			}
		});
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
		
		
		
		
		
	}

	
	
	
	
}
