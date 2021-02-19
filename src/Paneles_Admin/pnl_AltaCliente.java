/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles_Admin;

import Interfaces.Menu_admin_interfaz;
import Interfaces.Subir_Foto_interfaz;
import Util.Utilidades;
import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author juana
 */
public class pnl_AltaCliente extends javax.swing.JPanel {

    Menu_admin_interfaz interfaz_menu_padre;
    BufferedReader inSocket;
    PrintWriter outSocket;
    
   
    
    public pnl_AltaCliente(Menu_admin_interfaz interfaz_menu_padre, BufferedReader inSocket, PrintWriter outSocket ) {
        initComponents();
        this.interfaz_menu_padre=interfaz_menu_padre;
        this.inSocket=inSocket;
        this.outSocket=outSocket;

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dni_tf = new javax.swing.JTextField();
        nombre_tf = new javax.swing.JTextField();
        apellidos_tf = new javax.swing.JTextField();
        peso_tf = new javax.swing.JTextField();
        correo_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        home_bt = new Recursos.RSButtonMetro();
        home_bt1 = new Recursos.RSButtonMetro();
        error_lb = new javax.swing.JLabel();
        altura_tf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        subir_bt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        notas_tf = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        setEnabled(false);
        setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1390, 689));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("*DNI: ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("*Nombre:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("*Apellidos:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Peso:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("*Correo:");

        dni_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dni_tf.setForeground(new java.awt.Color(255, 255, 255));
        dni_tf.setToolTipText("");
        dni_tf.setBorder(null);
        dni_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        dni_tf.setOpaque(false);
        dni_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dni_tfActionPerformed(evt);
            }
        });

        nombre_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombre_tf.setForeground(new java.awt.Color(255, 255, 255));
        nombre_tf.setBorder(null);
        nombre_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        nombre_tf.setOpaque(false);
        nombre_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_tfActionPerformed(evt);
            }
        });

        apellidos_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        apellidos_tf.setForeground(new java.awt.Color(255, 255, 255));
        apellidos_tf.setBorder(null);
        apellidos_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        apellidos_tf.setOpaque(false);
        apellidos_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidos_tfActionPerformed(evt);
            }
        });

        peso_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        peso_tf.setForeground(new java.awt.Color(255, 255, 255));
        peso_tf.setBorder(null);
        peso_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        peso_tf.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        peso_tf.setOpaque(false);
        peso_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peso_tfActionPerformed(evt);
            }
        });

        correo_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        correo_tf.setForeground(new java.awt.Color(255, 255, 255));
        correo_tf.setBorder(null);
        correo_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        correo_tf.setOpaque(false);
        correo_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correo_tfActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("kg");

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

        home_bt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        home_bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_checkmark_40px.png"))); // NOI18N
        home_bt1.setText("Dar de alta");
        home_bt1.setToolTipText("");
        home_bt1.setColorHover(new java.awt.Color(255, 255, 255));
        home_bt1.setColorNormal(new java.awt.Color(255, 255, 255));
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

        altura_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        altura_tf.setForeground(new java.awt.Color(255, 255, 255));
        altura_tf.setBorder(null);
        altura_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        altura_tf.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        altura_tf.setOpaque(false);
        altura_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altura_tfActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("m");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Altura:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Notas:");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Foto:");

        subir_bt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        subir_bt.setText("SUBIR");
        subir_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subir_btActionPerformed(evt);
            }
        });

        notas_tf.setColumns(20);
        notas_tf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        notas_tf.setForeground(new java.awt.Color(51, 51, 51));
        notas_tf.setRows(5);
        notas_tf.setWrapStyleWord(true);
        notas_tf.setBorder(null);
        notas_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        notas_tf.setOpaque(false);
        jScrollPane1.setViewportView(notas_tf);

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ALTA CLIENTE");

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator7.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(home_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(477, 477, 477)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(483, 483, 483)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(349, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(home_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(error_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(correo_tf)
                            .addComponent(nombre_tf)
                            .addComponent(jSeparator3)
                            .addComponent(apellidos_tf)
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dni_tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(336, 336, 336))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subir_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(peso_tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(altura_tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(home_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dni_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombre_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidos_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(correo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(peso_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(altura_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subir_bt)
                    .addComponent(jLabel13))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(error_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(home_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(54, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void home_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btActionPerformed
        //esconderMenu();
    }//GEN-LAST:event_home_btActionPerformed

    private void home_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btMouseClicked
        interfaz_menu_padre.cambiarPanelContenido(new pnl_Clientes(interfaz_menu_padre, inSocket, outSocket));
        
    }//GEN-LAST:event_home_btMouseClicked

    private void home_bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_bt1ActionPerformed
        //0 resetear mensaje error
        error_lb.setText("");

        //1 comprobar que los campos estan llenos
        if(dni_tf.getText().equals("") || nombre_tf.getText().equals("") || apellidos_tf.getText().equals("")|| apellidos_tf.getText().equals("")){
            error_lb.setText("Rellene correctamente los campos obligatorios");
        }else{

            //2 Obtener campos del trabajador
            String DNI=dni_tf.getText();
            String nombre=nombre_tf.getText();
            String apellidos=apellidos_tf.getText();
            String correo=correo_tf.getText();
            int peso;
            float altura;
            try{
                peso=Integer.parseInt(peso_tf.getText());
                altura=Float.parseFloat(altura_tf.getText());
            }catch(NumberFormatException nfe){
                peso=0;
                altura=0;
            }
            String rutaFoto=subir_bt.getText();
            if(rutaFoto.equalsIgnoreCase("SUBIR")) rutaFoto="";
            String notas= notas_tf.getText();
            //3 Lanzar peticion al servidor para dar de alta al nuevo trabajador
            crearCliente(DNI, nombre, apellidos, correo, peso, altura, rutaFoto,notas);
            
        }
    }//GEN-LAST:event_home_bt1ActionPerformed

    private void home_bt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_bt1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_home_bt1MouseClicked

    private void dni_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dni_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dni_tfActionPerformed

    private void correo_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correo_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correo_tfActionPerformed

    private void peso_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peso_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peso_tfActionPerformed

    private void apellidos_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidos_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidos_tfActionPerformed

    private void nombre_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_tfActionPerformed

    private void altura_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altura_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_altura_tfActionPerformed

    private void subir_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subir_btActionPerformed
        new Subir_Foto_interfaz(this).setVisible(true);
    }//GEN-LAST:event_subir_btActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altura_tf;
    private javax.swing.JTextField apellidos_tf;
    private javax.swing.JTextField correo_tf;
    private javax.swing.JTextField dni_tf;
    private javax.swing.JLabel error_lb;
    private Recursos.RSButtonMetro home_bt;
    private Recursos.RSButtonMetro home_bt1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField nombre_tf;
    private javax.swing.JTextArea notas_tf;
    private javax.swing.JTextField peso_tf;
    private javax.swing.JButton subir_bt;
    // End of variables declaration//GEN-END:variables

    

    public void añadirRutaImagenSubida(String ruta){
        subir_bt.setSize(35, 500);
        subir_bt.setEnabled(false);
        subir_bt.setText(ruta);
    }

    private void cargarImagen(String ruta) {
        final int ANCHURA_IMG=200;
        final int ALTURA_IMG=250;
        
        Thread thread_cargarImagen = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                     final int PUERTO_imagenes = 9003;
                     final String HOST = "192.168.0.11";
                     Socket conexionSocketImagenes= new Socket(HOST, PUERTO_imagenes);
                     PrintWriter outputImagenes = new PrintWriter(conexionSocketImagenes.getOutputStream(), true);;
                     InputStream inputImagenes = conexionSocketImagenes.getInputStream();
                     
                     outputImagenes.write(ruta+"\n");
                     outputImagenes.flush();
                     
                     //Recoger los bytes[] de la imagen recibida 
                     //(El flujo maximo manda 65536 bytes y la imagen suele pesar mas, por ello hay que utilizar un bucle, leer varias veces del flujo y ir añadiendo los bytes haste tenerlos todos)
                     byte[] bytesImagen = new byte[65536];   //La seccion de imagen recibida (maximo pasa de 65.536 en 65.536 bytes el flujo asi que hay que concatenar arrays para cargar la imagen completa
                    int nBytesImagen;                       //El numero de bytes que hay en la seccion recibida
                    int nBytesImagenTotales=0;              //El numero total de bytes total en todas las secciones recibidas
                    byte[] imagenTotalAnterior=new byte[0];             //La imagen total hasta el momento
                    byte[] imagenTotal=new byte[0];                     //La imagen total final.
                    
                    
                                       
                    
                    
                    while((nBytesImagen= inputImagenes.read(bytesImagen))!=-1){
                        //System.out.println(bytesImagen);
                        //System.out.println(nBytesImagen);
                        nBytesImagenTotales+=nBytesImagen;
                        imagenTotal=new byte[nBytesImagenTotales];
                        
                        System.arraycopy(imagenTotalAnterior, 0, imagenTotal, 0, imagenTotalAnterior.length);
                        System.arraycopy(bytesImagen, 0, imagenTotal, imagenTotalAnterior.length, nBytesImagen);
                        
                        imagenTotalAnterior=imagenTotal;
                        if(nBytesImagen<65536) break;
                        
                    }
                    
                    //Una vez tenemos todos los bytes de la foto en una array, los mostramos en el label
                    ByteArrayInputStream bais = new ByteArrayInputStream(imagenTotal);
                    BufferedImage img = ImageIO.read(bais);
                    BufferedImage resizedImage=resizeImage(img,ANCHURA_IMG, ALTURA_IMG);
                   
                    
                    
                    // Cerrar flujos y Socket
                    outputImagenes.close();
                    inputImagenes.close();
                    conexionSocketImagenes.close();
                     
                } catch (IOException ex) {
                   
                }
            }
        });

        thread_cargarImagen.setDaemon(true);
        thread_cargarImagen.start();
    }
    
    //resizear la imagen
    private BufferedImage resizeImage(BufferedImage img, int newW, int newH) {
        Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = dimg.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();

        return dimg;
    }

    private void crearCliente(String DNI, String nombre, String apellidos, String correo, int peso, float altura, String rutaFoto, String notas) {
        Thread thread_altaCliente = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    
                   

                    outSocket.write("C18-ALTA_CLIENTE:"+DNI+","+nombre+","+apellidos+","+correo+","+peso+","+altura+","+rutaFoto+","+notas +"\n");
                    outSocket.flush();

                    String respuestaServidor = inSocket.readLine();
                    
                    
                    if (respuestaServidor.contains("S22-CLIENTE_REGISTRADO")){
                        pnl_Clientes panelClientes=new pnl_Clientes(interfaz_menu_padre, inSocket, outSocket);
                        panelClientes.mostrarMensajeError("Cliente dado de alta.");
                        interfaz_menu_padre.cambiarPanelContenido(panelClientes);
                    } 
                    else if(respuestaServidor.contains("S23-CLIENTE_REPETIDO")) error_lb.setText("Error de registro: Correo o Dni ya registrado previamente, pruebe con otro.");
                    else if (respuestaServidor.contains("S24-ERROR_SUBIDA_CLIENTE")) error_lb.setText("Error de resgistro en la Base de datos del servidor.");
                    else error_lb.setText("Error de comunicacion con el servidor.");

                } catch (IOException ex) {
                    Logger.getLogger(pnl_Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        thread_altaCliente.setDaemon(true);
        thread_altaCliente.start();
    }

    
    
}
