package com.example.moneyexchangeapp.owner;

import java.util.Date;

public class STRReport { private String reportID;
    private String customerID;

    public String getReportID() {
        return reportID;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public String getCustomerID() {
        return customerID;
    }

    @Override
    public String toString() {
        return "STRReport{" +
                "reportID='" + reportID + '\'' +
                ", customerID='" + customerID + '\'' +
                ", reason='" + reason + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public STRReport(String reportID, String customerID, String reason, Date timestamp) {
        this.reportID = reportID;
        this.customerID = customerID;
        this.reason = reason;
        this.timestamp = timestamp;
    }

    private String reason;
    private Date timestamp;
}
