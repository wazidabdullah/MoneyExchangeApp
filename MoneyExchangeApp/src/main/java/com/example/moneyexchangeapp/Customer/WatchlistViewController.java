package com.example.moneyexchangeapp.Customer;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;

public class WatchlistViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> CurrencyPairComboBox;
    @javafx.fxml.FXML
    private TableColumn<Watchlist , String> CurrencyPairTableColumn;
    @javafx.fxml.FXML
    private TableView<Watchlist> WatchlistTableView;
    @javafx.fxml.FXML
    private TableColumn<Watchlist , LocalDate> DateTableColumn;
    @javafx.fxml.FXML
    private AnchorPane WatchlistAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
        CurrencyPairComboBox.getItems().addAll("USD/EUR", "USD/BDT", "USD/AUD", "USD/CAD", "USD/INR", "EUR/BDT", "EUR/AUD", "EUR/CAD", "EUR/INR", "BDT/AUD", "BDT/CAD",
                "BDT/INR", "AUD/CAD", "AUD/INR", "CAD/INR");

        CurrencyPairTableColumn.setCellValueFactory(new PropertyValueFactory<>("currencyPair"));
        DateTableColumn.setCellValueFactory(new PropertyValueFactory<>("dateAdded"));

        WatchlistTableView.setItems(FXCollections.observableArrayList());
    }

    @javafx.fxml.FXML
    public void AddCurrencyButtonOnAction(ActionEvent actionEvent) {
            String selectedPair = CurrencyPairComboBox.getValue();

            if (selectedPair == null || selectedPair.isEmpty()) {
                return;
            }

            Watchlist newEntry = new Watchlist(selectedPair, LocalDate.now());
            WatchlistTableView.getItems().add(newEntry);
    }



    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CustomerDashView.fxml"));
            Node node = loader.load();
            WatchlistAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }
    }
