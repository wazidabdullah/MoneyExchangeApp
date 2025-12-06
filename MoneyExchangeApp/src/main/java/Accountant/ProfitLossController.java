package Accountant;

import com.example.moneyexchangeapp.ProfitLoss;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProfitLossController
{
    @javafx.fxml.FXML
    private Button btnUpdateSheet;
    @javafx.fxml.FXML
    private DatePicker dpDate;
    @javafx.fxml.FXML
    private TableColumn <ProfitLoss, String> colPLCurrency;
    @javafx.fxml.FXML
    private TableColumn <ProfitLoss, Double>colBuy;
    @javafx.fxml.FXML
    private Button btnCalculate;
    @javafx.fxml.FXML
    private TableColumn <ProfitLoss, Double>colPL;
    @javafx.fxml.FXML
    private Label lblPLMessage;
    @javafx.fxml.FXML
    private TableColumn <ProfitLoss, Double>colSell;
    @javafx.fxml.FXML
    private TableView <ProfitLoss> tblProfitLoss;

    private ObservableList<ProfitLoss> plList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        colPLCurrency.setCellValueFactory(new PropertyValueFactory<>("currency"));
        colBuy.setCellValueFactory(new PropertyValueFactory<>("buyRate"));
        colSell.setCellValueFactory(new PropertyValueFactory<>("sellRate"));
        colPL.setCellValueFactory(new PropertyValueFactory<>("profitLoss"));

        tblProfitLoss.setItems(plList);


        plList.add(new ProfitLoss("USD", 110.0, 112.5));
        plList.add(new ProfitLoss("EUR", 120.0, 121.4));
        plList.add(new ProfitLoss("GBP", 130.0, 131.8));
    }

    @javafx.fxml.FXML
    public void handleUpdateSheet(ActionEvent actionEvent) {
        double totalPL = 0;

        for (ProfitLoss pl : plList) {
            totalPL += pl.getProfitLoss();
        }

        lblPLMessage.setText("Total Profit/Loss: " + totalPL);
    }


    @javafx.fxml.FXML
    public void handleCalculate(ActionEvent actionEvent) {
        if (dpDate.getValue() == null) {
            lblPLMessage.setText("Please select a date first.");
            return;
        }

        lblPLMessage.setText("Sheet updated for " + dpDate.getValue());
    }
}