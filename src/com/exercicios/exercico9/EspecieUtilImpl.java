package com.exercicios.exercico9;

import java.util.ArrayList;
import java.util.List;

public class EspecieUtilImpl implements EspeciesUtil {
    List<Animal> animal = new ArrayList<>();

    @Override
    public List<Animal> filtraEspecie(List<Animal> animais, EspecieAnimal especieFiltrar) {

        for (Animal animai : animais) {
            if (animai.getEspecie().equals(especieFiltrar)) {
                animal.add(animai);
            }
        }
        return animal;
    }

    @Override
    public List<EspecieAnimal> classificaEspecies(List<Animal> animais) {

        List<EspecieAnimal> especiesDistintas = new ArrayList<>();
        for (Animal animal : animais) {
            if (!especiesDistintas.contains(animal.getEspecie())) {
                especiesDistintas.add(animal.getEspecie());
            }
        }
        return especiesDistintas;
    }
}
