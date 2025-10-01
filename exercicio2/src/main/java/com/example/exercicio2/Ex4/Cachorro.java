package com.example.exercicio2.Ex4;

import com.example.exercicio2.SalvarCSV;

public class Cachorro extends SalvarCSV{
    private String nome;
    private String cor;
    private String raca;

    public Cachorro(String nome, String cor, String raca) {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
    }

    @Override
    protected String[] getCabecalho() {
        return new String[]{"nome", "cor", "raca"};
    }

    @Override
    protected String[][] getDados() {
        return new String[][]{
                {nome, cor, raca}
        };
    }
}

