package com.example.TaxRepresentativeGovernmentNBR;

public class TaxDataManager {

    public double compileTaxData(double transactionVolume) {
        // Flat 15% tax for simulation
        double tax = transactionVolume * 0.15;
        System.out.println("Calculated Tax for volume $" + transactionVolume + " is $" + tax);
        return tax;
    }

    public void crossReferenceNBR(String taxId) {
        System.out.println("Checking NBR Database for Tax ID: " + taxId);
        System.out.println("Status: Compliant.");
    }

    public void flagSuspiciousTx(String txId) {
        System.out.println("[FLAG] Transaction " + txId + " marked for tax evasion review.");
    }
}