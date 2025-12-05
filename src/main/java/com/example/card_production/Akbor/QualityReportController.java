package com.example.card_production.Akbor;

import com.example.card_production.Card_Production_Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class QualityReportController
{
    @javafx.fxml.FXML
    private TextField QuantityTextFile;
    @javafx.fxml.FXML
    private DatePicker ReportDatePicker;
    @javafx.fxml.FXML
    private TextField ProducrNameTextFile;
    @javafx.fxml.FXML
    private TextField ProductTypeTextFile;
    @javafx.fxml.FXML
    private TextArea Notification;
    @javafx.fxml.FXML
    private TextField BatchNumberTextFile;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ViewQualityReportOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackToDashBord(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Akbor/Production_Director_Dashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Card_Production");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void AddProderctOnActionButton(ActionEvent actionEvent) {
    }
}