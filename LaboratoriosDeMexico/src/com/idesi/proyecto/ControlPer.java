
package com.idesi.proyecto;

import javax.swing.JOptionPane;


public class ControlPer extends javax.swing.JFrame {
    
    Empleado Empleados[] = new Empleado[5];
    Empleado Empleados1 = new Empleado();
    int posArr = 0;
    Principal vtnPrincipal;
    BuscarControlPer vtnBuscarControlPer;
    ModidicarPer vtnModidicarPer;
    EliminarPer vtnEliminarPer;
    boolean salario = false;
    
    public ControlPer() {
        initComponents();
    }
    
    public ControlPer(Principal vtnPrincipal, Empleado persona1){
        this.vtnPrincipal = vtnPrincipal;
        this.Empleados1 = persona1;
        initComponents();
    }
    
    public void limpiar_cajas(){
        txtNombre.setText("");
        txtEdad.setText("");
        txtRFC.setText("");
        txtCodigo.setText("");
    }
    
    public void Cargar_Datos(int actual){
        txtNombre.setText(Empleados[actual].getNombre());
        txtRFC.setText(Empleados[actual].getRFC());
        txtEdad.setText(Empleados[actual].getEdad());
        txtCodigo.setText(Empleados[actual].getCodigo());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblRFC = new javax.swing.JLabel();
        lblCodigoP = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtAlmacen = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        menuControl = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        miRegresar = new javax.swing.JMenuItem();
        jmEdicion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Control de Personal");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        lblEdad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEdad.setText("Edad:");

        lblRFC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRFC.setText("RFC:");

        lblCodigoP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigoP.setText("Codigo del Empleado:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tipo de Empleado:");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativos", "Laboratoristas" }));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 255));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(102, 255, 204));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar Empleado");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Personas Almacenadas:");

        txtAlmacen.setText("0");

        btnModificar.setBackground(new java.awt.Color(102, 255, 204));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setText("Modificar ");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(102, 255, 204));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jmArchivo.setText("Archivo");

        miRegresar.setText("Regresar");
        miRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegresarActionPerformed(evt);
            }
        });
        jmArchivo.add(miRegresar);

        menuControl.add(jmArchivo);

        jmEdicion.setText("Edicion");
        menuControl.add(jmEdicion);

        setJMenuBar(menuControl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(229, 229, 229))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel1)
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(lblCodigoP)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNombre)
                                        .addComponent(lblEdad, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblRFC, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(txtEdad)
                                    .addComponent(txtRFC)
                                    .addComponent(txtCodigo)
                                    .addComponent(cmbTipo, 0, 160, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(txtAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addGap(31, 31, 31))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addGap(27, 27, 27)
                        .addComponent(btnEliminar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdad)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRFC)
                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoP)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            /*if (posArr < persona.length) {
            
            if ((!(txtCodigo.getText()).equals(""))
                && !((txtNombre.getText()).equals(""))
                && !((txtEdad.getText()).equals(""))
                && !((txtRFC.getText()).equals(""))
                && !((txtCodigo.getText()).equals(""))){
                
              if(cmbTipo.getSelectedItem().toString() == "Laboratoristas"){
                persona[posArr] = new ControlPersonal();
                persona[posArr].setCodigo(txtCodigo.getText());
                persona[posArr].setRFC(txtRFC.getText());
                persona[posArr].setEdad(txtEdad.getText());
                persona[posArr].setNombre(txtNombre.getText());
                persona[posArr].settipoEmpleado(cmbTipo.getSelectedItem().toString());
                salario = true;
                
                 posArr++;
                 
                 JOptionPane.showMessageDialog(this, "Lavoratorista guardado");
              }else{
               
                persona[posArr] = new ControlPersonal();
                persona[posArr].setCodigo(txtCodigo.getText());
                persona[posArr].setRFC(txtRFC.getText());
                persona[posArr].setEdad(txtEdad.getText());
                persona[posArr].setNombre(txtNombre.getText());
                persona[posArr].settipoEmpleado(cmbTipo.getSelectedItem().toString());
                 
                posArr++;
                
                JOptionPane.showMessageDialog(this, "Administrativo guardado");
            
              }
              
              if(salario == true){
                 persona[posArr].Salario = 150;
              }else{
                  persona[posArr].Salario = 100;
              }
              
            } else {
                JOptionPane.showMessageDialog(this, "No se puede guardar, espacios sin llenar.");
            }
            
        } else {
            
             JOptionPane.showMessageDialog(this, "El almacenamiento esta completo.");
        }*/
            if(posArr < Empleados.length){
            Empleados[posArr] = new Empleado();
            Empleados[posArr].setNombre(txtNombre.getText());
            Empleados[posArr].setEdad(txtEdad.getText());
            Empleados[posArr].setRFC(txtRFC.getText());
            Empleados[posArr].setCodigo(txtCodigo.getText());
            Empleados[posArr].settipoEmpleado(cmbTipo.getSelectedItem().toString());
            posArr++;       
            txtAlmacen.setText(String.valueOf(posArr));
            
            //Habilitar el botón Abrir Ventana
            if(posArr>0) {
                btnBuscar.setEnabled(true);
            }
        }else{
            JOptionPane.showMessageDialog(this, "El almacenamiento esta completo");
        }  
        limpiar_cajas();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void miRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegresarActionPerformed
         
        this.setVisible(false);
         vtnPrincipal.setVisible(true);
         limpiar_cajas();
    }//GEN-LAST:event_miRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      if(vtnBuscarControlPer== null){
            vtnBuscarControlPer = new BuscarControlPer(this, Empleados);
        }
        
        vtnBuscarControlPer.posArr = posArr;
        vtnBuscarControlPer.actual = 0;
        
        vtnBuscarControlPer.setVisible(true);
        this.setVisible(false);
        limpiar_cajas();   
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(vtnModidicarPer== null){
            vtnModidicarPer = new ModidicarPer(this, Empleados);
        }
        
        vtnModidicarPer.posArr = posArr;
        vtnModidicarPer.actual = 0;
        
        
        vtnModidicarPer.setVisible(true);
        this.setVisible(false);
        limpiar_cajas(); 
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(vtnEliminarPer== null){
            vtnEliminarPer = new EliminarPer (this, Empleados);
        }
        
        vtnEliminarPer.posArr = posArr;
        vtnEliminarPer.actual = 0;
        
        
        vtnEliminarPer.setVisible(true);
        this.setVisible(false);
        limpiar_cajas(); 
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(ControlPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlPer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmEdicion;
    private javax.swing.JLabel lblCodigoP;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JMenuBar menuControl;
    private javax.swing.JMenuItem miRegresar;
    private javax.swing.JTextField txtAlmacen;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}
