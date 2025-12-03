package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;

public class FinancialReportsControler
{
    @javafx.fxml.FXML
    private ComboBox cbReportType;
    @javafx.fxml.FXML
    private TableColumn colItem;
    @javafx.fxml.FXML
    private DatePicker dpFrom;
    @javafx.fxml.FXML
    private Button btnExport;
    @javafx.fxml.FXML
    private DatePicker dpTo;
    @javafx.fxml.FXML
    private Button btnGenerate;
    @javafx.fxml.FXML
    private TableColumn colValue;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleExport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenerate(ActionEvent actionEvent) {
    }
}