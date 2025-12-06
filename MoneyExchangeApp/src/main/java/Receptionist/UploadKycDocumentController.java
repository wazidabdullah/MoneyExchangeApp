package Receptionist;

import com.example.moneyexchangeapp.UploadKycDocument;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;

public class UploadKycDocumentController
{
    @javafx.fxml.FXML
    private TextField txtDocNumber;
    @javafx.fxml.FXML
    private Label lblKycStatus;
    @javafx.fxml.FXML
    private TextField txtDocPath;
    @javafx.fxml.FXML
    private ComboBox <String> cmbDocType;
    @javafx.fxml.FXML
    private Button btnUploadDoc;
    @javafx.fxml.FXML
    private Button btnSelectDoc;

    @javafx.fxml.FXML
    public void initialize() {
        cmbDocType.getItems().addAll(
                "NID",
                "Passport",
                "Driving License",
                "Birth Certificate",
                "Trade License"
        );
    }


    @javafx.fxml.FXML
    public void handleSelectDocument(ActionEvent actionEvent) {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select KYC Document");

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("PDF Files", "*.pdf"),
                new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.jpeg", "*.png")
        );

        File file = fileChooser.showOpenDialog(null);

        if (file != null) {
            txtDocPath.setText(file.getAbsolutePath());
            lblKycStatus.setText("Document selected ✔");
        }
    }

    @javafx.fxml.FXML
    public void handleUploadDocument(ActionEvent actionEvent) {
        String docType = cmbDocType.getValue();
        String docNumber = txtDocNumber.getText();
        String docPath = txtDocPath.getText();

        if (docType == null || docNumber.isEmpty() || docPath.isEmpty()) {
            lblKycStatus.setText("⚠ Please fill all fields and select document!");
            return;
        }

        UploadKycDocument doc = new UploadKycDocument(docType, docNumber, docPath);

        System.out.println("KYC Document Uploaded:");
        System.out.println("Type: " + doc.getDocType());
        System.out.println("Number: " + doc.getDocNumber());
        System.out.println("Path: " + doc.getDocPath());

        lblKycStatus.setText("✔ Document uploaded successfully!");

        cmbDocType.setValue(null);
        txtDocNumber.clear();
        txtDocPath.clear();
    }
}
