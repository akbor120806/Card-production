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

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class BudgetController

{
    public static ArrayList<budget> userList = new ArrayList<>();


    @javafx.fxml.FXML
    private TableColumn<budget, Integer> BindingTableView;
    @javafx.fxml.FXML
    private TableColumn <budget, Integer>peperTebleView;
    @javafx.fxml.FXML
    private TextArea CommentTextArea;
    @javafx.fxml.FXML
    private TableView<budget> TextView;
    @javafx.fxml.FXML
    private TableColumn<budget, Integer> PackagingTableView;
    @javafx.fxml.FXML
    private TableColumn<budget, Integer> inkTableView;
    @javafx.fxml.FXML
    private TextArea ProfitMarginComparisonTextView;
    @javafx.fxml.FXML
    private TextField PaperTextField;
    @javafx.fxml.FXML
    private TextField PackagingTextField;
    @javafx.fxml.FXML
    private TextField BindingTextField;
    @javafx.fxml.FXML
    private TextField inkTextField;

    @javafx.fxml.FXML
    public void initialize() {
        peperTebleView.setCellValueFactory(new PropertyValueFactory<budget,Integer>("paper"));
        BindingTableView.setCellValueFactory(new PropertyValueFactory<budget,Integer>("binding"));
        PackagingTableView.setCellValueFactory(new PropertyValueFactory<budget,Integer>("packaging"));
        inkTableView.setCellValueFactory(new PropertyValueFactory<budget,Integer>("ink"));



    }

    @javafx.fxml.FXML
    public void ProfitMarginComparisonOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ApproveOnActionButton(ActionEvent actionEvent) {

        String text  = PaperTextField.getText();
        if (!text.matches("\\d+")) {
            CommentTextArea.setText("Digit Only");
        }
        String text1 = BindingTextField.getText();
        if (!text1.matches("\\d+")) {
            CommentTextArea.setText("Digit Only");
        }
        String text2 = PackagingTextField.getText();
        if (!text2.matches("\\d+")) {
            CommentTextArea.setText("Digit Only");
        }
        String text3 = inkTextField.getText();
        if (!text3.matches("\\d+")) {
            CommentTextArea.setText("Digit Only");
        }

        if (PaperTextField.getText().isEmpty() ||
                BindingTextField.getText().isEmpty() ||
                PackagingTextField.getText().isEmpty() ||
                inkTextField.getText().isEmpty()


        ) {

            CommentTextArea.setText("give me Valid Number");
        }

            budget b = new budget(
                    Integer.parseInt(PaperTextField.getText()),
                    Integer.parseInt(BindingTextField.getText()),
                    Integer.parseInt(PackagingTextField.getText()),
                    Integer.parseInt(inkTextField.getText())
            );
            userList.add(b);
            TextView.getItems().addAll(b);

            try {
                File f = new File("Budget.bin");
                FileOutputStream fos = null;
                ObjectOutputStream oos = null;

                if (f.exists()){
                    fos = new FileOutputStream(f,true);
                    oos = new budgetObjectOutputSream(fos);
                }
                else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                for (budget b1 :userList){
                    oos.writeObject(b1);
                }
                oos.close();



            }catch (Exception e){
//
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

}