package com.exercicios.exercico9;

public class Aguia implements Animal {
    @Override
    public EspecieAnimal getEspecie() {
        return EspecieAnimal.AVES;
    }

    @Override
    public String getNomeAnimal() {
        return "Aguia";
    }

}
