package com.example.moneyexchangeapp.Customer;

public class LiveRate {

    private final String currencyPair;
    private final float bidPrice;
    private final float changePercent;
    private final String lastUpdated;

    public LiveRate(String currencyPair, float bidPrice, float changePercent, String lastUpdated) {
        this.currencyPair = currencyPair;
        this.bidPrice = bidPrice;
        this.changePercent = changePercent;
        this.lastUpdated = lastUpdated;
    }

    public String getCurrencyPair() {
        return currencyPair;
    }

    public float getBidPrice() {
        return bidPrice;
    }

    public float getChangePercent() {
        return changePercent;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

}

