module com.example.card_production {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
//    requires com.example.card_production;
//    requires com.example.card_production;


    opens com.example.card_production.Akbor to javafx.fxml;
    exports com.example.card_production.Akbor;


    opens com.example.card_production to javafx.fxml;
    exports com.example.card_production;
}