package vista;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class IU_Principal extends javax.swing.JFrame {

    public Dimension dim;

    public void Ventana() {
        //con esto obtienes en tamano en en x y y de tu monitor

    }

    String tipous;

    public IU_Principal() {
        initComponents();
        dim = super.getToolkit().getScreenSize();
        super.setSize(dim);
//        super.setUndecorated(true);
        //super.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desk_IU_Principal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_Prin_Adm = new javax.swing.JMenu();
        Pta_Registrar_Usuario_ = new javax.swing.JMenuItem();
        Pta_Productos_adm_ = new javax.swing.JMenuItem();
        Pta_Generar_Informes_ = new javax.swing.JMenuItem();
        Pta_Proveedores = new javax.swing.JMenuItem();
        Menu_Prin_Usr = new javax.swing.JMenu();
        Pta_Productos_usr_ = new javax.swing.JMenuItem();
        Pta_Ventas_ = new javax.swing.JMenuItem();
        Pta_Registrar_Venta_usr = new javax.swing.JMenuItem();
        Pta_Registrar_reserva_ = new javax.swing.JMenuItem();

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

        Pta_Registrar_Usuario_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/registrar usuario.png"))); // NOI18N
        Pta_Registrar_Usuario_.setText("Usuarios");
        Pta_Registrar_Usuario_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pta_Registrar_Usuario_ActionPerformed(evt);
            }
        });
        Menu_Prin_Adm.add(Pta_Registrar_Usuario_);

        Pta_Productos_adm_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/productos.png"))); // NOI18N
        Pta_Productos_adm_.setText("Productos");
        Pta_Productos_adm_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pta_Productos_adm_ActionPerformed(evt);
            }
        });
        Menu_Prin_Adm.add(Pta_Productos_adm_);

        Pta_Generar_Informes_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/generarinformes.png"))); // NOI18N
        Pta_Generar_Informes_.setText("Generar informes");
        Pta_Generar_Informes_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pta_Generar_Informes_ActionPerformed(evt);
            }
        });
        Menu_Prin_Adm.add(Pta_Generar_Informes_);

        Pta_Proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/proveedores.png"))); // NOI18N
        Pta_Proveedores.setText("Proveedores");
        Pta_Proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pta_ProveedoresActionPerformed(evt);
            }
        });
        Menu_Prin_Adm.add(Pta_Proveedores);

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

        Pta_Ventas_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/ventas.png"))); // NOI18N
        Pta_Ventas_.setText("Ventas");
        Pta_Ventas_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pta_Ventas_ActionPerformed(evt);
            }
        });
        Menu_Prin_Usr.add(Pta_Ventas_);

        Pta_Registrar_Venta_usr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/punto-de-venta.png"))); // NOI18N
        Pta_Registrar_Venta_usr.setText("Registrar venta");
        Pta_Registrar_Venta_usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pta_Registrar_Venta_usrActionPerformed(evt);
            }
        });
        Menu_Prin_Usr.add(Pta_Registrar_Venta_usr);

        Pta_Registrar_reserva_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/calendario.png"))); // NOI18N
        Pta_Registrar_reserva_.setText("Reserva");
        Pta_Registrar_reserva_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pta_Registrar_reserva_ActionPerformed(evt);
            }
        });
        Menu_Prin_Usr.add(Pta_Registrar_reserva_);

        jMenuBar1.add(Menu_Prin_Usr);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pta_Productos_adm_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pta_Productos_adm_ActionPerformed
        IU_Productos opcionesModProductos = new IU_Productos();
        Desk_IU_Principal.add(opcionesModProductos);
        opcionesModProductos.show();
    }//GEN-LAST:event_Pta_Productos_adm_ActionPerformed

    private void Pta_Generar_Informes_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pta_Generar_Informes_ActionPerformed

    }//GEN-LAST:event_Pta_Generar_Informes_ActionPerformed

    private void Pta_Productos_usr_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pta_Productos_usr_ActionPerformed

        FrmBuscarProducto IU_BuscarProducto = new FrmBuscarProducto();
        Desk_IU_Principal.add(IU_BuscarProducto);
        IU_BuscarProducto.show();
    }//GEN-LAST:event_Pta_Productos_usr_ActionPerformed

    private void Pta_Registrar_Usuario_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pta_Registrar_Usuario_ActionPerformed
        IU_Usuario IU_RegistrarUsuario = new IU_Usuario();
        Desk_IU_Principal.add(IU_RegistrarUsuario);
        IU_RegistrarUsuario.setVisible(true);
    }//GEN-LAST:event_Pta_Registrar_Usuario_ActionPerformed

    private void Pta_ProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pta_ProveedoresActionPerformed
        IU_Proveedores IU_Proveedores = new IU_Proveedores();
        Desk_IU_Principal.add(IU_Proveedores);
        IU_Proveedores.show();
    }//GEN-LAST:event_Pta_ProveedoresActionPerformed

    private void Pta_Registrar_Venta_usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pta_Registrar_Venta_usrActionPerformed
        FrmRegistrarVenta IU_Registrar_Venta = new FrmRegistrarVenta();
        Desk_IU_Principal.add(IU_Registrar_Venta);
        IU_Registrar_Venta.show();


    }//GEN-LAST:event_Pta_Registrar_Venta_usrActionPerformed

    private void Pta_Ventas_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pta_Ventas_ActionPerformed
        IU_Ventas IU_Ventas = new IU_Ventas();
        Desk_IU_Principal.add(IU_Ventas);
        IU_Ventas.show();
    }//GEN-LAST:event_Pta_Ventas_ActionPerformed

    private void Pta_Registrar_reserva_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pta_Registrar_reserva_ActionPerformed
      FrmRegistrarReserva re=new FrmRegistrarReserva ();
      Desk_IU_Principal.add(re);
      re.show();
    }//GEN-LAST:event_Pta_Registrar_reserva_ActionPerformed
    public void comprobarusuario(String tipo) {

        if (tipo.equals("Administrador")) {
            Menu_Prin_Usr.setEnabled(false);
        } else {
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
    private javax.swing.JMenuItem Pta_Generar_Informes_;
    private javax.swing.JMenuItem Pta_Productos_adm_;
    private javax.swing.JMenuItem Pta_Productos_usr_;
    private javax.swing.JMenuItem Pta_Proveedores;
    private javax.swing.JMenuItem Pta_Registrar_Usuario_;
    private javax.swing.JMenuItem Pta_Registrar_Venta_usr;
    private javax.swing.JMenuItem Pta_Registrar_reserva_;
    private javax.swing.JMenuItem Pta_Ventas_;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
