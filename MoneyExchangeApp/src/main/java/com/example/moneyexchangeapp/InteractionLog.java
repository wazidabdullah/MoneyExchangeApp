package com.example.moneyexchangeapp;

public class InteractionLog {
    private String queryType;
    private String serviceProvided;
    private String description;

    public InteractionLog() {}

    public InteractionLog(String queryType, String serviceProvided, String description) {
        this.queryType = queryType;
        this.serviceProvided = serviceProvided;
        this.description = description;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getServiceProvided() {
        return serviceProvided;
    }

    public void setServiceProvided(String serviceProvided) {
        this.serviceProvided = serviceProvided;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
