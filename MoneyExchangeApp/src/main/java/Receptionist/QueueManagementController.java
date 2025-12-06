package Receptionist;

import com.example.moneyexchangeapp.QueueManagement;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class QueueManagementController
{
    @javafx.fxml.FXML
    private TableColumn <QueueManagement, String>colServiceType;
    @javafx.fxml.FXML
    private Button btnRefreshQueue;
    @javafx.fxml.FXML
    private ComboBox <String> comboServiceType;
    @javafx.fxml.FXML
    private TableColumn <QueueManagement, String>colCustomerName;
    @javafx.fxml.FXML
    private TextField txtStatus;
    @javafx.fxml.FXML
    private Button btnCompleted;
    @javafx.fxml.FXML
    private TextField txtCustomerName;
    @javafx.fxml.FXML
    private TableColumn <QueueManagement, String>colToken;
    @javafx.fxml.FXML
    private Button btnServe;
    @javafx.fxml.FXML
    private TableColumn <QueueManagement, String>colStatus;
    @javafx.fxml.FXML
    private TextField txtTokenNo;

    @javafx.fxml.FXML
    public void initialize() {
        comboServiceType.getItems().addAll(
                "Currency Exchange",
                "KYC Verification",
                "Remittance Help",
                "Customer Support"
        );
    }


    @javafx.fxml.FXML
    public void handleRefreshQueue(ActionEvent actionEvent) {
        System.out.println("Queue refreshed!");
    }

    @javafx.fxml.FXML
    public void handleMarkServing(ActionEvent actionEvent) {
        String token = txtTokenNo.getText();
        String customer = txtCustomerName.getText();
        String serviceType = comboServiceType.getValue();

        if (token.isEmpty() || customer.isEmpty() || serviceType == null) {
            System.out.println("⚠ Fill all fields before marking as serving!");
            return;
        }

        System.out.println("Serving Token: " + token);
        System.out.println("Customer: " + customer);
        System.out.println("Service: " + serviceType);

        txtStatus.setText("Serving");
    }


    @javafx.fxml.FXML
    public void handleMarkCompleted(ActionEvent actionEvent) {
        if (txtTokenNo.getText().isEmpty()) {
            System.out.println("⚠ Select a token before marking completed!");
            return;
        }

        System.out.println("Token " + txtTokenNo.getText() + " marked as COMPLETED.");
        txtStatus.setText("Completed");
    }
}