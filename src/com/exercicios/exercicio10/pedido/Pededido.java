package com.exercicios.exercicio10.pedido;

import com.exercicios.exercicio10.Item.Item;
import com.exercicios.exercicio10.cliente.Cliente;
import com.exercicios.exercicio10.crud.BaseObject;
import com.exercicios.exercicio6.Vendedor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pededido extends BaseObject {
    private Cliente cliente;
    private Vendedor vendedor;
    private LocalDateTime dataDeCadastro;
    private LocalDateTime dataDeValidade;
    private LocalDateTime dataDePrevisaoDeEntrega;
    private String enderecoDeEntrega;
    private FormaPagmento formaPagmento;
    private List<PedidoItem> pedidoItemList = new ArrayList<>();


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDateTime getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(LocalDateTime dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public LocalDateTime getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(LocalDateTime dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public LocalDateTime getDataDePrevisaoDeEntrega() {
        return dataDePrevisaoDeEntrega;
    }

    public void setDataDePrevisaoDeEntrega(LocalDateTime dataDePrevisaoDeEntrega) {
        this.dataDePrevisaoDeEntrega = dataDePrevisaoDeEntrega;
    }

    public String getEnderecoDeEntrega() {
        return enderecoDeEntrega;
    }

    public void setEnderecoDeEntrega(String enderecoDeEntrega) {
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

    public FormaPagmento getFormaPagmento() {
        return formaPagmento;
    }

    public void setFormaPagmento(FormaPagmento formaPagmento) {
        this.formaPagmento = formaPagmento;
    }

    public List<PedidoItem> getPedidoItemList() {
        return pedidoItemList;
    }

    public void setPedidoItemList(List<PedidoItem> pedidoItemList) {
        this.pedidoItemList = pedidoItemList;
    }
}
