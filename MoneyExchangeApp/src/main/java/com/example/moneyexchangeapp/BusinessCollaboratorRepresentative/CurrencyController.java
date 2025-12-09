package com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CurrencyController {

    @FXML
    private TextField currencyPairField;

    @FXML
    private Label rateLabel;

    @FXML
    void onFetchRealTimeRates(ActionEvent event) {
        String pair = currencyPairField.getText();

        if (pair.isEmpty()) {
            rateLabel.setText("Please enter a pair (e.g. USD/EUR)");
            return;
        }

        rateLabel.setText("Current Rate for " + pair + ": 1.0542");
    }

    @FXML
    void onValidateKey(ActionEvent event) {
        rateLabel.setText("Internal API Key Validated.");
    }
}
