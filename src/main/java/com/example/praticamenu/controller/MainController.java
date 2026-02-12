package com.example.praticamenu.controller;

import javafx.animation.PauseTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import javafx.animation.AnimationTimer;
import javafx.util.Duration;

//Incorporar caixa de alerta
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MainController {

    @FXML
    private BorderPane root;

    @FXML
    public void initialize(){
        carregarTela("Home.fxml");
    }

    @FXML
    public void abrirHome() {
        carregarTela("Home.fxml");
    }

    @FXML
    public void abrirLogin() {
        carregarTela("Login.fxml");
    }

    @FXML
    public void abrirCadastros() {
        carregarTela("Cadastros.fxml");
    }

    @FXML
    public void abrirClientes() {
        carregarTela("Clientes.fxml");
    }

    @FXML
    public void abrirProdutos() {
        carregarTela("Produtos.fxml");
    }

    @FXML
    public void abrirAjuda() {
        carregarTela("Ajuda.fxml");
    }

    @FXML
    public void abrirSobre() {
        carregarTela("AjudaSobre.fxml");
    }

    @FXML
    public void jumpscare() {
        carregarTela("jumpscare.fxml");
        PauseTransition pause = new PauseTransition(Duration.millis(600));
        pause.setOnFinished(event -> {
            Platform.exit();
            System.exit(0);
        });

        pause.play();
    }

    private void carregarTela(String fxml){
        try {
            root.setCenter(
                    FXMLLoader.load(getClass().getResource("/fxml/" + fxml))
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
