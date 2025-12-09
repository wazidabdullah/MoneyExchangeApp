package com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;

public class Transaction {
    private String swiftCode;
    private double amount;
    private boolean isProcessed;

    public Transaction(String swiftCode, double amount) {
        this.swiftCode = swiftCode;
        this.amount = amount;
        this.isProcessed = false;
    }

    public double calculateNetSettlement() {
        double fee = amount * 0.02; // 2% fee
        return amount - fee;
    }

    public void transmitInstructions() {
        if (amount > 0) {
            this.isProcessed = true;
            System.out.println("Sending $" + amount + " to SWIFT: " + swiftCode);
        } else {
            System.out.println("Error: Invalid amount.");
        }
    }

    public String getSwiftCode() { return swiftCode; }
    public void setSwiftCode(String swiftCode) { this.swiftCode = swiftCode; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}
