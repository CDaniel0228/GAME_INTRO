
package Funciones;

import javax.swing.ImageIcon;


public class Usuarios_Root {
    String pass;
    public ImageIcon administradores(String usuario){
        ImageIcon imagen = null;
        
        if(usuario.equalsIgnoreCase("Pilar")){   
       imagen = new javax.swing.ImageIcon(getClass().getResource("/Src//Pilar.jpg"));
       pass="2019";
       }else if(usuario.equalsIgnoreCase("Luis")){ 
       imagen = new javax.swing.ImageIcon(getClass().getResource("/Src//Luis.jpg"));
       pass="2019";
       }else if(usuario.equalsIgnoreCase("Eduar")){ 
       imagen = new javax.swing.ImageIcon(getClass().getResource("/Src//Eduar.jpg"));
       pass="2019";
       }else if(usuario.equalsIgnoreCase("Gustavo")){
       imagen = new javax.swing.ImageIcon(getClass().getResource("/Src//Gustavo.png"));
       pass="2019";
       }else if(usuario.equalsIgnoreCase("Daniel")){
       imagen = new javax.swing.ImageIcon(getClass().getResource("/Src//Daniel.png"));
       pass="2019";
       } 
        return imagen;
    }
    
    public String contraseña(){
        return pass;
    }
    public boolean existe(String usuario){
        boolean existe=false;
        
        if(usuario.equalsIgnoreCase("Pilar")){   
       existe = true;
       }else if(usuario.equalsIgnoreCase("Luis")){ 
       existe = true;
       }else if(usuario.equalsIgnoreCase("Eduar")){ 
       existe = true;
       }else if(usuario.equalsIgnoreCase("Gustavo")){
       existe = true;
       }else if(usuario.equalsIgnoreCase("Daniel")){
       existe = true;
       } 
        return existe;
    }
}
