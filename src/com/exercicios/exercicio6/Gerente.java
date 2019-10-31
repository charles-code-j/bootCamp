package com.exercicios.exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empregado{
    private Double ajudaDeCusto;
    private List<Vendedor> vendedores = new ArrayList<>();
    private Double percentualDeComissao;

    public Gerente(String nome, String cpf, Double salarioBase, Double imposto, Double ajudaDeCusto, Double percentualDeComissao) {
        super(nome, cpf, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
        this.percentualDeComissao = percentualDeComissao;
    }

    public Double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(Double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public Double getPercentualDeComissao() {
        return percentualDeComissao;
    }

    public void setPercentualDeComissao(Double percentualDeComissao) {
        this.percentualDeComissao = percentualDeComissao;
    }

    public void calculaSalario() {
        super.calculaSalario();
        Double valorComissao = 0.0;
        for (Vendedor vendedor: vendedores) {
             valorComissao =  valorComissao + vendedor.getValorDosProdutosVendidos();
        }
        valorComissao = valorComissao * percentualDeComissao / 100;
        salarioBase = salarioBase + valorComissao + ajudaDeCusto;
    }
}
