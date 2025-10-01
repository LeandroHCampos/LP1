package com.example.exercicio2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Objects;

public class MainController {
    @FXML
    private BorderPane rootPane;

    @FXML
    private Button btnEx1, btnEx2, btnEx3, btnEx4;

    @FXML
    private void initialize() {
        btnEx1.setOnAction(e -> carregarTela("ex2.fxml"));
        btnEx2.setOnAction(e -> carregarTela("ex3.fxml"));
        btnEx3.setOnAction(e -> carregarTela("ex4.fxml"));
        btnEx4.setOnAction(e -> carregarTela("ex5.fxml"));
    }


    private void carregarTela(String fxml)  {
        try {
            TabPane tela = FXMLLoader.load(getClass().getResource(fxml));
            rootPane.setCenter(tela);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
