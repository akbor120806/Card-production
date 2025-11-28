package com.example.card_production.Ashik;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ReviewRateController {

        @FXML
        private ComboBox<String> completedOrdersCombo;
        @FXML
        private Slider ratingSlider;
        @FXML
        private TextArea feedbackArea;
        @FXML
        private Label messageLabel;

        @FXML
        private void initialize() {
            completedOrdersCombo.setItems(FXCollections.observableArrayList(
                    "Order #100 - Delivered",
                    "Order #101 - Delivered"
            ));
        }

        @FXML
        private void handleSubmitReview() {
            // event-2 open completed orders, event-3 select, event-4 rate, event-5 feedback
            if (completedOrdersCombo.getValue() == null) {
                showMessage("Please select an order.", true);
                return;
            }

            double rating = ratingSlider.getValue();
            String feedback = feedbackArea.getText();

            // event-6 submit review, event-7 notify admin, event-8 update avg rating (stubs)
            // TODO: save to DB & update stats

            showMessage("Thanks! You rated " + rating + "★ with feedback submitted.", false);
        }

        private void showMessage(String text, boolean error) {
            messageLabel.setText(text);
            messageLabel.setStyle(error ? "-fx-text-fill:red;" : "-fx-text-fill:green;");
            messageLabel.setVisible(true);
        }
    }

