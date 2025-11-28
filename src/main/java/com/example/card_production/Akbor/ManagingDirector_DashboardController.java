package com.example.card_production.Akbor;

import com.example.card_production.Card_Production_Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ManagingDirector_DashboardController
{
    @javafx.fxml.FXML
    private TextField tytelShowLogin;
    @javafx.fxml.FXML
    private TextArea notificationTextArea;
    @javafx.fxml.FXML
    private TextField nameShowLogin;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void staffPerformanceOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Akbor/StaffPerformance.fxml"));
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
    public void marketingOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Akbor/Marketing.fxml"));
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
    public void production_PlanOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Akbor/Production_Plan.fxml"));
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
    public void budgetOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Akbor/budget.fxml"));
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
    public void homeOnActionButton(ActionEvent actionEvent) {
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

    @javafx.fxml.FXML
    public void selesReportOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Akbor/SalesReport.fxml"));
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
    public void clientOrderOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Akbor/ClientOrder.fxml"));
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