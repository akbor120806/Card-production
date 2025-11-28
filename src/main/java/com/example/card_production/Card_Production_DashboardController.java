package com.example.card_production;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Card_Production_DashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void managingDirectorOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Akbor/Managing_Director_Dashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Card_Production");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void productionManagerOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource( "Akbor/Production_Director_Dashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Card_Production");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void logOutOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Log_In_scene.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Card_Production");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void customerOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void inventoryManagerOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void selseExecutiveOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void deliveryStaf(ActionEvent actionEvent) {
    }
}