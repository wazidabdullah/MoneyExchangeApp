package com.example.moneyexchangeapp;

public class VerifyIdentity {
    private String identityNumber;
    private boolean verified;
    private String message;

    public VerifyIdentity(String identityNumber, boolean verified, String message) {
        this.identityNumber = identityNumber;
        this.verified = verified;
        this.message = message;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public boolean isVerified() {
        return verified;
    }

    public String getMessage() {
        return message;
    }
}
