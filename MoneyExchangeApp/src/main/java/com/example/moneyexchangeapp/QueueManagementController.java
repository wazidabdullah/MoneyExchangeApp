package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class QueueManagementController
{
    @javafx.fxml.FXML
    private TableColumn colServiceType;
    @javafx.fxml.FXML
    private Button btnRefreshQueue;
    @javafx.fxml.FXML
    private ComboBox comboServiceType;
    @javafx.fxml.FXML
    private TextField txtToeknNo;
    @javafx.fxml.FXML
    private TableColumn colCustomerName;
    @javafx.fxml.FXML
    private TextField txtStatus;
    @javafx.fxml.FXML
    private Button btnCompleted;
    @javafx.fxml.FXML
    private TextField txtCustomerName;
    @javafx.fxml.FXML
    private TableColumn colToken;
    @javafx.fxml.FXML
    private Button btnServe;
    @javafx.fxml.FXML
    private TableColumn colStatus;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleRefreshQueue(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleMarkServing(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleMarkCompleted(ActionEvent actionEvent) {
    }
}