module com.example.moneyexchangeapp {
    requires javafx.controls;
    requires javafx.fxml;
<<<<<<< HEAD
    requires java.desktop;
=======
    requires javafx.graphics;
>>>>>>> 12cb7ffbe734528ef9b421d610790c4cc5e90fc5

    opens com.example.moneyexchangeapp.EconomicResearcher to javafx.fxml, java.base;
    opens com.example.moneyexchangeapp to javafx.fxml, java.base;
    exports com.example.moneyexchangeapp;
<<<<<<< HEAD
    //opens com.example.moneyexchangeapp.EconomicResearcher to javafx.fxml , java.base;

=======
    exports com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;
    opens com.example.moneyexchangeapp.BusinessCollaboratorRepresentative to javafx.fxml;
    exports com.example.TaxRepresentativeGovernmentNBR;
    opens com.example.TaxRepresentativeGovernmentNBR to javafx.fxml;
>>>>>>> 4a6a6767bfe4d05fec9afcb2bc48da1e455026d4
}