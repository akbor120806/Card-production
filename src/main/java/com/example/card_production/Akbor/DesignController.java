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

public class DesignController
{
    @javafx.fxml.FXML
    private TextField DesignPreviewTextFiel;
    @javafx.fxml.FXML
    private TextArea Comment;
    @javafx.fxml.FXML
    private TableColumn DesignPreviewTableView;
    @javafx.fxml.FXML
    private TableColumn DesignsTableView;
    @javafx.fxml.FXML
    private TextArea CopyRightCheckerTextArea;
    @javafx.fxml.FXML
    private TextField DesignsTextFiel;
    @javafx.fxml.FXML
    private TableView TableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void CopyRightCheckerOnActionButotn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackToProductDashboardOnActionButton(ActionEvent actionEvent) {
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
    public void ApproveOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RequestChangesOnActionButton(ActionEvent actionEvent) {
    }
}