package com.exercicios.exercicio4;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Voo voo  = new Voo(LocalDateTime.now(), 233, 100);
        voo.lista();
    }

}
