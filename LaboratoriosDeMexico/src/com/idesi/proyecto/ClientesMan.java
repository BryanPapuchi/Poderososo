
package com.idesi.proyecto;

import javax.swing.JOptionPane;

public class ClientesMan extends javax.swing.JFrame {

    Clientes clientes[] = new Clientes[5];
    Citas citas[] = new Citas[5];
    Clientes clientes1 = new Clientes();
    
    int posArr = 0;
    int posBusqueda = 0;
    int actual = 0;
    int modificar = 0;

    
    RegistrarCitas vtnRegCit = null;
    ClientesMostrar vtnCliMos = null;
    Principal vtnPrincipal;
    
    public ClientesMan() {
        initComponents();
    }
    
    public ClientesMan( Principal vtnPrincipal , Clientes clientes1) {
        this.clientes1 = clientes1;
        this.vtnPrincipal = vtnPrincipal;
        initComponents();
    }

    private void limpiar_cajas() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtDom.setText("");
        txtEdad.setText("");
    }
    
    private void limpiar_cajas1() {
        txtCodigo1.setText("");
        txtNombre1.setText("");
        txtDom1.setText("");
        txtEdad1.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtDom = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBuscado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        txtEdad1 = new javax.swing.JTextField();
        txtCodigo1 = new javax.swing.JTextField();
        txtDom1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        ckbModificar = new javax.swing.JCheckBox();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniregresarMenu = new javax.swing.JMenuItem();
        mniAyuda = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniListCli = new javax.swing.JMenuItem();
        mniEstab = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manejo de Clientes");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Registro de clientes");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Edad:");

        jLabel6.setText("Domicilio:");

        jLabel7.setText("Codigo:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Acciones");

        jLabel9.setText("Buscar cliente:");

        jLabel10.setText("Edad:");

        jLabel11.setText("Nombre:");

        jLabel12.setText("Domicilio:");

        jLabel13.setText("Codigo:");

        txtNombre1.setEnabled(false);

        txtEdad1.setEnabled(false);

        txtCodigo1.setEnabled(false);

        txtDom1.setEnabled(false);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        ckbModificar.setText("Modificar Cliente");
        ckbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbModificarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar cliente");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        mniregresarMenu.setText("Regresar al menu");
        mniregresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniregresarMenuActionPerformed(evt);
            }
        });
        jMenu1.add(mniregresarMenu);

        mniAyuda.setText("Ayuda");
        mniAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAyudaActionPerformed(evt);
            }
        });
        jMenu1.add(mniAyuda);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mniListCli.setText("Lista de Clientes");
        mniListCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListCliActionPerformed(evt);
            }
        });
        jMenu2.add(mniListCli);

        mniEstab.setText("Establecer una cita");
        mniEstab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEstabActionPerformed(evt);
            }
        });
        jMenu2.add(mniEstab);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(35, 35, 35)
                                .addComponent(txtEdad))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDom))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(24, 24, 24)
                                .addComponent(txtCodigo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 42, Short.MAX_VALUE))
                                    .addComponent(txtNombre)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(63, 63, 63)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel8)
                        .addGap(142, 142, 142))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDom1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ckbModificar)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnModificar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnEliminar))
                                            .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnBuscar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBuscado)))
                                .addGap(43, 43, 43))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(ckbModificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtDom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if (posArr < clientes.length) {
            
            if ((!(txtNombre.getText()).equals(""))
                && !((txtDom.getText()).equals(""))
                && !((txtCodigo.getText()).equals(""))
                && !((txtEdad.getText()).equals(""))) {
                
                if (txtEdad.getText().matches("[0-9]+")) {
                    clientes[posArr] = new Clientes();
                    clientes[posArr].setNombre(txtNombre.getText());
                    clientes[posArr].setEdad(Double.parseDouble(txtEdad.getText()));
                    clientes[posArr].setDomicilio(txtDom.getText());
                    clientes[posArr].setCodigo(txtCodigo.getText());
                    posArr++;
                } else {                  
                        JOptionPane.showMessageDialog(this, "Formato de edad invalido.");                }
            
            } else {
                JOptionPane.showMessageDialog(this, "No se puede guardar, espacios sin llenar.");
            }
            
        } else {
            
             JOptionPane.showMessageDialog(this, "El almacenamiento esta completo.");
        }
        
        limpiar_cajas();
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        if (!(txtBuscado.getText()).equals("")) {
            String productoBuscada = txtBuscado.getText();
            for (int i = 0; i < posArr; i++) {
                
                if (ckbModificar.isSelected()) {
                
                    if ((clientes[i].getCodigo()).equalsIgnoreCase(productoBuscada)) {
                        posBusqueda = i;
                        break;
                    
                    }
                
                } else if ((clientes[i].getNombre()).equalsIgnoreCase(productoBuscada) ) {
                    posBusqueda = i;
                    break;
                }
            }
            
            txtBuscado.setText("");

            if (posBusqueda < 5) {
                txtNombre1.setText(clientes[posBusqueda].getNombre());
                txtEdad1.setText(String.valueOf(clientes[posBusqueda].getEdad()));
                txtDom1.setText(clientes[posBusqueda].getDomicilio());
                txtCodigo1.setText(clientes[posBusqueda].getCodigo());
                modificar = posBusqueda;
                posBusqueda = 5;
            } else {
                JOptionPane.showMessageDialog(this, "Nombre no encontrado");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Casilla en blanco");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void ckbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbModificarActionPerformed
       
         if (ckbModificar.isSelected()) {
                
                limpiar_cajas1();
                btnModificar.setEnabled(true);
                btnEliminar.setEnabled(true);
                txtNombre1.setEnabled(true);
                txtEdad1.setEnabled(true);
                txtDom1.setEnabled(true);
                txtCodigo1.setEnabled(true);
                
            } else {
                 
                btnModificar.setEnabled(false);
                btnEliminar.setEnabled(false);
                txtNombre1.setEnabled(false);
                txtEdad1.setEnabled(false);
                txtDom1.setEnabled(false);
                txtCodigo1.setEnabled(false);
            
         }
         
    }//GEN-LAST:event_ckbModificarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
       //clientes[modificar].setEdad(Double.toString());
        
        if (!((txtNombre1.getText()).equals(""))
                && !((txtDom1.getText()).equals(""))
                && !(txtCodigo1.getText()).equals("")
                && !(txtEdad1.getText()).equals("")) {
            
            clientes[modificar].setNombre(txtNombre1.getText());
            clientes[modificar].setEdad(Double.parseDouble(txtEdad1.getText()));
            clientes[modificar].setDomicilio(txtDom1.getText());
            clientes[modificar].setCodigo(txtCodigo1.getText());
            
            
            limpiar_cajas1();
            
            JOptionPane.showMessageDialog(this, "Elemento guardado con exito.");
            posBusqueda = 5;
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void mniListCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListCliActionPerformed

    if(posArr != 0) {
        
     
        if (vtnCliMos == null) {
            vtnCliMos = new ClientesMostrar(this, clientes);
        }

        vtnCliMos.posArr = posArr;
        vtnCliMos.actual = 0;
        vtnCliMos.cargar_datos(vtnCliMos.actual);
        
        vtnCliMos.setVisible(true);
        this.setVisible(false);
        limpiar_cajas1();
    } else {
        JOptionPane.showMessageDialog(this,"No hay clentes registrados");
    }
    }//GEN-LAST:event_mniListCliActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
         for (int i = posBusqueda; i < posArr; i++) {
           if (i < (clientes.length-1)) {
                clientes[i] = clientes[i + 1];
            }
        }
        
        --posArr;
            
            
        JOptionPane.showMessageDialog(this, "Elemento eliminado");
        limpiar_cajas1();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void mniEstabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEstabActionPerformed
         
        if (vtnRegCit == null) {
            vtnRegCit = new RegistrarCitas(this, citas);
        }

        vtnRegCit.setVisible(true);
        this.setVisible(false);
        limpiar_cajas1();
    
    }//GEN-LAST:event_mniEstabActionPerformed

    private void mniregresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniregresarMenuActionPerformed
       
        this.setVisible(false);
        vtnPrincipal.setVisible(true);
        limpiar_cajas();
        
    }//GEN-LAST:event_mniregresarMenuActionPerformed

    private void mniAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAyudaActionPerformed
       
        JOptionPane.showMessageDialog(this,"Para buscar un cliente es por Nombre. \n" + "Para editar un cliente, se busca por codigo.");
    }//GEN-LAST:event_mniAyudaActionPerformed

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
            java.util.logging.Logger.getLogger(ClientesMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesMan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JCheckBox ckbModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniAyuda;
    private javax.swing.JMenuItem mniEstab;
    private javax.swing.JMenuItem mniListCli;
    private javax.swing.JMenuItem mniregresarMenu;
    private javax.swing.JTextField txtBuscado;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtDom;
    private javax.swing.JTextField txtDom1;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEdad1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    // End of variables declaration//GEN-END:variables
}
