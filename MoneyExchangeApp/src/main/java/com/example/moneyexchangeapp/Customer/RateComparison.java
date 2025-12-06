package com.example.moneyexchangeapp.Customer;

public class RateComparison {
    private String Currency1, Currency2, Result;

    public RateComparison(String currency1, String currency2, String result) {
        Currency1 = currency1;
        Currency2 = currency2;
        Result = result;
    }

    public String getCurrency1() {
        return Currency1;
    }

    public void setCurrency1(String currency1) {
        Currency1 = currency1;
    }

    public String getCurrency2() {
        return Currency2;
    }

    public void setCurrency2(String currency2) {
        Currency2 = currency2;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    @Override
    public String toString() {
        return "RateComparison{" +
                "Currency1='" + Currency1 + '\'' +
                ", Currency2='" + Currency2 + '\'' +
                ", Result='" + Result + '\'' +
                '}';
    }
}
