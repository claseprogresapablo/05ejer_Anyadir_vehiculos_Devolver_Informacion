package com.example.a05ejer_anyadir_vehiculos_devolver_informacion.modelos;

import java.io.Serializable;

public class Moto implements Serializable {

    private String marca;
    private String modelo;
    private int cc;

    public Moto(String marca, String modelo, int cc) {
        this.marca = marca;
        this.modelo = modelo;
        this.cc = cc;
    }

    public Moto() {
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

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cc=" + cc +
                '}';
    }
}
