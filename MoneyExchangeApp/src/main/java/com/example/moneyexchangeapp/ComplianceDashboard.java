package com.example.moneyexchangeapp;

public class ComplianceDashboard {

    private String cls;
    private String cli;
    private String indicator;
    private String description;
    private String date;
    private String status;


    public ComplianceDashboard(String cls, String cli, String indicator, String description, String date, String status) {
        this.cls = cls;
        this.cli = cli;
        this.indicator = indicator;
        this.description = description;
        this.date = date;
        this.status = status;
    }


    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public String getCli() {
        return cli;
    }

    public void setCli(String cli) {
        this.cli = cli;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
