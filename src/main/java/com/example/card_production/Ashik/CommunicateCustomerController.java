package com.example.card_production.Ashik;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CommunicateCustomerController {
    @FXML private TextArea chatArea;
    @FXML private TextField messageField;

    @FXML
    private void initialize() {
        chatArea.setText("System: Opened chat with customer.\n");
    }

    @FXML
    private void handleSend() {
        String msg = messageField.getText();
        if (msg.isEmpty()) return;

        // event-3 send message/call (simulated as chat)
        chatArea.appendText("You: " + msg + "\n");
        messageField.clear();

        // event-4 receive response (demo)
        chatArea.appendText("Customer: Okay, I am waiting. (demo)\n");

        // event-5 update delivery notes, event-7 save log – as part of this interaction (stub)
    }

    @FXML
    private void handleBack() {
        // event-8 return to dashboard (stub)
        chatArea.appendText("Returning to dashboard (demo).\n");
    }
}

