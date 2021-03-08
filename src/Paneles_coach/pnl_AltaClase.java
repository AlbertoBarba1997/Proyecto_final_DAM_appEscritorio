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
public class pnl_AltaClase extends javax.swing.JPanel {

    Menu_coach_interfaz interfaz_menu_padre;
    Menu_admin_interfaz interfaz_menu_padre_admin;
    BufferedReader inSocket;
    PrintWriter outSocket;
    boolean admin=false;
    
   
    
    public pnl_AltaClase(Menu_coach_interfaz interfaz_menu_padre, BufferedReader inSocket, PrintWriter outSocket ) {
        initComponents();
        this.interfaz_menu_padre=interfaz_menu_padre;
        this.inSocket=inSocket;
        this.outSocket=outSocket;
        
    }
     public pnl_AltaClase(Menu_admin_interfaz interfaz_menu_padre_admin, BufferedReader inSocket, PrintWriter outSocket ) {
        initComponents();
        this.interfaz_menu_padre_admin=interfaz_menu_padre_admin;
        admin=true;
        this.inSocket=inSocket;
        this.outSocket=outSocket;
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        nombre_tf = new javax.swing.JTextField();
        home_bt = new Recursos.RSButtonMetro();
        alta_bt = new Recursos.RSButtonMetro();
        error_lb = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        subir_bt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion_tf = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        aforo_tf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setEnabled(false);
        setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1390, 850));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre ");

        nombre_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombre_tf.setForeground(new java.awt.Color(255, 255, 255));
        nombre_tf.setToolTipText("");
        nombre_tf.setBorder(null);
        nombre_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        nombre_tf.setOpaque(false);
        nombre_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_tfActionPerformed(evt);
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

        alta_bt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        alta_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_checkmark_40px.png"))); // NOI18N
        alta_bt.setText("Dar de alta");
        alta_bt.setToolTipText("");
        alta_bt.setColorHover(new java.awt.Color(255, 255, 255));
        alta_bt.setColorNormal(new java.awt.Color(255, 255, 255));
        alta_bt.setOpaque(false);
        alta_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alta_btMouseClicked(evt);
            }
        });
        alta_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alta_btActionPerformed(evt);
            }
        });

        error_lb.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        error_lb.setForeground(new java.awt.Color(255, 255, 255));
        error_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error_lb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Foto");

        subir_bt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        subir_bt.setText("SUBIR");
        subir_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subir_btActionPerformed(evt);
            }
        });

        descripcion_tf.setColumns(20);
        descripcion_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        descripcion_tf.setForeground(new java.awt.Color(51, 51, 51));
        descripcion_tf.setRows(5);
        descripcion_tf.setWrapStyleWord(true);
        descripcion_tf.setBorder(null);
        descripcion_tf.setCaretColor(new java.awt.Color(51, 51, 51));
        descripcion_tf.setOpaque(false);
        jScrollPane1.setViewportView(descripcion_tf);

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ALTA CLASE");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Aforo máximo");

        jSeparator8.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator8.setForeground(new java.awt.Color(204, 204, 204));

        aforo_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        aforo_tf.setForeground(new java.awt.Color(255, 255, 255));
        aforo_tf.setToolTipText("");
        aforo_tf.setBorder(null);
        aforo_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        aforo_tf.setOpaque(false);
        aforo_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aforo_tfActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("personas");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Descripcion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(526, 526, 526)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 405, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nombre_tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(136, 136, 136))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator8)
                                        .addComponent(aforo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(87, 87, 87)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(subir_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(316, 316, 316)))
                    .addComponent(error_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(353, 353, 353))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alta_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(581, 581, 581))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(home_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7)))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aforo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subir_bt)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(alta_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)))
                .addComponent(error_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void home_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btActionPerformed
        //esconderMenu();
    }//GEN-LAST:event_home_btActionPerformed

    private void home_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btMouseClicked
        if(interfaz_menu_padre!=null){
            interfaz_menu_padre.cambiarPanelContenido(new pnl_Clases(interfaz_menu_padre, inSocket, outSocket));
        }else{
            interfaz_menu_padre_admin.cambiarPanelContenido(new pnl_Clases(interfaz_menu_padre_admin, inSocket, outSocket));
        }
        
    }//GEN-LAST:event_home_btMouseClicked

    private void alta_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alta_btActionPerformed
        //0 resetear mensaje error
        error_lb.setText("");

        //1 comprobar que los campos estan llenos
        if (!nombre_tf.getText().equals("") || !aforo_tf.getText().equals("")) {
           
            try {
                
                
                String nombre = nombre_tf.getText();
                int aforo = Integer.parseInt(aforo_tf.getText()); 
                String descripccion = descripcion_tf.getText();
                String rutaFoto = subir_bt.getText();
                //3 Lanzar peticion al servidor para dar de alta al nuevo trabajador
                crearClase(nombre, aforo, rutaFoto, descripccion);

            } catch (NumberFormatException excepcionNumeroMalIntroducido) {
                error_lb.setText("Aforo maximo mal introducido. Escriba un numero entero.");
            } catch (Exception e){
                error_lb.setText("Error desconocido.");
            }

        }else{
            error_lb.setText("Rellene correctamente los campos.");
            
        }
    }//GEN-LAST:event_alta_btActionPerformed

    private void alta_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alta_btMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_alta_btMouseClicked

    private void subir_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subir_btActionPerformed
        new Subir_Foto_interfaz(this).setVisible(true);
    }//GEN-LAST:event_subir_btActionPerformed

    private void nombre_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_tfActionPerformed

    private void aforo_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aforo_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aforo_tfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aforo_tf;
    private Recursos.RSButtonMetro alta_bt;
    private javax.swing.JTextArea descripcion_tf;
    private javax.swing.JLabel error_lb;
    private Recursos.RSButtonMetro home_bt;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField nombre_tf;
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
                        System.out.println(bytesImagen);
                        System.out.println(nBytesImagen);
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
                    System.out.println(img);
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

    private void crearClase(String nombre, int aforo, String rutaImg, String descripccion) {
        Thread thread_altaCliente = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    
                   

                    outSocket.write("C21-ALTA_CLASE:"+nombre+","+aforo+","+rutaImg+","+descripccion+"\n");
                    outSocket.flush();

                    String respuestaServidor = inSocket.readLine();
                    
                    
                    if (respuestaServidor.contains("S30-CLASE_REGISTRADA")){
                        error_lb.setText("CLASE REGISTRADA CON EXITO! Registre otra clase si lo desea.");
                    } 
                    else if(respuestaServidor.contains("S31-CLASE_REPETIDA")) error_lb.setText("Error de registro: Ya hay una clase con ese nombre");
                    else error_lb.setText("Error de comunicacion con el servidor.");

                } catch (IOException ex) {
                    Logger.getLogger(pnl_Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        thread_altaCliente.start();
    }

    
    
}
