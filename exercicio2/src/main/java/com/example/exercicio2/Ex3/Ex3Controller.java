package com.example.exercicio2.Ex3;

import com.example.exercicio2.SalvarCSV;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Ex3Controller {
    @FXML
    private TextField textFieldChapeu, textFieldCor, textFieldTipo, txtRoupa, txtPessoas, txtMaterial, txtComprimento;

    @FXML
    private CheckBox checkBoxSegurando, checkBoxAlavanca;

    @FXML
    private void cadastrarChapeu(){
        Chapeu chapeu = new  Chapeu(textFieldChapeu.getText(), textFieldCor.getText(), textFieldTipo.getText());
        chapeu.salvar("chapeu.csv");
    }
    @FXML
    private void cadastrarPessoas(){
        PessoasNaImagem pessoas = new PessoasNaImagem(txtRoupa.getText(),Integer.parseInt(txtPessoas.getText()),checkBoxSegurando.isSelected());
        pessoas.salvar("pessoas.csv");
    }
    @FXML
    private void cadastrarTrilho(){
        TrilhoDoTrem trilho = new TrilhoDoTrem(txtMaterial.getText(), Boolean.getBoolean(checkBoxAlavanca.getText()), Integer.parseInt(txtComprimento.getText()));
        trilho.salvar("trilho.csv");
    }
}
