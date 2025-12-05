package com.example.card_production.Akbor;

import com.example.card_production.Card_Production_Application;
import com.example.card_production.Sign_Up_Scene;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;

public class StaffPerformanceController
{
    public static ArrayList<StaffPerformance> userList = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn<StaffPerformance,String> DepartmentTableView;
    @javafx.fxml.FXML
    private TableColumn<StaffPerformance,String> performanceScoreTableView;
    @javafx.fxml.FXML
    private TableColumn<StaffPerformance,String> attendanceAttendanceTableView;
    @javafx.fxml.FXML
    private TableColumn <StaffPerformance,String>staffNameTableView;
    @javafx.fxml.FXML
    private TextField PerformanceScoreTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> DepartmentComboBox;
    @javafx.fxml.FXML
    private TextField StaffNameTextArea;
    @javafx.fxml.FXML
    private TextField AttendanceAttendanceTextArea;
    @javafx.fxml.FXML
    private TableView<StaffPerformance> TableCollumeView;
    @javafx.fxml.FXML
    private TextArea Notification;

    @javafx.fxml.FXML
    public void initialize() {
        DepartmentComboBox.getItems().addAll("Printing","cutting","binding","packaging","ItSupport");


        staffNameTableView.setCellValueFactory(new PropertyValueFactory<StaffPerformance, String>("staffName"));
        DepartmentTableView.setCellValueFactory(new PropertyValueFactory<StaffPerformance, String>("department"));
        performanceScoreTableView.setCellValueFactory(new PropertyValueFactory<StaffPerformance, String>("performanceScore"));
        attendanceAttendanceTableView.setCellValueFactory(new PropertyValueFactory<StaffPerformance, String>("attendance"));
    }

    @javafx.fxml.FXML
    public void FlagForReviewOnActionButton(ActionEvent actionEvent) {

            if (userList.isEmpty()) {
                Notification.setText("No staff available.");
                return;
            }



        }




    @javafx.fxml.FXML
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


    }

    @javafx.fxml.FXML
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

    @javafx.fxml.FXML
    public void ShowPichartOnActionButton(ActionEvent actionEvent) {
    }
}
