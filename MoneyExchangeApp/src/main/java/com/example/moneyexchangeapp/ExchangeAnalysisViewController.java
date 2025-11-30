package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.shape.StrokeLineCap;

public class ExchangeAnalysisViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> fromRateCheckComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> toRateCheckComboBox;
    @javafx.fxml.FXML
    private Label AnalysisResultsLabel;

    @javafx.fxml.FXML
    public void initialize() {

        fromRateCheckComboBox.getItems().addAll("USD" , "EUR" , "BDT" , "AUD" , "CAD" , "INR" );
        toRateCheckComboBox.getItems().addAll("USD" , "EUR" , "BDT" , "AUD" , "CAD" , "INR" );
    }

    @javafx.fxml.FXML
    public void RunAnalysisButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {
    }
}