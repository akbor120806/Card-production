package com.example.card_production.Ashik;

import javafx.collections.FXCollections;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ViewAssignedController {
    @FXML private TextField filterField;
    @FXML private ListView<String> deliveryListView;
    @FXML private Label detailsLabel;
    @FXML private Label messageLabel;

    private FilteredList<String> filteredOrders;

    @FXML
    private void initialize() {
        // event-3 retrieve assigned orders
        var baseList = FXCollections.observableArrayList(
                "Order #200 - Dhaka - High",
                "Order #201 - Gazipur - Normal",
                "Order #202 - Narayanganj - High"
        );
        filteredOrders = new FilteredList<>(baseList, s -> true);
        deliveryListView.setItems(filteredOrders);

        deliveryListView.getSelectionModel().selectedItemProperty().addListener((obs, o, n) -> {
            if (n != null) {
                // event-6 select order, event-7 view customer contact info (simplified)
                detailsLabel.setText("Details: " + n + " | Customer: 017XXXXXXXX");
            }
        });

        // event-5 filter by location or urgency
        filterField.textProperty().addListener((obs, o, text) ->
                filteredOrders.setPredicate(item ->
                        text == null || text.isEmpty() || item.toLowerCase().contains(text.toLowerCase()))
        );
    }

    @FXML
    private void handleReadyToDeliver() {
        if (deliveryListView.getSelectionModel().getSelectedItem() == null) {
            showMessage("Select an order first.", true);
            return;
        }
        // event-8 confirm readiness
        showMessage("Marked as ready to deliver (demo).", false);
    }

    private void showMessage(String text, boolean error) {
        messageLabel.setText(text);
        messageLabel.setStyle(error ? "-fx-text-fill:red;" : "-fx-text-fill:green;");
        messageLabel.setVisible(true);
    }
}






