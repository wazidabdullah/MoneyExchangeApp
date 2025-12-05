package com.example.moneyexchangeapp;

public class BackupAndRestore {

    public boolean performBackup(String destination) {
        // Simulating backup process
        System.out.println("Backing up data to: " + destination);

        try {
            Thread.sleep(1500);  // Simulate processing
        } catch (Exception e) {
            return false;
        }

        return true; // success
    }

    public boolean performRestore() {
        // Simulating restore
        System.out.println("Restoring backup...");

        try {
            Thread.sleep(1500);  // simulate processing
        } catch (Exception e) {
            return false;
        }

        return true;  // success
    }
}

