package Receptionist;

import com.example.moneyexchangeapp.NewCustomerArrival;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.UUID;

public class NewCustomerArrivalController
{
    @javafx.fxml.FXML
    private Label lblVisitorId;
    @javafx.fxml.FXML
    private TextField txtReason;
    @javafx.fxml.FXML
    private Button btnGenerateId;
    @javafx.fxml.FXML
    private TextField txtVisitorId;
    @javafx.fxml.FXML
    private Button btnSaveArrival;

    @javafx.fxml.FXML
    public void initialize() {
        lblVisitorId.setText("No ID Generated");
    }


    @javafx.fxml.FXML
    public void handleSaveArrival(ActionEvent actionEvent) {
        String generatedId = "VIS-" + UUID.randomUUID().toString().substring(0, 6).toUpperCase();

        txtVisitorId.setText(generatedId);
        lblVisitorId.setText("Generated ID: " + generatedId);
    }


    @javafx.fxml.FXML
    public void handleGenerateVisitorId(ActionEvent actionEvent) {
        String visitorId = txtVisitorId.getText();
        String reason = txtReason.getText();

        if (visitorId.isEmpty() || reason.isEmpty()) {
            lblVisitorId.setText("⚠ Please generate ID & enter reason!");
            return;
        }

        NewCustomerArrival arrival = new NewCustomerArrival(visitorId, reason);

        System.out.println("New Customer Arrival Logged:");
        System.out.println("Visitor ID: " + arrival.getVisitorId());
        System.out.println("Reason: " + arrival.getReason());

        lblVisitorId.setText("✔ Saved successfully!");

        txtVisitorId.clear();
        txtReason.clear();
    }
}
