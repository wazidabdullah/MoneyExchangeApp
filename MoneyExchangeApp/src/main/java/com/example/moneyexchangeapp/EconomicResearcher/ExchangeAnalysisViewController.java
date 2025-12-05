package com.example.moneyexchangeapp.EconomicResearcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ExchangeAnalysisViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> fromRateCheckComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> toRateCheckComboBox;
    @javafx.fxml.FXML
    private Label AnalysisResultsLabel;
    @javafx.fxml.FXML
    private AnchorPane ExchangeAnalysisAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {

        fromRateCheckComboBox.getItems().addAll("USD" , "EUR" , "BDT" , "AUD" , "CAD" , "INR" );
        toRateCheckComboBox.getItems().addAll("USD" , "EUR" , "BDT" , "AUD" , "CAD" , "INR" );
    }

    @javafx.fxml.FXML
    public void RunAnalysisButtonOnAction(ActionEvent actionEvent) {

        String from = fromRateCheckComboBox.getValue();
        String to = toRateCheckComboBox.getValue();

        if (from == null || to == null) {
            AnalysisResultsLabel.setText("Please select both currencies!");
            return;
        }

        String result =
                "Exchange Rate Analysis (" + from + " to " + to + ")\n\n" +
                        "Average (30 Days): No data found\n" +
                        "Highest (30 Days): No data found\n" +
                        "Lowest  (30 Days): No data found";

        AnalysisResultsLabel.setText(result);
    }

    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EResearcherDashView.fxml"));
            Node node = loader.load();
            ExchangeAnalysisAnchorPane.getChildren().setAll(node);
        } catch (Exception e) {
            //
        }
    }
}