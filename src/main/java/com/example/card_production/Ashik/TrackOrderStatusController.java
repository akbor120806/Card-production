package com.example.card_production.Ashik;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class TrackOrderStatusController {

    @FXML private ListView<String> ordersListView;
    @FXML private Label statusLabel;

    @FXML
    private void initialize() {
        // event-2 Go to "My Orders" section – here just loading dummy orders
        ordersListView.setItems(FXCollections.observableArrayList(
                "Order #101 - Poster",
                "Order #102 - Diary",
                "Order #103 - Card"
        ));

        ordersListView.getSelectionModel().selectedItemProperty().addListener((obs, oldV, newV) -> {
            if (newV != null) {
                // event-4 Retrieve progress & event-5 display status
                statusLabel.setText("Status of " + newV + ": In Production (demo)");
            }
        });
    }

    @FXML
    private void handleRefresh() {
        // event-6 refresh/update view
        // TODO: reload from database
        statusLabel.setText("Orders refreshed (demo).");
    }

    @FXML
    private void handleBack() {
        // TODO: return to customer dashboard
    }
}