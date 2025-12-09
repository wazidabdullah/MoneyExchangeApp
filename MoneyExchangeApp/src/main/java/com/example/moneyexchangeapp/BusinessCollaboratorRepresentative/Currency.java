package com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;

public class Currency {
    private String currencyPair; 
    private double currentRate;

    public Currency(String currencyPair) {
        this.currencyPair = currencyPair;
        this.currentRate = 0.0;
    }

    public double fetchRealTimeRate() {
        if ("USD/EUR".equals(currencyPair)) {
            this.currentRate = 0.92;
        } else if ("USD/GBP".equals(currencyPair)) {
            this.currentRate = 0.78;
        } else {
            this.currentRate = 1.0; 
        }
        System.out.println("Fetched rate for " + currencyPair + ": " + this.currentRate);
        return this.currentRate;
    }

    public String getCurrencyPair() { return currencyPair; }
    public void setCurrencyPair(String currencyPair) { this.currencyPair = currencyPair; }

    public double getCurrentRate() { return currentRate; }
}
