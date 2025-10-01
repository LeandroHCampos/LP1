package com.example.exercicio2;

import java.io.*;

public class CsvEscritaLeitura {

    public void escreverCSV(String caminhoArquivo, String[] cabecalho, String[][] dados) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {

            // Escreve o cabeçalho
            if (cabecalho != null) {
                writer.write(String.join(";", cabecalho)); // usa ; como separador
                writer.newLine();
            }

            // Escreve os dados
            for (String[] linha : dados) {
                writer.write(String.join(";", linha));
                writer.newLine();
            }

            System.out.println("Arquivo CSV gravado com sucesso em: " + caminhoArquivo);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

