package com.example.card_production;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Sign_Up_scene_Controller extends Log_in_scene_Controller
{
    protected int mobile;
    protected String gmail;

    public Sign_Up_scene_Controller() {
    }

    public Sign_Up_scene_Controller(int mobile, String gmail) {
        this.mobile = mobile;
        this.gmail = gmail;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Sign_Up_scene_Controller{" +
                "mobile=" + mobile +
                ", gmail='" + gmail + '\'' +
                '}';
    }

    @javafx.fxml.FXML
    private TextField MobileNumberTextFile;
    @javafx.fxml.FXML
    private TextField passwordTextFile;
    @javafx.fxml.FXML
    private TextField gmailTextFile;
    @javafx.fxml.FXML
    private TextField nameTextFile;
    @javafx.fxml.FXML
    private ComboBox<String> positionComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        positionComboBox.getItems().addAll("ManagingDirector","ProductionManager","InventoryManager","SelesExecutive","DeliveryStaf","Customer");

    }

    @javafx.fxml.FXML
    public void logInOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Log_In_scene.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Card_Production");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void signUpOnActionButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Log_In_scene.fxml"));
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