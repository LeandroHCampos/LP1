package com.example.exercicio2.Ex2;

import javafx.fxml.FXML;
import javafx.scene.control.*;


public class Ex2Controller {
    @FXML
    private Label labelSalvo;

    @FXML
    private CheckBox checkBoxLuzes,checkBoxVisivel,checkBoxSilencioso, checkBoxBatendo,checkBoxMachucado;

    @FXML
    private TextField txtNumero, txtVista;

    @FXML
    private ChoiceBox<String> choiceBoxCor;

    @FXML
    private Slider sliderSaudade;

    @FXML
    private void initialize() {
        choiceBoxCor.getItems().addAll("Azul", "Vermelho");
        choiceBoxCor.setValue("Azul");
    }

    @FXML
    private void cadastrarHorizonte(){
        Horizonte horizonte = new Horizonte(choiceBoxCor.getValue(),checkBoxLuzes.isSelected(),checkBoxVisivel.isSelected());
        horizonte.salvar("horizonte.csv");
    }

    @FXML
    private void cadastrarApartamento(){
        Apartamento apartamento = new Apartamento(Integer.parseInt(txtNumero.getText()), txtVista.getText(),checkBoxSilencioso.isSelected());
        apartamento.salvar("apartamento.csv");
    }

    @FXML
    private void cadastrarCoracao(){
        Coracao coracao = new Coracao(checkBoxBatendo.isSelected(), (int) sliderSaudade.getValue(), checkBoxMachucado.isSelected());
        coracao.salvar("coracao.csv");

    }
}
