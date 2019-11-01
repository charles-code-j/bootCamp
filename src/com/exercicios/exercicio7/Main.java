package com.exercicios.exercicio7;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("creito", "rasdt", "12312321", "wefwfwefwf@wfew", 12);
        Pessoa pessoa1 = new Pessoa("loerji", "wfwe", "234234234", "3242342@ewqfw", 67);
        Pessoa pessoa2 = new Pessoa("wfwqwehgtef", "regerger", "123123", "3rtgtr2@e34wqfw", 18);
        Pessoa pessoa3 = new Pessoa("wfrthtrh", "erergege", "123123", "3rtgtr2@e34wqfw", 13);

        GrupoPessoa grupoPessoa = new GrupoPessoa();
        grupoPessoa.adicionarPessoa(pessoa);
        grupoPessoa.adicionarPessoa(pessoa1);
        grupoPessoa.adicionarPessoa(pessoa2);
        grupoPessoa.adicionarPessoa(pessoa3);


        grupoPessoa.listaDeMaior();
        grupoPessoa.listaMenor();


    }
}
