package com.example.moneyexchangeapp;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ModelComparisonViewController
{
    @javafx.fxml.FXML
    private Label FindBestPerformerLabel;
    @javafx.fxml.FXML
    private TableColumn<ModelComparison , String> CurrencyPairTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ModelComparison , Float> PerformanceTableColumn;
    @javafx.fxml.FXML
    private TableView<ModelComparison> ModelComparisonTableView;
    @javafx.fxml.FXML
    private TableColumn<ModelComparison , String> RecommendationTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ModelComparison ,String> TrendTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ModelComparison , Float> BuyRateTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        ModelComparisonTableView.setItems(FXCollections.observableArrayList(
                new ModelComparison("USD/EUR", "Uptrend", "Buy", 1.09f, 85f),
                new ModelComparison("USD/BDT", "Stable", "Hold", 119.5f, 70f),
                new ModelComparison("USD/AUD", "Uptrend", "Buy", 1.45f, 80f),
                new ModelComparison("USD/CAD", "Downtrend", "Sell", 1.25f, 65f),
                new ModelComparison("USD/INR", "Stable", "Hold", 82f, 75f),

                new ModelComparison("EUR/BDT", "Downtrend", "Sell", 130.2f, 60f),
                new ModelComparison("EUR/AUD", "Uptrend", "Buy", 1.61f, 85f),
                new ModelComparison("EUR/CAD", "Stable", "Hold", 1.48f, 70f),
                new ModelComparison("EUR/INR", "Downtrend", "Sell", 90.5f, 65f),

                new ModelComparison("BDT/AUD", "Uptrend", "Buy", 0.012f, 75f),
                new ModelComparison("BDT/CAD", "Stable", "Hold", 0.010f, 70f),
                new ModelComparison("BDT/INR", "Downtrend", "Sell", 0.68f, 60f),

                new ModelComparison("AUD/CAD", "Uptrend", "Buy", 0.89f, 80f),
                new ModelComparison("AUD/INR", "Downtrend", "Sell", 60.2f, 65f),
                new ModelComparison("CAD/INR", "Stable", "Hold", 67.5f, 70f)
        ));



    }

    @javafx.fxml.FXML
    public void FindBestPerformerButtonOnAction(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {
    }
}