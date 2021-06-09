/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.Control_Productos;
import control.Control_Reservas;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FrmRegistrarReserva extends javax.swing.JInternalFrame {

    Control_Reservas conectar;
    String sql;
    public FrmRegistrarReserva() {
        initComponents();
        conectar=new Control_Reservas();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txt_fechareserva = new javax.swing.JTextField();
        btn_Buscarproducto_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnombrec = new javax.swing.JTextField();
        txtdocumento = new javax.swing.JTextField();
        btn_Guardar_reserva = new javax.swing.JButton();
        btn_Cancelar_Reserva_ = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txthora = new javax.swing.JTextField();
        txtbuscar = new javax.swing.JTextField();
        btn_Cancelar_Reserva_1 = new javax.swing.JButton();
        btn_Cancelar_Reserva_2 = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Registrar reserva");

        txt_fechareserva.setText("DD-MM-AAAA");
        txt_fechareserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechareservaActionPerformed(evt);
            }
        });

        btn_Buscarproducto_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Buscarproducto_.setText("Buscar");
        btn_Buscarproducto_.setToolTipText("Registrar Usuario");
        btn_Buscarproducto_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Buscarproducto_ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Fecha reserva:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Imagenes/reservabuscar.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Datos cliente");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Documento:");

        btn_Guardar_reserva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Guardar_reserva.setText("Guardar");
        btn_Guardar_reserva.setToolTipText("Registrar Usuario");
        btn_Guardar_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Guardar_reservaActionPerformed(evt);
            }
        });

        btn_Cancelar_Reserva_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Cancelar_Reserva_.setText("Cancelar");
        btn_Cancelar_Reserva_.setToolTipText("Registrar Usuario");
        btn_Cancelar_Reserva_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cancelar_Reserva_ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ID");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Informacion solicitante");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Hora reserva");

        txthora.setText("HH-MM");
        txthora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthoraActionPerformed(evt);
            }
        });

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });

        btn_Cancelar_Reserva_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Cancelar_Reserva_1.setText("Editar");
        btn_Cancelar_Reserva_1.setToolTipText("Registrar Usuario");
        btn_Cancelar_Reserva_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cancelar_Reserva_1ActionPerformed(evt);
            }
        });

        btn_Cancelar_Reserva_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Cancelar_Reserva_2.setText("Eliminar");
        btn_Cancelar_Reserva_2.setToolTipText("Registrar Usuario");
        btn_Cancelar_Reserva_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cancelar_Reserva_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnombrec)
                                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(27, 27, 27)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6)
                                                .addComponent(txt_fechareserva, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(180, 180, 180)))
                                    .addComponent(jLabel13))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Buscarproducto_))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(139, 139, 139)
                                        .addComponent(btn_Cancelar_Reserva_1)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_Cancelar_Reserva_2))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btn_Guardar_reserva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Cancelar_Reserva_)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Buscarproducto_)
                    .addComponent(jLabel1)
                    .addComponent(txt_fechareserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(btn_Cancelar_Reserva_1)
                    .addComponent(btn_Cancelar_Reserva_2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Guardar_reserva)
                    .addComponent(btn_Cancelar_Reserva_))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fechareservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechareservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechareservaActionPerformed

    private void btn_Buscarproducto_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Buscarproducto_ActionPerformed
        conectar.conectar();

        String  id;
        String fecha;
        String hora;
        String nom;
        String doc;
        
       // int buscar=Integer.parseInt(txtbuscar.getText() );
        

        sql ="select * from reservas where documento =" + "'" +txtbuscar.getText()+ "'";

        String dato[] = conectar.consultar(sql);
        id = dato[0];
        fecha = dato[1];
        hora= dato[2];
        nom= dato[3];
        doc= dato[4];
        txtid.setText(id);
        txt_fechareserva.setText(fecha);
        txthora.setText(hora);
        txtnombrec.setText(nom);
        txtdocumento.setText(doc);
        
    
        
      
    }//GEN-LAST:event_btn_Buscarproducto_ActionPerformed

    private void btn_Guardar_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar_reservaActionPerformed
         
            conectar.conectar();
           String fecha=txt_fechareserva.getText();
           String hora=txthora.getText();
          sql="insert into reservas (fecha,hora,nombre,documento)values('"+fecha+ "','"+hora+"','"+txtnombrec.getText()+"','"+txtdocumento.getText()+"')";
          conectar.agregarproducto(sql);
      
              
            
        
        
    }//GEN-LAST:event_btn_Guardar_reservaActionPerformed

    private void btn_Cancelar_Reserva_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cancelar_Reserva_ActionPerformed
      dispose();
    }//GEN-LAST:event_btn_Cancelar_Reserva_ActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txthoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthoraActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void btn_Cancelar_Reserva_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cancelar_Reserva_1ActionPerformed
         String fecha=txt_fechareserva.getText();
           String hora=txthora.getText(); 
        sql="update reservas set fecha= '"+fecha+"',hora='"+hora+"',nombre='"+txtnombrec.getText()+"',documento='"+txtdocumento.getText()+"'where id_reserva="+"'"+txtid.getText()+"'";
       conectar.modificar(sql);
       
        System.out.println("sql="+sql);
    }//GEN-LAST:event_btn_Cancelar_Reserva_1ActionPerformed

    private void btn_Cancelar_Reserva_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cancelar_Reserva_2ActionPerformed

          conectar.conectar();      
        sql="delete from reservas where id_reserva="+"'"+txtid.getText()+"'";
        conectar.eliminar(sql);
        
    }//GEN-LAST:event_btn_Cancelar_Reserva_2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscarproducto_;
    private javax.swing.JButton btn_Cancelar_Reserva_;
    private javax.swing.JButton btn_Cancelar_Reserva_1;
    private javax.swing.JButton btn_Cancelar_Reserva_2;
    private javax.swing.JButton btn_Guardar_reserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_fechareserva;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txthora;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombrec;
    // End of variables declaration//GEN-END:variables
}
