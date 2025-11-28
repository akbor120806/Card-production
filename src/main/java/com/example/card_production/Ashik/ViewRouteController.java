package com.example.card_production.Ashik;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ViewRouteController {

    @FXML private ComboBox<String> ordersCombo;
    @FXML private TextArea routeArea;
    @FXML private Label messageLabel;

    @FXML
    private void initialize() {
        ordersCombo.setItems(FXCollections.observableArrayList(
                "Order #200 - Dhaka",
                "Order #201 - Gazipur"
        ));
    }

    @FXML
    private void handleViewMap() {
        // event-1 open order, event-2 click view map, event-3 load route, event-4 display
        if (ordersCombo.getValue() == null) {
            showMessage("Select an order first.", true);
            return;
        }

        // demo route
        routeArea.setText("Optimized path for " + ordersCombo.getValue()
                + ":\nWarehouse -> Uttara -> Customer.");
        showMessage("Route loaded (demo).", false);
    }

    @FXML
    private void handleStartNavigation() {
        // event-5 confirm navigation start, event-6/7 track location/progress (stub)
        showMessage("Navigation started (tracking not implemented).", false);
    }

    private void showMessage(String text, boolean error) {
        messageLabel.setText(text);
        messageLabel.setStyle(error ? "-fx-text-fill:red;" : "-fx-text-fill:green;");
        messageLabel.setVisible(true);
    }
}


