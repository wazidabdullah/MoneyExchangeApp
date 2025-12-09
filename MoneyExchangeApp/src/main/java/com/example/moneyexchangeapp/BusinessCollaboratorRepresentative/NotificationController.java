package com.example.moneyexchangeapp.BusinessCollaboratorRepresentative;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NotificationController {

    @FXML private TextField userIdField;
    @FXML private TextField departmentField;
    @FXML private TextArea messageArea;
    @FXML private Label statusLabel;

    private NotificationManager notificationManager = new NotificationManager();

    @FXML
    void onSendUserAlert(ActionEvent event) {
        String user = userIdField.getText();
        String msg = messageArea.getText();

        if (user.isEmpty() || msg.isEmpty()) {
            statusLabel.setText("Error: User ID and Message required.");
            return;
        }

        notificationManager.sendRealTimeAlert(user, msg);
        statusLabel.setText("Alert sent to User: " + user);
    }

    @FXML
    void onNotifyDepartment(ActionEvent event) {
        String dept = departmentField.getText();
        String msg = messageArea.getText();

        if (dept.isEmpty()) {
            statusLabel.setText("Error: Department required.");
            return;
        }

        notificationManager.notifyTeams(dept, msg);
        statusLabel.setText("Email sent to " + dept + " Department.");
    }
}
