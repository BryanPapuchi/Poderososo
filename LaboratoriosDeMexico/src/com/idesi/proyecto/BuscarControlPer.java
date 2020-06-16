
package com.idesi.proyecto;

import javax.swing.JOptionPane;

public class BuscarControlPer extends javax.swing.JFrame {
    
    Empleado Empleados[] = new Empleado[5];
    ControlPer vtnControlPer;
    int posArr;
    int actual = 0;
    int posBusqueda;
    int modificar = 0;
    
    

   
    public BuscarControlPer() {
        initComponents();
    }
    
    public BuscarControlPer(ControlPer vtnControlPer, Empleado[] Empleados){
        this.vtnControlPer = vtnControlPer;
        this.Empleados = Empleados;
        initComponents();
    }
    
    public void limpiar_cajas(){
        txtNombre.setText("");
        txtEdad.setText("");
        txtRFC.setText("");
        txtCodigo.setText("");
        txtTipo.setText("");
        txtSalario.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
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
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        mniRegresar = new javax.swing.JMenuItem();
        mniAyuda = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mniLimpiar = new javax.swing.JMenuItem();
        mnchHabilitar = new javax.swing.JCheckBoxMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIngresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIngresar.setText("Ingrese el Codigo:");

        btnBuscar.setBackground(new java.awt.Color(0, 0, 204));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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

        jMenu4.setText("Archivo");

        mniRegresar.setText("Regresar a Control Personal");
        mniRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRegresarActionPerformed(evt);
            }
        });
        jMenu4.add(mniRegresar);

        mniAyuda.setText("Ayuda");
        mniAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAyudaActionPerformed(evt);
            }
        });
        jMenu4.add(mniAyuda);

        jMenuBar3.add(jMenu4);

        jMenu5.setText("Edicion");

        mniLimpiar.setText("Limpiar Cajas");
        mniLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLimpiarActionPerformed(evt);
            }
        });
        jMenu5.add(mniLimpiar);

        mnchHabilitar.setSelected(true);
        mnchHabilitar.setText("Habilitar Cajas");
        mnchHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnchHabilitarActionPerformed(evt);
            }
        });
        jMenu5.add(mnchHabilitar);

        jMenuBar3.add(jMenu5);

        setJMenuBar(jMenuBar3);

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
                        .addComponent(txtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTipo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSalario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRFC)
                                .addGap(30, 30, 30)
                                .addComponent(txtRFC))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEdad)
                                .addGap(23, 23, 23)
                                .addComponent(txtEdad))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngresar)
                    .addComponent(txtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
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
                
                    if ((Empleados[i].getCodigo()).equalsIgnoreCase(productoBuscada)) {
                        posBusqueda = i;
                        break;
                    }
                }
            
            txtBuscado.setText("");

            if (posBusqueda < 5) {
                txtNombre.setText(Empleados[posBusqueda].getNombre());
                txtTipo.setText(Empleados[posBusqueda].gettipoEmpleado());
                txtEdad.setText(Empleados[posBusqueda].getEdad());
                txtRFC.setText(Empleados[posBusqueda].getRFC());
                txtCodigo.setText(Empleados[posBusqueda].getCodigo());
                modificar = posBusqueda;
                posBusqueda = 5;
            } else {
                JOptionPane.showMessageDialog(this, "Nombre no encontrado");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Casilla en blanco");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void mniRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRegresarActionPerformed
        this.setVisible(false);
        vtnControlPer.setVisible(true);
        limpiar_cajas();
    }//GEN-LAST:event_mniRegresarActionPerformed

    private void mniAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAyudaActionPerformed
        JOptionPane.showMessageDialog(this, "La busqueda del empleado es por codigo");
    }//GEN-LAST:event_mniAyudaActionPerformed

    private void mnchHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnchHabilitarActionPerformed
        if(mnchHabilitar.isSelected()){
            txtBuscado.setEnabled(true);
            txtNombre.setEnabled(true);
            txtEdad.setEnabled(true);
            txtRFC.setEnabled(true);
            txtCodigo.setEnabled(true);
            txtTipo.setEnabled(true);
            txtSalario.setEnabled(true);
        }else{
            txtBuscado.setEnabled(false);
            txtNombre.setEnabled(false);
            txtEdad.setEnabled(false);
            txtRFC.setEnabled(false);
            txtCodigo.setEnabled(false);
            txtTipo.setEnabled(false);
            txtSalario.setEnabled(false);
        }
    }//GEN-LAST:event_mnchHabilitarActionPerformed

    private void mniLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLimpiarActionPerformed
        limpiar_cajas();
    }//GEN-LAST:event_mniLimpiarActionPerformed

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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblIngresar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JCheckBoxMenuItem mnchHabilitar;
    private javax.swing.JMenuItem mniAyuda;
    private javax.swing.JMenuItem mniLimpiar;
    private javax.swing.JMenuItem mniRegresar;
    private javax.swing.JTextField txtBuscado;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
