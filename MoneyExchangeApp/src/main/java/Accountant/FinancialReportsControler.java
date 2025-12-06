package Accountant;

import com.example.moneyexchangeapp.FinancialReports;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class FinancialReportsControler
{
    @javafx.fxml.FXML
    private ComboBox <String> cbReportType;
    @javafx.fxml.FXML
    private TableColumn <FinancialReports, String>colItem;
    @javafx.fxml.FXML
    private DatePicker dpFrom;
    @javafx.fxml.FXML
    private Button btnExport;
    @javafx.fxml.FXML
    private DatePicker dpTo;
    @javafx.fxml.FXML
    private Button btnGenerate;
    @javafx.fxml.FXML
    private TableColumn <FinancialReports, String>colValue;
    @javafx.fxml.FXML
    private TableView <FinancialReports>tblReports;

    private ObservableList<FinancialReports> reportData = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        cbReportType.setItems(FXCollections.observableArrayList(
                "Daily Transactions",
                "Monthly Profit",
                "Annual Summary",
                "Customer Activity",
                "Branch Performance"
        ));


        colItem.setCellValueFactory(new PropertyValueFactory<>("item"));
        colValue.setCellValueFactory(new PropertyValueFactory<>("value"));


        tblReports.setItems(reportData);
    }

    @javafx.fxml.FXML
    public void handleExport(ActionEvent actionEvent) {
        String type = cbReportType.getValue();

        if (type == null) {
            System.out.println("Please select a report type!");
            return;
        }

        System.out.println("Generating report: " + type);


        reportData.clear();


        reportData.add(new FinancialReports("Total Transactions", "$12,450"));
        reportData.add(new FinancialReports("Total Profit", "$4,880"));
        reportData.add(new FinancialReports("Customers Served", "233"));
    }


    @javafx.fxml.FXML
    public void handleGenerate(ActionEvent actionEvent) {
        if (reportData.isEmpty()) {
            System.out.println("No data to export!");
            return;
        }

        System.out.println("Exporting report...");

    }
}