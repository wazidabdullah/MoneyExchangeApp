package Receptionist;

import com.example.moneyexchangeapp.CustomerRegistration;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Random;

public class CustomerRegistrationController
{
    @javafx.fxml.FXML
    private TextField txtContact;
    @javafx.fxml.FXML
    private TableColumn <CustomerRegistration, String>colCustomerName;
    @javafx.fxml.FXML
    private TableColumn <CustomerRegistration, String> colContactNumber;
    @javafx.fxml.FXML
    private TextField txtPurpose;
    @javafx.fxml.FXML
    private TableColumn <CustomerRegistration, String> colCustomerID;
    @javafx.fxml.FXML
    private TextField txtCustomerName;
    @javafx.fxml.FXML
    private Button btnSubmitRegistration;
    @javafx.fxml.FXML
    private TextField txtGeneratedCustomerId;
    @javafx.fxml.FXML
    private TableView <CustomerRegistration>tblCustomers;

    private ObservableList<CustomerRegistration> customerData = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        colCustomerID.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        colCustomerName.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        colContactNumber.setCellValueFactory(new PropertyValueFactory<>("contactNumber"));

        tblCustomers.setItems(customerData);

        generateCustomerId();

    }
        private void generateCustomerId() {
            Random random = new Random();
            String id = "CUST" + (1000 + random.nextInt(9000));
            txtGeneratedCustomerId.setText(id);
        }


    @javafx.fxml.FXML
    public void handleSubmitRegistration(ActionEvent actionEvent) {
        String customerId = txtGeneratedCustomerId.getText();
        String name = txtCustomerName.getText();
        String contact = txtContact.getText();
        String purpose = txtPurpose.getText();

        if (name.isEmpty() || contact.isEmpty() || purpose.isEmpty()) {
            System.out.println("All fields are required!");
            return;
        }

        CustomerRegistration newCustomer = new CustomerRegistration(customerId, name, contact, purpose);
        customerData.add(newCustomer);

        System.out.println("Customer Registered: " + customerId + " - " + name);

        txtCustomerName.clear();
        txtContact.clear();
        txtPurpose.clear();
        generateCustomerId();
    }
}
