package com.example.card_production.Ashik;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PlaceNewProductOrderController {

    @FXML private ComboBox<String> productCombo;
    @FXML private TextField quantityField;
    @FXML private TextArea customizationArea;
    @FXML private Label orderSummaryLabel;
    @FXML private Label messageLabel;

    @FXML
    private void initialize() {
        // event-2 Browse available products (simplified as a list)
        productCombo.setItems(FXCollections.observableArrayList(
                "Poster", "Diary", "Greeting Card"
        ));
    }

    @FXML
    private void handleReviewOrder() {
        // event-3 Select product and quantity, event-4 input customization, event-5 confirm
        String product = productCombo.getValue();
        String qtyText = quantityField.getText();

        if (product == null || qtyText.isEmpty()) {
            showMessage("Please select product and enter quantity", true);
            return;
        }

        int qty;
        try {
            qty = Integer.parseInt(qtyText);
        } catch (NumberFormatException e) {
            showMessage("Quantity must be a number", true);
            return;
        }

        String customization = customizationArea.getText();
        String summary = "Product: " + product +
                ", Quantity: " + qty +
                ", Customization: " + (customization.isEmpty() ? "None" : customization);
        orderSummaryLabel.setText(summary);
        showMessage("Order details reviewed. You can proceed to payment.", false);
    }

    @FXML
    private void handleProceedToPayment() {
        // event-6 Proceed to payment (here just a stub)
        // TODO: switch to payment scene or open payment dialog
        showMessage("Proceeding to payment (stub).", false);

        // event-7 Save order, event-8 display confirmation will be in payment screen
    }

    private void showMessage(String text, boolean error) {
        messageLabel.setText(text);
        messageLabel.setStyle(error ? "-fx-text-fill:red;" : "-fx-text-fill:green;");
        messageLabel.setVisible(true);
    }
}


