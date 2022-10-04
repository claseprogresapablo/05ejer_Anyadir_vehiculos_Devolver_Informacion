package com.example.a05ejer_anyadir_vehiculos_devolver_informacion.modelos;

import java.io.Serializable;

public class Coche implements Serializable {

    private String marca;
    private String modelo;
    private String Color;

    public Coche() {
    }


    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        Color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }
}
