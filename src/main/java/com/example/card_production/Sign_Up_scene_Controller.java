package com.example.card_production;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Sign_Up_scene_Controller
{
    @javafx.fxml.FXML
    private TextField MobileNumberTextFile;
    @javafx.fxml.FXML
    private TextField passwordTextFile;
    @javafx.fxml.FXML
    private TextField gmailTextFile;
    @javafx.fxml.FXML
    private TextField nameTextFile;
    @javafx.fxml.FXML
    private ComboBox positionComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logInOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Log_In_scene.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Card_Production");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void signUpOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Log_In_scene.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Card_Production");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }
    }
}