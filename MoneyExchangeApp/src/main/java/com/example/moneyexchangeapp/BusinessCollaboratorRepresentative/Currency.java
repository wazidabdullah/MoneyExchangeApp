package com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;

public class Currency {
    private String currencyPair; // e.g., "USD/EUR"
    private double currentRate;

    public Currency(String currencyPair) {
        this.currencyPair = currencyPair;
        this.currentRate = 0.0;
    }

    public double fetchRealTimeRate() {
        // Simulating a fetch from an external API
        if ("USD/EUR".equals(currencyPair)) {
            this.currentRate = 0.92;
        } else if ("USD/GBP".equals(currencyPair)) {
            this.currentRate = 0.78;
        } else {
            this.currentRate = 1.0; // Default
        }
        System.out.println("Fetched rate for " + currencyPair + ": " + this.currentRate);
        return this.currentRate;
    }

    // Getters and Setters
    public String getCurrencyPair() { return currencyPair; }
    public void setCurrencyPair(String currencyPair) { this.currencyPair = currencyPair; }

    public double getCurrentRate() { return currentRate; }
}