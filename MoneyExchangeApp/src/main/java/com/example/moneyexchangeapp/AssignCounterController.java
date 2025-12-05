package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AssignCounterController
{
    @javafx.fxml.FXML
    private TextField txtCounterNumber;
    @javafx.fxml.FXML
    private TextField txtWaitTime;
    @javafx.fxml.FXML
    private TextField txtTokenNumber;
    @javafx.fxml.FXML
    private Button btnGenerateToken;
    @javafx.fxml.FXML
    private ComboBox cmbServiceType;
    @javafx.fxml.FXML
    private Button btnPrintToken;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleGenerateToken(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handlePrintToken(ActionEvent actionEvent) {
    }
}