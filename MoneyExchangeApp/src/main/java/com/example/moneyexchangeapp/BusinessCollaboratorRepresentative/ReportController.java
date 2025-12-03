package com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ReportController {

    @FXML private ComboBox<String> reportTypeBox;
    @FXML private TextField partnerIdField;
    @FXML private Label outputLabel;

    private ReportGenerator reportGenerator = new ReportGenerator();

    @FXML
    public void initialize() {
        reportTypeBox.getItems().addAll("Audit Summary", "Transaction Log", "Tax Filing");
    }

    @FXML
    void onGeneratePDF(ActionEvent event) {
        String type = reportTypeBox.getValue();
        if (type == null) {
            outputLabel.setText("Please select a report type.");
            return;
        }
        reportGenerator.generateAuditReport(type);
        outputLabel.setText(type + " PDF generated successfully.");
    }

    @FXML
    void onReconcilePartner(ActionEvent event) {
        String partner = partnerIdField.getText();
        if (partner.isEmpty()) {
            outputLabel.setText("Enter Partner ID for reconciliation.");
            return;
        }
        reportGenerator.generateReconciliationReport(partner);
        outputLabel.setText("Reconciliation Report created for " + partner);
    }
}