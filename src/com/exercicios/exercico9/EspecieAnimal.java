package com.exercicios.exercico9;

public enum EspecieAnimal {
    AVES("Aves"),
    MAMIFERO("Mamifero"),
    PEIXES("Peixes"),
    REPTEIS("Repteis");

    private String nomeDoAnimal;

    EspecieAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }
}
