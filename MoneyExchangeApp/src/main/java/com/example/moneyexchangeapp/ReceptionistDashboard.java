package com.example.moneyexchangeapp;

public class ReceptionistDashboard {

    private String receptionistName;
    private String branchName;
    private int totalCustomersToday;

    public ReceptionistDashboard() {}

    public ReceptionistDashboard(String receptionistName, String branchName, int totalCustomersToday) {
        this.receptionistName = receptionistName;
        this.branchName = branchName;
        this.totalCustomersToday = totalCustomersToday;
    }

    public String getReceptionistName() {
        return receptionistName;
    }

    public void setReceptionistName(String receptionistName) {
        this.receptionistName = receptionistName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getTotalCustomersToday() {
        return totalCustomersToday;
    }

    public void setTotalCustomersToday(int totalCustomersToday) {
        this.totalCustomersToday = totalCustomersToday;
    }
}
