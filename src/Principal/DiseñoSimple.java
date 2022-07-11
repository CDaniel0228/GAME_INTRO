
package Principal;
import Diseño.Color_fondo;
import java.awt.Image;
import javax.swing.ImageIcon;

public class DiseñoSimple extends javax.swing.JPanel {

    //Color_fondo nuevo= new Color_fondo();
    private Configurar config;
    public DiseñoSimple(Configurar con) {
        initComponents();
        config=con;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("GulimChe", 1, 12)); // NOI18N
        jLabel2.setText("Cambiar Color Fondo");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 140, 30));

        jLabel1.setFont(new java.awt.Font("GulimChe", 1, 12)); // NOI18N
        jLabel1.setText("Cambiar Color Letra");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 140, 30));

        jLabel4.setFont(new java.awt.Font("GulimChe", 1, 12)); // NOI18N
        jLabel4.setText("Cambiar Diseño Letra");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 150, 30));

        jButton1.setText("Guardar Cambios");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jButton2.setText("Eliminar Cambios");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jButton3.setText("Color");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jButton6.setText("Letra");
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 95, -1, -1));

        jButton7.setText("Diseño");
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
