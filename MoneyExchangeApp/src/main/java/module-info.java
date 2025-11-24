module com.example.moneyexchangeapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.moneyexchangeapp to javafx.fxml;
    exports com.example.moneyexchangeapp;
}