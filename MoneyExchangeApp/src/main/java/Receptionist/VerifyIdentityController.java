package Receptionist;

import com.example.moneyexchangeapp.VerifyIdentity;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class VerifyIdentityController
{
    @javafx.fxml.FXML
    private Button btnVerifyIdentity;
    @javafx.fxml.FXML
    private TextField txtVerificationResult;
    @javafx.fxml.FXML
    private TextField txtIdentityNumber;

    @javafx.fxml.FXML
    public void initialize() {
        txtVerificationResult.setEditable(false);
    }

    @javafx.fxml.FXML
    public void handleVerifyIdentity(ActionEvent actionEvent) {
        String identityNo = txtIdentityNumber.getText().trim();

        if (identityNo.isEmpty()) {
            txtVerificationResult.setText("Please enter an identity number!");
            return;
        }

        boolean isValid = identityNo.length() >= 6;

        String message = isValid
                ? "Identity Verified Successfully."
                : "Identity Verification Failed.";

        VerifyIdentity verifyResult = new VerifyIdentity(identityNo, isValid, message);

        txtVerificationResult.setText(verifyResult.getMessage());
    }
}
