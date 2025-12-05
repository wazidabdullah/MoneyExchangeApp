package com.example.TaxRepresentativeGovernmentNBR;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TaxDataController {

    @FXML private TextField taxIdField;
    @FXML private TextField volumeField;
    @FXML private Label resultLabel;

    private TaxDataManager taxManager = new TaxDataManager();

    @FXML
    void onCalculateTax(ActionEvent event) {
        try {
            double vol = Double.parseDouble(volumeField.getText());
            double tax = taxManager.compileTaxData(vol);
            resultLabel.setText("Calculated Tax: $" + tax);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid Volume Amount.");
        }
    }

    @FXML
    void onCheckNBR(ActionEvent event) {
        String id = taxIdField.getText();
        if (id.isEmpty()) {
            resultLabel.setText("Please enter Tax ID.");
            return;
        }
        taxManager.crossReferenceNBR(id);
        resultLabel.setText("NBR Check Complete for: " + id);
    }

    @FXML
    void onFlagSuspicious(ActionEvent event) {
        taxManager.flagSuspiciousTx(taxIdField.getText());
        resultLabel.setText("Marked ID " + taxIdField.getText() + " as Suspicious.");
    }
}