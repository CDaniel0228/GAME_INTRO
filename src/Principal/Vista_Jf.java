
package Principal;


import Funciones.Guardar;
import Funciones.Usuarios;
import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import Diseño.Import_Image;



public class Vista_Jf extends javax.swing.JFrame {

    String foto="";
    Guardar nuevo=new Guardar();
    Import_Image imagenes=new Import_Image();
    ImageIcon aux_Image=new ImageIcon();

     ImageIcon error=new javax.swing.ImageIcon(getClass().getResource("/Src//error.png"));
   
    public Vista_Jf() {
        initComponents();
        this.setLocationRelativeTo(null);
        nuevo.subir("C:\\GAME_ON\\Usuarios.txt");
        Campo_1.setVisible(false);
        Campo_2.setVisible(false);
        error_1.setVisible(false);
        error_2.setVisible(false);
        
        aux_Image = imagenes.Avatar(); 
        Foto.setIcon(new ImageIcon(aux_Image.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
        
        error_1.setIcon(new ImageIcon(error.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        error_2.setIcon(new ImageIcon(error.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Foto = new javax.swing.JLabel();
        Txt_contraseña = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btn_nuevo = new javax.swing.JButton();
        Inicio = new javax.swing.JButton();
        Txt_jugador = new javax.swing.JTextField();
        error_1 = new javax.swing.JLabel();
        error_2 = new javax.swing.JLabel();
        Campo_1 = new javax.swing.JLabel();
        Campo_2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Foto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 102), new java.awt.Color(255, 102, 51), new java.awt.Color(0, 0, 0)));
        Foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FotoMouseClicked(evt);
            }
        });
        jPanel1.add(Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 80, 130, 130));

        Txt_contraseña.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        Txt_contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_contraseña.setAutoscrolls(false);
        Txt_contraseña.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(0, 102, 102)));
        Txt_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Txt_contraseñaKeyReleased(evt);
            }
        });
        jPanel1.add(Txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 130, 30));

        jLabel1.setFont(new java.awt.Font("Vrinda", 1, 11)); // NOI18N
        jLabel1.setText("JUGADOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Vrinda", 1, 11)); // NOI18N
        jLabel2.setText("CONTRASEÑA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        Btn_nuevo.setBackground(new java.awt.Color(255, 255, 255));
        Btn_nuevo.setFont(new java.awt.Font("Vrinda", 1, 11)); // NOI18N
        Btn_nuevo.setText("Nuevo");
        Btn_nuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 255), new java.awt.Color(204, 204, 204)));
        Btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 80, 30));

        Inicio.setText("Comenzar");
        Inicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 153, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(153, 255, 153)));
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        jPanel1.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 90, 30));

        Txt_jugador.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        Txt_jugador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_jugador.setAutoscrolls(false);
        Txt_jugador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(0, 102, 102)));
        Txt_jugador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Txt_jugadorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_jugadorKeyTyped(evt);
            }
        });
        jPanel1.add(Txt_jugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 190, 30));

        error_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                error_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                error_1MouseExited(evt);
            }
        });
        jPanel1.add(error_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 255, 20, 20));

        error_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                error_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                error_2MouseExited(evt);
            }
        });
        jPanel1.add(error_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 335, 20, 20));

        Campo_1.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        Campo_1.setText("Campo Basio");
        jPanel1.add(Campo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, 30));

        Campo_2.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        Campo_2.setText("Campo Basio");
        jPanel1.add(Campo_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_nuevoActionPerformed
        
        Usuarios jugador=new Usuarios();
        File carpeta = new File("C:/GAME_ON");
        File txt = new File("C:/GAME_ON/Usuarios.txt");
        
        if(Txt_jugador.getText().isEmpty() || Txt_contraseña.getText().isEmpty()){
          error_1.setVisible(true);
          error_2.setVisible(true);
            
           // Txt_jugador
        }else{
            if(foto.isEmpty()){
                foto=aux_Image.toString();
            }
            
       
       aux_Image = imagenes.Avatar();
       Foto.setIcon(new ImageIcon(aux_Image.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
       
        jugador.setNombre(Txt_jugador.getText());
        jugador.setContraseña(Txt_contraseña.getText());
        jugador.setFoto(foto);
        nuevo.Agregar(jugador, Txt_jugador.getText());
        
        nuevo.carpeta(carpeta);
        nuevo.txt_Guardar(txt,Txt_jugador.getText() );
        foto="";
        
          error_1.setVisible(false);
          error_2.setVisible(false);
          Txt_jugador.setText("");
          Txt_contraseña.setText("");
          
        }        
               
       
    }//GEN-LAST:event_Btn_nuevoActionPerformed

    private void FotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FotoMouseClicked
        JFileChooser jt=new JFileChooser();
        jt.setDialogTitle("Foto");
        if(jt.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            rsscalelabel.RSScaleLabel.setScaleLabel(Foto, jt.getSelectedFile().toString());
            foto=jt.getSelectedFile().toString();
            
        }
    }//GEN-LAST:event_FotoMouseClicked

    private void Txt_contraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_contraseñaKeyReleased
       if(Txt_contraseña.getText().isEmpty()){
           error_2.setVisible(true);
       }else{
           error_2.setVisible(false);
       }
        
    }//GEN-LAST:event_Txt_contraseñaKeyReleased

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        
        if(nuevo.Buscar_U(Txt_jugador.getText(), Txt_contraseña.getText())){
            JOptionPane.showMessageDialog(null, "Usuario_Encontrado");
            Niveles nv=new Niveles();
            nv.setVisible(true);
            this.setVisible(false);
            
        }else{
            JOptionPane.showMessageDialog(null, "Usuario_No_Encontrado");
        } 
    }//GEN-LAST:event_InicioActionPerformed

    private void Txt_jugadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_jugadorKeyReleased
        String aux=nuevo.Buscar_Image(Txt_jugador.getText());
       if(!aux.isEmpty()){
           
           String basio=aux;
           basio=basio.replace("file:/", "");
           aux=aux.replace("\\", "/");
        
        ImageIcon ms=new ImageIcon(aux);
        ImageIcon mss=new ImageIcon(basio);
        
        Foto.setIcon(new ImageIcon(ms.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
        Foto.setIcon(new ImageIcon(mss.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
       }else{
          Foto.setIcon(new ImageIcon(aux_Image.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
       }
       
      if(Txt_jugador.getText().isEmpty()){
        error_1.setVisible(true);
      }else{
        error_1.setVisible(false);
      }
            
    }//GEN-LAST:event_Txt_jugadorKeyReleased

    private void Txt_jugadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_jugadorKeyTyped
        char vl =evt.getKeyChar();
     if(Character.isDigit(vl)){
        getToolkit().beep();
        evt.consume();
         
        //JOptionPane.showMessageDialog(null, "Algo Anda Mal :[  ");
        
     }
    }//GEN-LAST:event_Txt_jugadorKeyTyped

    private void error_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_error_1MouseEntered
        Campo_1.setVisible(true);
    }//GEN-LAST:event_error_1MouseEntered

    private void error_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_error_1MouseExited
        Campo_1.setVisible(false);
    }//GEN-LAST:event_error_1MouseExited

    private void error_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_error_2MouseEntered
        Campo_2.setVisible(true);
    }//GEN-LAST:event_error_2MouseEntered

    private void error_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_error_2MouseExited
        Campo_2.setVisible(false);
    }//GEN-LAST:event_error_2MouseExited

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Jf().setVisible(true);
                 
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Vista_Jf.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_nuevo;
    private javax.swing.JLabel Campo_1;
    private javax.swing.JLabel Campo_2;
    private javax.swing.JLabel Foto;
    private javax.swing.JButton Inicio;
    private javax.swing.JTextField Txt_contraseña;
    private javax.swing.JTextField Txt_jugador;
    private javax.swing.JLabel error_1;
    private javax.swing.JLabel error_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
