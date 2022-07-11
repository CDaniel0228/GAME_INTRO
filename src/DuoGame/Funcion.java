
package DuoGame;


import Funciones.Usuarios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Funcion {
 
    File txt = new File("C:/GAME_ON/duoUsuarios.txt");
       
    public void txt_Guardar(String jugador){
        
             try {
                
                 BufferedWriter bw = null;
                 bw = new BufferedWriter(new FileWriter(txt));
                     
                  bw.write(jugador);   
                  
                  bw.close();
                 
                 
             } catch (IOException ex) {
                 System.out.println(ex);
             }
            
    }
    
        public String Subir_txt(){
        String temp = "";
        try (BufferedReader bf = new BufferedReader(new FileReader(txt))) {
            //StringBuilder temp = new StringBuilder();
            
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                //temp.append(bfRead).append("\n");
               // temp += bfRead+"\n"; //guardado el texto del archivo
               
                temp=bfRead;
                
                
            }
           
           

        } catch (FileNotFoundException ex) {
            System.out.println("No se encontró el archivo");
        } catch (IOException ex) {
            System.out.println("Excepcion " + ex.getMessage());
        }
        return temp;
    }
    
    
}
