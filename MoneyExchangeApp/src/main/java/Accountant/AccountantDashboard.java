package Accountant;

public class AccountantDashboard {
    private String userName = "John Accountant";
    private String role = "Accountant";
    private String lastLogin = "2025-12-05 10:45 AM";
    private int complianceItems = 12;

    public AccountantDashboard() {
    }

    // --- Getters and Setters ---
    public String getUserName() {
        return userName;
    }

    public String getRole() {
        return role;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public int getComplianceItems() {
        return complianceItems;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public void setComplianceItems(int complianceItems) {
        this.complianceItems = complianceItems;
    }
}
