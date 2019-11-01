package com.exercicios.exercico9;

public class Cobra implements Animal{
    @Override
    public EspecieAnimal getEspecie() {
        return EspecieAnimal.REPTEIS;
    }

    @Override
    public String getNomeAnimal() {
        return "Cobra";
    }
}
