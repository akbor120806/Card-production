package com.example.card_production.Ashik;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RequestModificationController {

    @FXML private ComboBox<String> ordersCombo;
    @FXML private TextArea changeRequestArea;
    @FXML private Label messageLabel;

    @FXML
    private void initialize() {
        ordersCombo.setItems(FXCollections.observableArrayList(
                "Order #101", "Order #102"
        ));
    }

    @FXML
    private void handleSubmitRequest() {
        // event-1/2 open "My Orders", select order, event-3 submit request
        if (ordersCombo.getValue() == null || changeRequestArea.getText().isEmpty()) {
            showMessage("Select an order and write your change request.", true);
            return;
        }

        // event-4 validate if modification allowed (stub)
        boolean allowed = true; // TODO: check deadline / status
        if (!allowed) {
            showMessage("Modification not allowed for this order.", true);
            return;
        }

        // event-5 update order record, event-6 notify PM, event-7 save history (all stubbed)
        // TODO: DB update + notification

        // event-8 success msg
        showMessage("Modification request submitted successfully.", false);
    }

    private void showMessage(String text, boolean error) {
        messageLabel.setText(text);
        messageLabel.setStyle(error ? "-fx-text-fill:red;" : "-fx-text-fill:green;");
        messageLabel.setVisible(true);
    }
}

