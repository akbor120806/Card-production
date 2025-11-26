package com.example.card_production;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Card_Production_Application extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Log_in_scene_.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Card_Production");
        stage.setScene(scene);
        stage.show();
    }
}
