package Receptionist;

import com.example.moneyexchangeapp.ExchangeRate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Random;

public class ExchangeRateDisplayController
{
    @javafx.fxml.FXML
    private TableColumn <ExchangeRate, Double>colSellRate;
    @javafx.fxml.FXML
    private Button btnShowTrend;
    @javafx.fxml.FXML
    private Button btnRefreshRates;
    @javafx.fxml.FXML
    private TableColumn <ExchangeRate, Double>colBuyRate;
    @javafx.fxml.FXML
    private TableColumn <ExchangeRate, String>colCurrency;
    @javafx.fxml.FXML
    private TableView <ExchangeRate>tblExchangeRates;

    private ObservableList<ExchangeRate> exchangeData = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {
        colCurrency.setCellValueFactory(new PropertyValueFactory<>("currency"));
        colBuyRate.setCellValueFactory(new PropertyValueFactory<>("buyRate"));
        colSellRate.setCellValueFactory(new PropertyValueFactory<>("sellRate"));

        loadInitialRates();

        tblExchangeRates.setItems(exchangeData);
    }

    private void loadInitialRates() {
        exchangeData.addAll(
                new ExchangeRate("USD", 107.5, 108.0),
                new ExchangeRate("EUR", 115.0, 116.0),
                new ExchangeRate("GBP", 133.0, 134.5),
                new ExchangeRate("JPY", 0.98, 1.0)
        );
    }


    @javafx.fxml.FXML
    public void handleRefreshRates(ActionEvent actionEvent) {
        Random random = new Random();
        for (ExchangeRate rate : exchangeData) {
            double buy = rate.getBuyRate() + (random.nextDouble() - 0.5);
            double sell = rate.getSellRate() + (random.nextDouble() - 0.5);
            rate.setBuyRate(Math.round(buy * 100.0) / 100.0);
            rate.setSellRate(Math.round(sell * 100.0) / 100.0);
        }
        tblExchangeRates.refresh();
        System.out.println("Exchange rates refreshed!");
    }


    @javafx.fxml.FXML
    public void handleShowTrend(ActionEvent actionEvent) {
        System.out.println("Showing exchange rate trends:");
        for (ExchangeRate rate : exchangeData) {
            double diff = rate.getSellRate() - rate.getBuyRate();
            System.out.println(rate.getCurrency() + ": Spread = " + diff);
        }
    }
}