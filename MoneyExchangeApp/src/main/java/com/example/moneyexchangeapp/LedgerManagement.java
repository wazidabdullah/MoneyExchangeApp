package com.example.moneyexchangeapp;

public class LedgerManagement {
    private String refId;
    private String currency;
    private double rate;
    private double amount;
    private double profitMargin;
    private String date;

    public LedgerManagement(String refId, String currency, double rate, double amount, double profitMargin, String date) {
        this.refId = refId;
        this.currency = currency;
        this.rate = rate;
        this.amount = amount;
        this.profitMargin = profitMargin;
        this.date = date;
    }


    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(double profitMargin) {
        this.profitMargin = profitMargin;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
