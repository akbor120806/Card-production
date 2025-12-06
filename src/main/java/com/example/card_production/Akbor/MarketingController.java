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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;

public class MarketingController
{

    public static ArrayList<Marketing> userList = new ArrayList<>();
    @javafx.fxml.FXML
    private TextField ROITextField;
    @javafx.fxml.FXML
    private TableColumn<Marketing,String> RioTableView;
    @javafx.fxml.FXML
    private TableColumn <Marketing,String>CampaignNameTableView;
    @javafx.fxml.FXML
    private TextArea FeedBackTextArea;
    @javafx.fxml.FXML
    private TextField CampaignNameTextField;
    @javafx.fxml.FXML
    private TableColumn<Marketing,String> BudgetTableView;
    @javafx.fxml.FXML
    private TextField BudgetTextArea;
    @javafx.fxml.FXML
    private TableView <Marketing>TableView;

    @javafx.fxml.FXML
    public void initialize() {


        CampaignNameTableView.setCellValueFactory(new PropertyValueFactory<Marketing, String>("name"));
        BudgetTableView.setCellValueFactory(new PropertyValueFactory<Marketing, String>("budget"));
        RioTableView.setCellValueFactory(new PropertyValueFactory<Marketing, String>("roi"));

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
        boolean digitFound = false;
        for(int i=0;i<CampaignNameTextField.getText().length();i++){
            if(CampaignNameTextField.getText().charAt(i)>='0' &&
                    CampaignNameTextField.getText().charAt(i)<='9') digitFound = true;
        }
        if (
                CampaignNameTextField.getText().isEmpty()||
                        BudgetTextArea.getText().isEmpty()||
                        ROITextField.getText().isEmpty()||
                        digitFound
        ){
            FeedBackTextArea.setText("FilUp Properly");
        }
        else {
            Marketing m = new Marketing(
                    CampaignNameTextField.getText(),
                    Integer.parseInt(BudgetTextArea.getText()),
                    Integer.parseInt(ROITextField.getText())
            );

            userList.add(m);
            TableView.getItems().add(m);


            CampaignNameTextField.clear();
            BudgetTextArea.clear();
            ROITextField.clear();

        }


    }
}