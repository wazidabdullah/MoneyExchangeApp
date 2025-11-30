package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CorrelationAnalysisViewController
{
    @javafx.fxml.FXML
    private TableColumn<CorrelationAnalysis , String> CurrencyOneTableColumn;
    @javafx.fxml.FXML
    private TableColumn<CorrelationAnalysis , String> PositiveTableColumn;
    @javafx.fxml.FXML
    private TextField CorrelationValueTextField;
    @javafx.fxml.FXML
    private TableColumn<CorrelationAnalysis , Float> CorrelationValueTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> CurrencyOneComboBox;
    @javafx.fxml.FXML
    private TextField PeriodTextField;
    @javafx.fxml.FXML
    private TableColumn<CorrelationAnalysis , String> CurrencyTwoTableColumn;
    @javafx.fxml.FXML
    private TableView <CorrelationAnalysis> CorrelationAnalysisTableView;
    @javafx.fxml.FXML
    private ComboBox<String> CurrencyTwoComboBox;
    @javafx.fxml.FXML
    private CheckBox PositiveCheckBox;
    @javafx.fxml.FXML
    private TableColumn<CorrelationAnalysis , Integer> PeriodTableColumn;

    @javafx.fxml.FXML
    public void initialize() {

        CurrencyOneComboBox.getItems().addAll("USD" , "EUR" , "BDT" , "AUD" , "CAD" , "INR" );
        CurrencyTwoComboBox.getItems().addAll("USD" , "EUR" , "BDT" , "AUD" , "CAD" , "INR" );


        CurrencyOneTableColumn.setCellValueFactory(new PropertyValueFactory<>("CurrencyOne"));
        CurrencyTwoTableColumn.setCellValueFactory(new PropertyValueFactory<>("CurrencyTwo"));
        PeriodTableColumn.setCellValueFactory(new PropertyValueFactory<>("Period"));
        CorrelationValueTableColumn.setCellValueFactory(new PropertyValueFactory<>("CorrelationValue"));
        PositiveTableColumn.setCellValueFactory(new PropertyValueFactory<>("Positive"));
    }

    @javafx.fxml.FXML
    public void AddCorrelationButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {
    }
}