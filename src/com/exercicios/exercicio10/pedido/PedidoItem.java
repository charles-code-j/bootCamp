package com.exercicios.exercicio10.pedido;

import com.exercicios.exercicio10.Item.Item;
import com.exercicios.exercicio10.crud.BaseObject;
import com.exercicios.exercicio10.pedido.Pededido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PedidoItem extends BaseObject {
    private Pededido pedido;
    private BigDecimal quantidade;
    private Item item;
    private BigDecimal valorUnitario;
    private BigDecimal valorDesconto;
    private List<Pededido> pededidos = new ArrayList<>();

    public Pededido getPedido() {
        return pedido;
    }

    public void setPedido(Pededido pedido) {
        this.pedido = pedido;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public List<Pededido> getPededidos() {
        return pededidos;
    }

    public void setPededidos(List<Pededido> pededidos) {
        this.pededidos = pededidos;
    }

    public BigDecimal getValorTotal() {
         return quantidade.multiply(valorUnitario).subtract(valorDesconto);
    }

    public BigDecimal getValorTotalSemDesconto(){
        return  (quantidade.multiply(valorUnitario));
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
