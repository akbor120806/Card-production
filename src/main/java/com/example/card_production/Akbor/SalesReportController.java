package com.example.card_production.Akbor;

import com.example.card_production.Card_Production_Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class SalesReportController
{
    public static ArrayList<SalesReport> userList = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn<SalesReport,String> RevenueTableView;
    @javafx.fxml.FXML
    private TableColumn <SalesReport,String>ProfitTableView;
    @javafx.fxml.FXML
    private DatePicker endDateLocalTime;
    @javafx.fxml.FXML
    private TableColumn<SalesReport,String> CostTableView;
    @javafx.fxml.FXML
    private TableView<SalesReport> tableView;
    @javafx.fxml.FXML
    private TextField CostTextField;
    @javafx.fxml.FXML
    private DatePicker startDateKocalTime;
    @javafx.fxml.FXML
    private TextField RevenueTextField;
    @javafx.fxml.FXML
    private TableColumn <SalesReport,String>endDateTableView;
    @javafx.fxml.FXML
    private TableColumn<SalesReport,String> startDateTableView;
    @javafx.fxml.FXML
    private TableColumn<SalesReport,String> ProductTableView;
    @javafx.fxml.FXML
    private TextArea NotificationTextField;
    @javafx.fxml.FXML
    private Label ProductTaxtField;
    @javafx.fxml.FXML
    private ComboBox typeCombobox;

    @javafx.fxml.FXML
    public void initialize() {


    }

    @javafx.fxml.FXML
    public void aproveOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void rejectOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ExportPDFOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ExportExcelOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Managing_Director_DashboardOnActionButton(ActionEvent actionEvent) {
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
}