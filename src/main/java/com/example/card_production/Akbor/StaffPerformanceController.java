package com.example.card_production.Akbor;

import com.example.card_production.AppendableObjectOutputSteam;
import com.example.card_production.Card_Production_Application;
import com.example.card_production.Sign_Up_Scene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class StaffPerformanceController
{
    public static ArrayList<StaffPerformance> userList = new ArrayList<>();
    @FXML
    private TableColumn<StaffPerformance,String> DepartmentTableView;
    @FXML
    private TableColumn<StaffPerformance,String> performanceScoreTableView;
    @FXML
    private TableColumn<StaffPerformance,String> attendanceAttendanceTableView;
    @FXML
    private TableColumn <StaffPerformance,String>staffNameTableView;
    @FXML
    private TextField PerformanceScoreTextArea;
    @FXML
    private ComboBox<String> DepartmentComboBox;
    @FXML
    private TextField StaffNameTextArea;
    @FXML
    private TextField AttendanceAttendanceTextArea;
    @FXML
    private TableView<StaffPerformance> TableCollumeView;
    @FXML
    private TextArea Notification;
    @FXML
    private BorderPane dashboardBorderpane;

    @FXML
    public void initialize() {
        DepartmentComboBox.getItems().addAll("Printing","cutting","binding","packaging","ItSupport");


        staffNameTableView.setCellValueFactory(new PropertyValueFactory<StaffPerformance, String>("staffName"));
        DepartmentTableView.setCellValueFactory(new PropertyValueFactory<StaffPerformance, String>("department"));
        performanceScoreTableView.setCellValueFactory(new PropertyValueFactory<StaffPerformance, String>("performanceScore"));
        attendanceAttendanceTableView.setCellValueFactory(new PropertyValueFactory<StaffPerformance, String>("attendance"));



    }



    @FXML
    public void FlagForReviewOnActionButton(ActionEvent actionEvent) {




        if (userList.isEmpty()) {
                Notification.setText("No staff available.");
                return;
            }

        StaffPerformance highScoreStaff = userList.get(0);
        for (StaffPerformance a : userList) {
            if (a.getPerformanceScore() > highScoreStaff.getPerformanceScore()) {
                highScoreStaff = a;
            }
        }
        TableCollumeView.getItems().clear();
        TableCollumeView.getItems().add(highScoreStaff);


        }


    @FXML
    public void ApproveOnActionButton(ActionEvent actionEvent) {

        boolean digitFound = false;
        for (int i = 0; i < StaffNameTextArea.getText().length(); i++) {
            if (Character.isDigit(StaffNameTextArea.getText().charAt(i))) digitFound = true;
        }


        if (StaffNameTextArea.getText().isEmpty() ||
                DepartmentComboBox.getValue() == null ||
                PerformanceScoreTextArea.getText().isEmpty() ||
                AttendanceAttendanceTextArea.getText().isEmpty() ||
                digitFound) {

            Notification.setText("fill up Properly ");
            return;
        }
        if (!PerformanceScoreTextArea.getText().matches("\\d+")){
            Notification.setText("Performance Score must be digits only");
            return;
        }
        if (!AttendanceAttendanceTextArea.getText().matches("\\d+")){
            Notification.setText("Attendance  must be digits only");
            return;
        }


        for (StaffPerformance a : userList) {
            if (a.getStaffName().equalsIgnoreCase(StaffNameTextArea.getText())) {
                Notification.setText("This staff name already exists");
                return;
            }
        }


        StaffPerformance a = new StaffPerformance(
                StaffNameTextArea.getText(),
                DepartmentComboBox.getValue(),
                Integer.parseInt(PerformanceScoreTextArea.getText()),
                Integer.parseInt(AttendanceAttendanceTextArea.getText())

        );

        userList.add(a);
        TableCollumeView.getItems().addAll(a);


        StaffNameTextArea.clear();
        DepartmentComboBox.setValue(" ");
        PerformanceScoreTextArea.clear();
        AttendanceAttendanceTextArea.clear();

        try{
            File f = new File("StaffPerformance.bin");

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


            for(StaffPerformance c : userList){
                oos.writeObject(c);
            }
            oos.close();

        }catch (Exception e){
//
        }

    }

    @FXML
    public void BackToManagingDashboard(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Card_Production_Application.class.getResource("Managing_Director_Dashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());

            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Managing_Director_Dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();

        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    @FXML
    public void ShowPichartOnActionButton(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(
                    Card_Production_Application.class.getResource("StaffPichart.fxml")
            );

            dashboardBorderpane.setCenter(fxmlLoader.load());

        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
}
