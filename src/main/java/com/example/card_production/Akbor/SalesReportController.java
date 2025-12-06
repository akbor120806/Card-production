package com.example.card_production.Akbor;


import com.example.card_production.Card_Production_Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;

public class SalesReportController
{
    public static ArrayList<SalesReport> userList = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn<SalesReport,String> RevenueTableView;
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
    private ComboBox<String> typeCombobox;
    @javafx.fxml.FXML
    private TableColumn <SalesReport,String>typeTableView;
    @javafx.fxml.FXML
    private TextArea profitTextarea;
    @javafx.fxml.FXML
    private TextField ProductTaxtField;

    @javafx.fxml.FXML
    public void initialize() {
        typeCombobox.getItems().addAll("SmartCard","VisaCard","MasterCard","invitationCard");

        startDateKocalTime.setValue(LocalDate.of(2026,1,1));
        endDateLocalTime.setValue(LocalDate.of(2027,1,1));


        ProductTableView.setCellValueFactory(new PropertyValueFactory<SalesReport,String>("product"));
        typeTableView.setCellValueFactory(new PropertyValueFactory<SalesReport,String>("type"));
        RevenueTableView.setCellValueFactory(new PropertyValueFactory<SalesReport,String>("Revenue"));
        CostTableView.setCellValueFactory(new PropertyValueFactory<SalesReport,String>("cost"));
        endDateTableView.setCellValueFactory(new PropertyValueFactory<SalesReport,String>("endDate"));
        startDateTableView.setCellValueFactory(new PropertyValueFactory<SalesReport,String>("startDate"));

    }

    @javafx.fxml.FXML
    public void aproveOnActionButton(ActionEvent actionEvent) {
        boolean digitFound = false;
        for(int i=0;i<ProductTaxtField.getText().length();i++){
            if(ProductTaxtField.getText().charAt(i)>='0' &&
                    ProductTaxtField.getText().charAt(i)<='9') digitFound = true;
        }
        if (ProductTaxtField.getText().isEmpty()||
            RevenueTextField.getText().isEmpty()||
                CostTextField.getText().isEmpty()||
                digitFound
        ){
            NotificationTextField.setText("please Fill Up Properly ");
        }
        else {
            SalesReport s = new SalesReport(
                    ProductTaxtField.getText(),
                    typeCombobox.getValue(),
                    Integer.parseInt(RevenueTextField.getText()),
                    Integer.parseInt(CostTextField.getText()),
                    endDateLocalTime.getValue(),
                    startDateKocalTime.getValue()
            );
            userList.add(s);
            tableView.getItems().add(s);
            NotificationTextField.setText("salesReport SuccessFull");

            ProductTaxtField.clear();
            typeCombobox.setValue("");
            RevenueTextField.clear();
            CostTextField.clear();
            endDateLocalTime.setValue(LocalDate.of(2027,1,1));
            startDateKocalTime.setValue(LocalDate.of(2026,1,1));
        }



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

    @javafx.fxml.FXML
    public void profitOnActionButton(ActionEvent actionEvent) {
        float TotalRevinue = 0;
        float  totalCosr = 0;

        for (SalesReport s : userList){
            TotalRevinue = TotalRevinue +s.getRevenue();

            totalCosr = totalCosr+s.getCost();
           float profit =TotalRevinue-totalCosr;
            profitTextarea.setText("total profit" + profit);
        }




    }
}