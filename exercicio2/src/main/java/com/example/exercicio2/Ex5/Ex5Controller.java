package com.example.exercicio2.Ex5;


import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Ex5Controller {
    @FXML
    private TextField textFieldMarca, textFieldCor, textFieldCircunferencia,
                    textFieldTipo, textFieldAltura,
                    textFieldNome, textFieldNumero, textFieldPosicao;
    @FXML
    private CheckBox checkBoxMolhada;

    @FXML
    private void cadastrarBola() {
        Bola bola = new Bola(textFieldMarca.getText(),textFieldCor.getText(),Double.parseDouble(textFieldCircunferencia.getText()));
        bola.salvar("bola.csv");
        textFieldMarca.setText("");
        textFieldCor.setText("");
        textFieldCircunferencia.setText("");
    }
    @FXML
    private void cadastrarGrama(){
        Grama grama = new Grama(textFieldTipo.getText(),Double.parseDouble(textFieldAltura.getText()),checkBoxMolhada.isSelected());
        grama.salvar("grama.csv");
        textFieldTipo.setText("");
        textFieldAltura.setText("");
        checkBoxMolhada.setSelected(false);
    }
    @FXML
    private void cadastrarJogador(){
        Jogador jogador = new Jogador(textFieldNome.getText(),Integer.parseInt(textFieldNumero.getText()),textFieldPosicao.getText());
        jogador.salvar("jogador.csv");
        textFieldNome.setText("");
        textFieldNumero.setText("");
        textFieldPosicao.setText("");
    }
}
