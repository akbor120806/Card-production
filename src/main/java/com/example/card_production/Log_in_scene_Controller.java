package com.example.card_production;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import jdk.internal.icu.text.NormalizerBase;

public class Log_in_scene_Controller {

    @FXML
    private TextField PasswordTestFild;
    @FXML
    private TextField userNameOrEmailTextFild;

    @FXML
    protected void onHelloButtonClick() {
        NormalizerBase welcomeText = null;
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void signInOnActionButton(ActionEvent actionEvent) {
    }

    @FXML
    public void SignUpOnActionButton(ActionEvent actionEvent) {
    }
}
