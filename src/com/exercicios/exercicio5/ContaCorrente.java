package com.exercicios.exercicio5;

public class ContaCorrente extends ContaBancaria {
    private Integer taxaDeOperacao = 2;
    private Double valorSacar = 0.0;

    public Integer getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public Double getValorSacar() {
        return valorSacar;
    }

    public void setValorSacar(Double valorSacar) {
        this.valorSacar = valorSacar;
    }

    public void sacar(Double valorSacar) {
        if (getSaldo() > getSaldo() && getSaldo() <= valorSacar) {
            setSaldo(getSaldo() - valorSacar + (valorSacar * (taxaDeOperacao / 100)));
        } else {
            System.out.println("Não tem dinheiro");

        }
    }
}
