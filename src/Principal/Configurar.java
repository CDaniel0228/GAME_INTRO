
package Principal;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Configurar extends javax.swing.JFrame {

    DiseñoSimple nuevo = new DiseñoSimple();
    DiseñoImage nuevo2 = new DiseñoImage();
    DiseñoAvatar nuevo3 = new DiseñoAvatar();
    ImageIcon I_fondo=new javax.swing.ImageIcon(getClass().getResource("/Src//Fondo10.jpeg"));
    public Configurar() {
        initComponents();
        this.setLocationRelativeTo(null);
        IFondo.setIcon(new ImageIcon(I_fondo.getImage().getScaledInstance(400, 310, Image.SCALE_SMOOTH)));
        nuevo.setOpaque(false);
        Escritorio.add(nuevo);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Lb_Color3 = new javax.swing.JLabel();
        Lb_Color2 = new javax.swing.JLabel();
        Lb_Color = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Escritorio = new javax.swing.JPanel();
        IFondo = new javax.swing.JLabel();

        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lb_Color3.setBackground(new java.awt.Color(0, 0, 153));
        Lb_Color3.setForeground(new java.awt.Color(255, 255, 255));
        Lb_Color3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 51, 255), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 51, 51)));
        Lb_Color3.setOpaque(true);
        jPanel1.add(Lb_Color3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 16, 48, 8));

        Lb_Color2.setBackground(new java.awt.Color(204, 0, 0));
        Lb_Color2.setForeground(new java.awt.Color(255, 255, 255));
        Lb_Color2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 51, 255), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 51, 51)));
        Lb_Color2.setOpaque(true);
        jPanel1.add(Lb_Color2, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 16, 48, 8));

        Lb_Color.setBackground(new java.awt.Color(255, 255, 0));
        Lb_Color.setForeground(new java.awt.Color(255, 255, 255));
        Lb_Color.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 51, 255), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 51, 51)));
        Lb_Color.setOpaque(true);
        jPanel1.add(Lb_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 16, 48, 8));

        Menu.setOpaque(false);
        Menu.setLayout(new java.awt.GridLayout(1, 3));

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Diseño");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Menu.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Imagen");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        Menu.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Personage");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        Menu.add(jLabel3);

        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 20));

        Escritorio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 153, 0), new java.awt.Color(0, 0, 102), new java.awt.Color(153, 0, 0)));
        Escritorio.setOpaque(false);
        jPanel1.add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, 400, 280));
        jPanel1.add(IFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 310));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Lb_Color.setBackground(new Color(255,255,0));
        Lb_Color2.setBackground(new Color(204,0,0));
        Lb_Color3.setBackground(new Color(0,0,153));
        
        nuevo.setVisible(true);
        nuevo2.setVisible(false);
        nuevo3.setVisible(false);
        
        Escritorio.add(nuevo);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Lb_Color.setBackground(new Color(204,204,0));
        Lb_Color2.setBackground(new Color(255,0,0));
        Lb_Color3.setBackground(new Color(0,0,153));
        
        nuevo.setVisible(false);
        nuevo2.setVisible(true);
        nuevo3.setVisible(false);
        
        Escritorio.add(nuevo2);
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Lb_Color.setBackground(new Color(204,204,0));
        Lb_Color2.setBackground(new Color(204,0,0));
        Lb_Color3.setBackground(new Color(0,0,255));
        
        nuevo.setVisible(false);
        nuevo2.setVisible(false);
        nuevo3.setVisible(true);
        
        Escritorio.add(nuevo3);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Configurar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configurar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configurar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configurar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configurar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Escritorio;
    private javax.swing.JLabel IFondo;
    private javax.swing.JLabel Lb_Color;
    private javax.swing.JLabel Lb_Color2;
    private javax.swing.JLabel Lb_Color3;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
