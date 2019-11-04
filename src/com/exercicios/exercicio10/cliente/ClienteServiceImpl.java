package com.exercicios.exercicio10.cliente;

import com.exercicios.exercicio10.crud.CrudDAOImpl;

public class ClienteServiceImpl extends CrudDAOImpl<Cliente>  implements  ClienteService {

    protected void preSave(Cliente entity) {
        if (entity.getNome() == null) {
            throw new RuntimeException("Campo nome não inserido: ");
        }
    }
}
