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

public class RawMaterialsController {
    @javafx.fxml.FXML
    private TableColumn<RawMaterials,String> RequiredQtyTableView;
    @javafx.fxml.FXML
    private TextField AvailableQtyTextField;
    @javafx.fxml.FXML
    private TextArea notificationTextArea;
    @javafx.fxml.FXML
    private TextField RequiredQtyTextField;
    @javafx.fxml.FXML
    private TableColumn<RawMaterials,String> ItemTableView;
    @javafx.fxml.FXML
    private TableColumn<RawMaterials,String> RequiredTableView;
    @javafx.fxml.FXML
    private TextField ItemTextField;
    @javafx.fxml.FXML
    private TableColumn<RawMaterials,String> AvailableQtyTableView;
    @javafx.fxml.FXML
    private TextField RequiredTextField;
    @javafx.fxml.FXML
    private TableView<RawMaterials> TableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SubmitOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void GenerateRequestOnActionButton(ActionEvent actionEvent) {
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
}