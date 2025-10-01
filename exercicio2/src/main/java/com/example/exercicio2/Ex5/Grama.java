package com.example.exercicio2.Ex5;

import com.example.exercicio2.SalvarCSV;

public class Grama extends SalvarCSV {
    private String tipo;
    private double altura;
    private boolean estaMolhada;

    public Grama(String tipo, double altura, boolean estaMolhada) {
        this.tipo = tipo;
        this.altura = altura;
        this.estaMolhada = estaMolhada;
    }

    @Override
    protected String[] getCabecalho() {
        return new String[]{
                "Tipo","Altura","Esta Molhada?"
        };
    }

    @Override
    protected String[][] getDados() {
        return new String[][]{
                {tipo, String.valueOf(altura),String.valueOf(estaMolhada)},
        };
    }
}
