package com.example.moneyexchangeapp.Customer;

import java.time.LocalDate;

public class Watchlist {
    private String CurrencyPair;
    private LocalDate DateAdded;

    public Watchlist(String currencyPair, LocalDate dateAdded) {
        CurrencyPair = currencyPair;
        DateAdded = dateAdded;
    }

    public String getCurrencyPair() {
        return CurrencyPair;
    }

    public void setCurrencyPair(String currencyPair) {
        CurrencyPair = currencyPair;
    }

    public LocalDate getDateAdded() {
        return DateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        DateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "Watchlist{" +
                "CurrencyPair='" + CurrencyPair + '\'' +
                ", DateAdded=" + DateAdded +
                '}';
    }
}
