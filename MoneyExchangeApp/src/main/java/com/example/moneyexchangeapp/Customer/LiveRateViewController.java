package com.example.moneyexchangeapp.Customer;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class LiveRateViewController
{
    @javafx.fxml.FXML
    private TableView<LiveRate> LiveRatesTableView;
    @javafx.fxml.FXML
    private AnchorPane LiveRatesAnchorPane;
    @javafx.fxml.FXML
    private TableColumn<LiveRate , Float> BidPriceTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LiveRate , String> LastUpdatedTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LiveRate , String> CurrencyPairTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LiveRate , Float> ChangePercentTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        CurrencyPairTableColumn.setCellValueFactory(new PropertyValueFactory<>("currencyPair"));
        BidPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("bidPrice"));
        ChangePercentTableColumn.setCellValueFactory(new PropertyValueFactory<>("changePercent"));
        LastUpdatedTableColumn.setCellValueFactory(new PropertyValueFactory<>("lastUpdated"));

        loadDummyRates();
    }

    private void loadDummyRates() {
        LiveRatesTableView.setItems(FXCollections.observableArrayList(
                new LiveRate("USD/BDT", 119.45f, 0.12f, "2025-01-01 10:00"),
                new LiveRate("EUR/BDT", 130.34f, -0.25f, "2025-01-01 10:05"),
                new LiveRate("USD/EUR", 1.09f, 0.05f, "2025-01-01 10:10")
        ));

    }

    @javafx.fxml.FXML
    public void RefreshTableButtomOnAction(ActionEvent actionEvent) {
        loadDummyRates();
    }

    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CustomerDashView.fxml"));
        Node node = loader.load();
        LiveRatesAnchorPane.getChildren().setAll(node);
    }
    catch(Exception e) {
        //
    }
    }
}