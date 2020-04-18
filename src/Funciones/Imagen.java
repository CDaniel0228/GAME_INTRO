
package Funciones;

import javax.swing.ImageIcon;


public class Imagen {
    int indice=(int) (Math.random()*10);
    String rt[]={"/Src//img_1.jpg", "/Src//img_2.jpg", "/Src//img_4.jpg", "/Src//img_5.jpg",
    "/Src//img_6.jpg", "/Src//img_7.jpg", "/Src//img_8.jpg", "/Src//img_9.jpg", "/Src//img_10.jpg"};
 
    ImageIcon Avatar=new javax.swing.ImageIcon(getClass().getResource(rt[indice]));
}
