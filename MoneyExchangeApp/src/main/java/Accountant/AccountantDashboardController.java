package Accountant;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AccountantDashboardController
{
    @javafx.fxml.FXML
    private Button btnGoBackup;
    @javafx.fxml.FXML
    private Button btnLogout;
    @javafx.fxml.FXML
    private Label lblLastLogin;
    @javafx.fxml.FXML
    private Button btnGoCompliance;
    @javafx.fxml.FXML
    private Button btnGoProfit;
    @javafx.fxml.FXML
    private Button btnGoReport;
    @javafx.fxml.FXML
    private Label lblUser;
    @javafx.fxml.FXML
    private Label lblSystemStatus;
    @javafx.fxml.FXML
    private Label lblRole;
    @javafx.fxml.FXML
    private Button btnGoRecord;
    @javafx.fxml.FXML
    private Button btnGoAudit;
    @javafx.fxml.FXML
    private Label lblComplianceCount;
    @javafx.fxml.FXML
    private Button btnGoReconciliation;
    @javafx.fxml.FXML
    private Button btnGoLedger;

    private AccountantDashboard dashboardModel = new AccountantDashboard();
    @javafx.fxml.FXML
    public void initialize() {
        lblUser.setText(dashboardModel.getUserName());
        lblRole.setText(dashboardModel.getRole());
        lblLastLogin.setText(dashboardModel.getLastLogin());
        lblSystemStatus.setText("System Normal");
        lblComplianceCount.setText(String.valueOf(dashboardModel.getComplianceItems()));
    }


    @javafx.fxml.FXML
    public void goCompliance(ActionEvent actionEvent) {
        System.out.println("Navigating to Compliance panel...");
    }

    @javafx.fxml.FXML
    public void goAudit(ActionEvent actionEvent) {
        System.out.println("Navigating to Audit panel...");
    }

    @javafx.fxml.FXML
    public void goReports(ActionEvent actionEvent) {
        System.out.println("Navigating to Reports panel...");
    }

    @javafx.fxml.FXML
    public void goRecordTransaction(ActionEvent actionEvent) {
        System.out.println("Navigating to Record Transaction panel...");
    }


    @javafx.fxml.FXML
    public void goProfit(ActionEvent actionEvent) {
        System.out.println("Navigating to Profit Analysis panel...");
    }

    @javafx.fxml.FXML
    public void goBackup(ActionEvent actionEvent) {
        System.out.println("Navigating to Backup & Restore panel...");
    }


    @javafx.fxml.FXML
    public void goLedger(ActionEvent actionEvent) {
        System.out.println("Navigating to Ledger panel...");
    }


    @javafx.fxml.FXML
    public void goReconciliation(ActionEvent actionEvent) {
        System.out.println("Navigating to Reconciliation panel...");
    }
}