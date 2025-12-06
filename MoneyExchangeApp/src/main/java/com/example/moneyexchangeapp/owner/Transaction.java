package com.example.moneyexchangeapp.owner;

public class Transaction {private String transactionID;
    private String currency;
    private Double amount;
    private Double exchangeRate;

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID='" + transactionID + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", exchangeRate=" + exchangeRate +
                ", status='" + status + '\'' +
                '}';
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Transaction(String transactionID, String currency, Double amount, Double exchangeRate, String status) {
        this.transactionID = transactionID;
        this.currency = currency;
        this.amount = amount;
        this.exchangeRate = exchangeRate;
        this.status = status;
    }

    private String status;
}
