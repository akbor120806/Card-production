package com.example.card_production.Akbor;

import com.example.card_production.Sign_Up_Scene;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.ArrayList;

public class Production_PlanController
{
    public static ArrayList<Production_Plan> userList = new ArrayList<>();
    @javafx.fxml.FXML
    private TextField ProductTypeTextField;
    @javafx.fxml.FXML
    private TextArea InventoryStatusTaxtArea;
    @javafx.fxml.FXML
    private TableColumn<Production_Plan, String> ProductTypeTableView;
    @javafx.fxml.FXML
    private TextArea CommentTextArea;
    @javafx.fxml.FXML
    private TableColumn<Production_Plan, String> RequiredMaterialTableView;
    @javafx.fxml.FXML
    private ComboBox< String> RequiredMaterialComboBox;
    @javafx.fxml.FXML
    private TextField ForecastTextField;
    @javafx.fxml.FXML
    private TableColumn<Production_Plan, String> ForecastTableView;
    @javafx.fxml.FXML
    private TableView<Production_Plan> TableView;


    @javafx.fxml.FXML
    public void initialize() {
        RequiredMaterialComboBox.getItems().addAll("Art Paper","PVC Sheet","Glossy Card Paper","Matte Card Paper","Offset Paper","Duplex Board");
    }

    @javafx.fxml.FXML
    public void InventoryStatusOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackTo_Managing_Director_DashboardOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ApproveOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RejectOnActionButton(ActionEvent actionEvent) {
    }
}