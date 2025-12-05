package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class CustomerRegistrationController
{
    @javafx.fxml.FXML
    private TextField txtContact;
    @javafx.fxml.FXML
    private TableColumn colCustomerName;
    @javafx.fxml.FXML
    private TableColumn colContactNumber;
    @javafx.fxml.FXML
    private TextField txtPurpose;
    @javafx.fxml.FXML
    private TableColumn colCustomerID;
    @javafx.fxml.FXML
    private TextField txtCustomerName;
    @javafx.fxml.FXML
    private Button btnSubmitRegistration;
    @javafx.fxml.FXML
    private TextField txtGeneratedCustomerId;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSubmitRegistration(ActionEvent actionEvent) {
    }
}