package com.exercicios.exercico9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var animais = new ArrayList<Animal>();
        Animal gato = new Gato();
        Animal animal1 = new Gato();

        System.out.println(gato.getNomeAnimal());

    }
}