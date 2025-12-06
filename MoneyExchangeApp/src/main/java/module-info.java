module com.example.moneyexchangeapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.desktop;

    requires javafx.graphics;


    opens com.example.moneyexchangeapp.EconomicResearcher to javafx.fxml, java.base;
    opens com.example.moneyexchangeapp to javafx.fxml, java.base;
    exports com.example.moneyexchangeapp;

    exports com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;
    opens com.example.moneyexchangeapp.BusinessCollaboratorRepresentative to javafx.fxml;
    exports com.example.TaxRepresentativeGovernmentNBR;
    opens com.example.TaxRepresentativeGovernmentNBR to javafx.fxml;
    exports com.example.moneyexchangeapp.Customer;
    opens com.example.moneyexchangeapp.Customer to java.base, javafx.fxml;
}