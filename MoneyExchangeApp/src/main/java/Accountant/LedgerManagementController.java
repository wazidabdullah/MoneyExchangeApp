package Accountant;

import com.example.moneyexchangeapp.LedgerManagement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class LedgerManagementController
{
    @javafx.fxml.FXML
    private Button btnSaveChanges;
    @javafx.fxml.FXML
    private TableColumn <LedgerManagement, Double>colProfitMargin;
    @javafx.fxml.FXML
    private TableColumn <LedgerManagement, Double>colAmount;
    @javafx.fxml.FXML
    private Label lblTotalProfit;
    @javafx.fxml.FXML
    private Label lblTotalAmount;
    @javafx.fxml.FXML
    private TableColumn <LedgerManagement, String>colRefId;
    @javafx.fxml.FXML
    private TextField txtEditAmount;
    @javafx.fxml.FXML
    private TableColumn <LedgerManagement, String>colDate;
    @javafx.fxml.FXML
    private TableColumn <LedgerManagement, Double>colRate;
    @javafx.fxml.FXML
    private TextField txtEditRate;
    @javafx.fxml.FXML
    private TableColumn <LedgerManagement, String> colCurrency;
    @javafx.fxml.FXML
    private TableView <LedgerManagement>tblLedger;

    private ObservableList<LedgerManagement> ledgerData = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {
        
        colRefId.setCellValueFactory(new PropertyValueFactory<>("refId"));
        colCurrency.setCellValueFactory(new PropertyValueFactory<>("currency"));
        colRate.setCellValueFactory(new PropertyValueFactory<>("rate"));
        colAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        colProfitMargin.setCellValueFactory(new PropertyValueFactory<>("profitMargin"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));


        loadSampleData();


        tblLedger.setItems(ledgerData);


        tblLedger.getSelectionModel().selectedItemProperty().addListener((obs, oldSel, newSel) -> {
            if (newSel != null) {
                txtEditRate.setText(String.valueOf(newSel.getRate()));
                txtEditAmount.setText(String.valueOf(newSel.getAmount()));
            }
        });


        updateTotals();
    }

    private void loadSampleData() {
        ledgerData.addAll(
                new LedgerManagement("REF-001", "USD", 110.50, 5000.00, 3.5, "2025-12-01"),
                new LedgerManagement("REF-002", "EUR", 115.20, 3200.00, 4.0, "2025-12-02"),
                new LedgerManagement("REF-003", "GBP", 130.80, 4100.00, 2.8, "2025-12-03")
        );
    }


    public void handleSaveChanges() {

        LedgerManagement selected = tblLedger.getSelectionModel().getSelectedItem();

        if (selected == null) {
            System.out.println("No row selected.");
            return;
        }

        try {
            double newRate = Double.parseDouble(txtEditRate.getText());
            double newAmount = Double.parseDouble(txtEditAmount.getText());

            selected.setRate(newRate);
            selected.setAmount(newAmount);

            tblLedger.refresh();
            updateTotals();

            System.out.println("Updated: " + selected.getRefId());

        } catch (NumberFormatException e) {
            System.out.println("Enter valid numbers.");
        }
    }

    private void updateTotals() {

        double totalAmount = ledgerData.stream()
                .mapToDouble(LedgerManagement::getAmount)
                .sum();

        double totalProfit = ledgerData.stream()
                .mapToDouble(item -> item.getAmount() * item.getProfitMargin() / 100)
                .sum();

        lblTotalAmount.setText(String.format("%.2f", totalAmount));
        lblTotalProfit.setText(String.format("%.2f", totalProfit));
    }
}
