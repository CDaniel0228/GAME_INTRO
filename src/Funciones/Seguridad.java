
package Funciones;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Seguridad{
    
    public static void Correr() {
        Scanner sc =new Scanner(System.in);
        Seguridad Recifrar=new Seguridad();
        
        System.out.println("Usuario");
        String Mensaje=sc.nextLine();
        System.out.println("Contraseña");
        String clave  = sc.nextLine();
        
        char[][] Arreglo={
        {'a','b','c','d','e','f','g'},
        {'h','i','j','k','l','m','ñ'},
        {'n','o','p','q','r','s','t'},
        {'u','v','w','x','y','z','1'},
        {'2','3','4','5','6','7','8'},
        {'9','0','_','-',' ','.',','},
        {'$','#','%','&','+','*','/'}};
        
        String encriptar1=Recifrar.Cifrar(Mensaje);
        String []encriptar2=Recifrar.Cifrar2(Mensaje, Arreglo);
        String cipher =   Cifrado_Playfair(Mensaje,clave);

        System.out.println("Sifrado_1 "+Recifrar.Cifrar(Mensaje));
        System.out.println("Desifrado_1 " +Recifrar.Desifrar(encriptar1)+"\n");
        
        System.out.println("Sifrado_2 "+Arrays.toString(Recifrar.Cifrar2(Mensaje, Arreglo)));
        System.out.println("Desifrado_2 "+Recifrar.Desifrar2(encriptar2, Arreglo)+"\n");
   
        System.out.println("Sifrado_3 "+Cifrado_Playfair(Mensaje,clave));
        System.out.println("Desifrado_3 "+Descifrado_Playfair(cipher,clave)+"\n");
         
         //Se convierte el mensaje a array de binarios
         String [] mensajeB = TextoABinario(Mensaje);
         String [] claveB = TextoABinario(clave);
 
        //Se manda a cifrar
         String [] resultado = Cifrado_Descifrado_XOR(mensajeB,claveB);
       /*
        System.out.println("Usuario_Binario");
        Imprimir(mensajeB);
        
        System.out.println("Clave_Binario");
        Imprimir(claveB);
       */
        System.out.println("2_Resultados");
        Imprimir(resultado);
       
         //Se manda a descifrar;
         String[] resultado2 = Cifrado_Descifrado_XOR(resultado,claveB);
  
         System.out.print(" Mensaje Desifrado ");
         System.out.println(BinarioATexto(resultado2));
   
   
    }
    
    public String Cifrar(String Mensaje){
        
        char []cifrar=Mensaje.toCharArray();
        String ms = "";
        for(int i=0; i<cifrar.length; i++){
            ms+=(char)(((int)cifrar[i])+3);

        }
        return ms;
    }
    
    public String Desifrar(String Mensaje){
        char []cifrar=Mensaje.toCharArray();
        String ms = "";
        for(int i=0; i<cifrar.length; i++){
            ms+=(char)(((int)cifrar[i])-3);

        }
        return ms;
    }
    
    public String []Cifrar2(String Mensaje, char[][]Arreglo){
        String[]cifrar=new String[Mensaje.toCharArray().length];
        char[] ms=Mensaje.toCharArray();
        
        for(int i=0; i<ms.length; i++){
            for(int j=0; j<ms.length; j++){
                for(int h=0; h<ms.length; h++){
                    if(Arreglo[j][h]==ms[i]){
                        cifrar[i]=Integer.toString(j)+Integer.toString(h);
                        
                        break;
                    }
                }
            }
        }
        return cifrar;
    }
    
    public String Desifrar2(String [] Mensaje, char[][]Arreglo){
        char[] Desifrar;
       // String[] mensaje=new String[Mensaje.toCharArray().length];
        String cifrar="";
        
        for (int i=0; i<Mensaje.length; i++) {
            Desifrar = Mensaje[i].toCharArray();
            cifrar+=Arreglo[Character.getNumericValue(Desifrar[0])][Character.getNumericValue(Desifrar[1])];
            
        }
        System.out.println(cifrar);
        return cifrar;
    }
    
    
      public static char [][] GenerarParejas(String mensaje){
      
      int tam = mensaje.length();
      
      //Se revisa que no alla caracteres repetidos consecutivamente como "llave"
      //tendria que queda lxlave
      
      char [] revision= mensaje.toCharArray();
      ArrayList<Character> arrayRevision = new ArrayList<>();
      for(int i=0;i<mensaje.length();i++){
         arrayRevision.add(revision[i]);
      
         if(i+1<revision.length){
         if(revision[i]==revision[i+1]){
            arrayRevision.add('x');
            
                              }
                  }
            }
      
      //Revisamos que el mensaje quede de un tamaño par si no es asi agregamos x al final para volverlo par
      if(arrayRevision.size()%2!=0){
         arrayRevision.add('x');
      }
      
      
      //Se forma una matris de 2 columnas para las parejas de caracteres
      char [][] parejaCaracteres= new char [arrayRevision.size()/2][2];
      int cont =0;
      for(int i=0;i<parejaCaracteres.length;i++){
         for(int j=0;j<parejaCaracteres[1].length;j++){
            parejaCaracteres[i][j]=arrayRevision.get(cont);
            cont++;
         }
      }
      
      return parejaCaracteres;
   }
     
      public static int[] ObtenerPosicionCaracter(char caracter,char [][] matris){
      
      int [] direccion = new int [2];
      
      
      for(int i =0;i<matris.length;i++ ){
         
         for(int j=0;j<matris[i].length;j++){
            
            if(caracter == matris[i][j]){
               //fila
               direccion[0]=i;
                //columna
               direccion[1]=j;
            }
         }
   
      }
   
      return direccion;
      
   }
     
      public static String Cifrado_Playfair(String mensaje,String clave){
 
      //Se genera la matriz
      char [][] matris = GenerarMatriz(clave);
      //Se generan las parejas de caracteres
      char [][] parejaCaracteres = GenerarParejas(mensaje);
      
      System.out.println("\n \t Matriz");
      //Imprimimos la matriz con la misma funcion que hemos utilizado 
      //en todo el taller
      Imprimir(matris);
      
      //Se imprimen las parejas de caracteres
      System.out.println("\n \t Parejas de caracteres");
      Imprimir(parejaCaracteres);
      String cipher = "";
      
      //Los array de direcciones de las dos letras
      int [] direcciones ;   
      int [] direcciones2;
      int columna =0;
      //Se va por todas las parejas de caracteres
      for(int i=0;i<parejaCaracteres.length;i++){
      
      
         // Se manda a obtener las posiciones de los caracteres
         direcciones= ObtenerPosicionCaracter(parejaCaracteres[i][columna],matris);
         columna++;
         direcciones2= ObtenerPosicionCaracter(parejaCaracteres[i][columna],matris);
         
         
         if(columna==1){
            columna=0;
         }
         
         // Se guardan en variables para asi comparar las reglas
         int fila1= direcciones[0];
         int columna1= direcciones[1];
         
         int fila2= direcciones2[0];
         int columna2= direcciones2[1];
         
         
         // Si estan en la misma fila se le suma +1 a la columna
         int fTemporal;
         if(fila1==fila2){
            fTemporal= columna1+1;
            if(fTemporal==matris.length){
               fTemporal=0;
            }
            
            cipher+=matris[fila1][fTemporal];
            
            
            fTemporal = columna2+1;
            if(fTemporal==matris.length){
               fTemporal=0;
            }
            
            cipher+=matris[fila2][fTemporal];
         }      
         
         
         // si estan en la misma columna se le suma +1 a la fila
         int cTemporal;
         if(columna1==columna2){
            
            cTemporal = fila1+1;
            
            if(cTemporal == matris.length){
               cTemporal=0;
            }
            
            cipher+= matris[cTemporal][columna1];
            
            cTemporal = fila2+1;
            
            if(cTemporal == matris.length){
               cTemporal=0;
            }
            
            cipher+= matris[cTemporal][columna2];
            
            
         }   
         
         // si no cumple ninguna de las anteriores
         // se coloca la diagonal opuesta, se invierten las columnas
         
         if(fila1!=fila2 & columna1!=columna2){
            
            cipher+=matris[fila1][columna2];
            cipher+=matris[fila2][columna1];
            
 
                  }
      }
      
      // se retorna el cipher
      return cipher;
   }
      
      public static String Descifrado_Playfair(String cipher,String clave){
      
      String mensaje ="";
      
      char [][] matris= GenerarMatriz(clave);
      char [][] parejas = GenerarParejas(cipher);
      
      int [] direcciones;
      int [] direcciones2;
      
      int columnas=0;
      for(int i=0;i<parejas.length;i++){
         
         
         direcciones= ObtenerPosicionCaracter(parejas[i][columnas],matris);
         columnas++;
         
 
         int fila1= direcciones[0];
         int columna1= direcciones[1];
 
         
         direcciones2= ObtenerPosicionCaracter(parejas[i][columnas],matris);
         if(columnas==1){columnas=0;}
         
         int fila2= direcciones2[0];
         int columna2= direcciones2[1];
         
         //Filas iguales ya no se suma , si no que ahora se resta -1 a la columna
         int fTemporal;
         if(fila1==fila2){
            fTemporal= columna1-1;
            if(fTemporal<0){
               fTemporal=matris.length-1;
            }
            
            mensaje+=matris[fila1][fTemporal];
            
            
            fTemporal = columna2-1;
            if(fTemporal<0){
               fTemporal=matris.length-1;
            }
            
            mensaje+=matris[fila2][fTemporal];
         }      
         
         
         int cTemporal;
         //Columnas iguales ya no se suma , si no que ahora se resta -1 a la fila
 
         if(columna1==columna2){
            
            cTemporal = fila1-1;
            
            if(cTemporal<0){
               cTemporal=matris.length-1;
            }
            
            mensaje+= matris[cTemporal][columna1];
            
            cTemporal = fila2-1;
            
            if(cTemporal<0){
               cTemporal=matris.length-1;
            }
            
            mensaje+= matris[cTemporal][columna2];
            
            
         }   
         
         //Si no se cumple ninguna se coloca la diagonal opuesta, esto no cambia
         if(fila1!=fila2 & columna1!=columna2){
            
            mensaje+=matris[fila1][columna2];
            mensaje+=matris[fila2][columna1];
 
         }
         
      }
      
      return mensaje;
   }
      
      public static void Imprimir(char [][] matris){
      for(int i=0;i<matris.length;i++){
         for(int j=0;j<matris[i].length;j++){
            System.out.print(matris[i][j]+" ");
 
         }
         System.out.println("");
 
      }
   }
      
      public static char [][] GenerarMatriz (String clave){
       char [][] matris = new char [7][7];
 
      char [] caracteresClave = clave.toCharArray();
      char [] numeros = {'0','1','2','3','4','5','6','7','8','9'};
      char [] letras = new char [26];
      char [] signos = {'+','-','$','&',',','.',' ','_','*','%','=','?','¿'};
      LinkedHashSet<Character> caracteresMatriz = new LinkedHashSet<>();
      
   
      
      //Eliminamos las letras repetidas de a clave
      //Se ingresa la clave sin caracteres repetidos a la coleccion que tendra todos los caracteres de la matris
      
      for(int k=0;k<caracteresClave.length;k++){
         caracteresMatriz.add(caracteresClave[k]);   
      }
      
      //Se generan las letras del abecedario en base al codigo ASCII
      for(int i=97;i<123;i++){
         letras[i-97] = (char)i;
      }
      
      
      
      //Se ingresa el resto del abecedario
      for(int i=0;i<letras.length;i++){
         caracteresMatriz.add(letras[i]);
      }
      
      //Se ingresan los numeros
      for(int i=0;i<numeros.length;i++){
         caracteresMatriz.add(numeros[i]);
      }
      
      //Se ingresan los signos
      for(int i=0;i<signos.length;i++){
         caracteresMatriz.add(signos[i]);
         }
      
      //Se convierte el linkedhashSet en un array para luego meterlo en la matriz
      int cont;
      char [] arrayTemporal = new char [caracteresMatriz.size()];
      cont=0;
      for(char caracter:caracteresMatriz){
         arrayTemporal[cont]=caracter;
         cont++;
      }
      
      
      
      //Se ingresan a la matriz todos los caracteres (con esto tendriamos nuestra matriz lista)
      cont=0;
      for(int i=0;i<matris.length;i++){
         for(int j=0;j<matris[0].length;j++){
            matris[i][j]=arrayTemporal[cont];
            cont++;
         }
         
      }
      
      return matris;
   }
      
      
      public static String CompuertaXOR (String binario1 , String binario2){
      
      char [] operando1 = binario1.toCharArray();
      char [] operando2 = binario2.toCharArray();
      char [] r =new char [operando1.length];
      
   for(int i=0;i<operando1.length ;i++){
      
      
      if(operando1[i]!=operando2[i]){
            r [i]='1';
         }else {
            r [i]= '0';
         }
   }   
 
   String re="";
   for(int j=0;j<r.length;j++){
      re+=r[j];
   }
 
      return re;
   }
   
      public static String [] Cifrado_Descifrado_XOR (String [] mensaje,String [] clave){
      
      String [] resultado = new String [mensaje.length];
      int puntero=0;
   
      for(int i =0 ;i<mensaje.length;i++){
         
         if(puntero>=clave.length){
            puntero =0;
         }
         resultado[i]= CompuertaXOR(mensaje[i],clave[puntero]);
         
         puntero++;
      }
      
      return resultado;
   }
 
      public static String [] TextoABinario(String texto){
      
      char caracter;
      int codigoASCII;
      String binario;
      String [] binarios = new String [texto.length()];
      
      for (int i=0;i<texto.length();i++){
         
         caracter = texto.charAt(i);
         codigoASCII = (int) caracter;
         
         binario = "";
         
         
         for(int j=7;j>=0;j--){
            if(codigoASCII>=Math.pow(2, j)){
               codigoASCII-=Math.pow(2,j);
               binario +="1";
            }else{
               binario+="0";
            }
         }
      
         binarios[i]= binario.toString();
 
         
      }
      return binarios;
   }
   
      public static String BinarioATexto(String [] binarios){
      String texto="";
      
      for(int j=0;j<binarios.length;j++){
      char [] bin = binarios[j].toCharArray();
      
      int decimal =0;
      
      int contador=0;
      for(int i=bin.length-1;i>-1;i--){
   
         if(bin[contador]=='1'){
            decimal+=Math.pow(2, i);
         }
         
         contador++;
      }
      
      texto+= (char) decimal;
      
      }
      
      return texto;
   }
   
      public static void Imprimir(String [] arreglo){
      
      for(int i=0;i<arreglo.length;i++){
         System.out.println(arreglo[i]+" ");
      }
   }
      
}
