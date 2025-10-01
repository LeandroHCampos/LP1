package com.example.exercicio2.Ex3;

import com.example.exercicio2.SalvarCSV;

public class Chapeu extends SalvarCSV {
    private String tipo;
    private String cor;
    private String material;

    public Chapeu(String tipo, String cor, String material) {
        this.tipo = tipo;
        this.cor = cor;
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    protected String[] getCabecalho() {
        return new String[]{
                "Tipo", "Cor", "Material"
        };
    }

    @Override
    protected String[][] getDados() {
        return new String[][]{
                {getTipo(), getCor(), getMaterial()},
        };
    }
}
