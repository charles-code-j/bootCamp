package com.exercicios.exercicio7;

import java.util.ArrayList;
import java.util.List;

public class GrupoPessoa {
    private List<Pessoa> maiorDeIdade = new ArrayList<>();
    private List<Pessoa> menorDeIdade = new ArrayList<>();

    public List<Pessoa> getMaiorDeIdade() {
        return maiorDeIdade;
    }

    public List<Pessoa> getMenorDeIdade() {
        return menorDeIdade;
    }

    public void adicionarPessoa(Pessoa pessoa) {
        if (pessoa.getIdade() < 18 && pessoa.getIdade() >= 0) {
            menorDeIdade.add(pessoa);
        } else {
            maiorDeIdade.add(pessoa);
        }
    }

    public void listaDeMaior() {
        System.out.println("Maiores de idade: ");
        System.out.println();
        for (Pessoa pessoa : maiorDeIdade) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println();
        }
    }
    public void listaMenor() {
        System.out.println("Menor de idade: ");
        System.out.println();
        for (Pessoa pessoa : menorDeIdade) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println();
        }
    }
}


