package com.example.moneyexchangeapp;

public class QueueManagement {
    private String token;
    private String customerName;
    private String serviceType;
    private String status;

    public QueueManagement(String token, String customerName, String serviceType, String status) {
        this.token = token;
        this.customerName = customerName;
        this.serviceType = serviceType;
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
