package com.exercicios.exercicio10.crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CrudDAOImpl<T extends BaseObject> implements CrudDAO <T> {

    private List<T> list = new ArrayList<>();


    public T save(T entity) {
        entity.setId(Math.abs(new Random().nextInt()));
        list.add(entity);
        return entity;
    }


    public void delete(Integer id) {
        list.removeIf(entity -> entity.getId().equals(id));
    }


    public List<T> findAll() {
        return list;
    }


    public T findById(Integer id) {
        for (T entity : list) {
            if (entity.getId().equals(id)) {
                return entity;
            }
        }
        return null;
    }
}
