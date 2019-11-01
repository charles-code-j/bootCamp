package com.exercicios.exercicio8;

public class Circulo implements Figura {
    private Double raio;



    public Circulo(Double raio) {
        this.raio = raio;
    }


    public Double getArea() {
        return Math.PI * (raio * raio);
    }
}
