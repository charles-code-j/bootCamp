package com.exercicios.exercico9;

import java.util.ArrayList;
import java.util.List;
/*
O método deve contabilizar o número de animais disponíveis em cada uma das espécies e retornar os resultados
como uma lista de objetos da classe Resultado. Cada objeto conterá uma espécie e o número de animais
da mesma contabilizados. Devem ser consideradas apenas as espécies cujos animais estão presentes na lista.


 */
public class ContabilizarEspecies  {
     public List<Resultado> contEspec(List<Animal> animais, EspecieUtilImpl especieUtil ){
         List<Resultado> resultados = new ArrayList<>();
         List<EspecieAnimal> especieAnimals = new ArrayList<>();
         especieAnimals = especieUtil.classificaEspecies(animais);
         for (EspecieAnimal especieAnimal : especieAnimals) {
             List<Animal> animals = new ArrayList<>();
             animais = especieUtil.filtraEspecie(animais, especieAnimal);
             Integer qtd = 0;
             qtd = animals.size();
             resultados.add(new Resultado(especieAnimal, qtd));
         }
         return resultados;
     }


}
