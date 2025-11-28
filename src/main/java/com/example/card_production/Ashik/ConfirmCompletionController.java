package com.example.card_production.Ashik;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ConfirmCompletionController {
    @FXML private ComboBox<String> ordersCombo;
    @FXML private TextField signatureField;
    @FXML private Label messageLabel;

    @FXML
    private void initialize() {
        ordersCombo.setItems(FXCollections.observableArrayList(
                "Order #200", "Order #201"
        ));
    }

    @FXML
    private void handleUploadProof() {
        // event-1 open assigned order, event-2 mark delivered, event-3 capture proof
        if (ordersCombo.getValue() == null || signatureField.getText().isEmpty()) {
            showMessage("Select order and capture signature/photo (stub text).", true);
            return;
        }

        // event-5 validate proof, event-6 update status, event-7 notify admin/customer, event-8 log record
        // TODO: real file upload, DB, notifications

        showMessage("Delivery confirmed and proof saved (demo).", false);
    }

    private void showMessage(String text, boolean error) {
        messageLabel.setText(text);
        messageLabel.setStyle(error ? "-fx-text-fill:red;" : "-fx-text-fill:green;");
        messageLabel.setVisible(true);
    }
}
