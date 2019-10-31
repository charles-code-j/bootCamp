package com.exercicios.ExemploHeranca;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private LocalDate dataDeAdmissao;

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public BigDecimal calculaSalario(){
        return salario;
    }
}
