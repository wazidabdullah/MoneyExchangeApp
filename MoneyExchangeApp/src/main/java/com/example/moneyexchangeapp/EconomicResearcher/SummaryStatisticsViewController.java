package com.example.moneyexchangeapp.EconomicResearcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class SummaryStatisticsViewController
{
    @javafx.fxml.FXML
    private AnchorPane SummaryStatisticsAnchorPane;
    @javafx.fxml.FXML
    private Label AverageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> CurrencyOneComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> CurrencyTwoComboBox;
    @javafx.fxml.FXML
    private Label LowestLabel;
    @javafx.fxml.FXML
    private Label HighestLabel;

    @javafx.fxml.FXML
    public void initialize() {

        CurrencyOneComboBox.getItems().addAll("USD" , "EUR" , "BDT" , "AUD" , "CAD" , "INR" );
        CurrencyTwoComboBox.getItems().addAll("USD" , "EUR" , "BDT" , "AUD" , "CAD" , "INR" );
    }

    @javafx.fxml.FXML
    public void CheckButtonOnAction(ActionEvent actionEvent) {

        String from = CurrencyOneComboBox.getValue();
        String to = CurrencyTwoComboBox.getValue();

        if (from == null || to == null) {
            AverageLabel.setText("Select two currencies!");
            HighestLabel.setText("-");
            LowestLabel.setText("-");
            return;
        }

        AverageLabel.setText("No data found");
        HighestLabel.setText("No data found");
        LowestLabel.setText("No data found");
    }

    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EResearcherDashView.fxml"));
            Node node = loader.load();
            SummaryStatisticsAnchorPane.getChildren().setAll(node);
        } catch (Exception e) {
            //
        }
    }
}