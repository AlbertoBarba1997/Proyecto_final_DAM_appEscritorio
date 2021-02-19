/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles_coach;

import Paneles_Admin.*;
import Interfaces.Menu_admin_interfaz;
import Interfaces.Menu_coach_interfaz;
import Interfaces.Subir_Foto_interfaz;
import Util.Utilidades;
import com.sun.org.apache.xerces.internal.xs.ItemPSVI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.font.TextAttribute;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
public class pnl_AltaTabla extends javax.swing.JPanel {

    Menu_coach_interfaz interfaz_menu_padre;
    BufferedReader inSocket;
    PrintWriter outSocket;

    DefaultTableModel defaultTableModel;
    DefaultTableModel defaultTableModel1;
    
    
    ItemChangeListener listenerCambiaItemCombo;
    
    int filtradoRolAnterior;
    
    boolean tablaBase;
    String dniUsuarioTabla;
    
    HashMap<Integer,String[]> lDia1;
    HashMap<Integer,String[]> lDia2;
    HashMap<Integer,String[]> lDia3;
    HashMap<Integer,String[]> lDia4;
    HashMap<Integer,String[]> lDia5;
    HashMap<Integer,String[]> lDia6;
   
    ArrayList< HashMap<Integer,String[]>> todosLosDias;

    
    //CONSTRUCTORES
    
    public pnl_AltaTabla(Menu_coach_interfaz interfaz_menu_padre, BufferedReader inSocket, PrintWriter outSocket) {
        //Si viene sin id de cliente, significa que es una tabla base
        tablaBase=true;
        
        initComponents();
        filtradoRolAnterior=0;
        this.interfaz_menu_padre = interfaz_menu_padre;

        this.inSocket = inSocket;
        this.outSocket = outSocket;

        listenerCambiaItemCombo=new ItemChangeListener();

        configurarApariencia();

        cargarTablaEjercicios(); 
        
        inicializarListasDias();
        
    }
    
   
    public pnl_AltaTabla(Menu_coach_interfaz interfaz_menu_padre, BufferedReader inSocket, PrintWriter outSocket, String dniUsuarioTabla) {
        //Si viene con id de usuario, es una tabla personalizada para un solo usuario.
        tablaBase=false;
        this.dniUsuarioTabla=dniUsuarioTabla;
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        patronBuscar_tf = new javax.swing.JTextField();
        tipo_cb = new javax.swing.JComboBox<>();
        musculos_cb = new javax.swing.JComboBox<>();
        musculo_lb = new javax.swing.JLabel();
        eliminar_lb2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ejercicios_tb = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        resetEjercicios_bt = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        agregarEjercicio_bt1 = new javax.swing.JButton();
        eliminarEjercicio_bt2 = new javax.swing.JButton();
        dia_cb = new javax.swing.JComboBox<>();
        eliminar_lb3 = new javax.swing.JLabel();
        eliminar_lb4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        guardar_bt = new javax.swing.JButton();
        nombreTabla_tf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        nDias_cb = new javax.swing.JComboBox<>();
        series_tf = new javax.swing.JTextField();
        reps_tf = new javax.swing.JTextField();
        tiempo_tf = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ejercicios_tb1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1390, 850));

        titulo_lb.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        titulo_lb.setForeground(new java.awt.Color(255, 255, 255));
        titulo_lb.setText("CREAR TABLA DE EJERCICIOS");

        jPanel1.setBackground(new java.awt.Color(74, 31, 61));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_search_30px_1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        patronBuscar_tf.setBackground(new java.awt.Color(74, 31, 61));
        patronBuscar_tf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
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
                .addComponent(patronBuscar_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(patronBuscar_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tipo_cb.setBackground(new java.awt.Color(74, 31, 61));
        tipo_cb.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tipo_cb.setForeground(new java.awt.Color(255, 255, 255));
        tipo_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Cardio", "Musculacion", "Estiramiento" }));
        tipo_cb.setBorder(null);

        musculos_cb.setBackground(new java.awt.Color(74, 31, 61));
        musculos_cb.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        musculos_cb.setForeground(new java.awt.Color(255, 255, 255));
        musculos_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        musculos_cb.setBorder(null);
        musculos_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musculos_cbActionPerformed(evt);
            }
        });

        musculo_lb.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
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

        eliminar_lb2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
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

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel4.setOpaque(false);

        jScrollPane1.setBackground(new java.awt.Color(74, 31, 61));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setForeground(new java.awt.Color(74, 31, 61));
        jScrollPane1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        ejercicios_tb.setBackground(new java.awt.Color(222, 222, 222));
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
        ejercicios_tb.setOpaque(false);
        ejercicios_tb.setRowHeight(38);
        ejercicios_tb.setSelectionBackground(new java.awt.Color(101, 58, 88));
        ejercicios_tb.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(ejercicios_tb);
        if (ejercicios_tb.getColumnModel().getColumnCount() > 0) {
            ejercicios_tb.getColumnModel().getColumn(0).setPreferredWidth(100);
            ejercicios_tb.getColumnModel().getColumn(1).setMinWidth(0);
            ejercicios_tb.getColumnModel().getColumn(1).setPreferredWidth(0);
            ejercicios_tb.getColumnModel().getColumn(1).setMaxWidth(0);
            ejercicios_tb.getColumnModel().getColumn(2).setPreferredWidth(40);
            ejercicios_tb.getColumnModel().getColumn(3).setResizable(false);
            ejercicios_tb.getColumnModel().getColumn(3).setPreferredWidth(130);
            ejercicios_tb.getColumnModel().getColumn(4).setMinWidth(0);
            ejercicios_tb.getColumnModel().getColumn(4).setPreferredWidth(0);
            ejercicios_tb.getColumnModel().getColumn(4).setMaxWidth(0);
            ejercicios_tb.getColumnModel().getColumn(5).setResizable(false);
            ejercicios_tb.getColumnModel().getColumn(5).setMinWidth(0);
            ejercicios_tb.getColumnModel().getColumn(5).setPreferredWidth(0);
            ejercicios_tb.getColumnModel().getColumn(5).setMaxWidth(0);
            ejercicios_tb.getColumnModel().getColumn(6).setResizable(false);
            ejercicios_tb.getColumnModel().getColumn(6).setMinWidth(0);
            ejercicios_tb.getColumnModel().getColumn(6).setPreferredWidth(0);
            ejercicios_tb.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Series:");

        resetEjercicios_bt.setBackground(new java.awt.Color(74, 31, 61));
        resetEjercicios_bt.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        resetEjercicios_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_reset_25px.png"))); // NOI18N
        resetEjercicios_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetEjercicios_btActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Rep:");

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tiempo:");

        agregarEjercicio_bt1.setBackground(new java.awt.Color(74, 31, 61));
        agregarEjercicio_bt1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        agregarEjercicio_bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_right_25px.png"))); // NOI18N
        agregarEjercicio_bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEjercicio_bt1ActionPerformed(evt);
            }
        });

        eliminarEjercicio_bt2.setBackground(new java.awt.Color(74, 31, 61));
        eliminarEjercicio_bt2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        eliminarEjercicio_bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_left_25px.png"))); // NOI18N
        eliminarEjercicio_bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEjercicio_bt2ActionPerformed(evt);
            }
        });

        dia_cb.setBackground(new java.awt.Color(74, 31, 61));
        dia_cb.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dia_cb.setForeground(new java.awt.Color(255, 255, 255));
        dia_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia 1" }));
        dia_cb.setBorder(null);
        dia_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dia_cbActionPerformed(evt);
            }
        });

        eliminar_lb3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        eliminar_lb3.setForeground(new java.awt.Color(255, 255, 255));
        eliminar_lb3.setText("Dia:");
        eliminar_lb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminar_lb3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminar_lb3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminar_lb3MouseExited(evt);
            }
        });

        eliminar_lb4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        eliminar_lb4.setForeground(new java.awt.Color(74, 31, 61));
        eliminar_lb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_sort_down_15px.png"))); // NOI18N
        eliminar_lb4.setText("Ejercicios");
        eliminar_lb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminar_lb4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminar_lb4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminar_lb4MouseExited(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(74, 31, 61));
        jSeparator2.setForeground(new java.awt.Color(74, 31, 61));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Num. de dias:");

        guardar_bt.setBackground(new java.awt.Color(74, 31, 61));
        guardar_bt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        guardar_bt.setForeground(new java.awt.Color(255, 255, 255));
        guardar_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_save_30px.png"))); // NOI18N
        guardar_bt.setText("GUARDAR");
        guardar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btActionPerformed(evt);
            }
        });

        nombreTabla_tf.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        nombreTabla_tf.setForeground(new java.awt.Color(255, 255, 255));
        nombreTabla_tf.setText("Nombre de la tabla");
        nombreTabla_tf.setToolTipText("Nombre"); // NOI18N
        nombreTabla_tf.setBorder(null);
        nombreTabla_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        nombreTabla_tf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombreTabla_tf.setOpaque(false);
        nombreTabla_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreTabla_tffocusLostDNI(evt);
            }
        });
        nombreTabla_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreTabla_tfMouseClicked(evt);
            }
        });
        nombreTabla_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTabla_tfActionPerformed(evt);
            }
        });
        nombreTabla_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreTabla_tfkeyPresedDNI(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        nDias_cb.setBackground(new java.awt.Color(74, 31, 61));
        nDias_cb.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        nDias_cb.setForeground(new java.awt.Color(255, 255, 255));
        nDias_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        nDias_cb.setBorder(null);
        nDias_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nDias_cbActionPerformed(evt);
            }
        });

        series_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        series_tf.setForeground(new java.awt.Color(255, 255, 255));
        series_tf.setText("3");
        series_tf.setOpaque(false);
        series_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                series_tfActionPerformed(evt);
            }
        });

        reps_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        reps_tf.setForeground(new java.awt.Color(255, 255, 255));
        reps_tf.setText("10");
        reps_tf.setOpaque(false);
        reps_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reps_tfActionPerformed(evt);
            }
        });

        tiempo_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tiempo_tf.setForeground(new java.awt.Color(255, 255, 255));
        tiempo_tf.setOpaque(false);
        tiempo_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempo_tfActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel5.setOpaque(false);

        jScrollPane2.setBackground(new java.awt.Color(74, 31, 61));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setForeground(new java.awt.Color(74, 31, 61));
        jScrollPane2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        ejercicios_tb1.setBackground(new java.awt.Color(222, 222, 222));
        ejercicios_tb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ejercicios_tb1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ejercicios_tb1.setForeground(new java.awt.Color(0, 0, 0));
        ejercicios_tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Ejercicio", "Series", "Reps", "Tiempo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ejercicios_tb1.setGridColor(new java.awt.Color(255, 255, 255));
        ejercicios_tb1.setOpaque(false);
        ejercicios_tb1.setRowHeight(38);
        ejercicios_tb1.setSelectionBackground(new java.awt.Color(101, 58, 88));
        ejercicios_tb1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        ejercicios_tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ejercicios_tb1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(ejercicios_tb1);
        if (ejercicios_tb1.getColumnModel().getColumnCount() > 0) {
            ejercicios_tb1.getColumnModel().getColumn(0).setMinWidth(0);
            ejercicios_tb1.getColumnModel().getColumn(0).setPreferredWidth(0);
            ejercicios_tb1.getColumnModel().getColumn(0).setMaxWidth(0);
            ejercicios_tb1.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardar_bt)
                .addGap(597, 597, 597))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tipo_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(eliminar_lb2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(musculos_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(musculo_lb))))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(agregarEjercicio_bt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eliminarEjercicio_bt2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(resetEjercicios_bt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dia_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eliminar_lb3)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(series_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reps_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tiempo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eliminar_lb4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(titulo_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreTabla_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(nDias_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(titulo_lb)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTabla_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nDias_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminar_lb4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(eliminar_lb2)
                                .addComponent(musculo_lb, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(eliminar_lb3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tipo_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(musculos_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dia_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(agregarEjercicio_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarEjercicio_bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetEjercicios_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(series_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reps_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tiempo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(guardar_bt)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void resetEjercicios_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetEjercicios_btActionPerformed
        inicializarListasDias();
        ActualizarInformacionTabla();
    }//GEN-LAST:event_resetEjercicios_btActionPerformed

    private void actualizarTablaFiltrada(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarTablaFiltrada
        
        
    }//GEN-LAST:event_actualizarTablaFiltrada

    private void patronBuscar_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patronBuscar_tfKeyReleased
        actualizarTablaFiltrada();
    }//GEN-LAST:event_patronBuscar_tfKeyReleased

    private void agregarEjercicio_bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEjercicio_bt1ActionPerformed
        //Obtiene la fila seleccionada, extrae el id y el nombre. Obtiene de los tf los demas datos y los introduce en la lista del dia correspondiente y a la vez añade una fila a la tabla
        int id=(int)ejercicios_tb.getValueAt(ejercicios_tb.getSelectedRow(),4 );
        String nombre=(String) ejercicios_tb.getValueAt(ejercicios_tb.getSelectedRow(),0);
        String series=series_tf.getText();
        String repeticiones=reps_tf.getText();
        String tiempo=tiempo_tf.getText();
        try{
            //Comprobar que pueden pasarse a integuer
            if(!series.equals("")){
                Integer.parseInt(series);
            }
            
            if(!repeticiones.equals("")){
                Integer.parseInt(repeticiones);
            }
            //Añadir a la lista que almacena lso ejercicios de cada dia
            int diaCorrespondiente=dia_cb.getSelectedIndex();
            String[] valores={nombre,series,repeticiones,tiempo};
            todosLosDias.get(diaCorrespondiente).put(id,valores);
            //Añadir fila a la tabla
//            Object[] fila={id,nombre,series,repeticiones,tiempo};
//            defaultTableModel1.addRow(fila);
            ActualizarInformacionTabla();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Escribe correctamente las series y repeticiones (numeros enteros) o dejelas vacias.");
        }
        
        
        
        
    }//GEN-LAST:event_agregarEjercicio_bt1ActionPerformed

    private void eliminarEjercicio_bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEjercicio_bt2ActionPerformed
        //Comprobar que halla una fila marcada en la columna de arriba
        int filaSeleccionada=ejercicios_tb1.getSelectedRow();
        
        if(filaSeleccionada!=-1){
            int idEjercicio=(int)ejercicios_tb1.getValueAt(filaSeleccionada, 0);
            todosLosDias.get(dia_cb.getSelectedIndex()).remove(idEjercicio);
            ActualizarInformacionTabla();
            
        }
        
    }//GEN-LAST:event_eliminarEjercicio_bt2ActionPerformed

    private void ejercicios_tb1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ejercicios_tb1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ejercicios_tb1MousePressed

    private void eliminar_lb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_lb3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_lb3MouseClicked

    private void eliminar_lb3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_lb3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_lb3MouseEntered

    private void eliminar_lb3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_lb3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_lb3MouseExited

    private void eliminar_lb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_lb4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_lb4MouseClicked

    private void eliminar_lb4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_lb4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_lb4MouseEntered

    private void eliminar_lb4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_lb4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_lb4MouseExited

    private void nombreTabla_tffocusLostDNI(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTabla_tffocusLostDNI
        JTextField DNITextField=(JTextField)evt.getSource();
        if(DNITextField.getText().equalsIgnoreCase("")){
            DNITextField.setText("Nombre de la tabla");
        }
    }//GEN-LAST:event_nombreTabla_tffocusLostDNI

    private void nombreTabla_tfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTabla_tfMouseClicked
        JTextField DNITextField=(JTextField)evt.getSource();
        if(DNITextField.getText().equalsIgnoreCase("Nombre de la tabla")){
            DNITextField.setText("");
        }

    }//GEN-LAST:event_nombreTabla_tfMouseClicked

    private void nombreTabla_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTabla_tfActionPerformed

    }//GEN-LAST:event_nombreTabla_tfActionPerformed

    private void nombreTabla_tfkeyPresedDNI(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTabla_tfkeyPresedDNI

        if(nombreTabla_tf.getText().equalsIgnoreCase("Nombre de la tabla")){
            nombreTabla_tf.setText("");

        }

        char teclaPulsada=evt.getKeyChar();

    }//GEN-LAST:event_nombreTabla_tfkeyPresedDNI

    private void musculos_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musculos_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musculos_cbActionPerformed

    private void series_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_series_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_series_tfActionPerformed

    private void reps_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reps_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reps_tfActionPerformed

    private void tiempo_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempo_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempo_tfActionPerformed

    private void nDias_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nDias_cbActionPerformed
        int nDias=Integer.parseInt((String)nDias_cb.getSelectedItem());
       
        actualizarComboDiasDisponibles(nDias);
    }//GEN-LAST:event_nDias_cbActionPerformed

    private void dia_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dia_cbActionPerformed
        ActualizarInformacionTabla();
    }//GEN-LAST:event_dia_cbActionPerformed

    private void guardar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btActionPerformed
        // 1 Obtener todos los parametros
        String nombreTabla=nombreTabla_tf.getText();
        int nDias=Integer.parseInt((String)nDias_cb.getSelectedItem());
        ArrayList<Object[]> listaEjercicios=crearListaEjercicios(nDias);
        
        // 2 Comprobar si los parametros estan bien introducidos
        if(nombreTabla.equals("") || nombreTabla.equalsIgnoreCase("Nombre de la tabla") || Utilidades.comprobarComa(nombreTabla)){
            JOptionPane.showMessageDialog(null, "Introduce correctamente el nombre de la tabla, sin comas.");
        }else if(listaEjercicios.size()<1){
            JOptionPane.showMessageDialog(null, "La tabla debe de tener al menos un ejercicio.");
        }else{
            //3 pasar la lista de ejercicios a String
            String listadoEjerciciosString=crearListadoEjerciciosString(listaEjercicios);
            System.out.println(listadoEjerciciosString);
            //4 Comprobar si es una tabla base, en la cual no se adjudicaria a nadie, o ona tabla personalizada de un cliente en concreto, y mandarla al servidor.
            if(tablaBase){
                crearTablaModelo(nombreTabla, nDias,listadoEjerciciosString);
                
            }else{
                crearTablaPersonalizada(nombreTabla,nDias, listadoEjerciciosString, dniUsuarioTabla);
                
            }
            
        }
    }//GEN-LAST:event_guardar_btActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarEjercicio_bt1;
    private javax.swing.JComboBox<String> dia_cb;
    private javax.swing.JTable ejercicios_tb;
    private javax.swing.JTable ejercicios_tb1;
    private javax.swing.JButton eliminarEjercicio_bt2;
    private javax.swing.JLabel eliminar_lb2;
    private javax.swing.JLabel eliminar_lb3;
    private javax.swing.JLabel eliminar_lb4;
    private javax.swing.JButton guardar_bt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel musculo_lb;
    private javax.swing.JComboBox<String> musculos_cb;
    private javax.swing.JComboBox<String> nDias_cb;
    private javax.swing.JTextField nombreTabla_tf;
    private javax.swing.JTextField patronBuscar_tf;
    private javax.swing.JTextField reps_tf;
    private javax.swing.JButton resetEjercicios_bt;
    private javax.swing.JTextField series_tf;
    private javax.swing.JTextField tiempo_tf;
    private javax.swing.JComboBox<String> tipo_cb;
    private javax.swing.JLabel titulo_lb;
    // End of variables declaration//GEN-END:variables

    
    private void cargarTablaEjercicios() {
        
        //Establecer los parametros de filtro nulos
        tipo_cb.setSelectedIndex(0);
        musculos_cb.setSelectedIndex(0);
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
                    Logger.getLogger(pnl_AltaTabla.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(pnl_AltaTabla.class.getName()).log(Level.SEVERE, null, ex);
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
        defaultTableModel1 = (DefaultTableModel) this.ejercicios_tb1.getModel();
        
        
        ejercicios_tb.getTableHeader().setOpaque(false);
        ejercicios_tb.getTableHeader().setBackground(new Color(74,31,61));
        ejercicios_tb.getTableHeader().setForeground(new Color(255,255,255));
        ejercicios_tb.getTableHeader().setPreferredSize(new Dimension(jScrollPane1.getWidth(),50));
        ejercicios_tb.setRowHeight(50);
        ejercicios_tb1.getTableHeader().setOpaque(false);
        ejercicios_tb1.getTableHeader().setBackground(new Color(74,31,61));
        ejercicios_tb1.getTableHeader().setForeground(new Color(255,255,255));
        ejercicios_tb1.getTableHeader().setPreferredSize(new Dimension(jScrollPane1.getWidth(),50));
        ejercicios_tb1.setRowHeight(50);
        
        
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(createEmptyBorder());
        tipo_cb.setBorder(createEmptyBorder());
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.setBorder(createEmptyBorder());
        tipo_cb.setBorder(createEmptyBorder());
        dia_cb.setBorder(createEmptyBorder());
        
        Font labelFont=patronBuscar_tf.getFont();
        
        
        ejercicios_tb.getTableHeader().setFont(new Font(labelFont.getName(), Font.PLAIN, labelFont.getSize()));
        ejercicios_tb1.getTableHeader().setFont(new Font(labelFont.getName(), Font.PLAIN, labelFont.getSize()));
        
        
        //Cambiar barra 
        jScrollPane1.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(74,31,61);
            }
        
        });
        jScrollPane2.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
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
                    Logger.getLogger(pnl_AltaTabla.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        thread_cargarTrabajadores.start();
    }

    private void cargarComboBoxsMusculos() {
        ArrayList<JComboBox> musculos_combos = new ArrayList<JComboBox>();
        musculos_combos.add(musculos_cb);
        
        
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
                        musculos_cb.removeAllItems();
                        musculos_cb.addItem("Todos");
                        
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
                    Logger.getLogger(pnl_AltaTabla.class.getName()).log(Level.SEVERE, null, ex);
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
                    String musculo = (String) musculos_cb.getSelectedItem();
                    String filtroBusqueda = patronBuscar_tf.getText();

                    //Si los cb estan en "todos" no filtrará por esos campos, por lo que se envia vacio
                    if (tipo.equalsIgnoreCase("todos")) tipo="";
                    if(musculo.equalsIgnoreCase("todos")) musculo="";

                    if(tipo.equalsIgnoreCase("cardio")){
                        //Si es cardio, desactiva la funcion de musculos y hace una peticion diferente al servidor, ya que la sentencia sql no se puede hacer si no tiene musculos de la manera anterior (x inner joins)
                        musculo_lb.setVisible(false);
                        musculos_cb.setVisible(false);
                        
                        outSocket.write("C35-FILTRAR_EJERCICIOS_CARDIO:"+filtroBusqueda+"\n");
                        outSocket.flush();
                        
                    }else{
                        musculo_lb.setVisible(true);
                        musculos_cb.setVisible(true);
                        
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
                    Logger.getLogger(pnl_AltaTabla.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        thread_cargarMusculos.setDaemon(true);
        thread_cargarMusculos.start();
    } 

    private void inicializarListasDias() {
       lDia1=new HashMap<Integer,String[]>();
       lDia2=new HashMap<Integer,String[]>();
       lDia3=new HashMap<Integer,String[]>();
       lDia4=new HashMap<Integer,String[]>();
       lDia5=new HashMap<Integer,String[]>();
       lDia6=new HashMap<Integer,String[]>();
       
       
       todosLosDias=new ArrayList<HashMap<Integer,String[]>>();
       todosLosDias.add(lDia1);
       todosLosDias.add(lDia2);
       todosLosDias.add(lDia3);
       todosLosDias.add(lDia4);
       todosLosDias.add(lDia5);
       todosLosDias.add(lDia6);
    }

    private void actualizarComboDiasDisponibles(int nDias) {
        //1 Vaciar Combo
        dia_cb.removeAllItems();
        //2 Rellenarlo con los dias que esten disponibles
        for(int i=1;i<=nDias;i++){
            dia_cb.addItem("Dia "+i);
        }
        //3 Vaciar todos los ejercicios de las listas si confirma desear hacerlo
        
        int respuesta=JOptionPane.showConfirmDialog(null, "¿Quiere eliminar los ejercicios introducidos hasta ahora?","Confirmar",0);
        if(respuesta==0){
            inicializarListasDias();
        }
        //4 Actualizar la tabla que se esta mostrando
        ActualizarInformacionTabla();
        
        
        
    }

    private void ActualizarInformacionTabla() {
       try{
        //Coge todo lo almacenado en la lista del dia 
       int dia=dia_cb.getSelectedIndex(); //Contando desde 0
       
       //Limpiar tabla
       defaultTableModel1.setRowCount(0);
       
       //Coger el hasmap correspondiente
       HashMap<Integer,String[]> ejerciciosDiaCorrespondiente=todosLosDias.get(dia);
       
       //Iterar el map de los ejercicios
       Iterator it = ejerciciosDiaCorrespondiente.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            int idEjercicio=(int)pair.getKey();
            String[] datos=(String[]) pair.getValue();
            Object[] fila={idEjercicio,datos[0], datos[1],datos[2], datos[3]};
            defaultTableModel1.addRow(fila);
            //it.remove(); // avoids a ConcurrentModificationException
        }
       }catch(Exception e){
           //Aqui llega por que se activa al resetear el combo y al no tener ningun elemento en el momento de activarse, muere, pero no pasa nada.
       }
    }

    private ArrayList<Object[]> crearListaEjercicios(int nDias) {
       
       ArrayList<Object[]> listaEjerciciosDias=new ArrayList<Object[]>(); 
        //Recorrer los maps y meterlos todos en una lista de Strings[] {ndia, id_ejercicio,reps,series,tiempo}
        for(int i=0;i<nDias;i++){
            
            for (Map.Entry<Integer, String[]> entry : todosLosDias.get(i).entrySet()) {
                
                Object[] datosEjercicio=new Object[5];
                String[] d=entry.getValue();
                datosEjercicio[0]=i+1;                      //1)Numero de dia
                datosEjercicio[1]=entry.getKey();           //2)Id del ejercicio
                try{
                    datosEjercicio[2]=Integer.parseInt(d[2]);   //3)Repeticiones
                }catch(Exception e){
                    datosEjercicio[2]=0;
                }
                try{
                    datosEjercicio[3]=Integer.parseInt(d[1]);  //4)Series
                }catch(Exception e){
                    datosEjercicio[3]=0;
                }
                datosEjercicio[4]=d[3];                      //5) Tiempo
                
                listaEjerciciosDias.add(datosEjercicio);
                
        }
            
            
        }
        return listaEjerciciosDias;
     }

    private String crearListadoEjerciciosString(ArrayList<Object[]> listaEjercicios) {
        String cadenaResultado="";
        boolean primero=true;
        for(Object[] atrEjercicio:listaEjercicios){
            if(primero){
                primero=false;
            }else{
                cadenaResultado+=",";
            }
            cadenaResultado+=atrEjercicio[0]+"&"+atrEjercicio[1]+"&"+atrEjercicio[2]+"&"+atrEjercicio[3]+"&"+atrEjercicio[4];
 
        }
        return cadenaResultado;
    }

    private void crearTablaModelo(String nombreTabla, int nDias, String listaEjerciciosString) {

        Thread thread_altaTabla = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    outSocket.write("C39-ALTA_TABLA_MODELO:" + nombreTabla + "&" + nDias + "," + listaEjerciciosString + "\n");
                    outSocket.flush();

                    String respuestaServidor = inSocket.readLine();

                    if (respuestaServidor.contains("S52-TABLA_REGISTRADA")) {
                        JOptionPane.showMessageDialog(null, "Tabla registrada con exito");
                        inicializarListasDias();
                        ActualizarInformacionTabla();
                    } else if(respuestaServidor.contains("S47-ERROR_REGISTRO:duplicate")) {
                        JOptionPane.showMessageDialog(null, "Ya hay una tabla registrada con ese nombre.");
                    }else{
                        JOptionPane.showMessageDialog(null, "Error en el registro.");
                    }
                            

                } catch (IOException ex) {
                    Logger.getLogger(pnl_Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }});
        thread_altaTabla.setDaemon(true);
        thread_altaTabla.start();
    }


    private void crearTablaPersonalizada(String nombreTabla, int nDias, String listaEjerciciosString, String dniUsuarioTabla) {
         Thread thread_altaTabla = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    outSocket.write("C40-ALTA_TABLA_PERSONALIZADA:" + nombreTabla + "&" + nDias+ "&" + dniUsuarioTabla + "," + listaEjerciciosString + "\n");
                    outSocket.flush();

                    String respuestaServidor = inSocket.readLine();

                    if (respuestaServidor.contains("S52-TABLA_REGISTRADA")) {
                        JOptionPane.showMessageDialog(null, "Tabla registrada con exito");
                        inicializarListasDias();
                        ActualizarInformacionTabla();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error en el registro.");
                    }

                } catch (IOException ex) {
                    Logger.getLogger(pnl_Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }});
        thread_altaTabla.setDaemon(true);
        thread_altaTabla.start();
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
        musculos_cb.addItemListener(listenerCambiaItemCombo);
        tipo_cb.addItemListener(listenerCambiaItemCombo);
    }

}

