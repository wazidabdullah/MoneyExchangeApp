package com.example.moneyexchangeapp;

public class EResearcherDash {

    private int analysesCompleted , reportsPublished , collaborations;

    public EResearcherDash(int analysesCompleted, int reportsPublished, int collaborations) {
        this.analysesCompleted = analysesCompleted;
        this.reportsPublished = reportsPublished;
        this.collaborations = collaborations;
    }

    public int getAnalysesCompleted() {
        return analysesCompleted;
    }

    public void setAnalysesCompleted(int analysesCompleted) {
        this.analysesCompleted = analysesCompleted;
    }

    public int getReportsPublished() {
        return reportsPublished;
    }

    public void setReportsPublished(int reportsPublished) {
        this.reportsPublished = reportsPublished;
    }

    public int getCollaborations() {
        return collaborations;
    }

    public void setCollaborations(int collaborations) {
        this.collaborations = collaborations;
    }

    @Override
    public String toString() {
        return "EResearcherDash{" +
                "analysesCompleted=" + analysesCompleted +
                ", reportsPublished=" + reportsPublished +
                ", collaborations=" + collaborations +
                '}';
    }
}
