package com.example.TaxRepresentativeGovernmentNBR;

import java.time.LocalDateTime;

public class AuditLogger {

    private String logFile;

    public AuditLogger() {
        this.logFile = "system_logs.txt";
    }

    public void logTransaction(String txId, String action) {
        String timestamp = LocalDateTime.now().toString();
        System.out.println("[LOG " + timestamp + "] TxID: " + txId + " | Action: " + action);
        // In a real app, this would write to the text file
    }

    public void exportLogs() {
        System.out.println("Exporting all logs to " + logFile + "...");
        System.out.println("Export Complete.");
    }
}