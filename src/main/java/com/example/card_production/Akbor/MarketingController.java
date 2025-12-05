package com.example.card_production.Akbor;

import com.example.card_production.Card_Production_Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MarketingController
{
    @javafx.fxml.FXML
    private TextField ROITextField;
    @javafx.fxml.FXML
    private TableColumn RioTableView;
    @javafx.fxml.FXML
    private TableColumn CampaignNameTableView;
    @javafx.fxml.FXML
    private TextArea FeedBackTextArea;
    @javafx.fxml.FXML
    private TextField CampaignNameTextField;
    @javafx.fxml.FXML
    private TableColumn BudgetTableView;
    @javafx.fxml.FXML
    private TextField BudgetTextArea;
    @javafx.fxml.FXML
    private TableView TableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void RejectOnAktionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackTo_Managing_Director_DashboardOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Akbor/Managing_Director_Dashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());

            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Managing_Director_Dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();

        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void ApproveOnActionButton(ActionEvent actionEvent) {
    }
}