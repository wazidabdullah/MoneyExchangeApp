package Accountant;

import com.example.moneyexchangeapp.ComplianceDashboard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ComplianceDashboardController
{
    @javafx.fxml.FXML

    private Button btnMarkResolved;
    @javafx.fxml.FXML
    private TableColumn <ComplianceDashboard, String>colCLS;
    @javafx.fxml.FXML
    private TableColumn <ComplianceDashboard, String>colIndicator;
    @javafx.fxml.FXML
    private TableColumn <ComplianceDashboard, String>colDescription;
    @javafx.fxml.FXML
    private TableColumn <ComplianceDashboard, String>colCLDate;
    @javafx.fxml.FXML
    private Button btnViewDetails;
    @javafx.fxml.FXML
    private TableColumn <ComplianceDashboard, String>colCLI;
    @javafx.fxml.FXML
    private TableColumn <ComplianceDashboard, String>colStatus;


    private ObservableList<ComplianceDashboard> complianceData = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    private TableView tblCompliance;

    @javafx.fxml.FXML
    public void initialize() {
        colCLS.setCellValueFactory(new PropertyValueFactory<>("cls"));
        colCLI.setCellValueFactory(new PropertyValueFactory<>("cli"));
        colIndicator.setCellValueFactory(new PropertyValueFactory<>("indicator"));
        colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        colCLDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        loadSampleData();
        tblCompliance.setItems(complianceData);
    }

    private void loadSampleData() {
        complianceData.addAll(
                new ComplianceDashboard("CLS-001", "CLI-01", "KYC Missing", "User not submitted NID", "2025-12-01", "Pending"),
                new ComplianceDashboard("CLS-002", "CLI-02", "High Transaction", "Suspicious cash deposit", "2025-12-02", "Reviewing"),
                new ComplianceDashboard("CLS-003", "CLI-03", "AML Flag", "Unusual foreign transfer", "2025-12-03", "Resolved")
        );
    }

    @javafx.fxml.FXML
    public void handleResolve(ActionEvent actionEvent) {
        ComplianceDashboard selected = (ComplianceDashboard) tblCompliance.getSelectionModel().getSelectedItem();

        if (selected != null) {
            selected.setStatus("Resolved");
            tblCompliance.refresh();
            System.out.println("Marked as Resolved: " + selected.getCls());
        } else {
            System.out.println("No row selected.");
        }
    }

    @javafx.fxml.FXML
    public void handleViewDetails(ActionEvent actionEvent) {
        ComplianceDashboard selected = (ComplianceDashboard) tblCompliance.getSelectionModel().getSelectedItem();

        if (selected != null) {
            System.out.println("Viewing details for: " + selected.getCls());

        } else {
            System.out.println("No row selected.");
        }
    }
}
