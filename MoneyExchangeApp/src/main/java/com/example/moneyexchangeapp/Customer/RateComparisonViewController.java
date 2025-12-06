package com.example.moneyexchangeapp.Customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class RateComparisonViewController
{
    @javafx.fxml.FXML
    private Label ComparisonOutputLabel;
    @javafx.fxml.FXML
    private ComboBox<String> CurrencyOneComboBox;
    @javafx.fxml.FXML
    private AnchorPane RateComparisonAnchorPane;
    @javafx.fxml.FXML
    private ComboBox<String> CurrencyTwoComboBox;

    @javafx.fxml.FXML
    public void initialize() {

        CurrencyOneComboBox.getItems().addAll("USD", "EUR", "BDT", "INR");
        CurrencyTwoComboBox.getItems().addAll("USD", "EUR", "BDT", "INR");
    }

    private Float getRate(String currency) {
        return switch (currency) {
            case "USD" -> 110.0f;
            case "EUR" -> 118.0f;
            case "BDT" -> 1.0f;
            case "INR" -> 1.3f;
            default -> 0f;
        };

    }

    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CustomerDashView.fxml"));
            Node node = loader.load();
            RateComparisonAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }


    @javafx.fxml.FXML
    public void CompareButtonOnAction(ActionEvent actionEvent) {
        String c1 = CurrencyOneComboBox.getValue();
        String c2 = CurrencyTwoComboBox.getValue();

        if (c1 == null || c2 == null) {
            ComparisonOutputLabel.setText("Please select both currencies.");
            return;
        }

        float rate1 = getRate(c1);
        float rate2 = getRate(c2);


        float result = rate1 / rate2;


        String resultText = String.format("1 %s = %.2f %s", c1, result, c2);


        RateComparison comparison = new RateComparison(c1, c2, resultText);


        ComparisonOutputLabel.setText(comparison.getResult());
    }
    }
