
package Principal;

import Diseño.CTabla;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

public class Puntos extends javax.swing.JFrame {

    DefaultTableModel dtm;
    Object[] objetos = new Object[3];
    int filaSeleccionada = -1;
    
    public Puntos() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        dtm = (DefaultTableModel) Tabla.getModel();
        Tabla.setDefaultRenderer(Object.class, new CTabla());
        Tabla.setBackground(Color.white);
        Tabla.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        
        Añadir();
    }
    
    private void Añadir(){
        objetos[0] = 2;
        objetos[1] = 3;
        objetos[2] = 4;
        dtm.addRow(objetos);
        
        for (int i = 0; i < objetos.length; i++) {
            objetos[i] = "";
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ScrollTablal = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        IFondo = new javax.swing.JLabel();

        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "          Aciertos", "           Fallos", "            Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Tabla.setOpaque(false);
        Tabla.setShowHorizontalLines(false);
        Tabla.setShowVerticalLines(false);
        ScrollTablal.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setResizable(false);
            Tabla.getColumnModel().getColumn(1).setResizable(false);
            Tabla.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(ScrollTablal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 280));
        jPanel1.add(IFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
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
            java.util.logging.Logger.getLogger(Puntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Puntos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IFondo;
    private javax.swing.JScrollPane ScrollTablal;
    private javax.swing.JTable Tabla;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
