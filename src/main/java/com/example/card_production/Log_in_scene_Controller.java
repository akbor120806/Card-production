package com.example.card_production;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import jdk.internal.icu.text.NormalizerBase;

public class Log_in_scene_Controller {

    @FXML
    private ComboBox<String> positionComboBox;

    public Log_in_scene_Controller() {
    }


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
    public void initialize() {
        positionComboBox.getItems().addAll("ManagingDirector","ProductionManager","InventoryManager","SelesExecutive","DeliveryStaf","Customer");
    }

    @FXML
    public void signInOnActionButton(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Card_Production_Dashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Card_Production");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }
    }

    @FXML
    public void SignUpOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Sign_Up_scene.fxml"));
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
