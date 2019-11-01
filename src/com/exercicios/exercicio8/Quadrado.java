package com.exercicios.exercicio8;

public class Quadrado  implements  Figura{
    private Double lado;

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    public Double getArea() {
        return lado * lado;
    }
}