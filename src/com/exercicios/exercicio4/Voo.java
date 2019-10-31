package com.exercicios.exercicio4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Voo {
    private Integer numVoo;
    private LocalDateTime localDateTime;
    private Integer numeroMaxPassageiro = 100;
    private boolean vagaOcupada;
    private List<Integer> acentos = new ArrayList<>();

    public Voo(LocalDateTime localDateTime, Integer numVoo, Integer numeroMaxPassageiro) {
        this.numVoo = numVoo;
        this.localDateTime = localDateTime;
        this.numeroMaxPassageiro = numeroMaxPassageiro;

        for (Integer i = 1; i <= numeroMaxPassageiro; i++) {
            acentos.add(i);
        }
    }

    public Integer getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(Integer numVoo) {
        this.numVoo = numVoo;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Integer getNumeroMaxPassageiro() {
        return numeroMaxPassageiro;
    }

    public void setNumeroMaxPassageiro(Integer numeroMaxPassageiro) {
        numeroMaxPassageiro = numeroMaxPassageiro;
    }

    public boolean isVagaOcupada() {
        return vagaOcupada;
    }

    public void setVagaOcupada(boolean vagaOcupada) {
        this.vagaOcupada = vagaOcupada;
    }

    public List<Integer> getAssentos() {
        return acentos;
    }

    public void setAssentos(List<Integer> assentos) {
        this.acentos = assentos;
    }

    public void lista() {
        System.out.println("numero voo: " + numVoo);
        for (Integer i : acentos) {
            System.out.print(" - " + i);
        }
        System.out.println();
    }

    public Integer acentoLivre() {
        if (acentos.isEmpty()) {
            return acentos.get(0);
        }
        return null;
    }
}



