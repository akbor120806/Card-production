package com.example.card_production.Akbor;

import com.example.card_production.Card_Production_Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ClientOrderController
{
    public static ArrayList<ClientOrder> userList = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn<ClientOrder, String> OrderQtyTableView;
    @javafx.fxml.FXML
    private TableColumn <ClientOrder, String>DeadlineTableView;
    @javafx.fxml.FXML
    private TextField OrderQtyTextField;
    @javafx.fxml.FXML
    private TableColumn<ClientOrder, String> DesignTableView;
    @javafx.fxml.FXML
    private TextField ClientNameTextFielw;
    @javafx.fxml.FXML
    private TextField DesignTextField;
    @javafx.fxml.FXML
    private TableColumn <ClientOrder, String>ClientNameTableView;
    @javafx.fxml.FXML
    private TextArea viewProgressNotification;
    @javafx.fxml.FXML
    private TextField DeadlineTextField;
    @javafx.fxml.FXML
    private TextArea NotificationTextField;
    @javafx.fxml.FXML
    private TableView< ClientOrder> TableView;

    @javafx.fxml.FXML
    public void initialize() {
        ClientNameTableView.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        DesignTableView.setCellValueFactory(new PropertyValueFactory<>("design"));
        OrderQtyTableView.setCellValueFactory(new PropertyValueFactory<>("orderQnt"));
        DeadlineTableView.setCellValueFactory(new PropertyValueFactory<>("deadline"));

    }


    @javafx.fxml.FXML
    public void ModifyOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ApproveOnActionButton(ActionEvent actionEvent) {

        boolean digitFound = false;
        for (int i = 0; i < ClientNameTextFielw.getText().length(); i++) {
            if (Character.isDigit(ClientNameTextFielw.getText().charAt(i))) digitFound = true;
        }


        if (ClientNameTextFielw.getText().isEmpty() ||
                DesignTextField.getText().isEmpty() ||
                OrderQtyTextField.getText().isEmpty() ||
                DeadlineTextField.getText().isEmpty() ||

                digitFound) {

            NotificationTextField.setText("please Give me valid User Name or Password ");
            return;
        }
//        if (!OrderQtyTextField.("\\d+")){
//            NotificationTextField.setText("Digits Only");
//        }
//        if (OrderQtyTextField.length()){
//            NotificationTextField.setText("must be 11 digit");
//        }
//        if (!DesignTextField.("\\d+")){
//            NotificationTextField.setText("must proper gmail");
//        }

        boolean sameName = false;
        for (ClientOrder a : userList) {
            if (a.getClientName().equals(ClientNameTextFielw.getText()))
            {
                sameName = true;
                break;
            }
        }

        if (sameName) {
            NotificationTextField.setText("same Name Has been founded");
            return;
        }

        ClientOrder a = new ClientOrder(
                ClientNameTextFielw.getText(),
                DesignTextField.getText(),
                Integer.parseInt(OrderQtyTextField.getText()),
                Integer.parseInt(DeadlineTextField.getText())
        );

        userList.add(a);
        TableView.getItems().add(a);

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


            for(ClientOrder c : userList){
                oos.writeObject(c);
            }
            oos.close();

        }catch (Exception e){
}
    }

    @javafx.fxml.FXML
    public void viewProgressOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Managing_Director_DashboardOnActionButton(ActionEvent actionEvent) {
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

}