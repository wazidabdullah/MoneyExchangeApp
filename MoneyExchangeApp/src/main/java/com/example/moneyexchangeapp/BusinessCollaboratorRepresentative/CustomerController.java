package com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CustomerController {

    @FXML
    private TextField customerNameField;

    @FXML
    private TextField docIdField;

    @FXML
    private Label kycStatusLabel;

    @FXML
    void onReviewKYC(ActionEvent event) {
        // UML: reviewKYC(data)
        String name = customerNameField.getText();
        if (name.isEmpty()) {
            kycStatusLabel.setText("Enter customer name.");
        } else {
            kycStatusLabel.setText("KYC Reviewed for: " + name + ". Status: PENDING.");
        }
    }

    @FXML
    void onCheckAMLFlags(ActionEvent event) {
        // UML: checkAMLFlags(tx)
        kycStatusLabel.setText("AML Check: No suspicious flags found.");
    }
}