package com.example.moneyexchangeapp.Customer;

public class SupportTicket {
    private String Issue;
    private String Description;

    public SupportTicket(String issue, String description) {
        Issue = issue;
        Description = description;
    }

    public String getIssue() {
        return Issue;
    }

    public void setIssue(String issue) {
        Issue = issue;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "SupportTicket{" +
                "Issue='" + Issue + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
