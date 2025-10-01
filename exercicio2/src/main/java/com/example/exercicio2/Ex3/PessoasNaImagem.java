package com.example.exercicio2.Ex3;

import com.example.exercicio2.SalvarCSV;

public class PessoasNaImagem extends SalvarCSV {
    private String roupa;
    private int quantidadeDePessoas;
    private boolean segurandoAlavanca;

    public PessoasNaImagem(String roupa, int quantidadeDePessoas, boolean segurandoAlavanca) {
        this.roupa = roupa;
        this.quantidadeDePessoas = quantidadeDePessoas;
        this.segurandoAlavanca = segurandoAlavanca;
    }

    public String getRoupa() {
        return roupa;
    }

    public boolean isSegurandoAlavanca() {
        return segurandoAlavanca;
    }

    @Override
    protected String[] getCabecalho() {
        return new String[]{
                "Roupa","Qtd de Pessoas", "Estão segurando a alavanca?"
        };
    }

    @Override
    protected String[][] getDados() {
        return new String[][]{
                {getRoupa(),String.valueOf(quantidadeDePessoas), isSegurandoAlavanca()?"Sim":"Não"},
        };
    }
}