package com.exercicios.exercicio10.Item;

import com.exercicios.exercicio10.crud.BaseObject;

import java.math.BigDecimal;

public class Item extends BaseObject {
    private String descricao;
    private boolean inativo;
    private BigDecimal qtdEstoque;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isInativo() {
        return inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }

    public BigDecimal getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(BigDecimal qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    private BigDecimal valorUnitario;
}
