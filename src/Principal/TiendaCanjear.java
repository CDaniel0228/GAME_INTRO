
package Principal;

import Funciones.Guardar;
import java.io.File;
import javax.swing.JOptionPane;


public class TiendaCanjear extends javax.swing.JPanel {
   
   File txt = new File("C:/GAME_ON/Usuarios.txt");
   Guardar CanjerPuntos= new Guardar();
   int moneda=0, tiempo=0, CPuntos=0;;
   Tienda canjear;
   boolean permitir=false;
   
    public TiendaCanjear(Tienda tienda) {
        initComponents();
        canjear=tienda;
        CanjerPuntos.SubirUsuario_txt("C:\\GAME_ON\\Usuarios.txt");
        CPuntos=CanjerPuntos.PuntosTotal();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        btn_CTiempo = new javax.swing.JButton();
        Rd_T1 = new javax.swing.JRadioButton();
        Rd_T2 = new javax.swing.JRadioButton();
        Rd_T3 = new javax.swing.JRadioButton();
        IFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("MingLiU_HKSCS", 1, 18)); // NOI18N
        jLabel7.setText("Tiempo");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        btn_CTiempo.setText("Comprar Tiempo");
        btn_CTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CTiempoActionPerformed(evt);
            }
        });
        add(btn_CTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        Rd_T1.setFont(new java.awt.Font("Mangal", 0, 12)); // NOI18N
        Rd_T1.setText("5 seg");
        Rd_T1.setOpaque(false);
        Rd_T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rd_T1ActionPerformed(evt);
            }
        });
        add(Rd_T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        Rd_T2.setFont(new java.awt.Font("Mangal", 0, 12)); // NOI18N
        Rd_T2.setText("10 seg");
        Rd_T2.setOpaque(false);
        Rd_T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rd_T2ActionPerformed(evt);
            }
        });
        add(Rd_T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        Rd_T3.setFont(new java.awt.Font("Mangal", 0, 12)); // NOI18N
        Rd_T3.setText("15 seg");
        Rd_T3.setOpaque(false);
        Rd_T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rd_T3ActionPerformed(evt);
            }
        });
        add(Rd_T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));
        add(IFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void Rd_T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rd_T1ActionPerformed
        if(Rd_T1.isSelected()){
           
           Rd_T2.setSelected(false);
           Rd_T3.setSelected(false);
          
          if(CPuntos>=20){
               tiempo=5;
               permitir=true;
           }else{
               tiempo=0;
               permitir=false;
           }          
        }
    }//GEN-LAST:event_Rd_T1ActionPerformed

    private void Rd_T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rd_T2ActionPerformed
       if(Rd_T2.isSelected()){
           Rd_T1.setSelected(false);
           Rd_T3.setSelected(false);             
           if(CPuntos>=35){
               tiempo=10;
               permitir=true;
           }else{
               tiempo=0;
               permitir=false;
           } 
        }
    }//GEN-LAST:event_Rd_T2ActionPerformed

    private void Rd_T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rd_T3ActionPerformed
        if(Rd_T3.isSelected()){
           Rd_T1.setSelected(false);
           Rd_T2.setSelected(false);
           
           
           if(CPuntos>=50){
               tiempo=15;
               permitir=true;
           }else{
               tiempo=0;
               permitir=false;
           } 
                     
        }
    }//GEN-LAST:event_Rd_T3ActionPerformed

    private void btn_CTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CTiempoActionPerformed
        if(permitir){
        CanjerPuntos.CanjearPuntos(tiempo);
        CanjerPuntos.txt_GuardarUsuario(txt);
        JOptionPane.showMessageDialog(this, "Su Cambio A Sido Exiostoso","Puntos", 
        JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "No Tiene Puntos Sufisientes","Puntos", 
        JOptionPane.INFORMATION_MESSAGE);
        }
 
    }//GEN-LAST:event_btn_CTiempoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IFondo;
    private javax.swing.JRadioButton Rd_T1;
    private javax.swing.JRadioButton Rd_T2;
    private javax.swing.JRadioButton Rd_T3;
    private javax.swing.JButton btn_CTiempo;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
