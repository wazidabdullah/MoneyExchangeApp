package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class ReconciliationController
{
    @javafx.fxml.FXML
    private Button btnStartRecon;
    @javafx.fxml.FXML
    private TableColumn colBankAmount;
    @javafx.fxml.FXML
    private TextField txtAdjustment;
    @javafx.fxml.FXML
    private Button btnCorrect;
    @javafx.fxml.FXML
    private TableColumn colDifference;
    @javafx.fxml.FXML
    private TableColumn colSystemAmount;
    @javafx.fxml.FXML
    private Button btnImportBank;
    @javafx.fxml.FXML
    private TableColumn colStatus;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleStartRecon(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleImport(ActionEvent actionEvent) {
    }
}