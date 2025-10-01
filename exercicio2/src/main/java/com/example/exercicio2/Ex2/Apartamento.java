package com.example.exercicio2.Ex2;

import com.example.exercicio2.SalvarCSV;

public class Apartamento extends SalvarCSV {
    private int numero; // número do apartamento
    private String vista; // vista para a cidade
    private boolean silencioso; // se está silencioso ou não

    public Apartamento(int numero, String vista, boolean silencioso) {
        this.numero = numero;
        this.vista = vista;
        this.silencioso = silencioso;
    }

    public int getNumero() {
        return numero;
    }

    public String getVista() {
        return vista;
    }

    public boolean isSilencioso() {
        return silencioso;
    }

    @Override
    protected String[] getCabecalho() {
        return new String[]{"Numero", "Vista", "Silencioso"};
    }

    @Override
    protected String[][] getDados() {
        return new String[][]{
                {String.valueOf(getNumero()), getVista(), isSilencioso()?"Sim":"Não"}
        };
    }
}

