
package com.idesi.proyecto;

import javax.swing.JOptionPane;


public class ControlPer extends javax.swing.JFrame {
    
    Empleado Empleados[] = new Empleado[5];
    Empleado Empleados1 = new Empleado();
    
    int posArr = 0;
    int acual = 0;
    int profesion = 0;
    public int aumento = 0;
    
    Principal vtnPrincipal = null;
    BuscarControlPer vtnBuscarControlPer = null;
    ModidicarPer vtnModidicarPer = null;
    EliminarPer vtnEliminarPer = null;
    MostrarPer vtnMostrarPer = null;
    Recursos vtnRec = null;
    
    
    
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
        btnMostrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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
        btnModificar.setText("Modificar Empleado ");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(102, 255, 204));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar Empleado");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(102, 255, 204));
        btnMostrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMostrar.setText("Reporte Empleado");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Agregar Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(lblCodigoP)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombre)
                                .addComponent(lblEdad, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblRFC, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEdad)
                                    .addComponent(txtRFC)
                                    .addComponent(txtCodigo)
                                    .addComponent(cmbTipo, 0, 160, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(txtAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jButton1)))
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
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrar)
                    .addComponent(btnBuscar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            
        if (posArr < Empleados.length) {
            
            if ((!(txtCodigo.getText()).equals(""))
                && !((txtNombre.getText()).equals(""))
                && !((txtEdad.getText()).equals(""))
                && !((txtRFC.getText()).equals(""))
                && !((txtCodigo.getText()).equals(""))){
                
              if(cmbTipo.getSelectedItem().toString() == "Laboratoristas") {
              
                Empleados[posArr] = new Empleado();
                Empleados[posArr].setCodigo(txtCodigo.getText());
                Empleados[posArr].setRFC(txtRFC.getText());
                Empleados[posArr].setEdad(txtEdad.getText());
                Empleados[posArr].setNombre(txtNombre.getText());
                Empleados[posArr].settipoEmpleado(cmbTipo.getSelectedItem().toString());
                profesion = 150;
//                if ( aumento != 0 ) {

//                        profesion = profesion + (aumento * 150);
//                        Empleados[posArr].setSalario(profesion);
                        
//                } else {
                    Empleados[posArr].setSalario(profesion);
//                }
                 posArr++;
                 
                JOptionPane.showMessageDialog(this, "Laboratorista guardado");
                
              } else {
               
                Empleados[posArr] = new Empleado();
                Empleados[posArr].setCodigo(txtCodigo.getText());
                Empleados[posArr].setRFC(txtRFC.getText());
                Empleados[posArr].setEdad(txtEdad.getText());
                Empleados[posArr].setNombre(txtNombre.getText());
                Empleados[posArr].settipoEmpleado(cmbTipo.getSelectedItem().toString());
                profesion = 100; 
//                if ( aumento != 0 ) {

//                        profesion = profesion + (aumento * 100);
//                        Empleados[posArr].setSalario(profesion);
                        
//                } else {
                    Empleados[posArr].setSalario(profesion);
//                }
                posArr++;
                
                JOptionPane.showMessageDialog(this, "Administrativo guardado");
                
              }
              
            
            } else {
                JOptionPane.showMessageDialog(this, "No se puede guardar, espacios sin llenar.");
            }
            
        } else {
            
             JOptionPane.showMessageDialog(this, "El almacenamiento esta completo.");
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

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if(posArr>0){
        if(vtnMostrarPer== null){
            vtnMostrarPer = new MostrarPer(this, Empleados);
        }
        
        vtnMostrarPer.posArr = posArr;
        vtnMostrarPer.actual = 0;
        vtnMostrarPer.cargar_datos(vtnMostrarPer.actual);
        
        vtnMostrarPer.setVisible(true);
        this.setVisible(false);
        limpiar_cajas();
        }else{
            JOptionPane.showMessageDialog(this, "No hay recursos registrados.");
        }
       
        
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        vtnRec.setVisible(true);
        limpiar_cajas(); 
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JButton jButton1;
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
