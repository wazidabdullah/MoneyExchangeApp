package com.example.TaxRepresentativeGovernmentNBR;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class AuditLogController {

    @FXML private TextArea logDisplayArea;
    @FXML private Label statusLabel;

    private AuditLogger logger = new AuditLogger();

    @FXML
    public void initialize() {
        // Simulating loading existing logs
        logDisplayArea.setText("[LOG 2025-12-02 10:00] System Start\n[LOG 2025-12-02 10:05] User Login: Admin\n");
    }

    @FXML
    void onRefreshLogs(ActionEvent event) {
        logDisplayArea.appendText("[LOG 2025-12-02 12:00] Logs Refreshed...\n");
        statusLabel.setText("Logs updated.");
    }

    @FXML
    void onExportLogs(ActionEvent event) {
        logger.exportLogs();
        statusLabel.setText("Logs exported to system_logs.txt");
    }
}