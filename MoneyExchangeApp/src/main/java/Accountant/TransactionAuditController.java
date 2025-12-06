package Accountant;

import com.example.moneyexchangeapp.TransactionAudit;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TransactionAuditController
{
    @javafx.fxml.FXML
    private TableColumn <TransactionAudit, String>colDetails;
    @javafx.fxml.FXML
    private Button btnSaveCorrection;
    @javafx.fxml.FXML
    private Button btnScan;
    @javafx.fxml.FXML
    private TableColumn <TransactionAudit, String> colTransId;
    @javafx.fxml.FXML
    private TextField txtCorrectValue;
    @javafx.fxml.FXML
    private TableColumn <TransactionAudit, String>colFlagStatus;
    @javafx.fxml.FXML
    private TableColumn <TransactionAudit, String>colIssueType;
    @javafx.fxml.FXML
    private TableView <TransactionAudit>tblAudit;

    private ObservableList<TransactionAudit> auditData = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        colTransId.setCellValueFactory(new PropertyValueFactory<>("transId"));
        colIssueType.setCellValueFactory(new PropertyValueFactory<>("issueType"));
        colDetails.setCellValueFactory(new PropertyValueFactory<>("details"));
        colFlagStatus.setCellValueFactory(new PropertyValueFactory<>("flagStatus"));

        tblAudit.setItems(auditData);
    }

    @javafx.fxml.FXML
    public void handleScan(ActionEvent actionEvent) {
        auditData.clear();


        auditData.addAll(
                new TransactionAudit("TXN1001", "Incorrect Amount", "Amount mismatch detected", "Flagged"),
                new TransactionAudit("TXN1002", "Invalid Currency", "Unsupported currency used", "Flagged"),
                new TransactionAudit("TXN1003", "Missing Branch ID", "Branch ID not provided", "Investigate")
        );

        System.out.println("Audit scanning completed.");
    }

    @javafx.fxml.FXML
    public void handleSave(ActionEvent actionEvent) {

        TransactionAudit selected = tblAudit.getSelectionModel().getSelectedItem();
        if (selected == null) {
            System.out.println("No row selected.");
            return;
        }

        String correction = txtCorrectValue.getText();
        if (correction.isEmpty()) {
            System.out.println("Enter a correction value.");
            return;
        }

        selected.setCorrectedValue(correction);

        tblAudit.refresh();
        txtCorrectValue.clear();

        System.out.println("Correction saved for: " + selected.getTransId());
    }
}
