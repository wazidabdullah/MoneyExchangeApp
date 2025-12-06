package com.example.moneyexchangeapp;

public class ProfitLoss {
    private String currency;
    private double buyRate;
    private double sellRate;
    private double profitLoss;

    public ProfitLoss(String currency, double buyRate, double sellRate) {
        this.currency = currency;
        this.buyRate = buyRate;
        this.sellRate = sellRate;
        this.profitLoss = sellRate - buyRate;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBuyRate() {
        return buyRate;
    }

    public double getSellRate() {
        return sellRate;
    }

    public double getProfitLoss() {
        return profitLoss;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setBuyRate(double buyRate) {
        this.buyRate = buyRate;
        updatePL();
    }

    public void setSellRate(double sellRate) {
        this.sellRate = sellRate;
        updatePL();
    }

    private void updatePL() {
        this.profitLoss = this.sellRate - this.buyRate;
    }
}
