package com.example.card_production.Ashik;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class DownloadInvoiceController {

    @FXML private ComboBox<String> completedOrdersCombo;
    @FXML private Label messageLabel;

    @FXML
    private void initialize() {
        completedOrdersCombo.setItems(FXCollections.observableArrayList(
                "Order #100", "Order #101"
        ));
    }

    @FXML
    private void handleDownload() {
        // event-1 go to order history, event-2 select order, event-3 click download
        if (completedOrdersCombo.getValue() == null) {
            showMessage("Select an order first.", true);
            return;
        }

        // event-4 retrieve invoice, event-5 generate PDF, event-6 verify (stubs)
        // TODO: real PDF generation and file save dialog

        // event-7 download & event-8 confirmation
        showMessage("Invoice for " + completedOrdersCombo.getValue()
                + " downloaded (demo).", false);
    }

    private void showMessage(String text, boolean error) {
        messageLabel.setText(text);
        messageLabel.setStyle(error ? "-fx-text-fill:red;" : "-fx-text-fill:green;");
        messageLabel.setVisible(true);
    }
}


