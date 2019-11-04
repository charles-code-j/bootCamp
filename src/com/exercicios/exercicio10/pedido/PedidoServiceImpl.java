package com.exercicios.exercicio10.pedido;

import com.exercicios.exercicio10.Item.Item;
import com.exercicios.exercicio10.crud.CrudServiceImpl;

import java.math.BigDecimal;

public class PedidoServiceImpl extends CrudServiceImpl<Pededido> implements PedidoService {
    protected void preSave(Pededido entity) {
        BigDecimal totalDesconto = BigDecimal.ZERO;
        BigDecimal totalPedido = BigDecimal.ZERO;
        if (entity.getCliente() == null) {
            throw new RuntimeException("Campo cliente não inserido: ");
        }
        if (entity.getVendedor() == null) {
            throw new RuntimeException("Campo vendedor não inserido: ");
        }
        if (entity.getDataDeCadastro() == null) {
            throw new RuntimeException("Campo data cadastro não inserido: ");
        }

        for (PedidoItem pedidoItem : entity.getPedidoItemList()) {
            if (pedidoItem.getQuantidade() == null) {
                throw new RuntimeException("Campo nome não inserido: ");
            } else if (pedidoItem.getValorUnitario() == null) {
                throw new RuntimeException("Valor não adicionado");
            }

            if (pedidoItem.getItem().isInativo()) {
                throw new RuntimeException("Valor não adicionado");
            }
            if (pedidoItem.getQuantidade().compareTo(pedidoItem.getItem().getQtdEstoque()) > 0) {
                throw new RuntimeException("Quantidade maior que o disponivel: " + "solicitado: " + pedidoItem.getQuantidade()
                        + ". Disponivel: " + pedidoItem.getItem().getQtdEstoque());
            }
            totalPedido = totalPedido.add(pedidoItem.getValorDesconto());
            totalDesconto = totalPedido.add(pedidoItem.getValorDesconto());

            BigDecimal diferenca = totalDesconto.divide(totalPedido).multiply(BigDecimal.valueOf(100));
            if(pedidoItem.getValorDesconto().compareTo(pedidoItem.getValorTotal()) == 1){
                throw new RuntimeException("Desconto exedeu:");
            }

        }

    }
    protected void postSave(Pededido entity) {
        BigDecimal  totalItens = BigDecimal.ZERO;
        for (PedidoItem pedidoItem : entity.getPedidoItemList() ) {
           // totalItens = totalItens.add(pedidoItem.getItem());

        }
    }
}


