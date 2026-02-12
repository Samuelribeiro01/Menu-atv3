package com.example.praticamenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource("/fxml/MainLayout.fxml")
        );

        Scene scene = new Scene(loader.load(), 600, 400);
        stage.setTitle("Sistema com menu fixo");
        stage.setScene(scene);
        stage.show();
    }

    public static void Main (String[] args) {
        launch();
    }
}
