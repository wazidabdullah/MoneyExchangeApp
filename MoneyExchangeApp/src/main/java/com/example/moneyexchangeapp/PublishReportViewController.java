package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PublishReportViewController
{
    @javafx.fxml.FXML
    private TextArea ReportContentTextArea;
    @javafx.fxml.FXML
    private TextField ReportTypeTextField;
    @javafx.fxml.FXML
    private TextField ReportTitleTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void PublishOnlineButtonOnAction(ActionEvent actionEvent) {

        if (ReportTitleTextField.getText().isEmpty() || ReportTypeTextField.getText().isEmpty() || ReportContentTextArea.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Missing Fields!");
            alert.setContentText("Please fill all fields before publishing.");
            alert.show();
            return;}
    }

    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {

        }
}