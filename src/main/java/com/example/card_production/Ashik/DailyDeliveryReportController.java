package com.example.card_production.Ashik;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.time.LocalDate;
public class DailyDeliveryReportController {

    @FXML private DatePicker datePicker;
    @FXML private TextArea reportArea;
    @FXML private Label messageLabel;

    @FXML
    private void handleGenerateReport() {
        // event-1 open report tab, event-2 select date, event-3 load completed deliveries
        LocalDate date = datePicker.getValue();
        if (date == null) {
            showMessage("Select a date first.", true);
            return;
        }

        // event-4 calculate totals, event-5 verify accuracy (stub)
        // TODO: load from DB

        String report = """
                Daily Delivery Report - %s
                
                Completed Deliveries: 10
                Failed Deliveries: 2
                COD Collected: 3500
                Remarks: Demo data only.
                """.formatted(date);

        reportArea.setText(report);
        showMessage("Summary report generated (demo).", false);
    }

    @FXML
    private void handleSendToAdmin() {
        // event-6 generate summary (done above), event-7 send to admin, event-8 logout (stub)
        showMessage("Report sent to Admin and logged out (demo).", false);
    }

    private void showMessage(String text, boolean error) {
        messageLabel.setText(text);
        messageLabel.setStyle(error ? "-fx-text-fill:red;" : "-fx-text-fill:green;");
        messageLabel.setVisible(true);
    }
}

