package Receptionist;

import com.example.moneyexchangeapp.InteractionLog;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class InteractionLogController
{
    @javafx.fxml.FXML
    private Button btnSaveInteraction;
    @javafx.fxml.FXML
    private Label lblInteractionStatus;
    @javafx.fxml.FXML
    private TextArea txtDescription;
    @javafx.fxml.FXML
    private TextField xtServiceProvided;
    @javafx.fxml.FXML
    private ComboBox <String>cmbQueryType;

    @javafx.fxml.FXML
    public void initialize() {
        cmbQueryType.getItems().addAll(
                "Account Opening",
                "Currency Exchange",
                "Remittance Query",
                "System Issue",
                "General Inquiry"
        );
    }

    @javafx.fxml.FXML
    public void handleSaveInteraction(ActionEvent actionEvent) {
        String queryType = cmbQueryType.getValue();
        String serviceProvided = xtServiceProvided.getText();
        String description = txtDescription.getText();

        if (queryType == null || serviceProvided.isEmpty() || description.isEmpty()) {
            lblInteractionStatus.setText("⚠ Please fill all fields!");
            return;
        }

        InteractionLog log = new InteractionLog(queryType, serviceProvided, description);

        System.out.println("Interaction Saved:");
        System.out.println("Type: " + log.getQueryType());
        System.out.println("Service: " + log.getServiceProvided());
        System.out.println("Description: " + log.getDescription());

        lblInteractionStatus.setText("✔ Interaction saved successfully!");

        cmbQueryType.setValue(null);
        xtServiceProvided.clear();
        txtDescription.clear();
    }
}
