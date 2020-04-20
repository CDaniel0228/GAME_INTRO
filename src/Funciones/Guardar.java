
package Funciones;

import Principal.Vista_Jf;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Funciones.Seguridad;

public class Guardar {
    ArrayList<Usuarios> usuario=new ArrayList();
    ArrayList <String> datos=new ArrayList();
    Seguridad Txt_Cifrar=new Seguridad();
   
    boolean igual;
  
    
    
    public void Agregar(Usuarios jugadores, String comparar){
        String aux="";
    for(int i=0; i<usuario.size(); i++){
     if(usuario.get(i).getNombre().equalsIgnoreCase(comparar)){
         aux=usuario.get(i).getNombre();
      }
    }
       
    if(aux.equalsIgnoreCase(comparar)){
         JOptionPane.showMessageDialog(null,  " El producto ya se ha agregado");
         igual=false;
    }else{
        usuario.add(jugadores);
       JOptionPane.showMessageDialog(null,  " Se ha agregado");
       igual=true;
    }
    }
    
     public boolean Buscar_U(String nombre, String contraseña){
         
        boolean ref = false;
        for(int i=0; i<usuario.size(); i++){
            if(usuario.get(i).getNombre().equalsIgnoreCase(nombre) 
                    && usuario.get(i).getContraseña().equalsIgnoreCase(contraseña)){
                ref=true;
            }
        }
        return ref;
    } 
     
     public String Buscar_Image(String nombre){
         
        String ref = "" ;
        for(int i=0; i<usuario.size(); i++){
            if(usuario.get(i).getNombre().equalsIgnoreCase(nombre)){
                ref=usuario.get(i).getFoto();
                
            }
        }
        return ref;
    } 
     
     
   public void subir(String direccion){
        
        try (BufferedReader bf = new BufferedReader(new FileReader(direccion))) {
            //StringBuilder temp = new StringBuilder();
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                //temp.append(bfRead).append("\n");
               // temp += bfRead+"\n"; //guardado el texto del archivo
               
                temp=Txt_Cifrar.Desifrar(bfRead);
                datos.add(temp);
                
            }
           
            int j=1, x=2;
            for(int i=0; i<datos.size(); i+=3){
                 Usuarios jugadores=new Usuarios();
                jugadores.setNombre(datos.get(i));
                jugadores.setContraseña(datos.get(j));
                j+=3;
                jugadores.setFoto(datos.get(x));
                x+=3;
                
                System.out.println(datos.get(i));
               usuario.add(jugadores); 
            }  
   
            
            
           igual=false;

        } catch (FileNotFoundException ex) {
            System.out.println("No se encontró el archivo");
        } catch (IOException ex) {
            System.out.println("Excepcion " + ex.getMessage());
        }
    }
    
    
    public void txt_Guardar(File txt, String Nombre){
        BufferedWriter bw = null;
         if(txt.exists()) {
             try {
                 bw = new BufferedWriter(new FileWriter(txt));
                 for(int i=0; i<usuario.size(); i++){
                     if (!igual){
                         System.out.println("NO");
                     }else{
                     String convertir= Txt_Cifrar.Cifrar(usuario.get(i).getNombre());
                     bw.write(convertir);
                     bw.newLine();
                     convertir= Txt_Cifrar.Cifrar(usuario.get(i).getContraseña());
                     bw.write(convertir);
                     bw.newLine();
                     convertir= Txt_Cifrar.Cifrar(usuario.get(i).getFoto());
                     bw.write(convertir);
                     bw.newLine();
                     }
                 }
                 
             } catch (IOException ex) {
                 Logger.getLogger(Vista_Jf.class.getName()).log(Level.SEVERE, null, ex);
             }
            
        } else {
             try {
                 bw = new BufferedWriter(new FileWriter(txt));
                for(int i=0; i<usuario.size(); i++){
                     if (!igual){
                         System.out.println("NO");
                     }else{
                     String convertir= Txt_Cifrar.Cifrar(usuario.get(i).getNombre());
                     bw.write(convertir);
                     bw.newLine();
                     convertir= Txt_Cifrar.Cifrar(usuario.get(i).getContraseña());
                     bw.write(convertir);
                     bw.newLine();
                     convertir= Txt_Cifrar.Cifrar(usuario.get(i).getFoto());
                     bw.write(convertir);
                     bw.newLine();
                     }
                 }
             } catch (IOException ex) {
                 Logger.getLogger(Vista_Jf.class.getName()).log(Level.SEVERE, null, ex);
             }
            
        }
       try {
           bw.close();
       } catch (IOException ex) {
           Logger.getLogger(Vista_Jf.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    
    public void carpeta(File carpeta){
        if (!carpeta.exists()) {
            if (carpeta.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
    }

}
