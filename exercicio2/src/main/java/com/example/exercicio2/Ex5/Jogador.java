package com.example.exercicio2.Ex5;

import com.example.exercicio2.SalvarCSV;

public class Jogador extends SalvarCSV {

    private String nome;
    private int numeroCamisa;
    private String posicao;

    public Jogador(String nome, int numeroCamisa, String posicao) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
    }

    @Override
    protected String[] getCabecalho() {
        return new String[]{
                "Nome", "Numero","Posição"
        };
    }

    @Override
    protected String[][] getDados() {
        return new String[][]{
                {nome, String.valueOf(numeroCamisa), posicao},
        };
    }
}
