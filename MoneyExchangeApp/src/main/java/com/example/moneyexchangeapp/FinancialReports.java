package com.example.moneyexchangeapp;

public class FinancialReports {
    private String item;
    private String value;

    public FinancialReports(String item, String value) {
        this.item = item;
        this.value = value;
    }

    public String getItem() {
        return item;
    }

    public String getValue() {
        return value;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
