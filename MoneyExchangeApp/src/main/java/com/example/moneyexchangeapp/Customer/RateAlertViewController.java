package com.example.moneyexchangeapp.Customer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.time.LocalDate;

public class RateAlertViewController
{
    @javafx.fxml.FXML
    private TableColumn<RateAlert , String> ConditionTableColumn;
    @javafx.fxml.FXML
    private TableColumn<RateAlert , String> CurrencyTableColumn;
    @javafx.fxml.FXML
    private TableColumn<RateAlert , String> AlertTypeTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> CurrencyComboBox;
    @javafx.fxml.FXML
    private TableColumn<RateAlert , String> DateTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String>ConditionComboBox;
    @javafx.fxml.FXML
    private AnchorPane RateAlertAnchorPane;
    @javafx.fxml.FXML
    private ComboBox<String> AlertTypeComboBox;
    @javafx.fxml.FXML
    private TableView<RateAlert> RateAlertTableView;

    private final ObservableList<RateAlert> alertList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        CurrencyTableColumn.setCellValueFactory(new PropertyValueFactory<>("currency"));
        ConditionTableColumn.setCellValueFactory(new PropertyValueFactory<>("condition"));
        AlertTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("alertType"));
        DateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        RateAlertTableView.setItems(alertList);

        CurrencyComboBox.setItems(FXCollections.observableArrayList("USD/BDT", "EUR/BDT", "GBP/BDT"));
        ConditionComboBox.setItems(FXCollections.observableArrayList("Above", "Below", "Equal To"));
        AlertTypeComboBox.setItems(FXCollections.observableArrayList("SMS", "Email", "App Notification"));

    }

    @javafx.fxml.FXML
    public void SetAlertButtonOnAction(ActionEvent actionEvent) {
        if (CurrencyComboBox.getValue() == null ||
                ConditionComboBox.getValue() == null ||
                AlertTypeComboBox.getValue() == null) {
            return;
        }

        RateAlert alert = new RateAlert(
                CurrencyComboBox.getValue(),
                ConditionComboBox.getValue(),
                AlertTypeComboBox.getValue(),
                LocalDate.now().toString()
        );

        alertList.add(alert);
        RateAlertTableView.refresh();
    }

    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CustomerDashView.fxml"));
            Node node = loader.load();
            RateAlertAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }
    }
