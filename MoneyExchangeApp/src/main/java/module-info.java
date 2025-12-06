module com.example.moneyexchangeapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.moneyexchangeapp to javafx.fxml;
    exports com.example.moneyexchangeapp;
    exports Accountant;
    opens Accountant to javafx.fxml;
    exports Receptionist;
    opens Receptionist to javafx.fxml;
}