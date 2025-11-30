package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ForecastModelViewController
{
    @javafx.fxml.FXML
    private TableView ForecastModelTableView;
    @javafx.fxml.FXML
    private ComboBox CurrencyPairComboBox;
    @javafx.fxml.FXML
    private TableColumn ConfidenceTableColumn;
    @javafx.fxml.FXML
    private TableColumn DateColumn;
    @javafx.fxml.FXML
    private TableColumn RecommendationTableColumn;
    @javafx.fxml.FXML
    private TableColumn TrendTableColumn;
    @javafx.fxml.FXML
    private TableColumn PredictedRateTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void PredictButtonOnAction(ActionEvent actionEvent) {
    }
}