package com.exercicios.exercicio10.Item;

import com.exercicios.exercicio10.crud.CrudServiceImpl;

public class ItemServiceImpl extends CrudServiceImpl<Item> implements ItemService {
    protected void preSave(Item entity) {
        if (entity.getQtdEstoque() == null) {
            throw new RuntimeException("Campo nome não inserido: ");
        }
        if(entity.getValorUnitario() == null){
            throw  new RuntimeException("Valor não adicionado");
        }
    }
}
