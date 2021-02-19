/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles_coach;

import Paneles_Admin.*;

import Interfaces.Menu_coach_interfaz;
import Interfaces.Subir_Foto_interfaz;
import Util.Utilidades;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.font.TextAttribute;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.BorderFactory.createEmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juana
 */
public class pnl_Ejercicios extends javax.swing.JPanel {

    Menu_coach_interfaz interfaz_menu_padre;
    BufferedReader inSocket;
    PrintWriter outSocket;

    DefaultTableModel defaultTableModel;
    DefaultListModel defaultListModel;
    
    ItemChangeListener listenerCambiaItemCombo;
    
    int filtradoRolAnterior;

    
    //CONSTRUCTOR
    public pnl_Ejercicios(Menu_coach_interfaz interfaz_menu_padre, BufferedReader inSocket, PrintWriter outSocket) {
        initComponents();
        filtradoRolAnterior=0;
        this.interfaz_menu_padre = interfaz_menu_padre;

        this.inSocket = inSocket;
        this.outSocket = outSocket;
        
        listenerCambiaItemCombo=new ItemChangeListener();

        configurarApariencia();

        cargarTablaEjercicios();  
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo_lb = new javax.swing.JLabel();
        eliminar_lb = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        patronBuscar_tf = new javax.swing.JTextField();
        tipo_cb = new javax.swing.JComboBox<>();
        musculos_cb1 = new javax.swing.JComboBox<>();
        musculo_lb = new javax.swing.JLabel();
        eliminar_lb2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        nombreMusculo_tf = new javax.swing.JTextField();
        altaMusculo_bt = new javax.swing.JButton();
        modificar_lb1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        musculos_lb = new javax.swing.JLabel();
        tipo_cb2 = new javax.swing.JComboBox<>();
        musculos_cb2 = new javax.swing.JComboBox<>();
        agregar_bt = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        nombreEjercicio_tf = new javax.swing.JTextField();
        descripcion_tf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        listaMusculos_scroll = new javax.swing.JScrollPane();
        musculos_list = new javax.swing.JList<>();
        resetListaMusculos_bt = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        subirImg_bt = new javax.swing.JButton();
        modificar_lb2 = new javax.swing.JLabel();
        altaEjercicio_bt = new javax.swing.JButton();
        url_tf = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        eliminar_bt = new javax.swing.JButton();
        eliminarFoto_bt = new javax.swing.JButton();
        imagen_lbl = new javax.swing.JLabel();
        urlVideo_tf = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ejercicios_tb = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        altaMusculo_bt1 = new javax.swing.JButton();
        modificar_lb3 = new javax.swing.JLabel();
        musculos_cb3 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 204));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1390, 850));

        titulo_lb.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        titulo_lb.setForeground(new java.awt.Color(255, 255, 255));
        titulo_lb.setText("EJERCICIOS");

        eliminar_lb.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        eliminar_lb.setForeground(new java.awt.Color(255, 255, 255));
        eliminar_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_remove_30px.png"))); // NOI18N
        eliminar_lb.setText("Eliminar ejercicio");
        eliminar_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminar_lbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminar_lbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminar_lbMouseExited(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(74, 31, 61));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_search_30px_1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        patronBuscar_tf.setBackground(new java.awt.Color(74, 31, 61));
        patronBuscar_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        patronBuscar_tf.setForeground(new java.awt.Color(255, 255, 255));
        patronBuscar_tf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        patronBuscar_tf.setToolTipText("");
        patronBuscar_tf.setBorder(null);
        patronBuscar_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        patronBuscar_tf.setOpaque(false);
        patronBuscar_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarTablaFiltrada(evt);
            }
        });
        patronBuscar_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                patronBuscar_tfKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(patronBuscar_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(patronBuscar_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tipo_cb.setBackground(new java.awt.Color(74, 31, 61));
        tipo_cb.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        tipo_cb.setForeground(new java.awt.Color(255, 255, 255));
        tipo_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Cardio", "Musculacion", "Estiramiento" }));
        tipo_cb.setBorder(null);

        musculos_cb1.setBackground(new java.awt.Color(74, 31, 61));
        musculos_cb1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        musculos_cb1.setForeground(new java.awt.Color(255, 255, 255));
        musculos_cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        musculos_cb1.setBorder(null);

        musculo_lb.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        musculo_lb.setForeground(new java.awt.Color(255, 255, 255));
        musculo_lb.setText("Musculo:");
        musculo_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musculo_lbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                musculo_lbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                musculo_lbMouseExited(evt);
            }
        });

        eliminar_lb2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        eliminar_lb2.setForeground(new java.awt.Color(255, 255, 255));
        eliminar_lb2.setText("Tipo:");
        eliminar_lb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminar_lb2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminar_lb2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminar_lb2MouseExited(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setOpaque(false);

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre:");

        nombreMusculo_tf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nombreMusculo_tf.setForeground(new java.awt.Color(255, 255, 255));
        nombreMusculo_tf.setOpaque(false);

        altaMusculo_bt.setBackground(new java.awt.Color(74, 31, 61));
        altaMusculo_bt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        altaMusculo_bt.setForeground(new java.awt.Color(255, 255, 255));
        altaMusculo_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_save_30px.png"))); // NOI18N
        altaMusculo_bt.setText("DAR DE ALTA");
        altaMusculo_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaMusculo_btActionPerformed(evt);
            }
        });

        modificar_lb1.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        modificar_lb1.setForeground(new java.awt.Color(255, 255, 255));
        modificar_lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_muscle_30px.png"))); // NOI18N
        modificar_lb1.setText("Nuevo musculo");
        modificar_lb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificar_lb1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificar_lb1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificar_lb1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(altaMusculo_bt))
                    .addComponent(nombreMusculo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(modificar_lb1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(modificar_lb1)
                        .addGap(24, 24, 24))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreMusculo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(altaMusculo_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tipo:");

        musculos_lb.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        musculos_lb.setForeground(new java.awt.Color(255, 255, 255));
        musculos_lb.setText("Musculos:");

        tipo_cb2.setBackground(new java.awt.Color(74, 31, 61));
        tipo_cb2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tipo_cb2.setForeground(new java.awt.Color(255, 255, 255));
        tipo_cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Musculacion", "Cardio", "Estiramiento" }));
        tipo_cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_cb2ActionPerformed(evt);
            }
        });

        musculos_cb2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        musculos_cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biceps" }));
        musculos_cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musculos_cb2ActionPerformed(evt);
            }
        });

        agregar_bt.setBackground(new java.awt.Color(74, 31, 61));
        agregar_bt.setForeground(new java.awt.Color(255, 255, 255));
        agregar_bt.setText("AGREGAR");
        agregar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_btActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre:");

        nombreEjercicio_tf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nombreEjercicio_tf.setForeground(new java.awt.Color(255, 255, 255));
        nombreEjercicio_tf.setOpaque(false);

        descripcion_tf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        descripcion_tf.setForeground(new java.awt.Color(255, 255, 255));
        descripcion_tf.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Descripcion:");

        musculos_list.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        musculos_list.setForeground(new java.awt.Color(0, 0, 0));
        musculos_list.setOpaque(false);
        listaMusculos_scroll.setViewportView(musculos_list);

        resetListaMusculos_bt.setBackground(new java.awt.Color(74, 31, 61));
        resetListaMusculos_bt.setForeground(new java.awt.Color(255, 255, 255));
        resetListaMusculos_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_reset_25px.png"))); // NOI18N
        resetListaMusculos_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetListaMusculos_btActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Foto:");

        subirImg_bt.setBackground(new java.awt.Color(74, 31, 61));
        subirImg_bt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        subirImg_bt.setForeground(new java.awt.Color(255, 255, 255));
        subirImg_bt.setText("SUBIR");
        subirImg_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirImg_btActionPerformed(evt);
            }
        });

        modificar_lb2.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        modificar_lb2.setForeground(new java.awt.Color(255, 255, 255));
        modificar_lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_new_30px.png"))); // NOI18N
        modificar_lb2.setText("Nuevo ejercicio");
        modificar_lb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificar_lb2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificar_lb2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificar_lb2MouseExited(evt);
            }
        });

        altaEjercicio_bt.setBackground(new java.awt.Color(74, 31, 61));
        altaEjercicio_bt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        altaEjercicio_bt.setForeground(new java.awt.Color(255, 255, 255));
        altaEjercicio_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_save_30px.png"))); // NOI18N
        altaEjercicio_bt.setText("DAR DE ALTA");
        altaEjercicio_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaEjercicio_btActionPerformed(evt);
            }
        });

        url_tf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        url_tf.setForeground(new java.awt.Color(255, 255, 255));
        url_tf.setOpaque(false);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Url video:");

        eliminar_bt.setBackground(new java.awt.Color(74, 31, 61));
        eliminar_bt.setForeground(new java.awt.Color(255, 255, 255));
        eliminar_bt.setText("ELIMINAR");
        eliminar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btActionPerformed(evt);
            }
        });

        eliminarFoto_bt.setBackground(new java.awt.Color(74, 31, 61));
        eliminarFoto_bt.setForeground(new java.awt.Color(255, 255, 255));
        eliminarFoto_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_remove_25px.png"))); // NOI18N
        eliminarFoto_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarFoto_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(tipo_cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subirImg_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarFoto_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(descripcion_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreEjercicio_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(musculos_cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(agregar_bt))
                                    .addComponent(musculos_lb))
                                .addGap(140, 140, 140))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(url_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(listaMusculos_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eliminar_bt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(resetListaMusculos_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(altaEjercicio_bt)
                        .addGap(151, 151, 151))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modificar_lb2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modificar_lb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(musculos_lb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(musculos_cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregar_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(listaMusculos_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreEjercicio_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipo_cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminar_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetListaMusculos_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descripcion_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(url_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(altaEjercicio_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subirImg_bt)
                            .addComponent(jLabel17))
                        .addComponent(eliminarFoto_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        imagen_lbl.setBackground(new java.awt.Color(204, 204, 204));
        imagen_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/claseDefault.jpg"))); // NOI18N
        imagen_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        urlVideo_tf.setEditable(false);
        urlVideo_tf.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        urlVideo_tf.setForeground(new java.awt.Color(255, 255, 255));
        urlVideo_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        urlVideo_tf.setText("hptts//:youtube.Url.com");
        urlVideo_tf.setBorder(null);
        urlVideo_tf.setOpaque(false);
        urlVideo_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlVideo_tfActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 234));
        jPanel4.setToolTipText("");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setForeground(new java.awt.Color(74, 31, 61));
        jScrollPane1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        ejercicios_tb.setBackground(new java.awt.Color(255, 255, 255));
        ejercicios_tb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ejercicios_tb.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ejercicios_tb.setForeground(new java.awt.Color(0, 0, 0));
        ejercicios_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion", "Tipo", "Grupo Muscular", "id", "rutaImg", "rutaVideo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ejercicios_tb.setGridColor(new java.awt.Color(255, 255, 255));
        ejercicios_tb.setRowHeight(38);
        ejercicios_tb.setSelectionBackground(new java.awt.Color(101, 58, 88));
        ejercicios_tb.setSelectionForeground(new java.awt.Color(255, 255, 255));
        ejercicios_tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ejercicios_tbMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(ejercicios_tb);
        if (ejercicios_tb.getColumnModel().getColumnCount() > 0) {
            ejercicios_tb.getColumnModel().getColumn(0).setPreferredWidth(100);
            ejercicios_tb.getColumnModel().getColumn(1).setPreferredWidth(160);
            ejercicios_tb.getColumnModel().getColumn(2).setPreferredWidth(40);
            ejercicios_tb.getColumnModel().getColumn(3).setPreferredWidth(130);
            ejercicios_tb.getColumnModel().getColumn(4).setMinWidth(0);
            ejercicios_tb.getColumnModel().getColumn(4).setPreferredWidth(0);
            ejercicios_tb.getColumnModel().getColumn(4).setMaxWidth(0);
            ejercicios_tb.getColumnModel().getColumn(5).setMinWidth(0);
            ejercicios_tb.getColumnModel().getColumn(5).setPreferredWidth(0);
            ejercicios_tb.getColumnModel().getColumn(5).setMaxWidth(0);
            ejercicios_tb.getColumnModel().getColumn(6).setMinWidth(0);
            ejercicios_tb.getColumnModel().getColumn(6).setPreferredWidth(0);
            ejercicios_tb.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setOpaque(false);

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre:");

        altaMusculo_bt1.setBackground(new java.awt.Color(74, 31, 61));
        altaMusculo_bt1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        altaMusculo_bt1.setForeground(new java.awt.Color(255, 255, 255));
        altaMusculo_bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_remove_25px.png"))); // NOI18N
        altaMusculo_bt1.setText("ELIMINAR");
        altaMusculo_bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaMusculo_bt1ActionPerformed(evt);
            }
        });

        modificar_lb3.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        modificar_lb3.setForeground(new java.awt.Color(255, 255, 255));
        modificar_lb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_remove_25px.png"))); // NOI18N
        modificar_lb3.setText("Eliminar musculo");
        modificar_lb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificar_lb3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificar_lb3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificar_lb3MouseExited(evt);
            }
        });

        musculos_cb3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        musculos_cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musculos_cb3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(musculos_cb3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modificar_lb3)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(altaMusculo_bt1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(modificar_lb3)
                        .addGap(24, 24, 24))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musculos_cb3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(altaMusculo_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(titulo_lb))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(eliminar_lb)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eliminar_lb2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipo_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(musculo_lb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(musculos_cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(urlVideo_tf)
                    .addComponent(imagen_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titulo_lb)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tipo_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(musculo_lb)
                        .addComponent(eliminar_lb2)
                        .addComponent(musculos_cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagen_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(urlVideo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminar_lb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eliminar_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_lbMouseExited
        opcionFocusLost(evt);
    }//GEN-LAST:event_eliminar_lbMouseExited

    private void eliminar_lbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_lbMouseEntered
        opcionFocusGained(evt);
    }//GEN-LAST:event_eliminar_lbMouseEntered

    private void eliminar_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_lbMouseClicked
        //1 Comprobar si hay seleccionado un ejercicio en la tabla
        int filaSeleccionada = ejercicios_tb.getSelectedRow();
        
        if (filaSeleccionada != -1) {

            //2 Obtener el id (5 columna oculta) del trabajador seleccionado
            int idSeleccionado = (int) ejercicios_tb.getValueAt(filaSeleccionada, 4);            
            
            //3 Mostrar mensaje de confirmacion
            int opcion=JOptionPane.showConfirmDialog(null, "¿Estas seguro de que desea eliminar este ejercicio?","Confirmar",0);  //0->Si  1->No
            if(opcion==0){
                //4 (en hilo) Mandar un mensaje al servidor "C7-ELIMINAR_TRABAJADOR:dni"
                eliminarEjercicio(idSeleccionado);
            }
            
            
        } else {
            JOptionPane.showMessageDialog(null,"Debe previamente seleccionar el ejercicio en la tabla." );
        }
        
            
       
    }//GEN-LAST:event_eliminar_lbMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        String patron=patronBuscar_tf.getText();
        cargarTablaTrabajadoresBusqueda(patron);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void musculo_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musculo_lbMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_musculo_lbMouseClicked

    private void musculo_lbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musculo_lbMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_musculo_lbMouseEntered

    private void musculo_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musculo_lbMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_musculo_lbMouseExited

    private void eliminar_lb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_lb2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_lb2MouseClicked

    private void eliminar_lb2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_lb2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_lb2MouseEntered

    private void eliminar_lb2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_lb2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_lb2MouseExited

    private void altaMusculo_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaMusculo_btActionPerformed
        //1 Comprobar que el textField del nombre este relleno.
        String nombreMusculo = nombreMusculo_tf.getText();
        
        if (!nombreMusculo.isEmpty()) {
            //2 Comprobar que no esté vacio
            
            if (!Utilidades.comprobarComa(nombreMusculo)) {
                //3 Comprobar que no tenga "," para que no de un posterior error en la mensajeria con el servidor.

                crearMusculo(nombreMusculo);
            }
        }
        
    }//GEN-LAST:event_altaMusculo_btActionPerformed

    private void modificar_lb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_lb1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_lb1MouseClicked

    private void modificar_lb1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_lb1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_lb1MouseEntered

    private void modificar_lb1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_lb1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_lb1MouseExited

    private void agregar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_btActionPerformed
        String musculo=(String)musculos_cb2.getSelectedItem();
        try{
            //Comprobar que no este repetido
            boolean musculoRepetido=false;
            for(int i=0;i<defaultListModel.getSize();i++){
                String musc=(String)defaultListModel.getElementAt(i);
                if(musc.equalsIgnoreCase(musculo)){
                    JOptionPane.showMessageDialog(null, "Este musculo ya ha sido introducido.");
                    musculoRepetido=true;
                }
            }
            if(!musculoRepetido){
                defaultListModel.addElement(musculo);
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_agregar_btActionPerformed

    private void resetListaMusculos_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetListaMusculos_btActionPerformed
        defaultListModel.removeAllElements();
    }//GEN-LAST:event_resetListaMusculos_btActionPerformed

    private void subirImg_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirImg_btActionPerformed
        new Subir_Foto_interfaz(this).setVisible(true);
    }//GEN-LAST:event_subirImg_btActionPerformed

    private void modificar_lb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_lb2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_lb2MouseClicked

    private void modificar_lb2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_lb2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_lb2MouseEntered

    private void modificar_lb2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_lb2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_lb2MouseExited

    private void altaEjercicio_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaEjercicio_btActionPerformed
        //1. Comprobar que los campos esten rellenos
        String nombre=nombreEjercicio_tf.getText();
        String descripcion=descripcion_tf.getText();
        String url=url_tf.getText();
        String tipo=(String)tipo_cb2.getSelectedItem();
        ArrayList<String> listaMusculos=obtenerMusculosLista();
        String rutaImg=subirImg_bt.getText();
        
        //2. Comprobar que los campos nombre y tipo estan rellenos. Si es un ejercicio de musculacion o estiramiento minimo deberá añadirse un musculo. Comprobar que el nombre/rutaImg/UrlVideo tengan comas.
        if(nombre=="" || Utilidades.comprobarComa(nombre)){
            JOptionPane.showMessageDialog(null, "Rellene el campo del nombre, sin comas.");
            return;
        }else if((!tipo.equalsIgnoreCase("cardio") && listaMusculos.size()<1)){
            JOptionPane.showMessageDialog(null, "Seleccione un tipo de ejercicio y añada al menos un musuclo.");
            return;         
        }else if(Utilidades.comprobarComa(url, rutaImg)){
            JOptionPane.showMessageDialog(null, "Ni la url de la imagen ni la del videopuede contener comas.");
            return;
        }else{
            //Si esta todo correcto
            
            //3. Reemplazar las comas por arrobas
            descripcion=Utilidades.remplazarComaPorArroba(descripcion);
            //4. Comprobar ruta imagen
            if(rutaImg.equalsIgnoreCase("SUBIR")) rutaImg="";
            
            //5. Enviar los datos al servidor para dar de alta el ejercicio
            crearEjercicio(nombre,descripcion,rutaImg,url,tipo,listaMusculos);
        }
        
        
    }//GEN-LAST:event_altaEjercicio_btActionPerformed

    private void ejercicios_tbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ejercicios_tbMousePressed
        //1 Mirar si hay seleccionado un ejercicio en la tabla
        int filaSeleccionada = ejercicios_tb.getSelectedRow();

        if (filaSeleccionada != -1) {

            //2 Obtener el dni (1 columna) del cliente seleccionado
            String rutaImg = (String) ejercicios_tb.getValueAt(filaSeleccionada, 5);
            String rutaVideo = (String) ejercicios_tb.getValueAt(filaSeleccionada, 6);
            
            
            //3 Mostrar la informacion del cliente seleccionado
            mostrarDatosEjercicio(rutaImg,rutaVideo);

        } else {
            //this.error_lbl.setText("Selecciona un trabajador primero.");
        }
        //error_lbl.setText("");
    }//GEN-LAST:event_ejercicios_tbMousePressed

    private void actualizarTablaFiltrada(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarTablaFiltrada
        
        
    }//GEN-LAST:event_actualizarTablaFiltrada

    private void patronBuscar_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patronBuscar_tfKeyReleased
        actualizarTablaFiltrada();
    }//GEN-LAST:event_patronBuscar_tfKeyReleased

    private void tipo_cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_cb2ActionPerformed
        String tipo=(String)tipo_cb2.getSelectedItem();
        //1. Comprobar si es "Cardio" para desactivar las opciones de musculos, ya que los ejercicios de cardio no tienen musculos asociados
        if(tipo.equalsIgnoreCase("cardio")){
            musculos_cb2.setEnabled(false);
            agregar_bt.setEnabled(false);
            resetListaMusculos_bt.setEnabled(false);
            defaultListModel.removeAllElements();
            musculos_list.setEnabled(false);
            eliminar_bt.setEnabled(false);
        }else{
           musculos_cb2.setEnabled(true);
           agregar_bt.setEnabled(true);
           resetListaMusculos_bt.setEnabled(true); 
           musculos_list.setEnabled(true);
            eliminar_bt.setEnabled(true);
        }
    }//GEN-LAST:event_tipo_cb2ActionPerformed

    private void musculos_cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musculos_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musculos_cb2ActionPerformed

    private void eliminar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btActionPerformed
        try{
            if(musculos_list.getSelectedIndex()!=-1){
                defaultListModel.remove(musculos_list.getSelectedIndex());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_eliminar_btActionPerformed

    private void eliminarFoto_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFoto_btActionPerformed
        //Eliminar la foto del servidor
        String rutaImagen=subirImg_bt.getText();
        System.out.println(rutaImagen);
        eliminarImagen(rutaImagen);
        subirImg_bt.setEnabled(true);
        subirImg_bt.setText("SUBIR");
        //Ocultar el boton
        eliminarFoto_bt.setVisible(false);
    }//GEN-LAST:event_eliminarFoto_btActionPerformed

    private void altaMusculo_bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaMusculo_bt1ActionPerformed
        String nombreMusculo=(String)musculos_cb3.getSelectedItem();
        if(nombreMusculo==null || nombreMusculo==""){
            JOptionPane.showMessageDialog(null, "Seleccione el musculo que desee eliminar.");
        }else{
            eliminarMusculo(nombreMusculo);
            
        }
    }//GEN-LAST:event_altaMusculo_bt1ActionPerformed

    private void modificar_lb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_lb3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_lb3MouseClicked

    private void modificar_lb3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_lb3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_lb3MouseEntered

    private void modificar_lb3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_lb3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_lb3MouseExited

    private void musculos_cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musculos_cb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musculos_cb3ActionPerformed

    private void urlVideo_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlVideo_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlVideo_tfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_bt;
    private javax.swing.JButton altaEjercicio_bt;
    private javax.swing.JButton altaMusculo_bt;
    private javax.swing.JButton altaMusculo_bt1;
    private javax.swing.JTextField descripcion_tf;
    private javax.swing.JTable ejercicios_tb;
    private javax.swing.JButton eliminarFoto_bt;
    private javax.swing.JButton eliminar_bt;
    private javax.swing.JLabel eliminar_lb;
    private javax.swing.JLabel eliminar_lb2;
    private javax.swing.JLabel imagen_lbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane listaMusculos_scroll;
    private javax.swing.JLabel modificar_lb1;
    private javax.swing.JLabel modificar_lb2;
    private javax.swing.JLabel modificar_lb3;
    private javax.swing.JLabel musculo_lb;
    private javax.swing.JComboBox<String> musculos_cb1;
    private javax.swing.JComboBox<String> musculos_cb2;
    private javax.swing.JComboBox<String> musculos_cb3;
    private javax.swing.JLabel musculos_lb;
    private javax.swing.JList<String> musculos_list;
    private javax.swing.JTextField nombreEjercicio_tf;
    private javax.swing.JTextField nombreMusculo_tf;
    private javax.swing.JTextField patronBuscar_tf;
    private javax.swing.JButton resetListaMusculos_bt;
    private javax.swing.JButton subirImg_bt;
    private javax.swing.JComboBox<String> tipo_cb;
    private javax.swing.JComboBox<String> tipo_cb2;
    private javax.swing.JLabel titulo_lb;
    private javax.swing.JTextField urlVideo_tf;
    private javax.swing.JTextField url_tf;
    // End of variables declaration//GEN-END:variables

    
    private void cargarTablaEjercicios() {
               
        //Cargar Imagen Default
        Utilidades.cargarImagenNoDisponible(imagen_lbl,275,205);
        
        //Eliminar Url video si hay alguna
        urlVideo_tf.setText("");
        
        //Establecer los parametros de filtro nulos
        tipo_cb.setSelectedIndex(0);
        musculos_cb1.setSelectedIndex(0);
        patronBuscar_tf.setText("");
        
        //Solicitar al servidor los tatos de los Ejercicios ya registrados para mostrarlos por la tabla
        Thread thread_cargarEjercicios = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    outSocket.write("C31-LISTAR_EJERCICIOS\n");
                    outSocket.flush();

                    String respuestaServidor = inSocket.readLine();
                    if (respuestaServidor.contains("S12-ERROR_QUERY")) {
                        System.out.println("Error al cargar la query (pendiente)");
                    } else if (respuestaServidor.contains("S42-LISTA_EJERCICIOS")) {
                        //Vaciar la tabla antes de añadir los nuevos datos actualizados
                        defaultTableModel.setRowCount(0);
                        int numeroDeEjercicios = Utilidades.contarParametros(respuestaServidor);
                        for (int i = 0; i < numeroDeEjercicios; i++) {
                            String parametroEjercicio = Utilidades.obtenerParametro(respuestaServidor, i + 1);
                            Object[] atributosTrabajador = Utilidades.obtenerEjercicio(parametroEjercicio);
                            defaultTableModel.addRow(atributosTrabajador);

                        }

                    } else {
                        System.out.println("Respuesta erronea del server:" + respuestaServidor);
                    }

                } catch (IOException ex) {
                    Logger.getLogger(pnl_Ejercicios.class.getName()).log(Level.SEVERE, null, ex);
                }
                //Cuando acabe cargará los musculos. 
                cargarComboBoxsMusculos();
            }
        });
        thread_cargarEjercicios.setDaemon(true);
        thread_cargarEjercicios.start();
    }

    private void eliminarEjercicio(int id) {
        
        Thread thread_eliminarTrabajador = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    outSocket.write("C34_ELIMINAR_EJERCICIO:"+id+"\n");
                    outSocket.flush();

                    String respuestaServidor = inSocket.readLine();
                   
                    if (respuestaServidor.contains("S45-ERROR_ELIMINACION")) {
                        try{
                            String mensajeError=Utilidades.obtenerParametro(respuestaServidor,1);
                            JOptionPane.showMessageDialog(null, "Error en la eliminacion en el servidor:"+mensajeError);
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null, "Error desconocido del servidor, contacte con un tecnico.");
                        }
                    } else if (respuestaServidor.contains("S44-EJERCICIO_ELIMINADO")) {
                        //Si funciona se limitará a actualizar la tabla como el resto de opciones.
                    } else {
                         JOptionPane.showMessageDialog(null, "Error del servidor: No responde correctamente. Contacte con un tecnico.");
                    }
                    
                    cargarTablaEjercicios();

                } catch (IOException ex) {
                    Logger.getLogger(pnl_Ejercicios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        thread_eliminarTrabajador.start();
    }
    
    
    
    private void opcionFocusGained(java.awt.event.MouseEvent evt) {
        JLabel labelFocus = (JLabel) evt.getSource();
        Font font = labelFocus.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        labelFocus.setFont(font.deriveFont(attributes));
    }

    private void opcionFocusLost(java.awt.event.MouseEvent evt) {
        JLabel labelFocus = (JLabel) evt.getSource();
        Font font = labelFocus.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        labelFocus.setFont(font.deriveFont(attributes));
    }

    private void configurarApariencia() {
        
        defaultTableModel = (DefaultTableModel) this.ejercicios_tb.getModel();
        defaultListModel= new DefaultListModel();
        musculos_list.setModel(defaultListModel);
        
        eliminarFoto_bt.setVisible(false);
        
        ejercicios_tb.getTableHeader().setOpaque(false);
        ejercicios_tb.getTableHeader().setBackground(new Color(74,31,61));
        ejercicios_tb.getTableHeader().setForeground(new Color(255,255,255));
        ejercicios_tb.getTableHeader().setPreferredSize(new Dimension(jScrollPane1.getWidth(),50));
        ejercicios_tb.setRowHeight(50);
        
        
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(createEmptyBorder());
        tipo_cb.setBorder(createEmptyBorder());
        
        Font labelFont=patronBuscar_tf.getFont();
        
        
        ejercicios_tb.getTableHeader().setFont(new Font(labelFont.getName(), Font.PLAIN, labelFont.getSize()));
        
        
        //Cambiar barra 
        jScrollPane1.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(74,31,61);
            }
        
        });
        
        Font font = titulo_lb.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        titulo_lb.setFont(font.deriveFont(attributes));
        
        
        
    }

    private void cargarTablaTrabajadoresBusqueda(String patron) {
        Thread thread_cargarTrabajadores = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //1 Solicitar al servidor el listado de trabajadores (String)
                    outSocket.write("C10-LISTAR_BUSQUEDA_TRABAJADORES:"+patron+"\n");
                    outSocket.flush();

                    String respuestaServidor = inSocket.readLine();
                    System.out.println("entra");
                    if (respuestaServidor.contains("S12-ERROR_QUERY")) {
                        System.out.println("Error al cargar la query (pendiente)");
                    } else if (respuestaServidor.contains("S11-LISTA_TRABAJADORES")) {
                        defaultTableModel.setRowCount(0);
                        int numeroDeUsuarios = Utilidades.contarParametros(respuestaServidor);
                        for (int i = 0; i < numeroDeUsuarios; i++) {
                            String parametroTrabajador = Utilidades.obtenerParametro(respuestaServidor, i + 1);
                            Object[] atributosTrabajador = Utilidades.obtenerTrabajador(parametroTrabajador);
                            System.out.println("fila:" + atributosTrabajador);
                            defaultTableModel.addRow(atributosTrabajador);
                        }

                    } else {
                        System.out.println("Respuesta erronea del server:" + respuestaServidor);
                    }

                } catch (IOException ex) {
                    Logger.getLogger(pnl_Ejercicios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        thread_cargarTrabajadores.start();
    }

    private void mostrarDatosEjercicio(String rutaImg, String rutaVideo) {
        //1. Mostrar la ruta del video (si tiene) y cargar imagen no disponible mientras carga la otra.
        if(rutaVideo.equals("null")||rutaVideo.equals(""))  urlVideo_tf.setText("");
        else  urlVideo_tf.setText(rutaVideo);

        Utilidades.cargarImagenNoDisponible(imagen_lbl, 275, 205);

        //2. Solicitar al servidor la imagen(bytes) con la ruta registrada y cargarla en la interfaz
        if(rutaImg.trim()!=""){
            Utilidades.mostrarImagen(rutaImg, imagen_lbl, 275, 205);
            
        }
        

    }

    private void cargarComboBoxsMusculos() {
        ArrayList<JComboBox> musculos_combos = new ArrayList<JComboBox>();
        musculos_combos.add(musculos_cb1);
        musculos_combos.add(musculos_cb2);
        musculos_combos.add(musculos_cb3);
        
        Thread thread_cargarMusculos = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    outSocket.write("C32-LISTAR_MUSCULOS\n");
                    outSocket.flush();

                    String respuestaServidor = inSocket.readLine();
                    if (respuestaServidor.contains("S43-LISTA_MUSCULOS")) {
                        int numeroDeUsuarios = Utilidades.contarParametros(respuestaServidor);
                        
                        //Resetearlos
                        musculos_cb1.removeAllItems();
                        musculos_cb1.addItem("Todos");
                        musculos_cb2.removeAllItems();
                        musculos_cb3.removeAllItems();
                        
                        for (int i = 0; i < numeroDeUsuarios; i++) {
                            String nombreMusculo = Utilidades.obtenerParametro(respuestaServidor, i + 1);
                            
                            for(JComboBox combo:musculos_combos){
                                combo.addItem(nombreMusculo.toUpperCase());
                            }
                        }

                    } else {
                        System.out.println("Respuesta erronea del server:" + respuestaServidor);
                    }

                } catch (IOException ex) {
                    Logger.getLogger(pnl_Ejercicios.class.getName()).log(Level.SEVERE, null, ex);
                }
                añadirListenersCB(); //Esto es para que se añadan los listeners tras haber recargado de musculos los combo box, si no con el "ActionListener" normal, filtrara (peticion al servidor) cada vez que se añada un musculo.
            }
        });
        thread_cargarMusculos.setDaemon(true);
        thread_cargarMusculos.start();

    }

    
    public void actualizarTablaFiltrada() {                                         
        
        
        //Hacer peticion al servidor para que devuelva los ejercicios registrados con esos parametros
        Thread thread_cargarMusculos = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    
                    //Cada vez que cambie Alguno de los cb de filtrado o se escriba o borre en la barra se activará.
                    String tipo = (String) tipo_cb.getSelectedItem();
                    String musculo = (String) musculos_cb1.getSelectedItem();
                    String filtroBusqueda = patronBuscar_tf.getText();

                    //Si los cb estan en "todos" no filtrará por esos campos, por lo que se envia vacio
                    if (tipo.equalsIgnoreCase("todos")) tipo="";
                    if(musculo.equalsIgnoreCase("todos")) musculo="";

                    if(tipo.equalsIgnoreCase("cardio")){
                        //Si es cardio, desactiva la funcion de musculos y hace una peticion diferente al servidor, ya que la sentencia sql no se puede hacer si no tiene musculos de la manera anterior (x inner joins)
                        musculo_lb.setVisible(false);
                        musculos_cb1.setVisible(false);
                        
                        outSocket.write("C35-FILTRAR_EJERCICIOS_CARDIO:"+filtroBusqueda+"\n");
                        outSocket.flush();
                        
                    }else{
                        musculo_lb.setVisible(true);
                        musculos_cb1.setVisible(true);
                        
                        outSocket.write("C33-FILTRAR_EJERCICIOS:"+tipo+","+musculo+","+filtroBusqueda+"\n");
                        outSocket.flush();
                    }
                    

                    String respuestaServidor = inSocket.readLine();
                    if (respuestaServidor.contains("S12-ERROR_QUERY")) {
                        System.out.println("Error al cargar la query (pendiente)");
                    } else if (respuestaServidor.contains("S42-LISTA_EJERCICIOS")) {
                        //Vaciar la tabla antes de añadir los nuevos datos actualizados
                        defaultTableModel.setRowCount(0);
                        int numeroDeEjercicios = Utilidades.contarParametros(respuestaServidor);
                        for (int i = 0; i < numeroDeEjercicios; i++) {
                            String parametroEjercicio = Utilidades.obtenerParametro(respuestaServidor, i + 1);
                            Object[] atributosTrabajador = Utilidades.obtenerEjercicio(parametroEjercicio);
                            defaultTableModel.addRow(atributosTrabajador);

                        }

                    } else {
                        System.out.println("Respuesta erronea del server:" + respuestaServidor);
                    }

                } catch (IOException ex) {
                    Logger.getLogger(pnl_Ejercicios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        thread_cargarMusculos.setDaemon(true);
        thread_cargarMusculos.start();
    } 

    private void crearMusculo(String nombreMusculo) {
        Thread thread_altaMusculo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                   
                    outSocket.write("C36-ALTA_MUSCULO:" + nombreMusculo + "\n");
                    outSocket.flush();

                    String respuestaServidor = inSocket.readLine();

                    if (respuestaServidor.contains("S46-CLASE_REGISTRADA")) {
                        cargarComboBoxsMusculos();
                         showMessageDialog(null, "Musculo registrado correctamente");
                        nombreMusculo_tf.setText("");

                    } else if (respuestaServidor.contains("S47-ERROR_REGISTRO:Registro duplicado")) {

                        showMessageDialog(null, "El musculo \"" + nombreMusculo + "\" ya esta registrado");

                    } else {

                        try {
                            String mensajeError = Utilidades.obtenerParametro(respuestaServidor, 1);
                            showMessageDialog(null, "Error al registrar:" + mensajeError);
                        } catch (Exception e) {
                            showMessageDialog(null, "Error desconocido. Pongase en contacto con un tecnico.");
                        }
                        cargarComboBoxsMusculos();

                    } 
                    
                } catch (IOException ex) {
                    Logger.getLogger(pnl_Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        thread_altaMusculo.setDaemon(true);
        thread_altaMusculo.start();
    }

    public void añadirRutaImagenSubida(String ruta) {
         subirImg_bt.setSize(35, 500);
        subirImg_bt.setEnabled(false);
        subirImg_bt.setText(ruta);
        eliminarFoto_bt.setVisible(true);
    }

    private void eliminarImagen(String rutaImagen) {
        Thread thread_eliminarImagen = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    outSocket.write("C20_ELIMINAR_FOTO:"+ rutaImagen+ "\n");
                    outSocket.flush();

                    String respuestaServidor = inSocket.readLine();

                } catch (IOException ex) {
                    Logger.getLogger(pnl_Ejercicios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        thread_eliminarImagen.setDaemon(true);
        thread_eliminarImagen.start();
    }

    private ArrayList<String> obtenerMusculosLista() {
        ArrayList<String> listaMusc=new ArrayList<>();
        for(int i = 0; i< musculos_list.getModel().getSize();i++){
            listaMusc.add(musculos_list.getModel().getElementAt(i));
        }
        
        return listaMusc;
        
    }

    private void crearEjercicio(String nombre, String descripcion, String rutaImg, String url, String tipo, ArrayList<String> listaMusculos) {
        Thread thread_altaEjercicio = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String musculos=generarCadenaMusculos(listaMusculos);
                    
                    outSocket.write("C37-ALTA_EJERCICIO:" + nombre +","+ tipo+","+ descripcion +","+ rutaImg+","+ url+","+ musculos+ "\n");
                    outSocket.flush();

                    String respuestaServidor = inSocket.readLine();

                    if (respuestaServidor.contains("S49-MUSCULO_REGISTRADO")) {
                        cargarTablaEjercicios();

                    } else if (respuestaServidor.contains("S47-ERROR_REGISTRO:duplicate")) {

                        showMessageDialog(null, "Ya hay un ejercicio recgistrado con el nombre \"" + nombre + "\".");

                    } else {

                        try {
                            String mensajeError = Utilidades.obtenerParametro(respuestaServidor, 1);
                            showMessageDialog(null, mensajeError);
                        } catch (Exception e) {
                            showMessageDialog(null, "Error desconocido. Pongase en contacto con un tecnico.");
                        }
                        
                        cargarTablaEjercicios();
                    } 
                    
                } catch (IOException ex) {
                    Logger.getLogger(pnl_Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            private String generarCadenaMusculos(ArrayList<String> listaMusculos) {
                String cadenaMusculos="";
                for(String musc:listaMusculos){
                    cadenaMusculos+="$"+musc;
                }
                return cadenaMusculos;
            }
            
        });
        thread_altaEjercicio.setDaemon(true);
        thread_altaEjercicio.start();
    }

    private void eliminarMusculo(String nombreMusculo) {
        Thread thread_eliminarClase = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    
                    outSocket.write("C38_ELIMINAR_MUSCULO:" + nombreMusculo + "\n");
                    outSocket.flush();

                    String respuestaServidor = inSocket.readLine();

                    if (respuestaServidor.contains("S50-MUSCULO_NO_ENCONTRADO")) {
                        JOptionPane.showMessageDialog(null, "La clase no ha podido ser eliminada.Otro administrador debe de haberla eliminado o modificado.");
                    } else if (respuestaServidor.contains("S51-MUSCULO_ELIMINADO")) {
                        JOptionPane.showMessageDialog(null, "Musculo eliminado correctamente");
    
                    } else {
                         JOptionPane.showMessageDialog(null, "No se ha podido eliminar el musculo: Error desconocido");
                    }
                    cargarComboBoxsMusculos();

                } catch (IOException ex) {
                    Logger.getLogger(pnl_Clases.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        thread_eliminarClase.setDaemon(true);
        thread_eliminarClase.start();
    }
  
    
    
    
    //LISTENER PARA COMBO BOX
    class ItemChangeListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent event) {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                Object item = event.getItem();
                actualizarTablaFiltrada();
            }
        }
    }
    
    public void añadirListenersCB(){
        musculos_cb1.addItemListener(listenerCambiaItemCombo);
        tipo_cb.addItemListener(listenerCambiaItemCombo);
    }

}

