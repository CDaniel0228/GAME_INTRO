
package Principal;

import java.awt.Desktop;
import java.awt.Image;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Diseño.Import_Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.Timer;

public class Game_On extends javax.swing.JFrame {
    Import_Image nueva=new Import_Image();
    Timer T;
    int respuesta=0;
    int Puntos=0;
    int Vidas=3;
    int segundos=0;
    int Preguntas=0;
    boolean Siguiente=true, Confirmar=false;
    
    public Game_On() {
        initComponents();
        this.setLocationRelativeTo(null);
        Tiempo();
        
        Image_1.setIcon(new ImageIcon(nueva.ImagePrincipal().getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        Image_2.setIcon(new ImageIcon(nueva.ImagePrincipal().getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        Image_3.setIcon(new ImageIcon(nueva.ImagePrincipal().getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        Image_4.setIcon(new ImageIcon(nueva.ImagePrincipal().getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        Lb_pregunta.setText(nueva.ImagePregunta());
        
         Btn_volver.setIcon(new ImageIcon(nueva.Botones2().getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
         Btn_informacion.setIcon(new ImageIcon(nueva.Botones2().getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
         Btn_comprobar.setIcon(new ImageIcon(nueva.Botones2().getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
         Btn_siguiente.setIcon(new ImageIcon(nueva.Botones2().getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Image_2 = new javax.swing.JLabel();
        Image_4 = new javax.swing.JLabel();
        Image_1 = new javax.swing.JLabel();
        Image_3 = new javax.swing.JLabel();
        Btn_volver = new javax.swing.JButton();
        Btn_comprobar = new javax.swing.JButton();
        Btn_siguiente = new javax.swing.JButton();
        Lb_pregunta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        op_1 = new javax.swing.JRadioButton();
        op_2 = new javax.swing.JRadioButton();
        op_3 = new javax.swing.JRadioButton();
        op_4 = new javax.swing.JRadioButton();
        Lb_tiempo = new javax.swing.JLabel();
        Lb_puntos = new javax.swing.JLabel();
        Lb_vidas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Btn_informacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Image_2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 153, 153), new java.awt.Color(51, 153, 0)));
        jPanel1.add(Image_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 100, 100));

        Image_4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 153, 153), new java.awt.Color(51, 153, 0)));
        jPanel1.add(Image_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 100, 100));

        Image_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 153, 153), new java.awt.Color(51, 153, 0)));
        jPanel1.add(Image_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 100, 100));

        Image_3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 153, 153), new java.awt.Color(51, 153, 0)));
        jPanel1.add(Image_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 100, 100));

        Btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_volverActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 50, 50));

        Btn_comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_comprobarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_comprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 50, 50));

        Btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_siguienteActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 50, 50));

        Lb_pregunta.setFont(new java.awt.Font("Rod", 1, 14)); // NOI18N
        Lb_pregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb_pregunta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(0, 51, 51), new java.awt.Color(255, 153, 153), new java.awt.Color(153, 255, 102)));
        jPanel1.add(Lb_pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 430, 40));

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(135, 169, 183));
        jLabel5.setText("Puntos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(135, 169, 183));
        jLabel6.setText("Tiempo s");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 60, -1));

        op_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_1ActionPerformed(evt);
            }
        });
        jPanel1.add(op_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 20, 20));

        op_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_2ActionPerformed(evt);
            }
        });
        jPanel1.add(op_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 20, 20));

        op_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_3ActionPerformed(evt);
            }
        });
        jPanel1.add(op_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 20, 20));

        op_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_4ActionPerformed(evt);
            }
        });
        jPanel1.add(op_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 20, 20));

        Lb_tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb_tiempo.setText("20");
        Lb_tiempo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 51)));
        jPanel1.add(Lb_tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 14, 40, 20));

        Lb_puntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb_puntos.setText("0");
        Lb_puntos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 51)));
        jPanel1.add(Lb_puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 14, 40, 20));

        Lb_vidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb_vidas.setText("3");
        Lb_vidas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 51)));
        jPanel1.add(Lb_vidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 14, 40, 20));

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(135, 169, 183));
        jLabel7.setText("Vidas");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        Btn_informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_informacionActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 50, 50));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_informacionActionPerformed
     Desktop enlace = Desktop.getDesktop();  
    try {
    enlace.browse(new URI(nueva.RespuestaLink()));
        } catch (IOException | URISyntaxException e){
    JOptionPane.showMessageDialog(this, nueva.RespuestaLink());
        }
    }//GEN-LAST:event_Btn_informacionActionPerformed

    private void Btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_volverActionPerformed
        Niveles niveles= new Niveles();
        niveles.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_volverActionPerformed

    private void Btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_siguienteActionPerformed
        if(Preguntas<9 && Confirmar){
        nueva.Nueva();
        Image_1.setIcon(new ImageIcon(nueva.ImagePrincipal().getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        Image_2.setIcon(new ImageIcon(nueva.ImagePrincipal().getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        Image_3.setIcon(new ImageIcon(nueva.ImagePrincipal().getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        Image_4.setIcon(new ImageIcon(nueva.ImagePrincipal().getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        Lb_pregunta.setText(nueva.ImagePregunta());
        Tiempo();
        
        op_1.setSelected(false);
        op_2.setSelected(false);
        op_3.setSelected(false);
        op_4.setSelected(false);
        Siguiente=true;
        Confirmar=false;
        Preguntas++;
        }else if(Preguntas>8){
            JOptionPane.showMessageDialog(this, "HA COMLETADO EL JUEGO \n"+
                    "PUNTOS \t"+Puntos, "END GAME", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "DEBE ELEGIR UNA OPCION", "RESPUESTA NULA", JOptionPane.ERROR_MESSAGE);
        } 
        
    }//GEN-LAST:event_Btn_siguienteActionPerformed

    private void Btn_comprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_comprobarActionPerformed
       if(nueva.VerificarRespuesta()==respuesta && Siguiente){
           Puntos+=10;
           Lb_puntos.setText(Puntos+"");
           Siguiente=false;
           JOptionPane.showMessageDialog(this, "CORRECTA", "FELICIDADES", JOptionPane.INFORMATION_MESSAGE);
       }else if(nueva.VerificarRespuesta()!=respuesta && Siguiente) {
           Vidas--;
           Lb_vidas.setText(Vidas+"");
           Siguiente=false;
           JOptionPane.showMessageDialog(this, "   INCORRECTA", "VUELVE A INTENTARLO", JOptionPane.INFORMATION_MESSAGE);
           
       }
       Confirmar=true;
       T.stop();
    }//GEN-LAST:event_Btn_comprobarActionPerformed

    private void op_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_1ActionPerformed

        if(op_1.isSelected()){
           op_2.setSelected(false);
           op_3.setSelected(false);
           op_4.setSelected(false);
           respuesta=1;
            
        }
    }//GEN-LAST:event_op_1ActionPerformed

    private void op_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_2ActionPerformed
        
        if(op_2.isSelected()){
           op_1.setSelected(false);
           op_3.setSelected(false);
           op_4.setSelected(false);
           respuesta=2;
        }
    }//GEN-LAST:event_op_2ActionPerformed

    private void op_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_3ActionPerformed
        
        if(op_3.isSelected()){
           op_2.setSelected(false);
           op_1.setSelected(false);
           op_4.setSelected(false);
           respuesta=3;
        }
    }//GEN-LAST:event_op_3ActionPerformed

    private void op_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_4ActionPerformed
        if(op_4.isSelected()){
           op_2.setSelected(false);
           op_3.setSelected(false);
           op_1.setSelected(false);
           respuesta=4;
        }
    }//GEN-LAST:event_op_4ActionPerformed

    public void Tiempo(){
       
       segundos=20;
       T=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            segundos--;
            Lb_tiempo.setText(segundos+"");
            
              if(segundos<1){
              segundos=0;
              T.stop();
              Siguiente=false;
              Confirmar=true;
              Vidas--;
              JOptionPane.showMessageDialog(null, "Se te a acabado el tiempo");
              }
            }
       });
       
       T.start();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game_On.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game_On.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game_On.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game_On.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game_On().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_comprobar;
    private javax.swing.JButton Btn_informacion;
    private javax.swing.JButton Btn_siguiente;
    private javax.swing.JButton Btn_volver;
    private javax.swing.JLabel Image_1;
    private javax.swing.JLabel Image_2;
    private javax.swing.JLabel Image_3;
    private javax.swing.JLabel Image_4;
    private javax.swing.JLabel Lb_pregunta;
    private javax.swing.JLabel Lb_puntos;
    private javax.swing.JLabel Lb_tiempo;
    private javax.swing.JLabel Lb_vidas;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton op_1;
    private javax.swing.JRadioButton op_2;
    private javax.swing.JRadioButton op_3;
    private javax.swing.JRadioButton op_4;
    // End of variables declaration//GEN-END:variables
}
