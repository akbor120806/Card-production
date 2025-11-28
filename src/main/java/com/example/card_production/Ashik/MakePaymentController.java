package com.example.card_production.Ashik;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MakePaymentController {


    @FXML private ComboBox<String> unpaidOrdersCombo;
    @FXML private ComboBox<String> paymentMethodCombo;
    @FXML private TextField transactionIdField;
    @FXML private Label invoiceLabel;
    @FXML private Label messageLabel;

    @FXML
    private void initialize() {
        unpaidOrdersCombo.setItems(FXCollections.observableArrayList(
                "Order #101 - Due 500",
                "Order #104 - Due 1200"
        ));
        paymentMethodCombo.setItems(FXCollections.observableArrayList(
                "Bkash", "Nagad", "Card", "Bank"
        ));
    }

    @FXML
    private void handlePayNow() {
        // event-1 select unpaid order, event-2 choose method, event-3 enter details
        if (unpaidOrdersCombo.getValue() == null ||
                paymentMethodCombo.getValue() == null ||
                transactionIdField.getText().isEmpty()) {
            showMessage("Please select order, method and enter transaction id.", true);
            return;
        }

        // event-4 validate payment (stub)
        boolean valid = transactionIdField.getText().length() >= 4;
        if (!valid) {
            showMessage("Invalid transaction id.", true);
            return;
        }

        // event-5 process transaction, event-6 update status
        // TODO: payment processing + DB update

        // event-7 generate invoice (demo)
        invoiceLabel.setText("Invoice: Order " + unpaidOrdersCombo.getValue()
                + " paid by " + paymentMethodCombo.getValue());

        // event-8 notify confirmation
        showMessage("Payment successful. Invoice generated.", false);
    }

    private void showMessage(String text, boolean error) {
        messageLabel.setText(text);
        messageLabel.setStyle(error ? "-fx-text-fill:red;" : "-fx-text-fill:green;");
        messageLabel.setVisible(true);
    }
}