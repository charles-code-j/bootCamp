package com.exercicios.exercicio10.vendedor;

import com.exercicios.exercicio10.crud.BaseObject;

import java.math.BigDecimal;

public class Vendedor extends BaseObject {

    private String nome;
    private BigDecimal persentualDeComissao;
    private BigDecimal percentualDeDescontoMax;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPersentualDeComissao() {
        return persentualDeComissao;
    }

    public void setPersentualDeComissao(BigDecimal persentualDeComissao) {
        this.persentualDeComissao = persentualDeComissao;
    }

    public BigDecimal getPercentualDeDescontoMax() {
        return percentualDeDescontoMax;
    }

    public void setPercentualDeDescontoMax(BigDecimal percentualDeDescontoMax) {
        this.percentualDeDescontoMax = percentualDeDescontoMax;
    }
}
