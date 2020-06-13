
package com.idesi.proyecto;

import javax.swing.JOptionPane;

public class BuscarControlPer extends javax.swing.JFrame {
    
    ControlPersonal persona[] = new ControlPersonal[5];
    ControlPer vtnControlPer;
    int posArr;
    int actual = 0;
    int posBusqueda;
    int modificar = 0;
    
    

   
    public BuscarControlPer() {
        initComponents();
    }
    
    public BuscarControlPer(ControlPer vtnControlPer, ControlPersonal[] persona){
        this.vtnControlPer = vtnControlPer;
        this.persona = persona;
    }
    
    public void limpiar_cajas(){
        txtNombre.setText("");
        txtEdad.setText("");
        txtRFC.setText("");
        txtCodigo.setText("");
        txtTipo.setText("");
        txtSalario.setText("");
    }

    /*public Buscar(ControlPer vtnControlPer , ControlPersonal persona[]){
        this.vtnControlPer = vtnControlPer;
        this.persona = persona;
        initComponents();
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIngresar = new javax.swing.JLabel();
        txtBuscado = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        lblRFC = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniRegresar1 = new javax.swing.JMenuItem();
        mniAyuda = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIngresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIngresar.setText("Ingrese el Codigo:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        lblEdad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEdad.setText("Edad:");

        lblRFC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRFC.setText("RFC:");

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setText("Codigo:");

        lblTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipo.setText("Tipo Empleado:");

        lblSalario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSalario.setText("Salario:");

        jMenu1.setText("File");

        mniRegresar1.setText("Regresar a Control Personal");
        mniRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRegresar1ActionPerformed(evt);
            }
        });
        jMenu1.add(mniRegresar1);

        mniAyuda.setText("Ayuda");
        mniAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAyudaActionPerformed(evt);
            }
        });
        jMenu1.add(mniAyuda);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addComponent(txtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSalario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblCodigo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCodigo))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEdad)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtEdad))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblRFC)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngresar)
                    .addComponent(txtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRFC)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalario)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
            if (!(txtBuscado.getText()).equals("")) {
            String productoBuscada = txtBuscado.getText();
            for (int i = 0; i < posArr; i++) {
                
               
                
                    if ((persona[i].getCodigo()).equalsIgnoreCase(productoBuscada)) {
                        posBusqueda = i;
                        break;
                    
                    }
                
                } 
            
            
            txtBuscado.setText("");

            if (posBusqueda < 5) {
                txtNombre.setText(persona[posBusqueda].getCodigo());
                txtTipo.setText(persona[posBusqueda].gettipoEmpleado());
                txtEdad.setText(persona[posBusqueda].getEdad());
                txtRFC.setText(persona[posBusqueda].getRFC());
                txtCodigo.setText(persona[posBusqueda].getCodigo());
                modificar = posBusqueda;
                posBusqueda = 5;
            } else {
                JOptionPane.showMessageDialog(this, "Nombre no encontrado");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Casilla en blanco");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void mniAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAyudaActionPerformed
        JOptionPane.showMessageDialog(this, "La busqueda del empleado es por codigo");
    }//GEN-LAST:event_mniAyudaActionPerformed

    private void mniRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRegresar1ActionPerformed
        this.setVisible(false);
        vtnControlPer.setVisible(true);
        limpiar_cajas();
    }//GEN-LAST:event_mniRegresar1ActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarControlPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarControlPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarControlPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarControlPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarControlPer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblIngresar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JMenuItem mniAyuda;
    private javax.swing.JMenuItem mniRegresar1;
    private javax.swing.JTextField txtBuscado;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
