package com.example.moneyexchangeapp.Customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class SupportTicketViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> IssueComboBox;
    @javafx.fxml.FXML
    private TextArea DescriptionTextArea;
    @javafx.fxml.FXML
    private Label TicketSentLabel;
    @javafx.fxml.FXML
    private AnchorPane SupportTicketAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
        IssueComboBox.getItems().addAll("Login Issue", "Payment Issue", "App Crash", "Feature Request", "Other");

    }

    @javafx.fxml.FXML
    public void SubmitTicketButtonOnAction(ActionEvent actionEvent) {
        String issue = IssueComboBox.getValue();
        String description = DescriptionTextArea.getText();

        if (issue == null || issue.isEmpty() || description.isEmpty()) {
            TicketSentLabel.setText("Please select an issue and write a description.");
            return;
        }

        SupportTicket ticket = new SupportTicket(issue, description);

        TicketSentLabel.setText("Ticket submitted successfully!\nIssue: " + ticket.getIssue());


        IssueComboBox.getSelectionModel().clearSelection();
        DescriptionTextArea.clear();
    }

    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CustomerDashView.fxml"));
            Node node = loader.load();
            SupportTicketAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }
    }
