package com.example.exercicio2.Ex3;

import com.example.exercicio2.SalvarCSV;

public class TrilhoDoTrem extends SalvarCSV {
    public String material;
    public boolean alavanca;
    public int comprimento;

    public TrilhoDoTrem(String material, boolean alavanca, int comprimento) {
        this.material = material;
        this.alavanca = alavanca;
        this.comprimento = comprimento;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isAlavanca() {
        return alavanca;
    }

    public int getComprimento() {
        return comprimento;
    }


    @Override
    protected String[] getCabecalho() {
        return new String[]{
                "Material","Alavanca ativa?","Comprimento"
        };
    }

    @Override
    protected String[][] getDados() {
        return new String[][]{{
            getMaterial(),isAlavanca()?"Sim":"Não",String.valueOf(getComprimento())
        }};
    }
}
