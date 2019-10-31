package com.exercicios.exercicio6;

public class Vendedor extends Empregado {
    private Double valorDosProdutosVendidos;
    private Double comissao;


    public Vendedor(String nome, String cpf, Double salarioBase, Double imposto, Double valorDosProdutosVendidos, Double comissao) {
        super(nome, cpf, salarioBase, imposto);
        this.valorDosProdutosVendidos = valorDosProdutosVendidos;
        this.comissao = comissao;
    }

    public Double getValorDosProdutosVendidos() {
        return valorDosProdutosVendidos;
    }

    public void setValorDosProdutosVendidos(Double valorDosProdutosVendidos) {
        this.valorDosProdutosVendidos = valorDosProdutosVendidos;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public void calculaSalario() {
        super.calculaSalario();
        Double valorComissao =  valorDosProdutosVendidos * valorDosProdutosVendidos / 100;
        salarioBase += valorComissao;

    }
}
