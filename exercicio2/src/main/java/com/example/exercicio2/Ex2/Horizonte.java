package com.example.exercicio2.Ex2;

import com.example.exercicio2.SalvarCSV;

public class Horizonte extends SalvarCSV {
    private String cor;
    private boolean visivel;
    private boolean luzesABrilhar;

    public String getCor() {
        return cor;
    }

    public boolean isVisivel() {
        return visivel;
    }

    public boolean isLuzesABrilhar() {
        return luzesABrilhar;
    }

    public Horizonte(String cor, boolean visivel, boolean luzesABrilhar) {
        this.cor = cor;
        this.visivel = visivel;
        this.luzesABrilhar = luzesABrilhar;
    }

    @Override
    protected String[] getCabecalho() {
        return new String[]{"Cor", "Está Visivel?", "Luzes Brilhando?"};
    }

    @Override
    protected String[][] getDados() {
        return new String[][]{
            {getCor(), isVisivel()?"Sim":"Não", isLuzesABrilhar() ? "Sim" : "Não"}
        };
    }
}