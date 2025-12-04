package com.example.card_production.Akbor;

import com.example.card_production.AppendableObjectOutputSteam;
import com.example.card_production.Card_Production_Application;
import com.example.card_production.Sign_Up_Scene;
import com.example.card_production.Sign_Up_scene_Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class Production_PlanController
{
    public static ArrayList<Production_Plan> userList = new ArrayList<>();
    @javafx.fxml.FXML
    private TextField ProductTypeTextField;
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

    ProductTypeTableView.setCellValueFactory(new PropertyValueFactory<Production_Plan, String>("productType"));
    ForecastTableView.setCellValueFactory(new PropertyValueFactory<Production_Plan, String>("forecast"));
    RequiredMaterialTableView.setCellValueFactory(new PropertyValueFactory<Production_Plan, String>("requiredMaterial"));



    }



    @javafx.fxml.FXML
    public void BackTo_Managing_Director_DashboardOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Akbor/Managing_Director_Dashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Managing_Director_Dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void ApproveOnActionButton(ActionEvent actionEvent) {

        if (ProductTypeTextField.getText().isEmpty() ||
                ForecastTextField.getText().isEmpty()||
                RequiredMaterialComboBox.getItems().isEmpty()
        ){
            CommentTextArea.setText("Fill Up ProperLy");
        }else {

            Production_Plan p = new Production_Plan(
                    ProductTypeTextField.getText(),
                    ForecastTextField.getText(),
                    RequiredMaterialComboBox.getValue()
            );
            Alert e2 = new Alert(Alert.AlertType.CONFIRMATION);
            e2.setContentText("Are you sure?");
            e2.showAndWait().ifPresent(response->{
                if(response==ButtonType.OK){
                    userList.add(p);
                    TableView.getItems().add(p);
                    CommentTextArea.setText("ProductPlan successfully ");
                }
            });

            ProductTypeTextField.clear();
            ForecastTextField.clear();
            RequiredMaterialComboBox.setValue("");
        }


    }


    @javafx.fxml.FXML
    public void loadPlanOnActionButton(ActionEvent actionEvent) {
        try{
            File f = new File("Production_load.bin");

            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if (f.exists()){
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputSteam(fos);
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }


            for(Production_Plan c : userList){
                oos.writeObject(c);
            }
            oos.close();

        }catch (Exception e){
//
        }


    }

    @javafx.fxml.FXML
    public void ViewAllPlanOnActionButton(ActionEvent actionEvent) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try{
            File f = new File("Production_load.bin");
            if(f.exists()){
                fis = new FileInputStream(f);
            }
            else{
                //alert: file does not exist
            }
            if(fis!=null){
                ois = new ObjectInputStream(fis);
            }


            while(true){
                TableView.getItems().add((Production_Plan) ois.readObject());
            }
        } catch (Exception e) {
            try {
                ois.close();
            } catch (IOException ex) {
                //
            }
    }
    }
}
