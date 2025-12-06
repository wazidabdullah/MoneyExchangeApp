package Accountant;

import com.example.moneyexchangeapp.BackupAndRestore;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class BackupAndRestoreController
{
    private BackupAndRestore backupService;
    @javafx.fxml.FXML
    private Label lblBackupStatus;
    @javafx.fxml.FXML
    private ComboBox <String>cbDestination;
    @javafx.fxml.FXML
    private Button btnRestore;
    @javafx.fxml.FXML
    private ProgressBar progressBackup;
    @javafx.fxml.FXML
    private Button btnStartBackup;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void StartBackupButtonOnAction(ActionEvent actionEvent) {
        String destination = cbDestination.getValue();

        if (destination == null) {
            lblBackupStatus.setText("⚠ Please select backup destination!");
            return;
        }

        lblBackupStatus.setText("Backup in progress...");
        progressBackup.setProgress(0.5);

        boolean success = backupService.performBackup(destination);

        if (success) {
            progressBackup.setProgress(1.0);
            lblBackupStatus.setText("✔ Backup completed successfully!");
        } else {
            lblBackupStatus.setText("❌ Backup failed!");
        }

}

    @javafx.fxml.FXML
    public void RestoreBackupButtonOnAction(ActionEvent actionEvent) {

        lblBackupStatus.setText("Restoration in progress...");
        progressBackup.setProgress(0.6);

        boolean success = backupService.performRestore();

        if (success) {
            progressBackup.setProgress(1.0);
            lblBackupStatus.setText("✔ Restoration completed!");
        } else {
            lblBackupStatus.setText("❌ Restore failed!");
        }
    }
    }