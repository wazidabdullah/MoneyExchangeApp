package com.example.moneyexchangeapp.EconomicResearcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.time.LocalDate;

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
    @javafx.fxml.FXML
    private AnchorPane ScheduleAnalysisAnchorPane;
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

        File file = new File("data/ScheduleAnalysis.bin");
        try{

            FileOutputStream fos = new FileOutputStream(file);

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("ScheduleAnalysis");
            oos.close();
            System.out.println("Object Stored Succesfully");
        } catch (IOException e){
            System.out.println("Failed to Write Object!");

        }

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            ScheduleAnalysis scheduleAnalysis = (ScheduleAnalysis) ois.readObject();

        } catch (IOException e){
            //
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        //ScheduledAnalysisList.add(a);
    }

    @javafx.fxml.FXML
    public void HomeButtonOnAction(ActionEvent actionEvent) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EResearcherDashView.fxml"));
            Node node = loader.load();
            ScheduleAnalysisAnchorPane.getChildren().setAll(node);
        } catch (Exception e) {
            //
        }
    }
}