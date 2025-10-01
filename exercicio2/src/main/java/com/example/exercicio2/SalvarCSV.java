package com.example.exercicio2;

import java.io.File;

public abstract class SalvarCSV {


    public void salvar(String caminho) {
        File arquivo = new File(caminho);
        String[] cabecalho = arquivo.exists() ? null : getCabecalho();
        String [][] dados = getDados();
        CsvEscritaLeitura cwr =  new CsvEscritaLeitura();
        cwr.escreverCSV(caminho, cabecalho, dados);
    }

    protected abstract String[] getCabecalho();
    protected abstract String[][] getDados();
}
