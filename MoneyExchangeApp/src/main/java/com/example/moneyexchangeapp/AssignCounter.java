package com.example.moneyexchangeapp;

public class AssignCounter {
    private String tokenNumber;
    private String counterNumber;
    private String waitTime;
    private String serviceType;

    public AssignCounter() {
    }

    public AssignCounter(String tokenNumber, String counterNumber, String waitTime, String serviceType) {
        this.tokenNumber = tokenNumber;
        this.counterNumber = counterNumber;
        this.waitTime = waitTime;
        this.serviceType = serviceType;
    }

    public String getTokenNumber() {
        return tokenNumber;
    }

    public void setTokenNumber(String tokenNumber) {
        this.tokenNumber = tokenNumber;
    }

    public String getCounterNumber() {
        return counterNumber;
    }

    public void setCounterNumber(String counterNumber) {
        this.counterNumber = counterNumber;
    }

    public String getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(String waitTime) {
        this.waitTime = waitTime;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
