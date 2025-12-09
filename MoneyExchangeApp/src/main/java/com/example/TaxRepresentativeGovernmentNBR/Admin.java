package com.example.TaxRepresentativeGovernmentNBR;

public class Admin {
    private String repId;
    private String accessLevel; 
    public Admin(String repId, String accessLevel) {
        this.repId = repId;
        this.accessLevel = accessLevel;
    }

    public void auditLogs() {
        System.out.println("Admin " + repId + " is reviewing system logs.");
    }

    public void enforceRegulations() {
        if ("Enforcement".equals(accessLevel)) {
            System.out.println("Sending compliance notice...");
        } else {
            System.out.println("Access Denied: You do not have enforcement rights.");
        }
    }

    public String getRepId() { return repId; }
    public void setRepId(String repId) { this.repId = repId; }

    public String getAccessLevel() { return accessLevel; }
    public void setAccessLevel(String accessLevel) { this.accessLevel = accessLevel; }
}
