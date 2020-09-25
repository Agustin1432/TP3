/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Controlador.*;;


public class VentanaCliente extends JFrame implements ActionListener{ 
		
		Controlador controlador;
		TrabajoPr醕ticoN3.Cliente cliente;
        
        private JLabel jLabel1;
        private JLabel jLabel2;
        private JLabel jLabel3;
        private JLabel jLabel4;
        private JLabel jLabel5;
        
        private JLabel jLabel6;
        private JLabel jLabel7;
        private JLabel jLabel8;
        private JLabel jLabel9;
        private JLabel jLabel10;
        
        private JLabel jLabel11;
        
        private JButton botonok;

        private JTextField jTextField1;
        private JTextField jTextField2;
        private JTextField jTextField3;
        private JTextField jTextField4;
        private JTextField jTextField5;
        
        private JTextField jTextField6;
        
        public static String texto;


        private JButton boton1;
        private JButton boton2;
        private JButton boton3;
        private JButton boton4;
        private JTextField texto1;
        private JLabel label1;
        public JList lista;

    
       public VentanaCliente (){
            //Creaci贸n del panel, que contendra JList
            
      
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
      
    
        //creaci贸n de los elememtos que componen la lista
        String[] nombres = {"Ana","Margarita","Daniela","Divian",
        "Leslie","Paz","Andrea","Macarena"};
        //creaci贸n del objeto lista
        JList lista = new JList(nombres);
        //se cambia la orientaci贸n de presentaci贸n y el ajuste
        lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        //selecciona un elemento de la lista
        Object[] seleccion = lista.getSelectedValues();
        //recoge el indice de los seleccionados
        int[] indices = lista.getSelectedIndices();
        // aqu铆 se crea el objeto, es decir la barra de desplazamiento
        JScrollPane barraDesplazamiento = new JScrollPane(lista);
        barraDesplazamiento.setBounds(450,30,200,300);
        //Agrega la barra de desplazamiento al panel
        panel.add(barraDesplazamiento);
        this.getContentPane().add(panel);
        
        
        jLabel1= new JLabel("NOMBRE:");
        jLabel1.setBounds(10,25,300,30);
        panel.add(jLabel1);
        jLabel2= new JLabel("APELLIDO:");
        jLabel2.setBounds(10,65,300,30);
        panel.add(jLabel2);
        jLabel3= new JLabel("DNI:");
        jLabel3.setBounds(10,105,300,30);
        panel.add(jLabel3);
        jLabel4= new JLabel("DIRECCION:");
        jLabel4.setBounds(10,145,300,30);
        panel.add(jLabel4);
        jLabel5= new JLabel("TELEFONO:");
        jLabel5.setBounds(10,185,300,30);
        panel.add(jLabel5);
        
        jLabel6= new JLabel("NOMBRE:");
        jLabel6.setBounds(10,340,300,30);
        panel.add(jLabel6);
        jLabel7= new JLabel("APELLIDO:");
        jLabel7.setBounds(10,380,300,30);
        panel.add(jLabel7);
        jLabel8= new JLabel("DNI:");
        jLabel8.setBounds(10,420,300,30);
        panel.add(jLabel8);
        jLabel9= new JLabel("DIRECCION:");
        jLabel9.setBounds(10,460,300,30);
        panel.add(jLabel9);
        jLabel10= new JLabel("TELEFONO:");
        jLabel10.setBounds(10,500,300,30);
        panel.add(jLabel10);
        
        jLabel11= new JLabel("INGRESE DNI:");
        jLabel11.setBounds(10,25,300,30);
        panel.add(jLabel11);
        jLabel11.setVisible(false);
        
        jTextField1= new JTextField("");
        jTextField1.setBounds(100,30,100,20);
        panel.add(jTextField1);
        jTextField2= new JTextField("");
        jTextField2.setBounds(100,70,100,20);
        panel.add(jTextField2);
        jTextField3= new JTextField("");
        jTextField3.setBounds(100,110,100,20);
        panel.add(jTextField3);
        jTextField4= new JTextField("");
        jTextField4.setBounds(100,150,100,20);
        panel.add(jTextField4);
        jTextField5= new JTextField("");
        jTextField5.setBounds(100,190,100,20);
        panel.add(jTextField5);
        
        jTextField6= new JTextField("");
        jTextField6.setBounds(100,30,100,20);
        panel.add(jTextField6);
        jTextField6.setVisible(false);
        
        boton1= new JButton("CREAR");
        boton1.setBounds(300,30,100,30);
        boton1.addActionListener(this);
        panel.add(boton1);
        boton2= new JButton("BUSCAR");
        boton2.setBounds(300,70,100,30);
        boton2.addActionListener(this);
        panel.add(boton2);
        boton3= new JButton("EDITAR");
        boton3.setBounds(300,110,100,30);
        boton3.addActionListener(this);
        panel.add(boton3);
        boton4= new JButton("ELIMINAR");
        boton4.setBounds(300,150,100,30);
        boton4.addActionListener(this);
        panel.add(boton4);
        botonok= new JButton("OK");
        botonok.setBounds(100,250,100,30);
        botonok.addActionListener(this);
        panel.add(botonok);
        this.setTitle("Cliente");
     
        
       }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1){
                     jLabel1.setVisible(true);
                     jLabel2.setVisible(true);
                     jLabel3.setVisible(true);
                     jLabel4.setVisible(true);
                     jLabel5.setVisible(true);
                     jLabel11.setVisible(false);
                     
                     jTextField1.setVisible(true);
                     jTextField2.setVisible(true);
                     jTextField3.setVisible(true);
                     jTextField4.setVisible(true);
                     jTextField5.setVisible(true);
                     
                     jTextField6.setVisible(false);
                     if(e.getSource()==botonok) {
                    	 cliente = new TrabajoPr醕ticoN3.Cliente(jTextField1.getText(), jTextField2.getText(),jTextField2.getText(),jTextField3.getText(),jTextField4.getText());
                    	 controlador.crearCliente(cliente);
                     }
        }else{
             if(e.getSource()==boton2){
                     jLabel1.setVisible(false);
                     jLabel2.setVisible(false);
                     jLabel3.setVisible(false);
                     jLabel4.setVisible(false);
                     jLabel5.setVisible(false);

                     
                     jTextField1.setVisible(false);
                     jTextField2.setVisible(false);
                     jTextField3.setVisible(false);
                     jTextField4.setVisible(false);
                     jTextField5.setVisible(false);
                     
                     jTextField6.setVisible(true);
                     jLabel11.setVisible(true);
                     if(e.getSource()==botonok) {
                    	 
                    	 controlador.buscarCliente(jTextField6.getText());
                     }
                     

              }else{
                    if(e.getSource()==boton3){
                            jLabel1.setVisible(false);
                            jLabel2.setVisible(false);
                            jLabel3.setVisible(false);
                            jLabel4.setVisible(false);
                            jLabel5.setVisible(false);


                            jTextField1.setVisible(false);
                            jTextField2.setVisible(false);
                            jTextField3.setVisible(false);
                            jTextField4.setVisible(false);
                            jTextField5.setVisible(false);

                            jTextField6.setVisible(true);
                            jLabel11.setVisible(true);

                    } else{
                            if(e.getSource()==boton4){
                                jLabel1.setVisible(false);
                                jLabel2.setVisible(false);
                                jLabel3.setVisible(false);
                                jLabel4.setVisible(false);
                                jLabel5.setVisible(false);


                                jTextField1.setVisible(false);
                                jTextField2.setVisible(false);
                                jTextField3.setVisible(false);
                                jTextField4.setVisible(false);
                                jTextField5.setVisible(false);

                                jTextField6.setVisible(true);
                                jLabel11.setVisible(true);

                             } 
                      }
              }

        }

    }

}
