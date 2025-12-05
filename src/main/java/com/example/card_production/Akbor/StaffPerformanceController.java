package com.example.card_production.Akbor;

import com.example.card_production.Card_Production_Application;
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
import java.util.ArrayList;

public class StaffPerformanceController {

    public static ArrayList<StaffPerformance> userList = new ArrayList<>();

    @FXML
    private TableColumn<StaffPerformance, String> DepartmentTableView;
    @FXML
    private TableColumn<StaffPerformance, String> performanceScoreTableView;
    @FXML
    private TableColumn<StaffPerformance, String> attendanceAttendanceTableView;
    @FXML
    private TableColumn<StaffPerformance,String> staffNameTableView;
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

        staffNameTableView.setCellValueFactory(new PropertyValueFactory<>("staffName"));
        DepartmentTableView.setCellValueFactory(new PropertyValueFactory<>("department"));
        performanceScoreTableView.setCellValueFactory(new PropertyValueFactory<>("performanceScore"));
        attendanceAttendanceTableView.setCellValueFactory(new PropertyValueFactory<>("attendance"));
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

        if (!PerformanceScoreTextArea.getText().matches("\\d+")) {
            Notification.setText("Performance Score must be digits only");
            return;
        }

        if (!AttendanceAttendanceTextArea.getText().matches("\\d+")) {
            Notification.setText("Attendance must be digits only");
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
        TableCollumeView.getItems().add(a);

        StaffNameTextArea.clear();
        DepartmentComboBox.setValue(null);
        PerformanceScoreTextArea.clear();
        AttendanceAttendanceTextArea.clear();

        try {
            File f = new File("StaffPerformance.bin");

            FileOutputStream fos;
            ObjectOutputStream oos;

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new StafObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(a);
            oos.close();

        } catch (Exception e) {

        }
    }


    @FXML
    public void BackToManagingDashboard(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(
                    Card_Production_Application.class.getResource("Akbor/Managing_Director_Dashboard.fxml")
            );
            Scene nextScene = new Scene(fxmlLoader.load());

            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Managing_Director_Dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();

        } catch (Exception e) {

        }
    }

    @FXML
    public void ShowPichartOnActionButton(ActionEvent actionEvent) {



            try {
                FXMLLoader fxmlLoader = new FXMLLoader(
                        Card_Production_Application.class.getResource("Akbor/StaffPichart.fxml")
                );

                Stage stage = new Stage();
                stage.setTitle("Staff Pie Chart");
                stage.setScene(new Scene(fxmlLoader.load()));
                stage.show();

            } catch (Exception e) {
//                e.printStackTrace();
            }
        }

    }
