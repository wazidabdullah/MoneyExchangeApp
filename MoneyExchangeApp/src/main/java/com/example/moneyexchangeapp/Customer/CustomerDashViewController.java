package com.example.moneyexchangeapp.Customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public class CustomerDashViewController
{
    @javafx.fxml.FXML
    private AnchorPane CustomerDashViewAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void RateComparisonButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("RateComparisonView.fxml"));
            Node node = loader.load();
            CustomerDashViewAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void SupportButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SupportTicketView.fxml"));
            Node node = loader.load();
            CustomerDashViewAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void LiveRatesButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LiveRateView.fxml"));
            Node node = loader.load();
            CustomerDashViewAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void WatchlistButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("WatchlistView.fxml"));
            Node node = loader.load();
            CustomerDashViewAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void RateAlertButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("RateAlertView.fxml"));
            Node node = loader.load();
            CustomerDashViewAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void CurrencyConverterButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CurrencyConverterView.fxml"));
            Node node = loader.load();
            CustomerDashViewAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }
}