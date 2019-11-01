package com.exercicios.exercicio8;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(10D,20D);
        Quadrado quadrado = new Quadrado(8D);
        Circulo circulo = new Circulo(4D);
        Retangulo retangulo = new Retangulo(3D,4D);

        FiguraGeometrica.calcularArea(quadrado);
        FiguraGeometrica.calcularArea(triangulo);
        FiguraGeometrica.calcularArea(circulo);
        FiguraGeometrica.calcularArea(retangulo);


        System.out.println("Area do triangulo: "+ triangulo.getArea() );
        System.out.println("Area do quadrado: "+ quadrado.getArea() );
        System.out.println("Area do retangulo: "+ retangulo.getArea() );
        System.out.println("Area do circulo: "+ circulo.getArea() );

    }
}
