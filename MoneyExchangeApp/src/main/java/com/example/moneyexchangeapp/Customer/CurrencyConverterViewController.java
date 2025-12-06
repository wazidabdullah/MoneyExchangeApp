package com.example.moneyexchangeapp.Customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CurrencyConverterViewController
{
    @javafx.fxml.FXML
    private TextField AmountTextField;
    @javafx.fxml.FXML
    private ComboBox<String> FromComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> ToComboBox;
    @javafx.fxml.FXML
    private Label ConvertedRateLabel;
    @javafx.fxml.FXML
    private AnchorPane CurrencyConverterAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {

        FromComboBox.getItems().addAll("USD", "EUR", "BDT", "INR");
        ToComboBox.getItems().addAll("USD", "EUR", "BDT", "INR");
    }

    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CustomerDashView.fxml"));
            Node node = loader.load();
            CurrencyConverterAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void ConvertButtonOnAction(ActionEvent actionEvent) {

        if (AmountTextField.getText().isEmpty()) {
            ConvertedRateLabel.setText("Enter amount!");
            return;
        }

        String from = FromComboBox.getValue();
        String to = ToComboBox.getValue();

        if (from == null || to == null) {
            ConvertedRateLabel.setText("Select currencies!");
            return;
        }

        if (from.equals(to)) {
            ConvertedRateLabel.setText("Both currencies same!");
            return;
        }

        float amount;
        try {
            amount = Float.parseFloat(AmountTextField.getText());
        } catch (Exception e) {
            ConvertedRateLabel.setText("Invalid amount!");
            return;
        }

        // Convert using Model
        float result = CurrencyConverter.convert(from, to, amount);

        if (result == -1) {
            ConvertedRateLabel.setText("Rate not available!");
            return;
        }

        ConvertedRateLabel.setText(String.format("%.2f %s", result, to));
    }

    }