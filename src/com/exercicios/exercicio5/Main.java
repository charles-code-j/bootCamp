package com.exercicios.exercicio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.setSaldo(2300.0);
        contaCorrente.setValorSacar(120.0);
        contaCorrente.setNumeroDaConta(1123);

        System.out.println("valor atual"+ contaCorrente.getSaldo());



    }
}
