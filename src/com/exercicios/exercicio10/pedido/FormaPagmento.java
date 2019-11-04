package com.exercicios.exercicio10.pedido;

public enum FormaPagmento {
    DINHEIRO("Dinhriro"),
    CARTAO("Cartão"),
    BOLETO("Boleto");

    private String label;

    FormaPagmento(String label) {
        this.label = label;
    }
}
