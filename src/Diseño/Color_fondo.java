
package Diseño;

import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

public class Color_fondo extends JFrame implements ActionListener {
 JButton bt;
 Color color;
 Container container;
  
 public Color_fondo(){
     container = getContentPane();
     container.setLayout( new FlowLayout() );
     
     bt=new JButton("Cambiar De Fondo");
     bt.setBounds(50, 30, 80, 30);
     bt.addActionListener(this);
     container.add(bt);
     
     
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
