package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class CorrelationAnalysisViewController {
    @javafx.fxml.FXML
    private TableColumn<CorrelationAnalysis, String> CurrencyOneTableColumn;
    @javafx.fxml.FXML
    private TableColumn<CorrelationAnalysis, String> PositiveTableColumn;
    @javafx.fxml.FXML
    private TextField CorrelationValueTextField;
    @javafx.fxml.FXML
    private TableColumn<CorrelationAnalysis, Float> CorrelationValueTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> CurrencyOneComboBox;
    @javafx.fxml.FXML
    private TextField PeriodTextField;
    @javafx.fxml.FXML
    private TableColumn<CorrelationAnalysis, String> CurrencyTwoTableColumn;
    @javafx.fxml.FXML
    private TableView<CorrelationAnalysis> CorrelationAnalysisTableView;
    @javafx.fxml.FXML
    private ComboBox<String> CurrencyTwoComboBox;
    @javafx.fxml.FXML
    private CheckBox PositiveCheckBox;
    @javafx.fxml.FXML
    private TableColumn<CorrelationAnalysis, Integer> PeriodTableColumn;
    @javafx.fxml.FXML
    private AnchorPane CorrelationAnalysisAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {

        CurrencyOneComboBox.getItems().addAll("USD", "EUR", "BDT", "AUD", "CAD", "INR");
        CurrencyTwoComboBox.getItems().addAll("USD", "EUR", "BDT", "AUD", "CAD", "INR");


        CurrencyOneTableColumn.setCellValueFactory(new PropertyValueFactory<>("CurrencyOne"));
        CurrencyTwoTableColumn.setCellValueFactory(new PropertyValueFactory<>("CurrencyTwo"));
        PeriodTableColumn.setCellValueFactory(new PropertyValueFactory<>("Period"));
        CorrelationValueTableColumn.setCellValueFactory(new PropertyValueFactory<>("CorrelationValue"));
        PositiveTableColumn.setCellValueFactory(new PropertyValueFactory<>("Positive"));
    }

    @javafx.fxml.FXML
    public void AddCorrelationButtonOnAction(ActionEvent actionEvent) {
        // Read values from input fields
        String currencyOne = CurrencyOneComboBox.getValue();
        String currencyTwo = CurrencyTwoComboBox.getValue();
        String periodText = PeriodTextField.getText();
        String correlationText = CorrelationValueTextField.getText();
        boolean positive = PositiveCheckBox.isSelected();

        if (currencyOne == null || currencyTwo == null || periodText.isEmpty() || correlationText.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Missing Fields");
            alert.setContentText("Please fill all fields before adding correlation data.");
            alert.show();
            return;

        }

        int period = Integer.parseInt(periodText);
        float correlationValue = Float.parseFloat(correlationText);

        CorrelationAnalysis newEntry = new CorrelationAnalysis(currencyOne, currencyTwo, positive , period, correlationValue);

        CorrelationAnalysisTableView.getItems().add(newEntry);
    }

    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EResearcherDashView.fxml"));
            Node node = loader.load();
            CorrelationAnalysisAnchorPane.getChildren().setAll(node);
        } catch (Exception e) {
            //
        }
    }
}