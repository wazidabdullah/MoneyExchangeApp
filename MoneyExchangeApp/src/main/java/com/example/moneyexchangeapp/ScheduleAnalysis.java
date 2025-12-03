package com.example.moneyexchangeapp;

import java.time.LocalDate;

public class ScheduleAnalysis {

    private String analysisType;
    private LocalDate scheduledDate;
    private boolean emailNotification;

    public String getAnalysisType() {
        return analysisType;
    }

    public void setAnalysisType(String analysisType) {
        this.analysisType = analysisType;
    }

    public LocalDate getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(LocalDate scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public boolean isEmailNotification() {
        return emailNotification;
    }

    public void setEmailNotification(boolean emailNotification) {
        this.emailNotification = emailNotification;
    }

    public ScheduleAnalysis(String analysisType, LocalDate scheduledDate, boolean emailNotification) {
        this.analysisType = analysisType;
        this.scheduledDate = scheduledDate;
        this.emailNotification = emailNotification;
    }

    @Override
    public String toString() {
        return "ScheduleAnalysis{" +
                "analysisType='" + analysisType + '\'' +
                ", scheduledDate=" + scheduledDate +
                ", emailNotification=" + emailNotification +
                '}';
    }
}
