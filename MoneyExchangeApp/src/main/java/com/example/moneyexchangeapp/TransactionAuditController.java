package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class TransactionAuditController
{
    @javafx.fxml.FXML
    private TableColumn colDetails;
    @javafx.fxml.FXML
    private Button btnSaveCorrection;
    @javafx.fxml.FXML
    private Button btnScan;
    @javafx.fxml.FXML
    private TableColumn colTransId;
    @javafx.fxml.FXML
    private TextField txtCorrectValue;
    @javafx.fxml.FXML
    private TableColumn colFlagStatus;
    @javafx.fxml.FXML
    private TableColumn colIssueType;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleScan(ActionEvent actionEvent) {
    }
}