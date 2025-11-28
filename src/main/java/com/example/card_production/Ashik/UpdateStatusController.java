package com.example.card_production.Ashik;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.time.LocalDateTime;

public class UpdateStatusController {

    @FXML private ComboBox<String> ordersCombo;
    @FXML private ComboBox<String> statusCombo;
    @FXML private Label messageLabel;

    @FXML
    private void initialize() {
        ordersCombo.setItems(FXCollections.observableArrayList(
                "Order #200", "Order #201", "Order #202"
        ));
        statusCombo.setItems(FXCollections.observableArrayList(
                "Out for Delivery", "Delivered"
        ));
    }

    @FXML
    private void handleUpdateStatus() {
        if (ordersCombo.getValue() == null || statusCombo.getValue() == null) {
            showMessage("Select order and status.", true);
            return;
        }

        // event-4 verify update (stub)
        // event-5 save status change, event-6 notify customer, event-7 log time/date
        LocalDateTime now = LocalDateTime.now();
        // TODO: DB update + notification

        showMessage("Status updated to " + statusCombo.getValue()
                + " at " + now + " (demo).", false);
    }

    private void showMessage(String text, boolean error) {
        messageLabel.setText(text);
        messageLabel.setStyle(error ? "-fx-text-fill:red;" : "-fx-text-fill:green;");
        messageLabel.setVisible(true);
    }
}