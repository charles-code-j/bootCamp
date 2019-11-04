package com.exercicios.exercicio10.vendedor;

import com.exercicios.exercicio10.crud.CrudDAOImpl;
import com.exercicios.exercicio10.crud.CrudServiceImpl;

public class VendedorServiceImpl extends CrudServiceImpl<Vendedor> implements VendedorService {
    protected void preSave(Vendedor entity) {
        if (entity.getNome() == null) {
            throw new RuntimeException("Campo nome não inserido: ");
        }

    }
}
