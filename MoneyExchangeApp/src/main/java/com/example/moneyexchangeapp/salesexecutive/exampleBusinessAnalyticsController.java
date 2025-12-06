package com.example.moneyexchangeapp.salesexecutive;

import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;

public class exampleBusinessAnalyticsController
{
    @javafx.fxml.FXML
    private Button refreshButton;
    @javafx.fxml.FXML
    private LineChart branchPerformanceChart;
    @javafx.fxml.FXML
    private Label lastUpdatedLabel;
    @javafx.fxml.FXML
    private TableView kpiTable;
    @javafx.fxml.FXML
    private TreeView analyticsTree;
    @javafx.fxml.FXML
    private BarChart currencyStockChart;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleRefreshData(ActionEvent actionEvent) {
    }
}