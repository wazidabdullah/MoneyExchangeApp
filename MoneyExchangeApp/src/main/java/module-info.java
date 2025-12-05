module com.example.moneyexchangeapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.example.moneyexchangeapp.EconomicResearcher to javafx.fxml, java.base;
    opens com.example.moneyexchangeapp to javafx.fxml, java.base;
    exports com.example.moneyexchangeapp;
    //opens com.example.moneyexchangeapp.EconomicResearcher to javafx.fxml , java.base;

}