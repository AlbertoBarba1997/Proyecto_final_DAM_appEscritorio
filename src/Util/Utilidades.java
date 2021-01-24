/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.font.TextAttribute;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author juana
 */
public class Utilidades {

    public Utilidades() {
    }

    public static void mostrarImagen(String rutaImagenBD, JLabel imagen_lbl1, int anchura, int altura) {
        final String DIRECCION_IP = "192.168.0.11";
        final int PUERTO_RECIBIR = 9003;

        Thread thread_recibirFoto = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    Socket conexionSocketRecibirImagen = new Socket(DIRECCION_IP, PUERTO_RECIBIR);
                    PrintWriter outputSocketRecibir = new PrintWriter(conexionSocketRecibirImagen.getOutputStream());
                    InputStream inputSocketRecibir = conexionSocketRecibirImagen.getInputStream();

                    outputSocketRecibir.write(rutaImagenBD + "\n");
                    outputSocketRecibir.flush();

                    //RECIBIR LA IMAGEN POR BYTES del flujo
                    byte[] bytesImagen = new byte[65536];   //La seccion de imagen recibida (maximo pasa de 65.536 en 65.536 bytes el flujo asi que hay que concatenar arrays para cargar la imagen completa
                    int nBytesImagen;                       //El numero de bytes que hay en la seccion recibida
                    int nBytesImagenTotales = 0;              //El numero total de bytes total en todas las secciones recibidas
                    byte[] imagenTotalAnterior = new byte[0];             //La imagen total hasta el momento
                    byte[] imagenTotal = new byte[0];                     //La imagen total final.

                    while ((nBytesImagen = inputSocketRecibir.read(bytesImagen)) != -1) {

                        nBytesImagenTotales += nBytesImagen;
                        imagenTotal = new byte[nBytesImagenTotales];

                        System.arraycopy(imagenTotalAnterior, 0, imagenTotal, 0, imagenTotalAnterior.length);
                        System.arraycopy(bytesImagen, 0, imagenTotal, imagenTotalAnterior.length, nBytesImagen);

                        imagenTotalAnterior = imagenTotal;
                        if (nBytesImagen < 65536) {
                            break;
                        }

                    }

                    ByteArrayInputStream bais = new ByteArrayInputStream(imagenTotal);
                    BufferedImage img = ImageIO.read(bais);
                    System.out.println(img);

                    BufferedImage resizedImage = resizeImage(img, anchura, altura);
                    imagen_lbl1.setIcon(new ImageIcon(resizedImage));

                    outputSocketRecibir.close();
                    inputSocketRecibir.close();
                    conexionSocketRecibirImagen.close();

                } catch (IOException e) {
                    e.printStackTrace();

                }
            }
        });
        thread_recibirFoto.setDaemon(true);
        thread_recibirFoto.start();

    }

    public static String obtenerParametro(String theInput, int nParametroBuscado) {
        //OBTIENE EL PARAMETRO indicado en la cadena indicada

        //Si es el primero estara entre los ":" y la ","
        //A partir del segundo se iran controlando por las ",", cuando lea una coma sabra que lo siguiente a leer es el siguiente parametro.
        int nParametro = 0;       //Mide por que parametro va, cuando lea un ":" o una "," -> nParametro++;

        char[] caracteres = theInput.toCharArray();
        String parametro = "";
        boolean comenzo=false;
        
        for (char c : caracteres) {
            
            if (c == ':'&& comenzo==false) {
                nParametro++;
                comenzo=true;
                
            } else if (c == ',') {
                nParametro++;
            } else if (nParametro == nParametroBuscado) {
                parametro += c;
            }

        }
        return parametro;
    }

    public static int contarParametros(String respuestaServidor) {
        //CUENTA CUANTOS PARAMETROS HAY EN UNA SECUENCIA String
        final String caracterDelimitador = ",";
        int nParametros = 0;

        if (respuestaServidor.contains(":")) {
            nParametros = 1;

            if (respuestaServidor.contains(caracterDelimitador)) {
                char[] arrayCaracteres = respuestaServidor.toCharArray();
                for (char c : arrayCaracteres) {
                    if (c == ',') {
                        nParametros++;
                    }
                }
            }
        }
        return nParametros;

    }

    public static Object[] obtenerTrabajador(String parametroTrabajador) {
        Object[] atributosTrabajador = new Object[6];
        final String separador = "/";
        //atributosTrabajador[0] = Integer.parseInt(obtenerAtributo(parametroTrabajador, 0));
        atributosTrabajador[0] = obtenerAtributo(parametroTrabajador, 1, separador);
        atributosTrabajador[1] = obtenerAtributo(parametroTrabajador, 2, separador);
        atributosTrabajador[2] = obtenerAtributo(parametroTrabajador, 3, separador);
        atributosTrabajador[3] = Float.parseFloat(obtenerAtributo(parametroTrabajador, 4, separador));
        atributosTrabajador[4] = obtenerAtributo(parametroTrabajador, 5, separador);
        atributosTrabajador[5] = obtenerAtributo(parametroTrabajador, 6, separador);

        return atributosTrabajador;

    }

    public static Object[] obtenerCliente(String parametroCliente) {
        Object[] atributosCliente = new Object[4];
        final String separador = "/";
        atributosCliente[0] = obtenerAtributo(parametroCliente, 0, separador);
        atributosCliente[1] = obtenerAtributo(parametroCliente, 1, separador);
        atributosCliente[2] = obtenerAtributo(parametroCliente, 2, separador);
        atributosCliente[3] = obtenerAtributo(parametroCliente, 3, separador);

        return atributosCliente;

    }
    
    public static String[] obtenerHorario(String parametroCliente) {
        String[] atributosHorario = new String[4];
        final String separador = "&";
        atributosHorario[0] = obtenerAtributo(parametroCliente, 0, separador);  //id
        atributosHorario[1] = obtenerAtributo(parametroCliente, 1, separador);  //dia
        atributosHorario[2] = obtenerAtributo(parametroCliente, 2, separador);  //hora
        atributosHorario[3] = obtenerAtributo(parametroCliente, 3, separador);  //nombreClase

        return atributosHorario;

    }
    public static String[] obtenerEntrenadores(String parametroCliente) {
        String[] atributosEntrenador = new String[4];
        final String separador = "&";
        atributosEntrenador[0] = obtenerAtributo(parametroCliente, 0, separador);  //id
        atributosEntrenador[1] = obtenerAtributo(parametroCliente, 1, separador);  //nombre
        atributosEntrenador[2] = obtenerAtributo(parametroCliente, 2, separador);  //apellidos

        return atributosEntrenador;

    }
    public static String[] obtenerClase(String parametroCliente) {
        String[] atributosClase = new String[4];
        final String separador = "&";
        atributosClase[0] = obtenerAtributo(parametroCliente, 0, separador);  //id
        atributosClase[1] = obtenerAtributo(parametroCliente, 1, separador);  //nombre
        
        return atributosClase;

    }

    public static Object[] obtenerDatosCliente(String parametroCliente, String separador) {

        Object[] atributosCliente = new Object[8];
        atributosCliente[0] = obtenerAtributo(parametroCliente, 0, separador);    //dni
        atributosCliente[1] = obtenerAtributo(parametroCliente, 1, separador);    //nombre
        atributosCliente[2] = obtenerAtributo(parametroCliente, 2, separador);    //apellidos
        atributosCliente[3] = obtenerAtributo(parametroCliente, 3, separador);    //fecha nacimiento
        atributosCliente[4] = obtenerAtributo(parametroCliente, 4, separador);    //peso
        atributosCliente[5] = obtenerAtributo(parametroCliente, 5, separador);    //altura
        atributosCliente[6] = obtenerAtributo(parametroCliente, 6, separador);    //notas
        atributosCliente[7] = obtenerAtributo(parametroCliente, 7, separador);    //ruta fotografia

        return atributosCliente;
    }

    public static Object[] obtenerDatosClase(String parametroCliente, String separador) {

        Object[] atributosCliente = new Object[8];
        atributosCliente[0] = obtenerAtributo(parametroCliente, 0, separador);    //nombre
        atributosCliente[1] = obtenerAtributo(parametroCliente, 1, separador);    //aforo
        atributosCliente[2] = obtenerAtributo(parametroCliente, 2, separador);    //descripccion
        atributosCliente[3] = obtenerAtributo(parametroCliente, 3, separador);    //id
        atributosCliente[4] = obtenerAtributo(parametroCliente, 4, separador);    //rutaImg

        return atributosCliente;
    }

    public static Object[] obtenerAtributosClave(String parametroClave) {
        String separador = "/";
        Object[] atributosTrabajador = new Object[6];
        atributosTrabajador[0] = Integer.parseInt(obtenerAtributo(parametroClave, 0, separador));
        atributosTrabajador[1] = obtenerAtributo(parametroClave, 1, separador);
        atributosTrabajador[2] = obtenerAtributo(parametroClave, 2, separador);

        return atributosTrabajador;
    }

    public static String obtenerAtributo(String cadena, int nAtributoBuscado, String separador) {
        int nParametro = 0;       //Mide por que parametro va
        final char caracterDelimitador = separador.charAt(0);
        char[] caracteres = cadena.toCharArray();
        String parametro = "";

        for (char c : caracteres) {

            if (c == caracterDelimitador) {
                nParametro++;
            } else if (nParametro == nAtributoBuscado) {
                parametro += c;
            }

        }
        return parametro;

    }

    public static void opcionFocusGained(java.awt.event.MouseEvent evt) {
        JLabel labelFocus = (JLabel) evt.getSource();
        Font font = labelFocus.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        labelFocus.setFont(font.deriveFont(attributes));
    }

    public static void opcionFocusLost(java.awt.event.MouseEvent evt) {
        JLabel labelFocus = (JLabel) evt.getSource();
        Font font = labelFocus.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        labelFocus.setFont(font.deriveFont(attributes));
    }

    public static BufferedImage resizeImage(BufferedImage img, int newW, int newH) {
        Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = dimg.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();

        return dimg;
    }

    public static String primeraLetraMayuscula(String input) {
        String output;
        try {
            output = input.substring(0, 1).toUpperCase() + input.substring(1);
        } catch (Exception e) {
            output = "";
        }
        return output;
    }

}
