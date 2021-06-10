package vista;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class IU_Principal extends javax.swing.JFrame {

    public Dimension dim;

   IU_Productos opcionesModProductos ;
   IU_Usuario IU_RegistrarUsuario ;
   IU_Proveedores IU_Proveedores;
     FrmBuscarProducto IU_BuscarProducto ;
    String tipous;
    public IU_Principal() {
        initComponents();
         IU_BuscarProducto = new FrmBuscarProducto();
         opcionesModProductos = new IU_Productos();
       IU_RegistrarUsuario = new IU_Usuario();
         IU_Proveedores = new IU_Proveedores();
        dim = super.getToolkit().getScreenSize();
       super.setSize(dim);
//        super.setUndecorated(true);
        super.setVisible(true);
        //Menu_Prin_Usr.setEnabled(false);

        //super.setVisible(true);
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desk_IU_Principal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_Prin_Adm = new javax.swing.JMenu();
        Usuarios = new javax.swing.JMenuItem();
        Productos = new javax.swing.JMenuItem();
        Proveedores = new javax.swing.JMenuItem();
        Menu_Prin_Usr = new javax.swing.JMenu();
        Pta_Productos_usr_ = new javax.swing.JMenuItem();
        Pta_Listar_Horarios_ = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IU_Principal");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout Desk_IU_PrincipalLayout = new javax.swing.GroupLayout(Desk_IU_Principal);
        Desk_IU_Principal.setLayout(Desk_IU_PrincipalLayout);
        Desk_IU_PrincipalLayout.setHorizontalGroup(
            Desk_IU_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        Desk_IU_PrincipalLayout.setVerticalGroup(
            Desk_IU_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        getContentPane().add(Desk_IU_Principal);

        Menu_Prin_Adm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/administracion.png"))); // NOI18N
        Menu_Prin_Adm.setText("Administrador");

        Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/registrar usuario.png"))); // NOI18N
        Usuarios.setText("Usuarios");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        Menu_Prin_Adm.add(Usuarios);

        Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/productos.png"))); // NOI18N
        Productos.setText("Productos");
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });
        Menu_Prin_Adm.add(Productos);

        Proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/proveedores.png"))); // NOI18N
        Proveedores.setText("Proveedores");
        Proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedoresActionPerformed(evt);
            }
        });
        Menu_Prin_Adm.add(Proveedores);

        jMenuBar1.add(Menu_Prin_Adm);

        Menu_Prin_Usr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/empleado.png"))); // NOI18N
        Menu_Prin_Usr.setText("Vendedor");

        Pta_Productos_usr_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/productos.png"))); // NOI18N
        Pta_Productos_usr_.setText("Productos");
        Pta_Productos_usr_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pta_Productos_usr_ActionPerformed(evt);
            }
        });
        Menu_Prin_Usr.add(Pta_Productos_usr_);

        Pta_Listar_Horarios_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/calendario.png"))); // NOI18N
        Pta_Listar_Horarios_.setText("Listar Horarios");
        Menu_Prin_Usr.add(Pta_Listar_Horarios_);

        jMenuBar1.add(Menu_Prin_Usr);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
       
         Desk_IU_Principal.removeAll();
         Desk_IU_Principal.setVisible(false);  
         Desk_IU_Principal.setVisible(true);
         
        
        Desk_IU_Principal.add(opcionesModProductos);
        opcionesModProductos.show();
    }//GEN-LAST:event_ProductosActionPerformed

    private void Pta_Productos_usr_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pta_Productos_usr_ActionPerformed
         Desk_IU_Principal.removeAll();
         Desk_IU_Principal.setVisible(false);  
         Desk_IU_Principal.setVisible(true);
      
        Desk_IU_Principal.add(IU_BuscarProducto);
        IU_BuscarProducto.show();
    }//GEN-LAST:event_Pta_Productos_usr_ActionPerformed

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
       
         Desk_IU_Principal.removeAll();
         Desk_IU_Principal.setVisible(false);  
         Desk_IU_Principal.setVisible(true);
        Desk_IU_Principal.add(IU_RegistrarUsuario);
        IU_RegistrarUsuario.setVisible(true);
    }//GEN-LAST:event_UsuariosActionPerformed

    private void ProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedoresActionPerformed
        Desk_IU_Principal.removeAll();
         Desk_IU_Principal.setVisible(false);  
         Desk_IU_Principal.setVisible(true);
        Desk_IU_Principal.add(IU_Proveedores);
        IU_Proveedores.show();
    }//GEN-LAST:event_ProveedoresActionPerformed
public void comprobarusuario(String tipo){
  
    if (tipo.equals("Administrador")) {
          Menu_Prin_Usr.setEnabled(false);
    }else{
        Menu_Prin_Adm.setEnabled(false);
    }
     
}
    
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
            java.util.logging.Logger.getLogger(IU_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IU_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IU_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IU_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IU_Principal().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desk_IU_Principal;
    private javax.swing.JMenu Menu_Prin_Adm;
    private javax.swing.JMenu Menu_Prin_Usr;
    private javax.swing.JMenuItem Productos;
    private javax.swing.JMenuItem Proveedores;
    private javax.swing.JMenuItem Pta_Listar_Horarios_;
    private javax.swing.JMenuItem Pta_Productos_usr_;
    private javax.swing.JMenuItem Usuarios;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
