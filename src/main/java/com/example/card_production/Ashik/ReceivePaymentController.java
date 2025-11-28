package com.example.card_production.Ashik;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ReceivePaymentController {

    @FXML private ComboBox<String> codOrdersCombo;
    @FXML private TextField amountField;
    @FXML private ComboBox<String> paymentTypeCombo;
    @FXML private Label messageLabel;

    @FXML
    private void initialize() {
        codOrdersCombo.setItems(FXCollections.observableArrayList(
                "Order #230 - COD 500",
                "Order #231 - COD 800"
        ));
        paymentTypeCombo.setItems(FXCollections.observableArrayList(
                "Cash", "Digital"
        ));
    }

    @FXML
    private void handleConfirmPayment() {
        if (codOrdersCombo.getValue() == null ||
                paymentTypeCombo.getValue() == null ||
                amountField.getText().isEmpty()) {
            showMessage("Fill all payment fields.", true);
            return;
        }

        double amount;
        try {
            amount = Double.parseDouble(amountField.getText());
        } catch (NumberFormatException e) {
            showMessage("Amount must be numeric.", true);
            return;
        }

        // event-3 validate amount, event-4 mark paid, event-5 generate receipt,
        // event-6 notify finance, event-7 update record, event-8 confirm (stubs)
        // TODO: DB + receipt generation

        showMessage("COD payment of " + amount + " received (demo).", false);
    }

    private void showMessage(String text, boolean error) {
        messageLabel.setText(text);
        messageLabel.setStyle(error ? "-fx-text-fill:red;" : "-fx-text-fill:green;");
        messageLabel.setVisible(true);
    }
}

