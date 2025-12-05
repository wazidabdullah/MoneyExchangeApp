package com;

public class ComplianceReport {private String requestID;
    private String partnerName;
    private String status;

    public String getRequestID() {
        return requestID;
    }

    @Override
    public String toString() {
        return "ComplianceReport{" +
                "requestID='" + requestID + '\'' +
                ", partnerName='" + partnerName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ComplianceReport(String requestID, String partnerName, String status) {
        this.requestID = requestID;
        this.partnerName = partnerName;
        this.status = status;
    }
}
