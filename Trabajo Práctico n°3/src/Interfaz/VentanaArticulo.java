package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class VentanaArticulo extends JFrame implements ActionListener {
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

     private JPanel panel;

     private JButton boton1;
     private JButton boton2;
     private JButton boton3;
     private JButton boton4;
     private JTextField texto1;
     private JLabel label1;
     public JList lista;
     	
     JRadioButton herra;
 
    public VentanaArticulo (){
         //Creación del panel, que contendra JList
         
   
     
     panel = new JPanel();
     panel.setLayout(null);
   
 
     //creación de los elememtos que componen la lista
     String[] nombres = {"Ana","Margarita","Daniela","Divian",
     "Leslie","Paz","Andrea","Macarena"};
     //creación del objeto lista
     JList lista = new JList(nombres);
     //se cambia la orientación de presentación y el ajuste
     lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
     //selecciona un elemento de la lista
     Object[] seleccion = lista.getSelectedValues();
     //recoge el indice de los seleccionados
     int[] indices = lista.getSelectedIndices();
     // aquí se crea el objeto, es decir la barra de desplazamiento
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
     jLabel3= new JLabel("TIPO:");
     jLabel3.setBounds(10,105,300,30);
     panel.add(jLabel3);
   
     
     jLabel6= new JLabel("NOMBRE:");
     jLabel6.setBounds(10,340,300,30);
     panel.add(jLabel6);
     jLabel7= new JLabel("PRECIO:");
     jLabel7.setBounds(10,380,300,30);
     panel.add(jLabel7);
     jLabel8= new JLabel("TIPO:");
     jLabel8.setBounds(10,420,300,30);
     panel.add(jLabel8);
     
     
     jLabel11= new JLabel("INGRESE EL NOMBRE:");
     jLabel11.setBounds(10,25,300,30);
     panel.add(jLabel11);
     jLabel11.setVisible(false);
     
     jTextField1= new JTextField("");
     jTextField1.setBounds(100,30,100,20);
     panel.add(jTextField1);
     jTextField2= new JTextField("");
     jTextField2.setBounds(100,70,100,20);
     panel.add(jTextField2);
     
    
     herra = new JRadioButton("Herramienta");
     herra.setBounds(100,105,100,30);
     panel.add(herra);
     
     jTextField6= new JTextField("");
     jTextField6.setBounds(150,30,100,20);
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
                  
           
                  jTextField6.setVisible(false);
                  
     }else{
          if(e.getSource()==boton2){
                  jLabel1.setVisible(false);
                  jLabel2.setVisible(false);
                  jLabel3.setVisible(false);
                  jLabel4.setVisible(false);
                  jLabel5.setVisible(false);

                  
                  jTextField1.setVisible(false);
                  jTextField2.setVisible(false);
                  herra.setVisible(false);
                  
                  jTextField6.setVisible(true);
                  jLabel11.setVisible(true);
                  
                  

           }else{
                 if(e.getSource()==boton3){
                         jLabel1.setVisible(false);
                         jLabel2.setVisible(false);
                         jLabel3.setVisible(false);
                         jLabel4.setVisible(false);
                         jLabel5.setVisible(false);
                         herra.setVisible(false);

                         jTextField1.setVisible(false);
                         jTextField2.setVisible(false);
                        

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
                             herra.setVisible(false); 

                             jTextField6.setVisible(true);
                             jLabel11.setVisible(true);

                          } 
                   }
           }

     }

 }
}
