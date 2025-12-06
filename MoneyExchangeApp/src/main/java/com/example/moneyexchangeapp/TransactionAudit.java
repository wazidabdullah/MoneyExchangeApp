package com.example.moneyexchangeapp;

public class TransactionAudit {
    private String transId;
    private String issueType;
    private String details;
    private String flagStatus;
    private String correctedValue;

    public TransactionAudit(String transId, String issueType, String details, String flagStatus) {
        this.transId = transId;
        this.issueType = issueType;
        this.details = details;
        this.flagStatus = flagStatus;
        this.correctedValue = "";
    }

    public String getTransId() { return transId; }
    public String getIssueType() { return issueType; }
    public String getDetails() { return details; }
    public String getFlagStatus() { return flagStatus; }
    public String getCorrectedValue() { return correctedValue; }

    public void setCorrectedValue(String correctedValue) {
        this.correctedValue = correctedValue;
    }
}