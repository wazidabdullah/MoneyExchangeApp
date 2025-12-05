package com.example.moneyexchangeapp.EconomicResearcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class PublishReportViewController
{
    @javafx.fxml.FXML
    private TextArea ReportContentTextArea;
    @javafx.fxml.FXML
    private TextField ReportTypeTextField;
    @javafx.fxml.FXML
    private TextField ReportTitleTextField;
    @javafx.fxml.FXML
    private AnchorPane PublishReportAnchorPane;

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

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EResearcherDashView.fxml"));
            Node node = loader.load();
            PublishReportAnchorPane.getChildren().setAll(node);

        }

        catch (Exception e) {
            //
        }

        }
}