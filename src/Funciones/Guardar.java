
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


public class Guardar {
    ArrayList<Usuarios> usuario=new ArrayList();
    ArrayList <String> datos=new ArrayList();
    Seguridad Txt_Cifrar=new Seguridad();
    boolean GameOver=false;
   
    boolean igual;
    
    
    public void agregarPuntos( int puntos){
        try (BufferedReader bf = new BufferedReader(new FileReader("usuario.txt"))) {
            
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                temp=Txt_Cifrar.Desifrar(bfRead);
            }
            System.out.println(temp);
            for(Usuarios m:usuario){
               
                if(m.getNombre().equalsIgnoreCase(temp)){
                String suma=Integer.parseInt(m.getPuntos())+puntos+"";
                m.setPuntos(suma);
                GameOver=true;
                break;
                }
            }
            }catch(Exception e){
            
        }
    }
    
    public void CanjearPuntos(int tiempo){
        try (BufferedReader bf = new BufferedReader(new FileReader("usuario.txt"))) {
            
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                temp=Txt_Cifrar.Desifrar(bfRead);
            }
            System.out.println(temp);
            for(Usuarios m:usuario){
               
                if(m.getNombre().equalsIgnoreCase(temp)){
                String SumaTime=Integer.parseInt(m.getTiempo())+tiempo+"";
                String resta=Integer.parseInt(m.getPuntos())-tiempo+"";
                m.setTiempo(SumaTime);
                m.setPuntos(resta);
                GameOver=true;
                break;
                }
            }
            }catch(Exception e){
            
        }
    }
    
    public int TiempoTotal(){
        int tiempo=10;
        try (BufferedReader bf = new BufferedReader(new FileReader("usuario.txt"))) {
            
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                temp=Txt_Cifrar.Desifrar(bfRead);
            }
            System.out.println(temp);
            for(Usuarios m:usuario){
               
                if(m.getNombre().equalsIgnoreCase(temp)){
                
                tiempo =Integer.parseInt(m.getTiempo());
                
                GameOver=true;
                break;
                }
            }
            }catch(Exception e){
            
        }
        return tiempo;
    }
    
    public int PuntosTotal(){
        int puntos=0;
        try (BufferedReader bf = new BufferedReader(new FileReader("usuario.txt"))) {
            
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                temp=Txt_Cifrar.Desifrar(bfRead);
            }
            System.out.println(temp);
            for(Usuarios m:usuario){
               
                if(m.getNombre().equalsIgnoreCase(temp)){
                
                puntos =Integer.parseInt(m.getPuntos());
                
                GameOver=true;
                break;
                }
            }
            }catch(Exception e){
            
        }
        return puntos;
    }
   
    public String NombreGamer(){
        String temp = "";
        try (BufferedReader bf = new BufferedReader(new FileReader("usuario.txt"))) {

            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                temp=Txt_Cifrar.Desifrar(bfRead);
            }
             }catch(Exception e){
                    
            }
        return temp;
    }
    
    public void Agregar(Usuarios jugadores, String comparar){
        String aux="";
    for(int i=0; i<usuario.size(); i++){
     if(usuario.get(i).getNombre().equalsIgnoreCase(comparar)){
         aux=usuario.get(i).getNombre();
      }
    }
       
    if(aux.equalsIgnoreCase(comparar)){
         System.out.println("No Se Agrego");
         igual=false;
    }else{
        usuario.add(jugadores);
       System.out.println("Se Agrego");
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
     
     
   public void SubirUsuario_txt(String direccion){
        
        try (BufferedReader bf = new BufferedReader(new FileReader(direccion))) {
            //StringBuilder temp = new StringBuilder();
            String temp = "";
            String bfRead;
            int ix=0;
            while((bfRead = bf.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                //temp.append(bfRead).append("\n");
               // temp += bfRead+"\n"; //guardado el texto del archivo
               
                temp=Txt_Cifrar.Desifrar(bfRead);
                datos.add(temp);
                System.out.println(datos.size()+"\t"+datos.get(ix));
                ix++;
                
            }
           
            int j=1, x=2, y=3, z=4;
            for(int i=0; i<datos.size(); i+=5){
                 Usuarios jugadores=new Usuarios();
                 
                jugadores.setNombre(datos.get(i));
                
                jugadores.setContraseña(datos.get(j));
                j+=5;
                jugadores.setFoto(datos.get(x));
                x+=5;
                jugadores.setPuntos(datos.get(y));
                y+=5;
                jugadores.setTiempo(datos.get(z));
                z+=5;
                
                
                System.out.println(datos.size());
               usuario.add(jugadores); 
               
            }           
            
           igual=false;

        } catch (FileNotFoundException ex) {
            System.out.println("No se encontró el archivo");
        } catch (IOException ex) {
            System.out.println("Excepcion " + ex.getMessage());
        }
    }
    
    
    public void txt_GuardarUsuario(File txt){
        
             try {
                 
                if(igual||GameOver) {
                 BufferedWriter bw = null;
                 bw = new BufferedWriter(new FileWriter(txt));
                 for(int i=0; i<usuario.size(); i++){
                     
                     String convertir= Txt_Cifrar.Cifrar(usuario.get(i).getNombre());
                     bw.write(convertir);
                     bw.newLine();
                     convertir= Txt_Cifrar.Cifrar(usuario.get(i).getContraseña());
                     bw.write(convertir);
                     bw.newLine();
                     convertir= Txt_Cifrar.Cifrar(usuario.get(i).getFoto());
                     bw.write(convertir);
                     bw.newLine();
                     convertir= Txt_Cifrar.Cifrar(usuario.get(i).getPuntos());
                     bw.write(convertir);
                     bw.newLine();
                     convertir= Txt_Cifrar.Cifrar(usuario.get(i).getTiempo());
                     bw.write(convertir);
                     bw.newLine();
                     
                  }
                  bw.close();
                 }
                 else{
                     System.out.println("NOES");
                     
                 }
                 
             } catch (IOException ex) {
                 Logger.getLogger(Vista_Jf.class.getName()).log(Level.SEVERE, null, ex);
             }
            
    }
    
    
    public void txt_Compras(String h, String h2, String h3){
        
             try {
                 
                File archivo=new File("Compras.txt");
                archivo.createNewFile();
                 BufferedWriter bw = null;
                 bw = new BufferedWriter(new FileWriter(archivo));
                   
                     String convertir= Txt_Cifrar.Cifrar(h);
                     bw.write(convertir);
                     bw.newLine();
                     convertir= Txt_Cifrar.Cifrar(h2);
                     bw.write(convertir);
                     bw.newLine();
                     convertir= Txt_Cifrar.Cifrar(h3);
                     bw.write(convertir);
                     bw.newLine();
                
                  bw.close();

                 
                }catch (IOException ex) {
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
