package Accountant;

import com.example.moneyexchangeapp.Reconciliation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ReconciliationController
{
    @javafx.fxml.FXML
    private Button btnStartRecon;
    @javafx.fxml.FXML
    private TableColumn <Reconciliation, Double>colBankAmount;
    @javafx.fxml.FXML
    private TextField txtAdjustment;
    @javafx.fxml.FXML
    private Button btnCorrect;
    @javafx.fxml.FXML
    private TableColumn <Reconciliation, Double>colDifference;
    @javafx.fxml.FXML
    private TableColumn <Reconciliation, Double>colSystemAmount;
    @javafx.fxml.FXML
    private Button btnImportBank;
    @javafx.fxml.FXML
    private TableColumn <Reconciliation, String>colStatus;
    @javafx.fxml.FXML
    private TableView <Reconciliation> tblReconciliation;

    private ObservableList<Reconciliation> reconData = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        colBankAmount.setCellValueFactory(new PropertyValueFactory<>("bankAmount"));
        colSystemAmount.setCellValueFactory(new PropertyValueFactory<>("systemAmount"));
        colDifference.setCellValueFactory(new PropertyValueFactory<>("difference"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        tblReconciliation.setItems(reconData);
    }

    @javafx.fxml.FXML
    public void handleStartRecon(ActionEvent actionEvent) {

        for (Reconciliation r : reconData) {
            r.setBankAmount(r.getBankAmount());
        }

        tblReconciliation.refresh();
        System.out.println("Reconciliation completed.");
    }


    @javafx.fxml.FXML
    public void handleImport(ActionEvent actionEvent) {
        reconData.addAll(
                new Reconciliation(10000, 9800),
                new Reconciliation(15000, 15000),
                new Reconciliation(8700, 9000)
        );

        System.out.println("Bank file imported.");
    }
}