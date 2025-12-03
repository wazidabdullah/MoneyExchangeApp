package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

public class ProfitLossController
{
    @javafx.fxml.FXML
    private Button btnUpdateSheet;
    @javafx.fxml.FXML
    private DatePicker dpDate;
    @javafx.fxml.FXML
    private TableColumn colPLCurrency;
    @javafx.fxml.FXML
    private TableColumn colBuy;
    @javafx.fxml.FXML
    private Button btnCalculate;
    @javafx.fxml.FXML
    private TableColumn colPL;
    @javafx.fxml.FXML
    private Label lblPLMessage;
    @javafx.fxml.FXML
    private TableColumn colSell;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleUpdateSheet(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleCalculate(ActionEvent actionEvent) {
    }
}