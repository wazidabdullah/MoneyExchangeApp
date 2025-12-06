package com.example.moneyexchangeapp;

public class RecordDailyTransaction {
    private String type;
    private String currency;
    private double rate;
    private double amount;
    private double bdtValue;
    private String branchId;
    private String date;

    public RecordDailyTransaction(String type, String currency, double rate, double amount, double bdtValue, String branchId, String date) {
        this.type = type;
        this.currency = currency;
        this.rate = rate;
        this.amount = amount;
        this.bdtValue = bdtValue;
        this.branchId = branchId;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public double getBdtValue() {
        return bdtValue;
    }

    public void setBdtValue(double bdtValue) {
        this.bdtValue = bdtValue;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "RecordDailyTransaction{" +
                "type='" + type + '\'' +
                ", currency='" + currency + '\'' +
                ", rate=" + rate +
                ", amount=" + amount +
                ", bdtValue=" + bdtValue +
                ", branchId='" + branchId + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}









