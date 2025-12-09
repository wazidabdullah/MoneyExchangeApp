package com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AgentController {

    @FXML
    private TextField collaboratorIdField;

    @FXML
    private TextField apiKeyField;

    @FXML
    private TextArea logArea;

    @FXML
    void onApproveTransaction(ActionEvent event) {
        log("Attempting to approve transaction...");
        log("Transaction approved for ID: " + collaboratorIdField.getText());
    }

    @FXML
    void onMonitorRisk(ActionEvent event) {
        log("Scanning latest transactions for risk patterns...");
        log("Risk Status: LOW");
    }

    @FXML
    void onReconcile(ActionEvent event) {
        log("Reconciling accounts with Settlement Engine...");
        log("Reconciliation Complete.");
    }

    @FXML
    void onInitiateSettlement(ActionEvent event) {
        if (apiKeyField.getText().isEmpty()) {
            log("Error: API Key required for settlement.");
            return;
        }
        log("Settlement process started via SWIFT Gateway.");
    }

    private void log(String message) {
        logArea.appendText(message + "\n");
    }
}
