package com.example.TaxRepresentativeGovernmentNBR;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EnforcementController {

    @FXML private TextField currentVolumeField;
    @FXML private Label enforcementLabel;

    private RegulatoryEnforcementEngine engine = new RegulatoryEnforcementEngine();

    @FXML
    void onAuditVolume(ActionEvent event) {
        try {
            double vol = Double.parseDouble(currentVolumeField.getText());
            engine.auditVolumes(vol);

            if (vol > 500000) {
                enforcementLabel.setText("VIOLATION: Limit Exceeded!");
                enforcementLabel.setStyle("-fx-text-fill: red;");
            } else {
                enforcementLabel.setText("Status: Compliant within limits.");
                enforcementLabel.setStyle("-fx-text-fill: green;");
            }
        } catch (NumberFormatException e) {
            enforcementLabel.setText("Invalid number format.");
        }
    }

    @FXML
    void onIssueNotice(ActionEvent event) {
        engine.generateComplianceNotice();
        enforcementLabel.setText("Compliance Notice Issued to Agency.");
        enforcementLabel.setStyle("-fx-text-fill: blue;");
    }
}