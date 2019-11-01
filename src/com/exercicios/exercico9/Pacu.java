package com.exercicios.exercico9;

public class Pacu implements  Animal {
    @Override
    public EspecieAnimal getEspecie() {
        return EspecieAnimal.PEIXES;
    }

    @Override
    public String getNomeAnimal() {
        return "Pacu";
    }
}
