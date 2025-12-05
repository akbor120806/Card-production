package com.example.card_production.Akbor;

import com.example.card_production.Card_Production_Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ProductController
{
    @javafx.fxml.FXML
    private TextField DisignsIdTextFiel;
    @javafx.fxml.FXML
    private TableColumn InspectionScheduleTableView;
    @javafx.fxml.FXML
    private DatePicker InspectionScheduleDatePicker;
    @javafx.fxml.FXML
    private TableColumn MeetingNotesTableView;
    @javafx.fxml.FXML
    private TableColumn DisignsIdTableView;
    @javafx.fxml.FXML
    private TextArea Notification;
    @javafx.fxml.FXML
    private TextField MeetingNotesTextFile;
    @javafx.fxml.FXML
    private TableView TableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SaveNotesOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SendReminderOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackToProductionDashboardOnActionButton(ActionEvent actionEvent) {
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
}