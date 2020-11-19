/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Interfaces.Menu_admin_interfaz;
import Util.Utilidades;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juana
 */
public class pnl_ModificarTrabajador extends javax.swing.JPanel {

    Menu_admin_interfaz interfaz_menu_padre;
    BufferedReader inSocket;
    PrintWriter outSocket;
    
    String dniSeleccionado ;
    String nombre ;
    String apellidos;
    String correo;
    float salario;
    
    public pnl_ModificarTrabajador(Menu_admin_interfaz interfaz_menu_padre, BufferedReader inSocket, PrintWriter outSocket,Object[] datosTrabajador ) {
        initComponents();
        this.interfaz_menu_padre=interfaz_menu_padre;
        this.inSocket=inSocket;
        this.outSocket=outSocket;
        
        dniSeleccionado=(String) datosTrabajador[0];
        nombre=(String) datosTrabajador[1];
        apellidos=(String) datosTrabajador[2];
        correo=(String) datosTrabajador[3];
        salario=(Float) datosTrabajador[4];
        
        rellenarCampos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dni_tf = new javax.swing.JTextField();
        nombre_tf = new javax.swing.JTextField();
        apellidos_tf = new javax.swing.JTextField();
        salario_tf = new javax.swing.JTextField();
        correo_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rol_combo = new javax.swing.JComboBox<>();
        home_bt = new Recursos.RSButtonMetro();
        home_bt1 = new Recursos.RSButtonMetro();
        error_lb = new javax.swing.JLabel();

        setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1390, 689));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MODIFICAR TRABAJADOR");
        jLabel1.setAutoscrolls(true);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("DNI *");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Nombre *");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Apellidos *");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Salario");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Correo");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Rol *");

        dni_tf.setEditable(false);
        dni_tf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        dni_tf.setCaretColor(new java.awt.Color(0, 0, 0));
        dni_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dni_tfActionPerformed(evt);
            }
        });

        nombre_tf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nombre_tf.setCaretColor(new java.awt.Color(0, 0, 0));
        nombre_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_tfActionPerformed(evt);
            }
        });

        apellidos_tf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        apellidos_tf.setCaretColor(new java.awt.Color(0, 0, 0));
        apellidos_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidos_tfActionPerformed(evt);
            }
        });

        salario_tf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        salario_tf.setCaretColor(new java.awt.Color(0, 0, 0));
        salario_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salario_tfActionPerformed(evt);
            }
        });

        correo_tf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        correo_tf.setCaretColor(new java.awt.Color(0, 0, 0));
        correo_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correo_tfActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("€");

        rol_combo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rol_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 - Administrador", "2 - Entrenador", "4 - Mantenimiento" }));
        rol_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rol_comboActionPerformed(evt);
            }
        });

        home_bt.setBackground(new java.awt.Color(74, 31, 61));
        home_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_back_arrow_50px.png"))); // NOI18N
        home_bt.setToolTipText("");
        home_bt.setColorHover(new java.awt.Color(112, 62, 97));
        home_bt.setColorNormal(new java.awt.Color(74, 31, 61));
        home_bt.setOpaque(false);
        home_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_btMouseClicked(evt);
            }
        });
        home_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btActionPerformed(evt);
            }
        });

        home_bt1.setBackground(new java.awt.Color(74, 31, 61));
        home_bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_checkmark_40px.png"))); // NOI18N
        home_bt1.setText("Modificar");
        home_bt1.setToolTipText("");
        home_bt1.setColorHover(new java.awt.Color(112, 62, 97));
        home_bt1.setColorNormal(new java.awt.Color(74, 31, 61));
        home_bt1.setOpaque(false);
        home_bt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_bt1MouseClicked(evt);
            }
        });
        home_bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_bt1ActionPerformed(evt);
            }
        });

        error_lb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(home_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(error_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(74, 74, 74)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dni_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(salario_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(correo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(apellidos_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre_tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(rol_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(373, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dni_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombre_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(apellidos_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(correo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(salario_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rol_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(home_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(error_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dni_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dni_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dni_tfActionPerformed

    private void nombre_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_tfActionPerformed

    private void apellidos_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidos_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidos_tfActionPerformed

    private void salario_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salario_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salario_tfActionPerformed

    private void correo_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correo_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correo_tfActionPerformed

    private void rol_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rol_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rol_comboActionPerformed

    private void home_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btActionPerformed
        //esconderMenu();
    }//GEN-LAST:event_home_btActionPerformed

    private void home_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btMouseClicked
        interfaz_menu_padre.cambiarPanelContenido(new pnl_Trabajadores(interfaz_menu_padre, inSocket, outSocket));
        
    }//GEN-LAST:event_home_btMouseClicked

    private void home_bt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_bt1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_home_bt1MouseClicked

    private void home_bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_bt1ActionPerformed
        //0 resetear mensaje error
        error_lb.setText("");
        
        //1 comprobar que los campos estan llenos
        if(dni_tf.getText().equals("") || nombre_tf.getText().equals("") || apellidos_tf.getText().equals("")){
            error_lb.setText("Rellene correctamente los campos obligatorios");
        }else{
            
            //2 Obtener campos del trabajador
            String DNI=dni_tf.getText();
            String nombre=nombre_tf.getText();
            String apellidos=apellidos_tf.getText();
            float salario=Float.parseFloat(salario_tf.getText());
            String correo=correo_tf.getText();
            int rol=Integer.parseInt((rol_combo.getSelectedItem().toString()).substring(0, 1));
            System.out.println(rol);
            
            //3 Lanzar peticion al servidor para dar de alta al nuevo trabajador
            modificarTrabajador(DNI, nombre, apellidos, salario, correo, rol);
            
            
        }
    }//GEN-LAST:event_home_bt1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos_tf;
    private javax.swing.JTextField correo_tf;
    private javax.swing.JTextField dni_tf;
    private javax.swing.JLabel error_lb;
    private Recursos.RSButtonMetro home_bt;
    private Recursos.RSButtonMetro home_bt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nombre_tf;
    private javax.swing.JComboBox<String> rol_combo;
    private javax.swing.JTextField salario_tf;
    // End of variables declaration//GEN-END:variables

    

    private void rellenarCampos() {
        dni_tf.setText(dniSeleccionado);
        nombre_tf.setText(nombre);
        apellidos_tf.setText(apellidos);
        correo_tf.setText(correo);
        salario_tf.setText(Float.toString(salario));
        
    }

    private void modificarTrabajador(String DNI, String nombre, String apellidos, float salario, String correo, int rol) {
        Thread thread_altaTrabajador = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    
                   

                    outSocket.write("C9-MODIFICAR_TRABAJADOR:"+DNI+","+nombre+","+apellidos+","+salario+","+correo+","+rol +"\n");
                    outSocket.flush();

                    String respuestaServidor = inSocket.readLine();
                    
                    
                    if (respuestaServidor.contains("S17-MODIFICACION_COMPLETADA")) interfaz_menu_padre.cambiarPanelContenido(new pnl_Trabajadores(interfaz_menu_padre, inSocket, outSocket)); 
                    else if(respuestaServidor.contains("S18-ERROR_CORREO")) error_lb.setText("Error de modificacion: Correo ya registrado previamente, pruebe con otro.");
                    else error_lb.setText("Error de modificacion. Puede que el trabajador haya sido eliminado por otro administrador.");

                } catch (IOException ex) {
                    Logger.getLogger(pnl_Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        thread_altaTrabajador.start();
    }
}
