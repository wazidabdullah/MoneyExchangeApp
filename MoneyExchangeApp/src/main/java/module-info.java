module com.example.moneyexchangeapp {
    requires javafx.controls;
    requires javafx.fxml;
<<<<<<< HEAD
    requires java.desktop;
=======
    requires javafx.graphics;
>>>>>>> 12cb7ffbe734528ef9b421d610790c4cc5e90fc5


    opens com.example.moneyexchangeapp to javafx.fxml;
    exports com.example.moneyexchangeapp;
    exports com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;
    opens com.example.moneyexchangeapp.BusinessCollaboratorRepresentative to javafx.fxml;
    exports com.example.TaxRepresentativeGovernmentNBR;
    opens com.example.TaxRepresentativeGovernmentNBR to javafx.fxml;
}