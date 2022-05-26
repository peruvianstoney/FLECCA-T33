package com.example.exament3.Servicios;

import java.io.Serializable;

public class Pokemon implements Serializable {

    public String Nombre;
    public String Tipo;
    public String url_imagen;
    public Number latitude;
    public Number longitude;

    public Pokemon() {
    }


    public Pokemon(String nombre, String tipo, String url_imagen, Number latitude, Number longitude) {
        Nombre = nombre;
        Tipo = tipo;
        this.url_imagen = url_imagen;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }

    public Number getLatitude() {
        return latitude;
    }

    public void setLatitude(Number latitude) {
        this.latitude = latitude;
    }

    public Number getLongitude() {
        return longitude;
    }

    public void setLongitude(Number longitude) {
        this.longitude = longitude;
    }
}
