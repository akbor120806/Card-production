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

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Sign_Up_scene_Controller {
    public static ArrayList<Sign_Up_Scene> userList = new ArrayList<>();
    protected String mobile;
    protected String gmail;
    @javafx.fxml.FXML
    private TextArea notificationTextField;
    @FXML
    private TextField MobileNumberTextFile;
    @FXML
    private TextField passwordTextFile;
    @FXML
    private TextField gmailTextFile;

    public Sign_Up_scene_Controller() {
//        public static ArrayList<Sign_Up_Scene> userList = new ArrayList<>();
    }

    @javafx.fxml.FXML
    private TextField nameTextFiled;
    @javafx.fxml.FXML
    private ComboBox<String> positionComboBox;

//    ArrayList<Sign_Up_Scene> arrayList;

    @javafx.fxml.FXML
    public void initialize() {
//        arrayList = new ArrayList<>();

        positionComboBox.getItems().addAll("ManagingDirector", "ProductionManager", "InventoryManager", "SelesExecutive", "DeliveryStaf", "Customer");

    }

    @javafx.fxml.FXML
    public void logInOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Log_In_scene.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Card_Production");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }
    }

    @FXML
    public void signUpOnActionButton(ActionEvent actionEvent) {
        mobile = MobileNumberTextFile.getText();
        gmail = gmailTextFile.getText();
        boolean digitFound = false;
        for (int i = 0; i < nameTextFiled.getText().length(); i++) {
            if (Character.isDigit(nameTextFiled.getText().charAt(i))) digitFound = true;
        }


        if (nameTextFiled.getText().isEmpty() ||
                MobileNumberTextFile.getText().isEmpty() ||
                gmailTextFile.getText().isEmpty() ||
                passwordTextFile.getText().isEmpty() ||
                positionComboBox.getValue() == null ||
                digitFound) {

            notificationTextField.setText("please Give me valid User Name or Password ");
            return;
        }
        if (!mobile.matches("\\d+")){
            notificationTextField.setText("Digits Only");
        }
        if (mobile.length()<11){
            notificationTextField.setText("must be 11 digit");
        }
        if (!gmail.contains("@")){
            notificationTextField.setText("must proper gmail");
        }

        boolean sameName = false;
        for (Sign_Up_Scene a : userList) {
            if (a.getUserName().equals(nameTextFiled.getText())) {
                sameName = true;
                break;
            }
        }

        if (sameName) {
            notificationTextField.setText("same Name Has been founded");
            return;
        }

        Sign_Up_Scene a = new Sign_Up_Scene(
                nameTextFiled.getText(),
                MobileNumberTextFile.getText(),
                gmailTextFile.getText(),
                passwordTextFile.getText(),
                positionComboBox.getValue()
        );

        userList.add(a);

//        this is file binary file write
        try{
            File f = new File("EmployeeRecord.bin");

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


            for(Sign_Up_Scene c : userList){
                oos.writeObject(c);
            }
            oos.close();

        }catch (Exception e){
//
        }
        loadLoginScene(actionEvent);
    }


    private void loadLoginScene(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Log_In_scene.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());

            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Card_Production");
            nextStage.setScene(nextScene);
            nextStage.show();

        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
}

