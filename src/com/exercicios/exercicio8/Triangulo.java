package com.exercicios.exercicio8;

public class Triangulo implements Figura {
    private Double base;
    private  Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getArea() {
        return (base * altura ) / 2;
    }
}
