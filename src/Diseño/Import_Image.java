
package Diseño;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.ImageIcon;


public class Import_Image {
    public static final String Rutas="./src/Source/";
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
       String rt[]={Rutas+"img_1.jpg", Rutas+"img_2.jpg", Rutas+"img_4.jpg", Rutas+"img_5.jpg", 
           Rutas+"lucha.png", Rutas+"img_6.jpg", Rutas+"img_7.jpg", Rutas+"img_8.jpg",
           Rutas+"img_9.jpg", Rutas+"img_10.jpg"};
       ImageIcon Avatar=new ImageIcon(rt[indice]);
       
     return Avatar;
    }
    
    public ImageIcon ImageB(boolean boton){
        ImageIcon funcion_B=null;
        
        String ruta[]={Rutas+"Tienda.jpg", Rutas+"Confi.jpg", Rutas+"Puntos.jpg",
        Rutas+"Inicio.jpg", Rutas+"web.png", Rutas+"Verificar.png"};
        
        String Ayuda[]={"s","s","s","s","s","s"};
        
        if(boton && contador4>=0 && contador4<5){
             contador4++;
             funcion_B=new ImageIcon(ruta[contador4]);
             Aux3=Ayuda[contador4];
        }else if(!boton && contador4>0 && contador4<=5 ){
            contador4--;
            funcion_B=new ImageIcon(ruta[contador4]);
            Aux3=Ayuda[contador4];
        }else if(contador4==5){
            funcion_B=new ImageIcon(ruta[contador4]);
            Aux3=Ayuda[contador4];
        }else if(contador4==0){
            funcion_B=new ImageIcon(ruta[contador4]);
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
                 image_boton=new ImageIcon(Rutas+"confi.jpg");
                 break;
             case 1:
                 image_boton=new ImageIcon(Rutas+"help.jpg");
                 break;
             case 2:
                 image_boton=new ImageIcon(Rutas+"Tienda.jpg");
                 break;
             case 3:
                 image_boton=new  ImageIcon(Rutas+"Volver.jpg");
                 break;
             case 4:
                 image_boton=new ImageIcon(Rutas+"Inicio.jpg");
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
                 image_boton2=new ImageIcon(Rutas+"devolver.png");
                 break;
             case 1:
                 image_boton2=new ImageIcon(Rutas+"web.png");
                 break;
             case 2:
                 image_boton2=new ImageIcon(Rutas+"Verificar.png");
                 break;
             case 3:
                 image_boton2=new ImageIcon(Rutas+"siguiente2.png");
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
                 help=new  ImageIcon(Rutas+"Anterior_1.png");
                 break;
             case 1:
                 help=new ImageIcon(Rutas+"Siguiente_1.png");
                 break;
                 default:
                     break;
        }
        
        contador3++;
        return help;
    }
    
    public ImageIcon ImagePrincipal(){
       
        Aux2=4;
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
            
                while (Lista_2.size()<Aux2) {
                aletorio_2 = random.nextInt(4);
   
                   if (!Lista_2.contains(aletorio_2)){
                    Respuestas=aletorio_2;
                    Lista_2.add(aletorio_2);
                     Aux2=0;
                     System.out.println(""+Respuestas);
                    }
                 }
         Acumulador++;
        
                
         switch (Preguntas) {
            case 0:
               
                        if(Respuestas==0){
                              respuestaImage=new ImageIcon(Rutas+"Chimbilaco2.jpeg");
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new ImageIcon(Rutas+"Chimbilaco.jpeg");
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new ImageIcon(Rutas+"Chimbilaco3.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new ImageIcon(Rutas+"Chimbilaco4.jpg");
                             verificar_falsas++;
                         }
                Link="https://brainly.lat/tarea/4832937";
                Pregunta_aleatoria="SE LE CONOCE COMO CHIMBILACO";
                 break;
                 
            case 1:
                 
                        if(Respuestas==0){
                              respuestaImage=new ImageIcon(Rutas+"Ediculo2.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new ImageIcon(Rutas+"Ediculo.jpeg");
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new ImageIcon(Rutas+"Ediculo3.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new ImageIcon(Rutas+"Ediculo4.jpg");
                             verificar_falsas++;
                         }
                Link="https://es.wikipedia.org/wiki/Ed%C3%ADculo";
                Pregunta_aleatoria="EDIFICIO PEQUEÑO NOMBRADO EDICULO";
             
                 break;
                 
            case 2:
                  
                
                        if(Respuestas==0){
                              respuestaImage=new ImageIcon(Rutas+"Joyel2.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new ImageIcon(Rutas+"Joyel.jpg");
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new ImageIcon(Rutas+"Joyel3.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new ImageIcon(Rutas+"Joyel4.jpg");
                             verificar_falsas++;
                         }
                 Link="https://dle.rae.es/joyel";
                 Pregunta_aleatoria="TIPO DE JOYA DENOMINADA JOYEL";
                 
                 break;
                 
            case 3:
                 
                        if(Respuestas==0){
                              respuestaImage=new ImageIcon(Rutas+"Ponto2.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new ImageIcon(Rutas+"Ponto.jpg");
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new ImageIcon(Rutas+"Ponto3.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new ImageIcon(Rutas+"Ponto4.jpg");
                             verificar_falsas++;
                         }
                 Link="https://es.thefreedictionary.com/ponto";
                 Pregunta_aleatoria="ESTA EN DIVERSOS PAISAJES DENOMINADO PONTO";
                 
                 break;
                 
            case 4:
                  
                        if(Respuestas==0){
                              respuestaImage=new ImageIcon(Rutas+"Sapenco2.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new ImageIcon(Rutas+"Sapenco.jpeg");
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new ImageIcon(Rutas+"Sapenco3.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new ImageIcon(Rutas+"Sapenco4.jpg");
                             verificar_falsas++;
                         }
                 Link="https://dle.rae.es/sapenco";
                 Pregunta_aleatoria="ANIAMAL COLORIDO NOMBRADO SAPENCO";
                 
                 break;
                 
            case 5:
                  
                        if(Respuestas==0){
                              respuestaImage=new ImageIcon(Rutas+"Sordon2.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new ImageIcon(Rutas+"Sordon.jpg");
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new ImageIcon(Rutas+"Sordon3.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new ImageIcon(Rutas+"Sordon4.jpg");
                             verificar_falsas++;
                         }
                 Link="https://es.thefreedictionary.com/sord%C3%B3n";
                 Pregunta_aleatoria="INSTRUMENTO DE AIRE NOMBRADO SORDON";
                 
                 break;
                 
            case 6:
                  
                        if(Respuestas==0){
                              respuestaImage=new ImageIcon(Rutas+"Ñenga2.jpeg");
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new ImageIcon(Rutas+"Ñenga.jpeg");
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new ImageIcon(Rutas+"Ñenga3.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new ImageIcon(Rutas+"Ñenga4.jpg");
                             verificar_falsas++;
                         }
                 Link="https://dle.rae.es/%C3%B1engo";
                 Pregunta_aleatoria="PERSONA LA CUAL NO ENGORDA NOMBRADA ÑENGA";
                 
                 break;
                 
            case 7:
                  
                        if(Respuestas==0){
                              respuestaImage=new ImageIcon(Rutas+"Zaino2.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new ImageIcon(Rutas+"Zaino.jpg");
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new ImageIcon(Rutas+"Zaino3.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new ImageIcon(Rutas+"Zaino4.jpg");
                             verificar_falsas++;
                         }
                Link="http://etimologias.dechile.net/?zaino";
                Pregunta_aleatoria="PERAONA QUE PIENSA EN SI MISMO NOMBRADA ZAINO";
                
                 break;
                 
            case 8:
                  
                        if(Respuestas==0){
                              respuestaImage=new ImageIcon(Rutas+"Burdegano2.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new ImageIcon(Rutas+"Burdegano.jpg");
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new ImageIcon(Rutas+"Burdegano3.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new ImageIcon(Rutas+"Burdegano4.jpg");
                             verificar_falsas++;
                         }
                 Link="https://es.wikipedia.org/wiki/Burd%C3%A9gano";
                 Pregunta_aleatoria="ANIMAL HIBRIDO NOMBRADO BURDEGANO";
                 
                 break;
                 
            case 9:
                 
                        if(Respuestas==0){
                              respuestaImage=new ImageIcon(Rutas+"Chamuco2.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==1){
                              respuestaImage=new ImageIcon(Rutas+"Chamuco.png");
                              verificar_verdaderas=verificar_falsas+1;
                        }else if(Respuestas==2){
                              respuestaImage=new ImageIcon(Rutas+"Chamuco3.jpg");
                              verificar_falsas++;
                        }else if(Respuestas==3){
                             respuestaImage=new ImageIcon(Rutas+"Chamuco4.jpg");
                             verificar_falsas++;
                         }
                 Link="https://es.wiktionary.org/wiki/chamuco";
                 Pregunta_aleatoria="ENTIDAD PARANORMAL NOMBRADA CHAMUCO";
                 
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
        int NPreguntas=0;
        return verificar_verdaderas+NPreguntas++;
    }
    
    public void Nueva(){
        verificar_verdaderas=0;
        verificar_falsas=0;
    }
    
    public String RespuestaLink(){        
      return Link;  
    }
    
}
