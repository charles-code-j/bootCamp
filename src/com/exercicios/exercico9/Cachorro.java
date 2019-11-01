package com.exercicios.exercico9;

public class Cachorro implements Animal {
    @Override
    public EspecieAnimal getEspecie() {
        return EspecieAnimal.MAMIFERO;
    }

    @Override
    public String getNomeAnimal() {
        return  "Cachorro";
    }
}
