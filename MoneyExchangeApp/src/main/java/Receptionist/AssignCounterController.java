package Receptionist;

import com.example.moneyexchangeapp.AssignCounter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class AssignCounterController
{
    @javafx.fxml.FXML
    private TextField txtCounterNumber;
    @javafx.fxml.FXML
    private TextField txtWaitTime;
    @javafx.fxml.FXML
    private TextField txtTokenNumber;
    @javafx.fxml.FXML
    private Button btnGenerateToken;
    @javafx.fxml.FXML
    private ComboBox <String>cmbServiceType;
    @javafx.fxml.FXML
    private Button btnPrintToken;

    private AssignCounter currentToken;

    @javafx.fxml.FXML
    public void initialize() {
        ObservableList<String> services = FXCollections.observableArrayList(
                "Cash Deposit", "Cash Withdrawal", "Account Opening", "Customer Support"
        );
        cmbServiceType.setItems(services);
        cmbServiceType.getSelectionModel().selectFirst();
    }


    @javafx.fxml.FXML
    public void handleGenerateToken(ActionEvent actionEvent) {
        Random random = new Random();

        String tokenNumber = "T" + (1000 + random.nextInt(9000));

        String counterNumber = String.valueOf(1 + random.nextInt(5));

        int waitMinutes = 5 + random.nextInt(20);

        String serviceType = cmbServiceType.getSelectionModel().getSelectedItem();

        currentToken = new AssignCounter(tokenNumber, counterNumber, waitMinutes + " min", serviceType);

        txtTokenNumber.setText(currentToken.getTokenNumber());
        txtCounterNumber.setText(currentToken.getCounterNumber());
        txtWaitTime.setText(currentToken.getWaitTime());

        System.out.println("Generated Token: " + currentToken.getTokenNumber()
                + " | Counter: " + currentToken.getCounterNumber()
                + " | Service: " + currentToken.getServiceType()
                + " | Wait: " + currentToken.getWaitTime());
    }


    @javafx.fxml.FXML
    public void handlePrintToken(ActionEvent actionEvent) {
        if (currentToken == null) {
            System.out.println("No token generated yet!");
            return;
        }

        String printMessage = "----- Token Receipt -----\n" +
                "Token Number: " + currentToken.getTokenNumber() + "\n" +
                "Counter: " + currentToken.getCounterNumber() + "\n" +
                "Service: " + currentToken.getServiceType() + "\n" +
                "Estimated Wait: " + currentToken.getWaitTime() + "\n" +
                "Time: " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "\n" +
                "------------------------";

        System.out.println(printMessage);

        txtTokenNumber.clear();
        txtCounterNumber.clear();
        txtWaitTime.clear();
        currentToken = null;
    }
}
