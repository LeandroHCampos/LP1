package com.example.exercicio2.Ex4;

import com.example.exercicio2.SalvarCSV;

public class Lampada extends SalvarCSV {
    private String cor;
    private int potencia;
    private boolean ligada;

    public Lampada(String cor, int potencia, boolean ligada) {
        this.cor = cor;
        this.potencia = potencia;
        this.ligada = ligada;
    }


    @Override
    protected String[] getCabecalho() {
        return new String[]{
                "Cor","Potencia","Ligada"
        };
    }

    @Override
    protected String[][] getDados() {
        return new String[][]{
                {
                    cor,String.valueOf(potencia),String.valueOf(ligada)
                }
        };
    }
}
