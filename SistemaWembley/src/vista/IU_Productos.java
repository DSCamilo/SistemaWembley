/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Usuario
 */
public class IU_Productos extends javax.swing.JInternalFrame {

    /**
     * Creates new form IU_Productos
     */
    public IU_Productos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desk_ModuloProductos = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        AgregarProductos_ = new javax.swing.JMenu();
        BuscarProductos_ = new javax.swing.JMenu();

        setTitle("Modulo Productos");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout Desk_ModuloProductosLayout = new javax.swing.GroupLayout(Desk_ModuloProductos);
        Desk_ModuloProductos.setLayout(Desk_ModuloProductosLayout);
        Desk_ModuloProductosLayout.setHorizontalGroup(
            Desk_ModuloProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        Desk_ModuloProductosLayout.setVerticalGroup(
            Desk_ModuloProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        getContentPane().add(Desk_ModuloProductos);

        AgregarProductos_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/registrar produc_mov prod.png"))); // NOI18N
        AgregarProductos_.setText("Agregar productos");
        AgregarProductos_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarProductos_MouseClicked(evt);
            }
        });
        AgregarProductos_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProductos_ActionPerformed(evt);
            }
        });
        jMenuBar1.add(AgregarProductos_);

        BuscarProductos_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/buscar produc mod pro.png"))); // NOI18N
        BuscarProductos_.setText("Buscar productos");
        BuscarProductos_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarProductos_MouseClicked(evt);
            }
        });
        jMenuBar1.add(BuscarProductos_);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarProductos_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProductos_ActionPerformed
        
    }//GEN-LAST:event_AgregarProductos_ActionPerformed

    private void AgregarProductos_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarProductos_MouseClicked
        FrmAgregarProducto IUAgregarProducto = new FrmAgregarProducto();
        Desk_ModuloProductos.add(IUAgregarProducto);
        IUAgregarProducto.show();
    }//GEN-LAST:event_AgregarProductos_MouseClicked

    private void BuscarProductos_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarProductos_MouseClicked
      FrmBuscarProducto IUBuscarProducto = new FrmBuscarProducto();
      Desk_ModuloProductos.add(IUBuscarProducto);
      IUBuscarProducto.show();
      
    }//GEN-LAST:event_BuscarProductos_MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AgregarProductos_;
    private javax.swing.JMenu BuscarProductos_;
    private javax.swing.JDesktopPane Desk_ModuloProductos;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
