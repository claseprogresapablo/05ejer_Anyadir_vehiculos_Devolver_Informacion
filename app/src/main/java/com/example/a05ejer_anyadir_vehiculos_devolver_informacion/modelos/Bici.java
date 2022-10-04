package com.example.a05ejer_anyadir_vehiculos_devolver_informacion.modelos;

import java.io.Serializable;

public class Bici implements Serializable {

    private String marca;
    private Float pulgadas;

    public Bici(String marca, Float pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    public Bici() {
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Bici{" +
                "marca='" + marca + '\'' +
                ", pulgadas=" + pulgadas +
                '}';
    }
}
