package com.exercicios.exercicio6;

public class Empregado extends Pessoa {
    protected Double salarioBase;
    private Double imposto;

    public Empregado(String nome, String cpf, Double salarioBase, Double imposto) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public void calculaSalario(){
        salarioBase = salarioBase - imposto;
    }
}
