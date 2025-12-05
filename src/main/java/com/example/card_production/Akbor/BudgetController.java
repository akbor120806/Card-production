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
import javafx.stage.Stage;

public class BudgetController
{
    @javafx.fxml.FXML
    private TextField BindingTextArea;
    @javafx.fxml.FXML
    private TableColumn BindingTableView;
    @javafx.fxml.FXML
    private TextField PaperTextArea;
    @javafx.fxml.FXML
    private TextField inkTextArea;
    @javafx.fxml.FXML
    private TableColumn peperTebleView;
    @javafx.fxml.FXML
    private TextArea CommentTextArea;
    @javafx.fxml.FXML
    private TextField PackagingTextArea;
    @javafx.fxml.FXML
    private TableView TextView;
    @javafx.fxml.FXML
    private TableColumn PackagingTableView;
    @javafx.fxml.FXML
    private TableColumn inkTableView;
    @javafx.fxml.FXML
    private TextArea ProfitMarginComparisonTextView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ProfitMarginComparisonOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ApproveOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RejectOnActionButton(ActionEvent actionEvent) {
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