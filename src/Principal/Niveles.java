/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Image;
import javax.swing.ImageIcon;
import Diseño.Import_Image;

public class Niveles extends javax.swing.JFrame {
    public static final String Rutas="../src/Source/";
     Import_Image nueva=new Import_Image();
     ImageIcon I_fondo=new ImageIcon(Rutas+"Fondo5.jpg");
     
    public Niveles() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        IFondo.setIcon(new ImageIcon(I_fondo.getImage().getScaledInstance(530, 500, Image.SCALE_SMOOTH)));
        Btn_confi.setIcon(new ImageIcon(nueva.Botones().getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        btn_ayuda.setIcon(new ImageIcon(nueva.Botones().getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        Btn_tienda.setIcon(new ImageIcon(nueva.Botones().getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        Btn_cambiar.setIcon(new ImageIcon(nueva.Botones().getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        Btn_inicio.setIcon(new ImageIcon(nueva.Botones().getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Rd_fasil = new javax.swing.JRadioButton();
        Rd_difisil = new javax.swing.JRadioButton();
        Btn_inicio = new javax.swing.JButton();
        btn_ayuda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Btn_cambiar = new javax.swing.JButton();
        Btn_tienda = new javax.swing.JButton();
        Btn_confi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        IFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Rd_fasil.setFont(new java.awt.Font("PMingLiU", 1, 12)); // NOI18N
        Rd_fasil.setSelected(true);
        Rd_fasil.setText("Facil");
        Rd_fasil.setContentAreaFilled(false);
        Rd_fasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rd_fasilActionPerformed(evt);
            }
        });
        jPanel1.add(Rd_fasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        Rd_difisil.setFont(new java.awt.Font("PMingLiU", 1, 12)); // NOI18N
        Rd_difisil.setText("Dificil");
        Rd_difisil.setContentAreaFilled(false);
        Rd_difisil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rd_difisilActionPerformed(evt);
            }
        });
        jPanel1.add(Rd_difisil, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        Btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_inicioActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 300, 50, 50));

        btn_ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayudaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 50, 50));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("DIFICULTAD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        Btn_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_cambiarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_cambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 50));

        Btn_tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_tiendaActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_tienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 50, 50));

        Btn_confi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_confiActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_confi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 50, 50));

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jLabel4.setText("TIENDA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 10)); // NOI18N
        jLabel5.setText("CONFIGURACION");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jLabel6.setText("USUARIO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jLabel7.setText("CAMBIAR  ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jLabel8.setText("AYUDA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 410, -1, -1));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 100, 70));

        jLabel10.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jLabel10.setText("JUGAR");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));
        jPanel1.add(IFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 500));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_inicioActionPerformed
        Game_On jugar=new Game_On();
        jugar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_inicioActionPerformed

    private void Btn_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_cambiarActionPerformed
        Vista_Jf regresar=new Vista_Jf();
        regresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_cambiarActionPerformed

    private void btn_ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayudaActionPerformed
      Ayuda ayuda= new Ayuda();
      //this.setVisible(false);
      ayuda.setVisible(true);
    }//GEN-LAST:event_btn_ayudaActionPerformed

    private void Btn_confiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_confiActionPerformed
       Configurar configuracion=new Configurar();
       configuracion.setVisible(true);
    }//GEN-LAST:event_Btn_confiActionPerformed

    private void Btn_tiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_tiendaActionPerformed
        Tienda tienda=new Tienda();
        tienda.setVisible(true);
    }//GEN-LAST:event_Btn_tiendaActionPerformed

    private void Rd_fasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rd_fasilActionPerformed
       if(Rd_fasil.isSelected()){
           Rd_difisil.setSelected(false);
           Rd_fasil.setSelected(true);
           
       }
       
    }//GEN-LAST:event_Rd_fasilActionPerformed

    private void Rd_difisilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rd_difisilActionPerformed
        if(Rd_fasil.isSelected()){
           Rd_difisil.setSelected(true);
           Rd_fasil.setSelected(false);
           
       }
       
    }//GEN-LAST:event_Rd_difisilActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Niveles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_cambiar;
    private javax.swing.JButton Btn_confi;
    private javax.swing.JButton Btn_inicio;
    private javax.swing.JButton Btn_tienda;
    private javax.swing.JLabel IFondo;
    private javax.swing.JRadioButton Rd_difisil;
    private javax.swing.JRadioButton Rd_fasil;
    private javax.swing.JButton btn_ayuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
