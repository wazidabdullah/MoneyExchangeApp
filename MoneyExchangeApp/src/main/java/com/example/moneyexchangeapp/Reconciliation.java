package com.example.moneyexchangeapp;

public class Reconciliation {
    private double bankAmount;
    private double systemAmount;
    private double difference;
    private String status;

    public Reconciliation(double bankAmount, double systemAmount) {
        this.bankAmount = bankAmount;
        this.systemAmount = systemAmount;
        this.difference = bankAmount - systemAmount;
        this.status = (difference == 0) ? "Matched" : "Mismatch";
    }

    public double getBankAmount() {
        return bankAmount;
    }

    public double getSystemAmount() {
        return systemAmount;
    }

    public double getDifference() {
        return difference;
    }

    public String getStatus() {
        return status;
    }

    public void setBankAmount(double bankAmount) {
        this.bankAmount = bankAmount;
        updateStatus();
    }

    public void setSystemAmount(double systemAmount) {
        this.systemAmount = systemAmount;
        updateStatus();
    }

    private void updateStatus() {
        this.difference = bankAmount - systemAmount;
        this.status = (difference == 0) ? "Matched" : "Mismatch";
    }
}
