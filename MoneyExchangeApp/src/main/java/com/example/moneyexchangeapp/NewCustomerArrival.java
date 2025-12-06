package com.example.moneyexchangeapp;

public class NewCustomerArrival {
    private String visitorId;
    private String reason;

    public NewCustomerArrival(String visitorId, String reason) {
        this.visitorId = visitorId;
        this.reason = reason;
    }

    public String getVisitorId() {
        return visitorId;
    }

    public String getReason() {
        return reason;
    }
}
