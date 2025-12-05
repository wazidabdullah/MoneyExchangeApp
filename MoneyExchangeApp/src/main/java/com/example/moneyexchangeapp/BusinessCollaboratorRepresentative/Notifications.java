package com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;

public class NotificationManager {

    private String emailService;

    public NotificationManager() {
        this.emailService = "SMTP-Server-Active";
    }

    public void sendRealTimeAlert(String userId, String message) {
        System.out.println("[ALERT] Sending to user " + userId + ": " + message);
    }

    public void notifyTeams(String department, String message) {
        // Simulating sending an email to a department
        System.out.println("[EMAIL] To: " + department + "@agency.gov | Subject: Urgent | Body: " + message);
    }
}