package com.example.moneyexchangeapp;

public class ModelComparison {
    private String currencyPair , recommendation ,trend;
    private float buyRate;
    private float performance;

    public ModelComparison(String currencyPair, String trend, String recommendation, float buyRate, float performance) {
        this.currencyPair = currencyPair;
        this.trend = trend;
        this.recommendation = recommendation;
        this.buyRate = buyRate;
        this.performance = performance;
    }

    public String getCurrencyPair() {
        return currencyPair;
    }

    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }

    public String getTrend() {
        return trend;
    }

    public void setTrend(String trend) {
        this.trend = trend;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public float getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(float buyRate) {
        this.buyRate = buyRate;
    }

    public float getPerformance() {
        return performance;
    }

    public void setPerformance(float performance) {
        this.performance = performance;
    }
}
