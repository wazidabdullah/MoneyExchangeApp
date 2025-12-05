package com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BankController {

    @FXML
    private TextField apiEndpointField;

    @FXML
    private TextField bankNameField;

    @FXML
    private Label statusLabel;

    @FXML
    void onSubmitApiKey(ActionEvent event) {
        // UML: submitAPIKey()
        String endpoint = apiEndpointField.getText();
        if (endpoint.isEmpty()) {
            statusLabel.setText("Error: Endpoint required.");
        } else {
            statusLabel.setText("API Key submitted to " + endpoint);
        }
    }

    @FXML
    void onReceiveConfirmation(ActionEvent event) {
        // UML: receiveConfirmation()
        statusLabel.setText("Connection Confirmed: Secure.");
    }
}