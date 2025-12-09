package com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;

public class Customer {
    private String fullName;
    private String documentId;
    private boolean isVerified;

    public Customer(String fullName, String documentId) {
        this.fullName = fullName;
        this.documentId = documentId;
        this.isVerified = false;
    }

    public void reviewKYC() {
        if (documentId != null && documentId.length() > 5) {
            this.isVerified = true;
            System.out.println("KYC Verified for: " + fullName);
        } else {
            System.out.println("KYC Failed: Invalid Document ID.");
        }
    }

    public boolean checkAMLFlags() {
        if ("Suspicious".equalsIgnoreCase(fullName)) {
            System.out.println("AML ALERT: Suspicious activity detected!");
            return true;
        }
        return false;
    }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getDocumentId() { return documentId; }
    public void setDocumentId(String documentId) { this.documentId = documentId; }
}
