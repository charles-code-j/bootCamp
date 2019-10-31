package com.exercicios.exercicio6;

public class Main {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("creto","23123", 21331.0,13.0);
        Empregado empregado1 = new Empregado("cwfweo","3424", 23423.0,65.0);


        System.out.println("Impregado"+empregado.getImposto());
        System.out.println("Salario"+empregado.salarioBase);
        System.out.println("cpf"+empregado.getCpf());
        System.out.println("empregado"+ empregado.getNome());


        System.out.println(empregado1.getImposto());
        System.out.println(empregado1.salarioBase);
        System.out.println(empregado1.getCpf());
        System.out.println(empregado1.getNome());
        System.out.println();

        Vendedor vendedor = new Vendedor("olawefewf", "123123", 12.0, 12.0, 12.0,
                2.0);

        Vendedor vendedor1 = new Vendedor("olawefewref", "24324", 16.78, 7.0, 12.0,
                7.0);

        System.out.println("Valor comissao: " +vendedor.getValorDosProdutosVendidos());
        System.out.println("cpf: "+ vendedor.getCpf());
        System.out.println("Nome: "+ vendedor.getNome());
        System.out.println("Comissão: "+ vendedor.getComissao());
        System.out.println("salario"+ vendedor.salarioBase);
        System.out.println();

        System.out.println("Valor comissao: " +vendedor1.getValorDosProdutosVendidos());
        System.out.println("cpf: "+ vendedor1.getCpf());
        System.out.println("Nome: "+ vendedor1.getNome());
        System.out.println("Comissão: "+ vendedor1.getComissao());
        System.out.println("salario: "+ vendedor1.salarioBase);
        System.out.println();

        Gerente gerente = new Gerente("wefwefew", "123123", 12333.7,12.0, 300.0,2.0);
        gerente.getVendedores().add(vendedor);

        System.out.println("Ajuda de custo "+gerente.getAjudaDeCusto());
        System.out.println("Percentual gerente"+gerente.getPercentualDeComissao());
        System.out.println("Salario gerente"+gerente.salarioBase);
        System.out.println();
    }
}
