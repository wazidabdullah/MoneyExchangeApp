package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class CollaborationHubViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> ResearcherListComboBox;
    @javafx.fxml.FXML
    private TextArea MessageTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        ResearcherListComboBox.getItems().addAll("Dr. A. Rahman",
                "Dr. S. Karim",
                "Dr. M. Hossain",
                "Dr. L. Ahmed",
                "Dr. R. Chowdhury");
    }

    @javafx.fxml.FXML
    public void SendMessageButtonOnAction(ActionEvent actionEvent) {

        String selectedResearcher = ResearcherListComboBox.getValue();
        String messageText = MessageTextArea.getText();

        if (selectedResearcher == null || selectedResearcher.isEmpty() || messageText.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Missing Information!");
            alert.setContentText("Please select a researcher and type your message.");
            alert.show();
            return;}
    }

    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {
    }
}