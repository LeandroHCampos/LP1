package com.example.exercicio2.Ex4;

import com.example.exercicio2.SalvarCSV;

public class Cobra extends SalvarCSV {
    private String especie;
    private double comprimento;
    private boolean venenosa;

    public Cobra(String especie, double comprimento, boolean venenosa) {
        this.especie = especie;
        this.comprimento = comprimento;
        this.venenosa = venenosa;
    }


    @Override
    protected String[] getCabecalho() {
        return new String[]{
                "Especie","Comprimento","É Venenosa"
        };
    }

    @Override
    protected String[][] getDados() {
        return new String[][]{
            {
                especie,String.valueOf(comprimento),String.valueOf(venenosa)
            }
        };
    }
}