package com.example.card_production;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Log_in_scene_Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
