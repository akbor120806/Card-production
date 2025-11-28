package com.example.card_production.Ashik;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CommunicateWithSalesController {

    @FXML private TextArea conversationArea;
    @FXML private TextField messageField;

    @FXML
    private void initialize() {
        conversationArea.setText("Support: Hello! How can we help you today?\n");
    }

    @FXML
    private void handleSend() {
        String msg = messageField.getText();
        if (msg.isEmpty()) return;

        // event-2 type message, event-3 send to sales, event-4 log thread
        conversationArea.appendText("You: " + msg + "\n");
        messageField.clear();

        // simulate response
        conversationArea.appendText("Sales: We received your message (demo).\n");
    }

    @FXML
    private void handleEndChat() {
        // event-8 end chat & logout (stub)
        conversationArea.appendText("Chat ended. You have been logged out (demo).\n");
        // TODO: actually log out & go to login scene
    }
}






