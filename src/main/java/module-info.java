module com.example.card_production {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.card_production to javafx.fxml;
    exports com.example.card_production;
}