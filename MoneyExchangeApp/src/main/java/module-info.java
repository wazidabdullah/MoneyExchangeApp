module com.example.moneyexchangeapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.moneyexchangeapp to javafx.fxml;
    exports com.example.moneyexchangeapp;
    exports com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;
    opens com.example.moneyexchangeapp.BusinessCollaboratorRepresentative to javafx.fxml;
    exports com.example.TaxRepresentativeGovernmentNBR;
    opens com.example.TaxRepresentativeGovernmentNBR to javafx.fxml;
}