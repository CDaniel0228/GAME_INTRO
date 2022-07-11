
package Diseño;

import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

public class Color_fondo extends JFrame implements ActionListener {
 JButton bt;
 Color color;
 Color fondo;
 Container container;
  
 public Color_fondo(){
     container = getContentPane();
     container.setLayout( new FlowLayout() );
     
     bt=new JButton("Cambiar De Fondo");
     bt.setBounds(50, 30, 80, 30);
     bt.addActionListener(this);
     container.add(bt);
     
     
 }
 public Color CL_Fondo(){
     fondo = JColorChooser.showDialog(this, "Nuevo Color", fondo);
     if(fondo==null){
     fondo = Color.GRAY;
     }
     return fondo;
 }
 
 public Color CL_Letras(){
     Color letras=null;
     letras = JColorChooser.showDialog(this, "Nuevo Color", letras);
     return letras;
 }
 
 public Font TL_Letras(){
     Font tamaño = null;
     
             
      /*       = new Font.((Frame)null, "Font Dialog Example", true);             
     dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);                                      
     dialog.setVisible(true);                                                                                
    if (!dialog.isCancelSelected()) {                                                                       
    System.out.println("Selected font is: " + dialog.getSelectedFont());                                
    }
	*/		
     return tamaño;
 }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt){
            color = JColorChooser.showDialog(this, "Nuevo Color", color);
            container.setBackground( color );
        }
         if ( color == null ){
          color = Color.WHITE;
          container.setBackground( color );
        }
    }
    
    public static void main(String []args){
        Color_fondo ncolor=new  Color_fondo();
        ncolor.setBounds(0, 0, 300, 300);
        ncolor.setLocationRelativeTo(null);
        ncolor.setVisible(true);
        
    }
    
}
