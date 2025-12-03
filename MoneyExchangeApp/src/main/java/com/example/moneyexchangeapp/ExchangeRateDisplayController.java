package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

public class ExchangeRateDisplayController
{
    @javafx.fxml.FXML
    private TableColumn colSellRate;
    @javafx.fxml.FXML
    private Button btnShowTrend;
    @javafx.fxml.FXML
    private Button btnRefreshRates;
    @javafx.fxml.FXML
    private TableColumn colBuyRate;
    @javafx.fxml.FXML
    private TableColumn colCurrency;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleRefreshRates(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleShowTrend(ActionEvent actionEvent) {
    }
}