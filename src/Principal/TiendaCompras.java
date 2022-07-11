
package Principal;

import javax.swing.JOptionPane;
import Funciones.Guardar;

public class TiendaCompras extends javax.swing.JPanel {
   Guardar nuevo=new Guardar();
   String habilitar="falso", habilitar2="falso", habilitar3="falso";
   Tienda Tcompras;
    public TiendaCompras(Tienda tienda) {
        initComponents();
        Tcompras=tienda;
    }

    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Ck_Login = new javax.swing.JCheckBox();
        Ck_Avatar = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        Ck_Dificultad = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel3.setText("Desbloquer Dificultad");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel4.setText("Editar Login");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("GungsuhChe", 0, 14)); // NOI18N
        jLabel5.setText("Cambiar Avatar");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        Ck_Login.setText("Off");
        Ck_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ck_LoginActionPerformed(evt);
            }
        });
        add(Ck_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        Ck_Avatar.setText("Off");
        Ck_Avatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ck_AvatarActionPerformed(evt);
            }
        });
        add(Ck_Avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inavilitado");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 110, -1));

        Ck_Dificultad.setText("Off");
        Ck_Dificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ck_DificultadActionPerformed(evt);
            }
        });
        add(Ck_Dificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Inavilitado");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 110, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Inavilitado");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void Ck_DificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ck_DificultadActionPerformed
        int n = JOptionPane.showConfirmDialog(
                  this,
                  "SE DESBLOQUEARA LA DIFICULTAD \n POR 30 MONEDAS\n"
                          + "¿DESEA DESBLOQUER ESTA FUNCION?",
                  "******",
                  JOptionPane.YES_NO_OPTION);
          if(n==0 ){
              Ck_Dificultad.setEnabled(false);
              if(Ck_Dificultad.isSelected()){
                  habilitar="verdadero";
                  nuevo.txt_Compras(habilitar, habilitar2, habilitar3);

              }
          }
    }//GEN-LAST:event_Ck_DificultadActionPerformed

    private void Ck_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ck_LoginActionPerformed
        int n = JOptionPane.showConfirmDialog(
                  this,
                  "SE DESBLOQUEARA LA DIFICULTAD \n POR 70 MONEDAS\n"
                          + "¿DESEA DESBLOQUER ESTA FUNCION?",
                  "******",
                  JOptionPane.YES_NO_OPTION);
          if(n==0 ){
              Ck_Login.setEnabled(false);
               if(Ck_Dificultad.isSelected()){
                  habilitar="verdadero";
                  nuevo.txt_Compras(habilitar, habilitar2, habilitar3);
              }
          }
    }//GEN-LAST:event_Ck_LoginActionPerformed

    private void Ck_AvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ck_AvatarActionPerformed
         int n = JOptionPane.showConfirmDialog(
                  this,
                  "SE DESBLOQUEARA LA DIFICULTAD \n POR 10 MONEDAS\n"
                          + "¿DESEA DESBLOQUER ESTA FUNCION?",
                  "******",
                  JOptionPane.YES_NO_OPTION);
          if(n==0 ){
              Ck_Avatar.setEnabled(false);
               if(Ck_Dificultad.isSelected()){
                  habilitar="verdadero";
                  nuevo.txt_Compras(habilitar, habilitar2, habilitar3);
              }
          }
    }//GEN-LAST:event_Ck_AvatarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Ck_Avatar;
    private javax.swing.JCheckBox Ck_Dificultad;
    private javax.swing.JCheckBox Ck_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
