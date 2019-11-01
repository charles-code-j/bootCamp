package com.exercicios.exercico9;

public class Gato implements Animal {
    @Override
    public EspecieAnimal getEspecie() {
        return EspecieAnimal.MAMIFERO;
    }

    @Override
    public String getNomeAnimal() {
        return "Gato";
    }
}
