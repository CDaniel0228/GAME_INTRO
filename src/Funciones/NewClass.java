
package Funciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class NewClass {
    public static void main(String[] args) {
        //leer un TXT
       /* Core c = new Core();
        String s1 = c.leerTxt("C:\\Users\\Azk_0\\Desktop\\Number.txt");
        System.out.println(s1 + "");

        String[] numsStr = s1.split("\\n");
        int[] numeros =  new int[numsStr.length];
        for (int i = 0; i < numsStr.length; i++) {
            //if(!numsStr[i].trim().equals(""))
                numeros[i] = Integer.parseInt(numsStr[i]);
        }
        //imprimimos numeros sin ordenar y tal cual los tenemos en nuestro array
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("");
        //ordenamos
        java.util.Arrays.sort(numeros);
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
*/
       ArrayList<String>nombres=new ArrayList();
        String texto = "";
        String direccion="C:\\Users\\Azk_0\\Desktop\\Number.txt";
        
        try (BufferedReader bf = new BufferedReader(new FileReader(direccion))) {
            //StringBuilder temp = new StringBuilder();
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                //temp.append(bfRead).append("\n");
                temp += bfRead+"\n"; //guardado el texto del archivo
                
                nombres.add(bfRead);
                
            }

            texto = temp.toString();
            System.out.println(texto);
            for(int i=0; i<nombres.size(); i++){
                System.out.println( nombres.get(i));
            }


        } catch (FileNotFoundException ex) {
            System.out.println("No se encontró el archivo");
        } catch (IOException ex) {
            System.out.println("Excepcion " + ex.getMessage());
        }
        
    }
}



