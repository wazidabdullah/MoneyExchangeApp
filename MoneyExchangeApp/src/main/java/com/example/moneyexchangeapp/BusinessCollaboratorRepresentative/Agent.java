package com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;

public class Agent {
    private String collaboratorId;
    private String apiKey;

    public Agent(String collaboratorId, String apiKey) {
        this.collaboratorId = collaboratorId;
        this.apiKey = apiKey;
    }

    public void approveTransaction(String transactionId) {
        System.out.println("Agent " + collaboratorId + " approved transaction: " + transactionId);
    }

    public void monitorRisk() {
        System.out.println("Risk analysis running for Agent: " + collaboratorId);
    }

    // Getters and Setters
    public String getCollaboratorId() { return collaboratorId; }
    public void setCollaboratorId(String collaboratorId) { this.collaboratorId = collaboratorId; }

    public String getApiKey() { return apiKey; }
    public void setApiKey(String apiKey) { this.apiKey = apiKey; }
}