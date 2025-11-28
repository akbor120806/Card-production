package com.example.card_production.Ashik;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class FailedDeliveryController {

    @FXML private ComboBox<String> ordersCombo;
    @FXML private ComboBox<String> reasonCombo;
    @FXML private TextArea detailsArea;
    @FXML private Label messageLabel;

    @FXML
    private void initialize() {
        ordersCombo.setItems(FXCollections.observableArrayList(
                "Order #210", "Order #211"
        ));
        reasonCombo.setItems(FXCollections.observableArrayList(
                "Customer not available",
                "Wrong address",
                "Payment issue",
                "Other"
        ));
    }

    @FXML
    private void handleSaveFailedDelivery() {
        // event-1 select failed order, event-2 choose reason, event-3 upload details
        if (ordersCombo.getValue() == null || reasonCombo.getValue() == null) {
            showMessage("Select order and reason.", true);
            return;
        }

        // event-4 update status, event-5 notify customer & sales, event-6 save report (stubs)
        // TODO: DB update + notifications

        showMessage("Failed delivery recorded (demo).", false);
    }

    @FXML
    private void handleReschedule() {
        // event-7 reschedule delivery, event-8 confirm update (stub)
        showMessage("Delivery rescheduled (demo).", false);
    }

    private void showMessage(String text, boolean error) {
        messageLabel.setText(text);
        messageLabel.setStyle(error ? "-fx-text-fill:red;" : "-fx-text-fill:green;");
        messageLabel.setVisible(true);
    }
}

