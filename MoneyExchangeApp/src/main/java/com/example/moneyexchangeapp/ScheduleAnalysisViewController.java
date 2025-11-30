package com.example.moneyexchangeapp;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class ScheduleAnalysisViewController
{
    @javafx.fxml.FXML
    private CheckBox EmailNotificationCheckBox;
    @javafx.fxml.FXML
    private TableColumn<ScheduleAnalysis , LocalDate> ScheduledDateTableColumn;
    @javafx.fxml.FXML
    private DatePicker ScheduledDateDatePicker;
    @javafx.fxml.FXML
    private TableView<ScheduleAnalysis> ScheduleAnalysisTableView;
    @javafx.fxml.FXML
    private TableColumn<ScheduleAnalysis , Boolean> EmailNotificationTableColumn;
    @javafx.fxml.FXML
    private TextField AnalysisTypeTextField;
    @javafx.fxml.FXML
    private TableColumn<ScheduleAnalysis , String> AnalysisTypeTableColumn;
    //private final ArrayList<ScheduleAnalysis> ScheduledAnalysisList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        AnalysisTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("analysisType"));
        ScheduledDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("scheduledDate"));
        EmailNotificationTableColumn.setCellValueFactory(new PropertyValueFactory<>("emailNotificationText"));
    }
    @javafx.fxml.FXML
    public void ScheduleAnalysisButtonOnAction(ActionEvent actionEvent) {

        String analysisType = AnalysisTypeTextField.getText();
        LocalDate date = ScheduledDateDatePicker.getValue();
        boolean sendEmail = EmailNotificationCheckBox.isSelected();

        if (analysisType.isEmpty() || date == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Missing Information!");
            alert.setContentText("Please enter analysis type and select a date.");
            alert.show();
            return;
        }
        ScheduleAnalysis a = new ScheduleAnalysis(analysisType, date, sendEmail);

        ScheduleAnalysisTableView.getItems().add(a);

        //ScheduledAnalysisList.add(a);
    }

    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {
    }
}