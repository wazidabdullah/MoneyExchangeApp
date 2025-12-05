package com;

public class OwnerWorkflow { private String adminID;

    public OwnerWorkflow(String branchID, String adminID) {
        this.branchID = branchID;
        this.adminID = adminID;
    }

    public String getAdminID() {
        return adminID;
    }

    @Override
    public String toString() {
        return "OwnerWorkflow{" +
                "adminID='" + adminID + '\'' +
                ", branchID='" + branchID + '\'' +
                '}';
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getBranchID() {
        return branchID;
    }

    public void setBranchID(String branchID) {
        this.branchID = branchID;
    }

    private String branchID;

}
