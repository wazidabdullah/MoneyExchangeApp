package com.example.moneyexchangeapp;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.shape.StrokeLineCap;

import java.time.LocalDate;

public class ForecastModelViewController
{
    @javafx.fxml.FXML
    private TableView<ForecastModel> ForecastModelTableView;
    @javafx.fxml.FXML
    private ComboBox<String> CurrencyPairComboBox;
    @javafx.fxml.FXML
    private TableColumn<ForecastModel , Integer> ConfidenceTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ForecastModel , DatePicker> DateColumn;
    @javafx.fxml.FXML
    private TableColumn<ForecastModel , String> RecommendationTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ForecastModel , String> TrendTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ForecastModel , Float> PredictedRateTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        CurrencyPairComboBox.getItems().addAll(
                "USD/EUR",
                "USD/BDT",
                "USD/AUD",
                "USD/CAD",
                "USD/INR",
                "EUR/BDT",
                "EUR/AUD",
                "EUR/CAD",
                "EUR/INR",
                "BDT/AUD",
                "BDT/CAD",
                "BDT/INR",
                "AUD/CAD",
                "AUD/INR",
                "CAD/INR"
        );

        DateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        PredictedRateTableColumn.setCellValueFactory(new PropertyValueFactory<>("predictedRate"));
        TrendTableColumn.setCellValueFactory(new PropertyValueFactory<>("trend"));
        RecommendationTableColumn.setCellValueFactory(new PropertyValueFactory<>("recommendation"));
        ConfidenceTableColumn.setCellValueFactory(new PropertyValueFactory<>("confidence"));

        ForecastModelTableView.setItems(FXCollections.observableArrayList(
                new ForecastModel("USD/EUR", 1.09f, "Uptrend", "Buy", 85, LocalDate.of(2025, 1, 1)),
                new ForecastModel("USD/BDT", 119.5f, "Stable", "Hold", 70, LocalDate.of(2025, 1, 2)),
                new ForecastModel("USD/AUD", 1.45f, "Uptrend", "Buy", 80, LocalDate.of(2025, 1, 3)),
                new ForecastModel("USD/CAD", 1.25f, "Downtrend", "Sell", 65, LocalDate.of(2025, 1, 4)),
                new ForecastModel("USD/INR", 82.0f, "Stable", "Hold", 75, LocalDate.of(2025, 1, 5)),
                new ForecastModel("EUR/BDT", 130.2f, "Downtrend", "Sell", 60, LocalDate.of(2025, 1, 6)),
                new ForecastModel("EUR/AUD", 1.61f, "Uptrend", "Buy", 85, LocalDate.of(2025, 1, 7)),
                new ForecastModel("EUR/CAD", 1.48f, "Stable", "Hold", 70, LocalDate.of(2025, 1, 8)),
                new ForecastModel("EUR/INR", 90.5f, "Downtrend", "Sell", 65, LocalDate.of(2025, 1, 9)),
                new ForecastModel("BDT/AUD", 0.012f, "Uptrend", "Buy", 75, LocalDate.of(2025, 1, 10)),
                new ForecastModel("BDT/CAD", 0.010f, "Stable", "Hold", 70, LocalDate.of(2025, 1, 11)),
                new ForecastModel("BDT/INR", 0.68f, "Downtrend", "Sell", 60, LocalDate.of(2025, 1, 12)),
                new ForecastModel("AUD/CAD", 0.89f, "Uptrend", "Buy", 80, LocalDate.of(2025, 1, 13)),
                new ForecastModel("AUD/INR", 60.2f, "Downtrend", "Sell", 65, LocalDate.of(2025, 1, 14)),
                new ForecastModel("CAD/INR", 67.5f, "Stable", "Hold", 70, LocalDate.of(2025, 1, 15))));

    }

    @javafx.fxml.FXML
    public void PredictButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {
    }
}