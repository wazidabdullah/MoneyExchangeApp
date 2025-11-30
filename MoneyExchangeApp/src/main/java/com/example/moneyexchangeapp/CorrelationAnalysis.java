package com.example.moneyexchangeapp;

public class CorrelationAnalysis {

    private String CurrencyOne , CurrencyTwo , Positive;
    private int Period;
    private float CorrelationValue;

    public CorrelationAnalysis(String currencyOne, String currencyTwo, String positive, int period, float correlationValue) {
        CurrencyOne = currencyOne;
        CurrencyTwo = currencyTwo;
        Positive = positive;
        Period = period;
        CorrelationValue = correlationValue;
    }

    public String getCurrencyOne() {
        return CurrencyOne;
    }

    public void setCurrencyOne(String currencyOne) {
        CurrencyOne = currencyOne;
    }

    public String getCurrencyTwo() {
        return CurrencyTwo;
    }

    public void setCurrencyTwo(String currencyTwo) {
        CurrencyTwo = currencyTwo;
    }

    public String getPositive() {
        return Positive;
    }

    public void setPositive(String positive) {
        Positive = positive;
    }

    public int getPeriod() {
        return Period;
    }

    public void setPeriod(int period) {
        Period = period;
    }

    public float getCorrelationValue() {
        return CorrelationValue;
    }

    public void setCorrelationValue(float correlationValue) {
        CorrelationValue = correlationValue;
    }

    @Override
    public String toString() {
        return "CorrelationAnalysis{" +
                "CurrencyOne='" + CurrencyOne + '\'' +
                ", CurrencyTwo='" + CurrencyTwo + '\'' +
                ", Positive='" + Positive + '\'' +
                ", Period=" + Period +
                ", CorrelationValue=" + CorrelationValue +
                '}';
    }
}
