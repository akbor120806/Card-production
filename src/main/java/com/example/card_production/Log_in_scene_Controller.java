package com.example.card_production;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
//import jdk.internal.icu.text.NormalizerBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Log_in_scene_Controller {

    @FXML
    private ComboBox<String> positionComboBox;
    @FXML
    private TextArea notificationTextField;

    public Log_in_scene_Controller() {
    }


    @FXML
    private TextField PasswordTestFild;
    @FXML
    private TextField userNameOrEmailTextFild;

    @FXML
    protected void onHelloButtonClick() {
//        NormalizerBase welcomeText = null;
//        welcomeText.setText("Welcome to JavaFX Application!");
    }


    @FXML
    public void initialize() {
        positionComboBox.getItems().addAll("ManagingDirector","ProductionManager","InventoryManager","SelesExecutive","DeliveryStaf","Customer");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            File f = new File("EmployeeRecord.bin");
            if (f.exists()){
                fis = new FileInputStream(f);
            }
            else{
                notificationTextField.setText("File Dose not create");
            }

            if(fis != null){
                ois = new ObjectInputStream(fis);
            }
            try {
            while (true){

                    Sign_Up_Scene user = (Sign_Up_Scene) ois.readObject();
                    Sign_Up_scene_Controller.userList.add(user);

                    if (ois != null) ois.close();
                }


                }catch (Exception a){

            }



        }
        catch (Exception e){
//
        }

    }

    @FXML
    public void signInOnActionButton(ActionEvent actionEvent) {

            if (userNameOrEmailTextFild.getText().isEmpty() ||
                    PasswordTestFild.getText().isEmpty() ||
                    positionComboBox.getValue() == null) {

                notificationTextField.setText("Please enter valid inputs!");
                return;
            }

            boolean a = false;

            for (Sign_Up_Scene user : Sign_Up_scene_Controller.userList) {
                if (user.getUserName().equals(userNameOrEmailTextFild.getText()) &&
                        user.getPassword().equals(PasswordTestFild.getText()) &&
                        user.getPosition().equals(positionComboBox.getValue())) {

                    a = true;
                    break;
                }
            }

            if (!a) {
                notificationTextField.setText("Incorrect Username/Password/Position!");
            }
            else {
                try {

                    String selectedPosition = positionComboBox.getValue();
                    String fxmlFile = "";

                    switch (selectedPosition) {
                        case "ManagingDirector":
                            fxmlFile = "Akbor/Managing_Director_Dashboard.fxml";
                            break;

                        case "ProductionManager":
                            fxmlFile = "Akbor/Production_Director_Dashboard.fxml";
                            break;

                        case "InventoryManager":
                            fxmlFile = "InventoryManager_Dashboard.fxml";
                            break;

                        case "SelesExecutive":
                            fxmlFile = "SelesExecutive_Dashboard.fxml";
                            break;

                        case "DeliveryStaf":
                            fxmlFile = "Ashik/delivery_dashboard.fxml";
                            break;

                        case "Customer":
                            fxmlFile = "Ashik/customer_dashboard.fxml";
                            break;
                    }

                    FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource(fxmlFile));
                    Scene nextScene = new Scene(fxmlLoader.load());
                    Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
                    nextStage.setTitle("Card_Production");
                    nextStage.setScene(nextScene);
                    nextStage.show();
                } catch (Exception e) {
//                    e.printStackTrace();
                }
            }
        }



    @FXML
    public void SignUpOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Sign_Up_scene.fxml"));
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

