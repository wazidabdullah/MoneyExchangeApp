package com.example.moneyexchangeapp.owner;

public class PartnershipRequest {private String requestID;
    private String partnerName;

    public String getRequestID() {
        return requestID;
    }

    @Override
    public String toString() {
        return "PartnershipRequest{" +
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

    public PartnershipRequest(String requestID, String partnerName, String status) {
        this.requestID = requestID;
        this.partnerName = partnerName;
        this.status = status;
    }

    private String status;
}
