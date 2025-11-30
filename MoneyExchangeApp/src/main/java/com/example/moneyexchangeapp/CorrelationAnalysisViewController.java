package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CorrelationAnalysisViewController
{
    @javafx.fxml.FXML
    private TableColumn CurrencyOneTableColumn;
    @javafx.fxml.FXML
    private TableColumn PositiveTableColumn;
    @javafx.fxml.FXML
    private TextField CorrelationValueTextField;
    @javafx.fxml.FXML
    private TableColumn CorrelationValueTableColumn;
    @javafx.fxml.FXML
    private ComboBox CurrencyOneComboBox;
    @javafx.fxml.FXML
    private TextField PeriodTextField;
    @javafx.fxml.FXML
    private TableColumn CurrencyTwoTableColumn;
    @javafx.fxml.FXML
    private TableView CorrelationAnalysisTableView;
    @javafx.fxml.FXML
    private ComboBox CurrencyTwoComboBox;
    @javafx.fxml.FXML
    private CheckBox PositiveCheckBox;
    @javafx.fxml.FXML
    private TableColumn PeriodTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AddCorrelationButtonOnAction(ActionEvent actionEvent) {
    }
}