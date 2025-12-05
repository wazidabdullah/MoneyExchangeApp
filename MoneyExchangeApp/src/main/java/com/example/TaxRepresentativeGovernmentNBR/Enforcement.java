package com.example.TaxRepresentativeGovernmentNBR;

public class RegulatoryEnforcementEngine {

    private double licenseLimit;

    public RegulatoryEnforcementEngine() {
        this.licenseLimit = 500000.00; // Example limit $500k
    }

    public void auditVolumes(double currentVolume) {
        if (currentVolume > licenseLimit) {
            detectViolations("Volume Exceeded Limit");
        } else {
            System.out.println("Volume " + currentVolume + " is within license limits.");
        }
    }

    public void detectViolations(String violationType) {
        System.out.println("VIOLATION DETECTED: " + violationType);
        generateComplianceNotice();
    }

    public void generateComplianceNotice() {
        System.out.println("Generating Legal Notice... Sent to Agency.");
    }
}