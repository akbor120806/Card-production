package com.example.card_production.Akbor;

import com.example.card_production.Card_Production_Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ProductTestDetalsController
{
    @javafx.fxml.FXML
    private TextField testStatusTextField;
    @javafx.fxml.FXML
    private TextField QuantityTextField;
    @javafx.fxml.FXML
    private TableColumn ProductTypeTablwView;
    @javafx.fxml.FXML
    private TableColumn UnitPriceTableView;
    @javafx.fxml.FXML
    private ComboBox ProductTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker testDatePicker;
    @javafx.fxml.FXML
    private TableColumn ProductNameTableView;
    @javafx.fxml.FXML
    private TableColumn testDateTableView;
    @javafx.fxml.FXML
    private TextField ProductNameTextField;
    @javafx.fxml.FXML
    private TableColumn testStatusTableView;
    @javafx.fxml.FXML
    private TextArea notification;
    @javafx.fxml.FXML
    private TableColumn QuantityTableView;
    @javafx.fxml.FXML
    private TextField UnitPriceTextField;
    @javafx.fxml.FXML
    private TableView TableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackToProductionDashbordOnActionButton(ActionEvent actionEvent) {
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
    public void ViewAllProductOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AddProductOnActionButton(ActionEvent actionEvent) {
    }
}