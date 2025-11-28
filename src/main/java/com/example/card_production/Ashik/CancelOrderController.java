package com.example.card_production.Ashik;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CancelOrderController {

    @FXML private ComboBox<String> activeOrdersCombo;
    @FXML private TextArea reasonArea;
    @FXML private Label messageLabel;

    @FXML
    private void initialize() {
        activeOrdersCombo.setItems(FXCollections.observableArrayList(
                "Order #110 - In Production",
                "Order #111 - Pending"
        ));
    }

    @FXML
    private void handleCancelOrder() {
        // event-1 go to My Orders, event-2 select active order, event-3 click cancel
        if (activeOrdersCombo.getValue() == null || reasonArea.getText().isEmpty()) {
            showMessage("Select order and write reason.", true);
            return;
        }

        // event-5 validate cancellation period (stub)
        boolean allowed = true; // TODO: check deadline / status
        if (!allowed) {
            showMessage("Cancellation period over.", true);
            return;
        }

        // event-6 update status to cancelled, event-7 notify admin & production, event-8 refund (stubs)
        // TODO: DB update + notification + refund flow

        showMessage("Order cancelled. Refund process initiated (demo).", false);
    }

    private void showMessage(String text, boolean error) {
        messageLabel.setText(text);
        messageLabel.setStyle(error ? "-fx-text-fill:red;" : "-fx-text-fill:green;");
        messageLabel.setVisible(true);
    }
}