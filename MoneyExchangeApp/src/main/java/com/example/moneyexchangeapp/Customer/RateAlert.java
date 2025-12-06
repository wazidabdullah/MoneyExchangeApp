package com.example.moneyexchangeapp.Customer;

public class RateAlert {
    private String Currency , Condition , AlertType , Date;

    public RateAlert(String currency, String condition, String alertType, String date) {
        Currency = currency;
        Condition = condition;
        AlertType = alertType;
        Date = date;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public String getAlertType() {
        return AlertType;
    }

    public void setAlertType(String alertType) {
        AlertType = alertType;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "RateAlert{" +
                "Currency='" + Currency + '\'' +
                ", Condition='" + Condition + '\'' +
                ", AlertType='" + AlertType + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}
