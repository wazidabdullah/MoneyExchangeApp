package com.example.moneyexchangeapp;

public class ExchangeAnalysis {
    private String fromRateCheck , toRateCheck;

    public ExchangeAnalysis(String fromRateCheck, String toRateCheck) {
        this.fromRateCheck = fromRateCheck;
        this.toRateCheck = toRateCheck;
    }

    public String getFromRateCheck() {
        return fromRateCheck;
    }

    public void setFromRateCheck(String fromRateCheck) {
        this.fromRateCheck = fromRateCheck;
    }

    public String getToRateCheck() {
        return toRateCheck;
    }

    public void setToRateCheck(String toRateCheck) {
        this.toRateCheck = toRateCheck;
    }

    @Override
    public String toString() {
        return "ExchangeAnalysis{" +
                "fromRateCheck='" + fromRateCheck + '\'' +
                ", toRateCheck='" + toRateCheck + '\'' +
                '}';
    }
}
