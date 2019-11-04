package com.exercicios.exercicio10;

import com.exercicios.exercicio10.cliente.Cliente;
import com.exercicios.exercicio10.cliente.ClienteService;
import com.exercicios.exercicio10.cliente.ClienteServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClienteService clienteService = new ClienteServiceImpl();
        try {
            Cliente cliente = new Cliente();
            cliente.setCpf("3324324");
            cliente.setEmail("eweewfw@wefwew");
            cliente.setId(2);
            cliente = clienteService.save(cliente);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        List<Cliente> clienteList = clienteService.findAll();
        for (Cliente cliente: clienteList) {
            System.out.println("ID: " + cliente.getId());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println();
        }
    }
}
