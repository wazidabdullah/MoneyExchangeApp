package com.example.moneyexchangeapp;

import java.time.LocalDate;

public class ForecastModel {

    private String currencyPair;
    private float predictedRate;
    private String trend;
    private String recommendation;
    private int confidence;
    private LocalDate date;

    public ForecastModel(String currencyPair, float predictedRate, String trend, String recommendation, int confidence, LocalDate date) {
        this.currencyPair = currencyPair;
        this.predictedRate = predictedRate;
        this.trend = trend;
        this.recommendation = recommendation;
        this.confidence = confidence;
        this.date = date;
    }

    public String getCurrencyPair() {
        return currencyPair;
    }

    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }

    public float getPredictedRate() {
        return predictedRate;
    }

    public void setPredictedRate(float predictedRate) {
        this.predictedRate = predictedRate;
    }

    public String getTrend() {
        return trend;
    }

    public void setTrend(String trend) {
        this.trend = trend;
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ForecastModel{" +
                "currencyPair='" + currencyPair + '\'' +
                ", predictedRate=" + predictedRate +
                ", trend='" + trend + '\'' +
                ", recommendation='" + recommendation + '\'' +
                ", confidence=" + confidence +
                ", date=" + date +
                '}';
    }
}
