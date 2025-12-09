package com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;

public class Bank {
    private String bankName;
    private String apiEndpoint;
    private boolean isConnected;

    public Bank(String bankName, String apiEndpoint) {
        this.bankName = bankName;
        this.apiEndpoint = apiEndpoint;
        this.isConnected = false;
    }

    public boolean connect() {
        if (apiEndpoint != null && !apiEndpoint.isEmpty()) {
            this.isConnected = true;
            System.out.println("Connected to " + bankName + " at " + apiEndpoint);
            return true;
        }
        return false;
    }

    public String getBankName() { return bankName; }
    public void setBankName(String bankName) { this.bankName = bankName; }

    public String getApiEndpoint() { return apiEndpoint; }
    public void setApiEndpoint(String apiEndpoint) { this.apiEndpoint = apiEndpoint; }
}
