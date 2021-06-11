
package vista;

import control.Control_Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class IU_AccederSistema extends javax.swing.JFrame {
        
  // PaginaPrincipal abrirVentana = new PaginaPrincipal();
   
     Control_Usuario conectar;
     String sql;
    public IU_AccederSistema() {
        initComponents();
        conectar=new Control_Usuario();
        this.setLocationRelativeTo(null); //Ubicar JFrame en el centro de nuestra pantalla
        //abrirVentana.show();
    }
    
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("vista/Imagenes/icono.png"));
        return retValue;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabelIcono = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusuarioinicio = new javax.swing.JTextField();
        btniniciarsesion = new javax.swing.JButton();
        txtpassinicio = new javax.swing.JPasswordField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 100, -1));

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/pelota-de-futbol.png"))); // NOI18N
        getContentPane().add(jLabelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 140, 150));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        txtusuarioinicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtusuarioinicio.setForeground(new java.awt.Color(204, 204, 204));
        txtusuarioinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioinicioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuarioinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, 30));

        btniniciarsesion.setBackground(new java.awt.Color(0, 204, 0));
        btniniciarsesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btniniciarsesion.setForeground(new java.awt.Color(255, 255, 255));
        btniniciarsesion.setText("Iniciar ");
        btniniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarsesionActionPerformed(evt);
            }
        });
        getContentPane().add(btniniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 90, -1));

        txtpassinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassinicioActionPerformed(evt);
            }
        });
        getContentPane().add(txtpassinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 200, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/iniciosesionfondo7.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpassinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassinicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassinicioActionPerformed

    private void btniniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarsesionActionPerformed
          String pass=String.valueOf(txtpassinicio.getPassword());
        if (pass.isEmpty()|| txtusuarioinicio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"No se puede continuar. Hay celdas vacias" );
        }else{
             conectar.conectar();
       
          sql="select *  from usuarios where usuario='"+txtusuarioinicio.getText()+"' and password='"+pass+"'";
           conectar.conectar();
            String dato[]=conectar.consultar(sql);
          String tipo=dato[1];
          conectar.iniciarsesion(sql,tipo);
     
        }
       
    }//GEN-LAST:event_btniniciarsesionActionPerformed

    private void txtusuarioinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioinicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioinicioActionPerformed

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
            java.util.logging.Logger.getLogger(IU_AccederSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IU_AccederSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IU_AccederSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IU_AccederSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IU_AccederSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btniniciarsesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JPasswordField txtpassinicio;
    private javax.swing.JTextField txtusuarioinicio;
    // End of variables declaration//GEN-END:variables
}
