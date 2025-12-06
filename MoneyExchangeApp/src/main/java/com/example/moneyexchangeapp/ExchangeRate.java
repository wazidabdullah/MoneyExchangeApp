package com.example.moneyexchangeapp;

public class ExchangeRate {
    private String currency;
    private double buyRate;
    private double sellRate;

    public ExchangeRate() {}

    public ExchangeRate(String currency, double buyRate, double sellRate) {
        this.currency = currency;
        this.buyRate = buyRate;
        this.sellRate = sellRate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(double buyRate) {
        this.buyRate = buyRate;
    }

    public double getSellRate() {
        return sellRate;
    }

    public void setSellRate(double sellRate) {
        this.sellRate = sellRate;
    }
}
