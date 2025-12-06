package com.example.moneyexchangeapp;

public class BackupAndRestore {

    public boolean performBackup(String destination) {
        System.out.println("Backing up data to: " + destination);

        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            return false;
        }

        return true; // success
    }

    public boolean performRestore() {

        System.out.println("Restoring backup...");

        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}

