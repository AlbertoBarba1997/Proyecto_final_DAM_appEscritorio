/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;


public class Ejercicio implements Serializable {
    int idEjercicio;
    int dia;
    String nombre;
    String descripcion;
    String tipo;
    String rutaImg;

    int series;
    int repeticiones;
    String tiempo;
   

    public Ejercicio(int idEjercicio, int dia, String nombre, String descripcion, String tipo, String rutaImg, int series, int repeticiones, String tiempo) {
        this.idEjercicio = idEjercicio;
        this.dia = dia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.rutaImg = rutaImg;

        this.series = series;
        this.repeticiones = repeticiones;
        this.tiempo = tiempo;
        
    }

    

    public Ejercicio() {
    }

    @Override
    public String toString() {
        return "Ejercicio{" +
                "idEjercicio=" + idEjercicio +
                ", dia=" + dia +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", rutaImg='" + rutaImg + '\'' +
                ", series=" + series +
                ", repeticiones=" + repeticiones +
                ", tiempo='" + tiempo + '\'' +
                '}';
    }

   

    public int getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(int idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRutaImg() {
        return rutaImg;
    }

    public void setRutaImg(String rutaImg) {
        this.rutaImg = rutaImg;
    }


    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public Object[] getFila() {
        Object[] fila={idEjercicio,nombre,series,repeticiones,tiempo};
        return fila;
    }
}