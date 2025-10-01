package com.example.exercicio2.Ex2;

import com.example.exercicio2.SalvarCSV;

public class Coracao extends SalvarCSV {
    private boolean batendo;
    private int nivelSaudade;
    private boolean machucado;

    public Coracao(boolean batendo, int nivelSaudade, boolean machucado) {
        this.batendo = batendo;
        this.nivelSaudade = nivelSaudade;
        this.machucado = machucado;
    }

    public boolean isBatendo() {
        return batendo;
    }

    public int getNivelSaudade() {
        return nivelSaudade;
    }

    public boolean isMachucado() {
        return machucado;
    }


    @Override
    protected String[] getCabecalho() {
        return new String[]{"Está Batendo?","Nivel de Saudade","Está machucado?"};
    }

    @Override
    protected String[][] getDados() {
        return new String[][]{
                {isBatendo()?"Sim":"Não", Integer.toString(getNivelSaudade()), isMachucado()?"Sim":"Não"},
        };
    }
}
