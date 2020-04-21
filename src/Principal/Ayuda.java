
package Principal;

import java.awt.Image;
import javax.swing.ImageIcon;
import Diseño.Import_Image;

public class Ayuda extends javax.swing.JFrame {
    Import_Image nueva=new Import_Image();
    ImageIcon Image_lb=new javax.swing.ImageIcon(getClass().getResource("/Src//Tienda.jpg"));
    ImageIcon I_fondo=new javax.swing.ImageIcon(getClass().getResource("/Src//Fondo3.jpg"));
    
    public Ayuda() {
        initComponents();
        this.setLocationRelativeTo(null);
        
         Lb_boton.setIcon(new ImageIcon(Image_lb.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH)));
         IFondo.setIcon(new ImageIcon(I_fondo.getImage().getScaledInstance(410, 190, Image.SCALE_SMOOTH)));
         
         btn_Anterior.setIcon(new ImageIcon(nueva.Botones3().getImage().getScaledInstance(70, 40, Image.SCALE_SMOOTH)));
         btn_Siguiente.setIcon(new ImageIcon(nueva.Botones3().getImage().getScaledInstance(70, 40, Image.SCALE_SMOOTH)));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        Lb_boton = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Area = new javax.swing.JTextArea();
        btn_Siguiente = new javax.swing.JButton();
        btn_Anterior = new javax.swing.JButton();
        IFondo = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lb_boton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 0, 0), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 0, 51), new java.awt.Color(255, 255, 102)));
        jPanel1.add(Lb_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 90, 90));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.setRequestFocusEnabled(false);
        jScrollPane1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setWheelScrollingEnabled(false);

        txt_Area.setLineWrap(true);
        txt_Area.setRows(10);
        txt_Area.setWrapStyleWord(true);
        txt_Area.setAutoscrolls(false);
        txt_Area.setFocusable(false);
        txt_Area.setOpaque(false);
        jScrollPane1.setViewportView(txt_Area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 105, 230, 80));

        btn_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 70, 40));

        btn_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 40));

        IFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(IFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 190));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SiguienteActionPerformed
        Lb_boton.setIcon(new ImageIcon(nueva.ImageB(true).getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btn_SiguienteActionPerformed

    private void btn_AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnteriorActionPerformed
         Lb_boton.setIcon(new ImageIcon(nueva.ImageB(false).getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btn_AnteriorActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ayuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IFondo;
    private javax.swing.JLabel Lb_boton;
    private javax.swing.JButton btn_Anterior;
    private javax.swing.JButton btn_Siguiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_Area;
    // End of variables declaration//GEN-END:variables
}
