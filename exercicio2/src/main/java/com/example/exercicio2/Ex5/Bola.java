package com.example.exercicio2.Ex5;

import com.example.exercicio2.SalvarCSV;

public class Bola extends SalvarCSV {
    private String marca;
    private String cor;
    private double circunferencia;

    public Bola(String marca, String cor, double circunferencia) {
        this.marca = marca;
        this.cor = cor;
        this.circunferencia = circunferencia;
    }

    @Override
    protected String[] getCabecalho() {
        return new String[]{
                "Marca","Cor","Circunferencia"
        };
    }

    @Override
    protected String[][] getDados() {
        return new String[][]{
                {marca,cor,String.valueOf(circunferencia)},
        };
    }
}

