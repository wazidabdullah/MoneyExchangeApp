package com;

public class Document {
    private String reportID;

    public String getReportID() {
        return reportID;
    }

    @Override
    public String toString() {
        return "Document{" +
                "reportID='" + reportID + '\'' +
                ", branchID='" + branchID + '\'' +
                ", riskLevel='" + riskLevel + '\'' +
                '}';
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public String getBranchID() {
        return branchID;
    }

    public void setBranchID(String branchID) {
        this.branchID = branchID;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Document(String reportID, String branchID, String riskLevel) {
        this.reportID = reportID;
        this.branchID = branchID;
        this.riskLevel = riskLevel;
    }

    private String branchID;
    private String riskLevel;
}
