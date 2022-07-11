
package DuoGame;

import Funciones.Guardar;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.ImageIcon;


public class Verificar extends javax.swing.JFrame implements ActionListener{
   Guardar Avatar= new Guardar();
   Informacion info=new Informacion();
   Funcion duo=new Funcion();
   int valor=2;
   public static final String Rutas="../src/Source/";
   ImageIcon I_fondo=new ImageIcon(Rutas+"FondoDuo.jpg");
   String NGamer, aux;
    public Verificar() {
        initComponents();
        this.setLocationRelativeTo(null);
        Avatar.SubirUsuario_txt("C:\\GAME_ON\\Usuarios.txt");
        NGamer= Avatar.NombreGamer();
        aux=Avatar.Buscar_Image(NGamer);
        aux=aux.replace("file:/", "");
        aux=aux.replace("\\", "/");
        ImageIcon ms=new ImageIcon(aux);
        IFondo.setIcon(new ImageIcon(ms.getImage().getScaledInstance(130, 140, Image.SCALE_SMOOTH)));
        IFondo.setIcon(new ImageIcon(I_fondo.getImage().getScaledInstance(430, 430, Image.SCALE_SMOOTH)));
        btn_Añadir.addActionListener(this);
        btn_Play.addActionListener(this);
        btn_Inicio.addActionListener(this);
        btn_atras.addActionListener(this);
        btn_salir.addActionListener(this);
        btn_Inicio.setVisible(false);
        lb_J1.setText(duo.Subir_txt());
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==btn_Añadir){
            if(txt_Contraseña.getText().isEmpty()){
                System.out.println("No Joda");
            }else{
                if(buscar()){
                Partida comenzar=new Partida();
                comenzar.setContraseña(txt_Contraseña.getText());
                comenzar.setJugador1(duo.Subir_txt());
                comenzar.setJugador2("Segundo");
                comenzar.setMonedas(valor);
                comenzar.setCorrectas(0);
                comenzar.setRespuesta(true);
                if(info.registrar(comenzar)){
                System.out.println("SE Ha Guardado");
                txt_Buscar.setEnabled(false);
               }
              }
            }
            
        }else if(e.getSource()==btn_Play){
            if(txt_Buscar.getText().isEmpty()){
                System.out.println("No Joda");
            }else{
                if(disponible()){
                
                    Partida comenzar=new Partida();
                    comenzar.setContraseña(txt_Buscar.getText());
                    comenzar.setJugador1(lb_J1.getText());
                    comenzar.setJugador2(duo.Subir_txt());
                    comenzar.setMonedas(20);
                    comenzar.setCorrectas(0);
                    comenzar.setRespuesta(false);
                   
                            
                    if(info.modificar(comenzar)){
                    System.out.println("SE Ha Modificado");
                    buscar();
                    btn_Añadir.setVisible(false);
                    btn_Play.setVisible(false);
                    btn_Inicio.setVisible(true);
                    }
                    System.out.println("Puede Iniciar");
                }
               
            }
        }else if(e.getSource()==btn_Inicio){
            duoGame_On azk = new duoGame_On();
            azk.setVisible(true);
            this.setVisible(false);
        }else if(e.getSource()==btn_atras){
            btn_Añadir.setVisible(true);
            btn_Play.setVisible(true);
            btn_Inicio.setVisible(false);
        }else if(e.getSource()==btn_salir){
            this.hide();
        }
            
    }
    
    public boolean buscar(){
        boolean existe= true;
        Partida comenzar=new Partida();
          comenzar.setContraseña(txt_Contraseña.getText());
          if(info.buscar(comenzar)){
             lb_J1.setText(comenzar.getJugador1());
             lb_J1.setText(comenzar.getJugador1());
             System.out.println("Ya ha sido creada");
             existe = false;
           }
        return existe;
    }

    public boolean disponible(){
        boolean existe=true;
        Partida comenzar=new Partida();
        comenzar.setContraseña(txt_Buscar.getText());
                
        if(info.buscar(comenzar)){
            lb_J1.setText(comenzar.getJugador1());
            lb_J2.setText(comenzar.getJugador2());
                
            if(comenzar.getRespuesta()){
             existe=true;
             System.out.println("Se a Conectado");
             
             }else{
             System.out.println("Esta en Uso");
             existe=false;
            }
        }else{
            System.out.println("No se busco");
        }
     return existe;
    }

        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_Jugador2 = new javax.swing.JLabel();
        lb_Jugador1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_Play = new javax.swing.JButton();
        lb_J1 = new javax.swing.JLabel();
        lb_J2 = new javax.swing.JLabel();
        txt_Buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_Contraseña = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_Añadir = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_Inicio = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        IFondo = new javax.swing.JLabel();

        setModalExclusionType(null);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_Jugador2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lb_Jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 130, 140));

        lb_Jugador1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lb_Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 140));

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 120, 30));

        btn_Play.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        btn_Play.setText("GO");
        btn_Play.setContentAreaFilled(false);
        btn_Play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 62, -1));

        lb_J1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lb_J1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lb_J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 160, 120, 20));

        lb_J2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lb_J2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lb_J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 130, 20));
        jPanel1.add(txt_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 123, 120, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 2, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 143, 120, -1));
        jPanel1.add(txt_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 36, 120, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 2, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 120, -1));

        btn_Añadir.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        btn_Añadir.setText("ADD");
        btn_Añadir.setContentAreaFilled(false);
        btn_Añadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 62, -1));

        btn_salir.setFont(new java.awt.Font("Trebuchet MS", 2, 12)); // NOI18N
        btn_salir.setText("EXIT");
        btn_salir.setContentAreaFilled(false);
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 180, 65, -1));

        btn_Inicio.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        btn_Inicio.setText("PLAY");
        btn_Inicio.setContentAreaFilled(false);
        btn_Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        btn_atras.setFont(new java.awt.Font("Trebuchet MS", 2, 12)); // NOI18N
        btn_atras.setText("BACK");
        btn_atras.setContentAreaFilled(false);
        btn_atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 65, -1));
        jPanel1.add(IFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 200));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Verificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IFondo;
    private javax.swing.JButton btn_Añadir;
    private javax.swing.JButton btn_Inicio;
    private javax.swing.JButton btn_Play;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_J1;
    private javax.swing.JLabel lb_J2;
    private javax.swing.JLabel lb_Jugador1;
    private javax.swing.JLabel lb_Jugador2;
    private javax.swing.JTextField txt_Buscar;
    private javax.swing.JTextField txt_Contraseña;
    // End of variables declaration//GEN-END:variables

    
}
