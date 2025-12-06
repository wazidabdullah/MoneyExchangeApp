package Accountant;

import com.example.moneyexchangeapp.RecordDailyTransaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class RecordDailyTransactionController
{
    @javafx.fxml.FXML
    private TableColumn <RecordDailyTransaction, Double> colAmount;
    @javafx.fxml.FXML
    private ComboBox <String>cbType;
    @javafx.fxml.FXML
    private TextField txtAmount;
    @javafx.fxml.FXML
    private TextField txtBranchId;
    @javafx.fxml.FXML
    private TableColumn<RecordDailyTransaction, Double> colRate;
    @javafx.fxml.FXML
    private TableColumn <RecordDailyTransaction, String>colDate;
    @javafx.fxml.FXML
    private Button btnValidate;
    @javafx.fxml.FXML
    private TableColumn <RecordDailyTransaction, Double> colBDT;
    @javafx.fxml.FXML
    private TableColumn<RecordDailyTransaction, String> colBranch;
    @javafx.fxml.FXML
    private ComboBox <String>cbCurrency;
    @javafx.fxml.FXML
    private TextField txtRate;
    @javafx.fxml.FXML
    private Button btnSave;
    @javafx.fxml.FXML
    private TableColumn <RecordDailyTransaction, String>colType;
    @javafx.fxml.FXML
    private TableColumn <RecordDailyTransaction, String>colCurrency;
    @javafx.fxml.FXML
    private TableView <RecordDailyTransaction>tblTransaction;

    private ObservableList<RecordDailyTransaction> transactionData = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        cbType.setItems(FXCollections.observableArrayList("Buy", "Sell"));
        cbCurrency.setItems(FXCollections.observableArrayList("USD", "EUR", "GBP", "SAR", "INR"));


        colType.setCellValueFactory(new PropertyValueFactory<>("type"));
        colCurrency.setCellValueFactory(new PropertyValueFactory<>("currency"));
        colRate.setCellValueFactory(new PropertyValueFactory<>("rate"));
        colAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        colBDT.setCellValueFactory(new PropertyValueFactory<>("bdtValue"));
        colBranch.setCellValueFactory(new PropertyValueFactory<>("branchId"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));

        tblTransaction.setItems(transactionData);
    }


    @javafx.fxml.FXML
    public void handleValidate(ActionEvent actionEvent) {
        String type = cbType.getSelectionModel().getSelectedItem();
        String currency = cbCurrency.getSelectionModel().getSelectedItem();
        String amount = txtAmount.getText();
        String rate = txtRate.getText();
        String branch = txtBranchId.getText();

        if (type == null || currency == null || amount.isEmpty() || rate.isEmpty() || branch.isEmpty()) {
            System.out.println("Validation Failed: Some fields are empty.");
            return;
        }

        try {
            Double.parseDouble(amount);
            Double.parseDouble(rate);
            System.out.println("Validation Successful.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid numbers entered.");
        }
    }


    @javafx.fxml.FXML
    public void handleSaveTransaction(ActionEvent actionEvent) {

        try {
            String type = cbType.getSelectionModel().getSelectedItem();
            String currency = cbCurrency.getSelectionModel().getSelectedItem();
            double rate = Double.parseDouble(txtRate.getText());
            double amount = Double.parseDouble(txtAmount.getText());
            double bdtValue = rate * amount;
            String branch = txtBranchId.getText();
            String today = java.time.LocalDate.now().toString();

            RecordDailyTransaction record = new RecordDailyTransaction(
                    type, currency, rate, amount, bdtValue, branch, today
            );

            transactionData.add(record);

            tblTransaction.refresh();

            System.out.println("Transaction saved successfully!");

        } catch (Exception ex) {
            System.out.println("Error saving transaction: " + ex.getMessage());
        }
    }
}