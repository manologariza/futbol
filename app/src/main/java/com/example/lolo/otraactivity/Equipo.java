package com.example.lolo.otraactivity;

import java.io.Serializable;

/**
 * Created by Lolo on 16/10/2017.
 */

public class Equipo {

    private String nombreEquipo;
    private String descripcionEquipo;
    private String nombreJugador;
    private String descripcionJugador;

    public Equipo(String n, String d, String no, String de){
        this.nombreEquipo=n;
        this.descripcionEquipo=d;
        this.nombreJugador=no;
        this.descripcionJugador=de;

    }

    //GETTER Y SETTER


    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getDescripcionEquipo() {
        return descripcionEquipo;
    }

    public void setDescripcionEquipo(String descripcionEquipo) {
        this.descripcionEquipo = descripcionEquipo;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getDescripcionJugador() {
        return descripcionJugador;
    }

    public void setDescripcionJugador(String descripcionJugador) {
        this.descripcionJugador = descripcionJugador;
    }
}
