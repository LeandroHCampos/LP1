package com.example.exercicio2.Ex4;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Ex4Controller {
    @FXML
    private TextField textFieldNome, textFieldCorCachorro, textFieldRaca,
            textFieldEspecie,textFieldComprimento,
            textFieldCor, textFieldPotencia;

    @FXML
    private CheckBox checkBoxVenenosa,
                    checkBoxLigada;


    @FXML
    private void cadastrarCachorro(){
        Cachorro cachorro = new Cachorro(textFieldNome.getText(), textFieldCorCachorro.getText(), textFieldRaca.getText());
        cachorro.salvar("cachorro.csv");
    }
    @FXML
    private void cadastrarCobra(){
        Cobra cobra = new Cobra(textFieldEspecie.getText(),Double.parseDouble(textFieldComprimento.getText()),checkBoxVenenosa.isSelected());
        cobra.salvar("cobra.csv");
    }

    @FXML
    private void cadastrarLampada(){
        Lampada lampada = new Lampada(textFieldCor.getText(),Integer.parseInt(textFieldPotencia.getText()),checkBoxVenenosa.isSelected());
        lampada.salvar("lampada.csv");
    }



}
