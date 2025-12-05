package com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TransactionController {

    @FXML
    private TextField swiftCodeField;

    @FXML
    private TextField amountField;

    @FXML
    private Label resultLabel;

    @FXML
    void onCalculateNetSettlement(ActionEvent event) {
        try {
            if (amountField.getText().isEmpty()) {
                resultLabel.setText("Please enter an amount.");
                return;
            }

            double amount = Double.parseDouble(amountField.getText());
            double fee = amount * 0.02;
            double net = amount - fee;

            resultLabel.setText(String.format("Net: $%.2f (Fee: $%.2f)", net, fee));

        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid amount. Use numbers only.");
        }
    }

    @FXML
    void onTransmitInstructions(ActionEvent event) {
        String swift = swiftCodeField.getText();

        if (swift == null || swift.isEmpty()) {
            resultLabel.setText("Error: SWIFT code required.");
            return;
        }

        if (swift.length() < 8) {
            resultLabel.setText("Error: Invalid SWIFT code.");
        } else {
            resultLabel.setText("Sent instructions to " + swift);
            System.out.println("Transmitting to Settlement Engine...");
        }
    }
}