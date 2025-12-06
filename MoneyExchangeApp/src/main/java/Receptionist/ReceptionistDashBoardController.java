package Receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;



public class ReceptionistDashBoardController
{
    @javafx.fxml.FXML
    private Button btnGoExchangeRates;
    @javafx.fxml.FXML
    private Button btnGoAssignCounter;
    @javafx.fxml.FXML
    private Button btnLogout;
    @javafx.fxml.FXML
    private Button btnGoRegistration;
    @javafx.fxml.FXML
    private Button btnGoInteractionLog;
    @javafx.fxml.FXML
    private Button btnGoArrival;
    @javafx.fxml.FXML
    private Button btnGoKyc;
    @javafx.fxml.FXML
    private Button btnGoVerify;
    @javafx.fxml.FXML
    private Button btnGoQueue;

    @javafx.fxml.FXML
    public void initialize() {
    }
    
    private void loadPage(String fxmlFile, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML

        public void openQueue(javafx.event.ActionEvent event) {

            loadPage("QueueView.fxml", event);
    }


    @javafx.fxml.FXML
    public void openVerify(javafx.event.ActionEvent event) {
        loadPage("VerifyCustomer.fxml", event);
    }


    @javafx.fxml.FXML
    public void openRegistration(javafx.event.ActionEvent event) {
        loadPage("CustomerRegistration.fxml", event);
    }

    @javafx.fxml.FXML
    public void openExchangeRates(javafx.event.ActionEvent event) {
        loadPage("ExchangeRates.fxml", event);
    }

    @javafx.fxml.FXML
    public void handleLogout(javafx.event.ActionEvent event) {
        loadPage("Login.fxml", event);
    }
    @javafx.fxml.FXML
    public void openInteractionLog(javafx.event.ActionEvent event) {
        loadPage("InteractionLog.fxml", event);
    }


    @javafx.fxml.FXML
    public void openAssignCounter(javafx.event.ActionEvent event) {
        loadPage("AssignCounter.fxml", event);
    }

    @javafx.fxml.FXML
    public void openNewCustomerArrival(javafx.event.ActionEvent event) {
        loadPage("NewCustomerArrival.fxml", event);
    }

    @javafx.fxml.FXML
    public void openKyc(javafx.event.ActionEvent event) {
        loadPage("KycVerification.fxml", event);
    }
}