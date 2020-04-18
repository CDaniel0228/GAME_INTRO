
package Diseño;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.ImageIcon;


public class Import_Image {
     int contador=0;
     int contador2=0;
     int contador3=0;
     
     int contador4=0;
     String Aux3="";
     
     int contador5=0, Acumulador=0;
     int Preguntas=0;
     int Respuestas=0;
     int Aux, Aux2;
     
     Random random = new Random();
     int aletorio_1;
     int aletorio_2;
     int verificar_falsas=0;
     int verificar_verdaderas=0;
     Set<Integer> Lista_1 = new HashSet<>();
     Set<Integer> Lista_2;
     
     String Link="";
     String Pregunta_aleatoria="";
       
    public ImageIcon Avatar(){
       int indice= (int) (Math.random()*10);
       String rt[]={"/Src//img_1.jpg", "/Src//img_2.jpg", "/Src//img_4.jpg", "/Src//img_5.jpg", "/Src//lucha.png",
       "/Src//img_6.jpg", "/Src//img_7.jpg", "/Src//img_8.jpg", "/Src//img_9.jpg", "/Src//img_10.jpg"};
       ImageIcon Avatar=new javax.swing.ImageIcon(getClass().getResource(rt[indice]));
       
     return Avatar;
    }
    
    public ImageIcon ImageB(boolean boton){
        ImageIcon funcion_B=null;
        
        String ruta[]={"/Src//Tienda.jpg", "/Src//Confi.jpg", "/Src//Puntos.jpg",
        "/Src//Inicio.jpg", "/Src//web.png", "/Src//Verificar.png"};
        
        String Ayuda[]={"s","s","s","s","s","s"};
        
        if(boton && contador4>=0 && contador4<5){
             contador4++;
             funcion_B=new javax.swing.ImageIcon(getClass().getResource(ruta[contador4]));
             Aux3=Ayuda[contador4];
        }else if(!boton && contador4>0 && contador4<=5 ){
            contador4--;
            funcion_B=new javax.swing.ImageIcon(getClass().getResource(ruta[contador4]));
            Aux3=Ayuda[contador4];
        }else if(contador4==5){
            funcion_B=new javax.swing.ImageIcon(getClass().getResource(ruta[contador4]));
            Aux3=Ayuda[contador4];
        }else if(contador4==0){
            funcion_B=new javax.swing.ImageIcon(getClass().getResource(ruta[contador4]));
            Aux3=Ayuda[contador4];
        }
       
       
       
     return funcion_B;
    }
    
    public String Help(){
        return Aux3;
    }
    
    public ImageIcon Botones(){
        ImageIcon image_boton = null;
         switch (contador) {
             case 0:
                 image_boton=new javax.swing.ImageIcon(getClass().getResource("/Src//confi.jpg"));
                 break;
             case 1:
                 image_boton=new javax.swing.ImageIcon(getClass().getResource("/Src//help.jpg"));
                 break;
             case 2:
                 image_boton=new javax.swing.ImageIcon(getClass().getResource("/Src//Tienda.jpg"));
                 break;
             case 3:
                 image_boton=new javax.swing.ImageIcon(getClass().getResource("/Src//puntos.jpg"));
                 break;
             case 4:
                 image_boton=new javax.swing.ImageIcon(getClass().getResource("/Src//Volver.jpg"));
                 break;
             case 5:
                 image_boton=new javax.swing.ImageIcon(getClass().getResource("/Src//Inicio.jpg"));
                 break;
             default:
                 break;
         }
         contador++;
         return image_boton;
    }
    
    public ImageIcon Botones2(){
        ImageIcon image_boton2 = null;
         switch (contador2) {
             case 0:
                 image_boton2=new javax.swing.ImageIcon(getClass().getResource("/Src//devolver.png"));
                 break;
             case 1:
                 image_boton2=new javax.swing.ImageIcon(getClass().getResource("/Src//web.png"));
                 break;
             case 2:
                 image_boton2=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.png"));
                 break;
             case 3:
                 image_boton2=new javax.swing.ImageIcon(getClass().getResource("/Src//siguiente2.png"));
                 break;
             
             default:
                 break;
         }
        
        
        contador2++;

       return image_boton2;
    }
    
    public ImageIcon Botones3(){
        ImageIcon help=null;
        switch (contador3) {
             case 0:
                 help=new javax.swing.ImageIcon(getClass().getResource("/Src//Anterior_1.png"));
                 break;
             case 1:
                 help=new javax.swing.ImageIcon(getClass().getResource("/Src//Siguiente_1.png"));
                 break;
                 default:
                     break;
        }
        
        contador3++;
        return help;
    }
    
    public ImageIcon ImagePrincipal(){
       
        
        ImageIcon respuestaImage=null;
        if(Acumulador==contador5){
           Aux=10;
            
        }
        while (Lista_1.size()<Aux) {
        aletorio_1 = random.nextInt(10);
   
        if (!Lista_1.contains(aletorio_1)){
           Preguntas=aletorio_1;
           Lista_1.add(aletorio_1);
           Aux=0;
           System.out.println(Aux2+""+Preguntas);
           Lista_2 = new HashSet<>(); 
           System.out.println(""+Lista_2.size());
           contador5+=4;
        }
    
      }
         
         Acumulador++;
        
                
         switch (Preguntas) {
            case 0:
                Aux2=4;
                 while (Lista_2.size()<Aux2) {
                 aletorio_2 = random.nextInt(4);
   
                    if (!Lista_2.contains(aletorio_2)){
                          Respuestas=aletorio_2;
                            Lista_2.add(aletorio_2);
                            Aux2=0;
                            System.out.println(""+Respuestas);
                    }
                 }
                        if(Respuestas==0){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Ecdotico.jpg"));
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                             verificar_falsas++;
                         }
                Link="";
                Pregunta_aleatoria="";
                 break;
                 
            case 1:
                 Aux2=4;
                 while (Lista_2.size()<Aux2) {
                 aletorio_2 = random.nextInt(4);
   
                    if (!Lista_2.contains(aletorio_2)){
                          Respuestas=aletorio_2;
                            Lista_2.add(aletorio_2);
                            Aux2=0;
                            System.out.println(""+Respuestas);
                    }
                 }
                        if(Respuestas==0){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Ecdotico.jpg"));
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                             verificar_falsas++;
                         }
                Link="";
                Pregunta_aleatoria="";
             
                 break;
                 
            case 2:
                  Aux2=4;
                 while (Lista_2.size()<Aux2) {
                 aletorio_2 = random.nextInt(4);
   
                    if (!Lista_2.contains(aletorio_2)){
                          Respuestas=aletorio_2;
                            Lista_2.add(aletorio_2);
                            Aux2=0;
                            System.out.println(""+Respuestas);
                    }
                 }
                        if(Respuestas==0){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Ecdotico.jpg"));
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                             verificar_falsas++;
                         }
                 Link="";
                 Pregunta_aleatoria="";
                 
                 break;
                 
            case 3:
                 Aux2=4;
                 while (Lista_2.size()<Aux2) {
                 aletorio_2 = random.nextInt(4);
   
                    if (!Lista_2.contains(aletorio_2)){
                          Respuestas=aletorio_2;
                            Lista_2.add(aletorio_2);
                            Aux2=0;
                            System.out.println(""+Respuestas);
                    }
                 }
                        if(Respuestas==0){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Ecdotico.jpg"));
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                             verificar_falsas++;
                         }
                 Link="";
                 Pregunta_aleatoria="";
                 
                 break;
                 
            case 4:
                  Aux2=4;
                 while (Lista_2.size()<Aux2) {
                 aletorio_2 = random.nextInt(4);
   
                    if (!Lista_2.contains(aletorio_2)){
                          Respuestas=aletorio_2;
                            Lista_2.add(aletorio_2);
                            Aux2=0;
                            System.out.println(""+Respuestas);
                    }
                 }
                        if(Respuestas==0){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Ecdotico.jpg"));
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                             verificar_falsas++;
                         }
                 Link="";
                 Pregunta_aleatoria="";
                 
                 break;
                 
            case 5:
                  Aux2=4;
                 while (Lista_2.size()<Aux2) {
                 aletorio_2 = random.nextInt(4);
   
                    if (!Lista_2.contains(aletorio_2)){
                          Respuestas=aletorio_2;
                            Lista_2.add(aletorio_2);
                            Aux2=0;
                            System.out.println(""+Respuestas);
                    }
                 }
                        if(Respuestas==0){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Ecdotico.jpg"));
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                             verificar_falsas++;
                         }
                 Link="";
                 Pregunta_aleatoria="";
                 
                 break;
                 
            case 6:
                  Aux2=4;
                 while (Lista_2.size()<Aux2) {
                 aletorio_2 = random.nextInt(4);
   
                    if (!Lista_2.contains(aletorio_2)){
                          Respuestas=aletorio_2;
                            Lista_2.add(aletorio_2);
                            Aux2=0;
                            System.out.println(""+Respuestas);
                    }
                 }
                        if(Respuestas==0){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Ecdotico.jpg"));
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                             verificar_falsas++;
                         }
                 Link="";
                 Pregunta_aleatoria="";
                 
                 break;
                 
            case 7:
                  Aux2=4;
                 while (Lista_2.size()<Aux2) {
                 aletorio_2 = random.nextInt(4);
   
                    if (!Lista_2.contains(aletorio_2)){
                          Respuestas=aletorio_2;
                            Lista_2.add(aletorio_2);
                            Aux2=0;
                            System.out.println(""+Respuestas);
                    }
                 }
                        if(Respuestas==0){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Ecdotico.jpg"));
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                             verificar_falsas++;
                         }
                Link="";
                Pregunta_aleatoria="";
                
                 break;
                 
            case 8:
                  Aux2=4;
                 while (Lista_2.size()<Aux2) {
                 aletorio_2 = random.nextInt(4);
   
                    if (!Lista_2.contains(aletorio_2)){
                          Respuestas=aletorio_2;
                            Lista_2.add(aletorio_2);
                            Aux2=0;
                            System.out.println(""+Respuestas);
                    }
                 }
                        if(Respuestas==0){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Ecdotico.jpg"));
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                             verificar_falsas++;
                         }
                 Link="";
                 Pregunta_aleatoria="";
                 
                 break;
                 
            case 9:
                 Aux2=4;
                 while (Lista_2.size()<Aux2) {
                 aletorio_2 = random.nextInt(4);
   
                    if (!Lista_2.contains(aletorio_2)){
                          Respuestas=aletorio_2;
                            Lista_2.add(aletorio_2);
                            Aux2=0;
                            System.out.println(""+Respuestas);
                    }
                 }
                        if(Respuestas==0){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Ecdotico.jpg"));
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new javax.swing.ImageIcon(getClass().getResource("/Src//Verificar.jpg"));
                             verificar_falsas++;
                         }
                 Link="";
                 Pregunta_aleatoria="";
                 
                 break;
                 
                 default:
                     break;
         }
        
        return respuestaImage;
    }
    
    public String ImagePregunta(){
      return Pregunta_aleatoria;  
    }
    
    public int VerificarRespuesta(){
        return verificar_verdaderas;
    }
    
    public void Nueva(){
        verificar_verdaderas=0;
        verificar_falsas=0;
    }
    
    public String RespuestaLink(){        
      return Link;  
    }
    
}
