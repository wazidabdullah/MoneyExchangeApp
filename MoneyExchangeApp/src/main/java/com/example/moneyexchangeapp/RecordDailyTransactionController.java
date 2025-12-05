package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class RecordDailyTransactionController
{
    @javafx.fxml.FXML
    private TableColumn colAmount;
    @javafx.fxml.FXML
    private ComboBox cbType;
    @javafx.fxml.FXML
    private TextField txtAmount;
    @javafx.fxml.FXML
    private TextField txtBranchId;
    @javafx.fxml.FXML
    private TableColumn colRate;
    @javafx.fxml.FXML
    private TableColumn colDate;
    @javafx.fxml.FXML
    private Button btnValidate;
    @javafx.fxml.FXML
    private TableColumn colBDT;
    @javafx.fxml.FXML
    private TableColumn colBranch;
    @javafx.fxml.FXML
    private ComboBox cbCurrency;
    @javafx.fxml.FXML
    private TextField txtRate;
    @javafx.fxml.FXML
    private Button btnSave;
    @javafx.fxml.FXML
    private TableColumn colType;
    @javafx.fxml.FXML
    private TableColumn colCurrency;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleValidate(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSaveTransaction(ActionEvent actionEvent) {
    }
}