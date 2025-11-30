package com.example.moneyexchangeapp;

public class CollaborationHub {
    private String researcherName , message;

    public CollaborationHub(String researcherName, String message) {
        this.researcherName = researcherName;
        this.message = message;
    }

    public String getResearcherName() {
        return researcherName;
    }

    public void setResearcherName(String researcherName) {
        this.researcherName = researcherName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "CollaborationHub{" +
                "researcherName='" + researcherName + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

