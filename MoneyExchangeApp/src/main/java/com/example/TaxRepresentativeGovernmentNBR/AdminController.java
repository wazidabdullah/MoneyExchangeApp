package com.example.TaxRepresentativeGovernmentNBR;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
// The fix is here: specifically using javafx.scene.control.*
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class AdminController {

    @FXML private TextField repIdField;
    @FXML private ComboBox<String> accessLevelBox;
    @FXML private ListView<String> auditLogList;

    @FXML
    public void initialize() {
        accessLevelBox.setItems(FXCollections.observableArrayList("Auditor", "Enforcement", "Observer"));
    }

    @FXML
    void onMonitorTransactions(ActionEvent event) {
        // UML: monitorTransactions()
        if (auditLogList != null) {
            auditLogList.getItems().add(0, "[MONITOR] Scanning live transactions for Rep ID: " + repIdField.getText());
        }
    }

    @FXML
    void onCollectTaxData(ActionEvent event) {
        // UML: collectTaxData()
        if (auditLogList != null) {
            auditLogList.getItems().add(0, "[TAX] Compiling tax data from LocalDatabase...");
        }
    }

    @FXML
    void onEnforceRegulations(ActionEvent event) {
        // UML: enforceRegulations()
        if (auditLogList != null) {
            auditLogList.getItems().add(0, "[ALERT] Compliance violation flags checked.");
        }
    }

    @FXML
    void onAuditLogs(ActionEvent event) {
        // UML: auditLogs()
        if (auditLogList != null) {
            auditLogList.getItems().add(0, "[AUDIT] Exporting logs to RegulatoryEnforcementEngine...");
        }
    }
}