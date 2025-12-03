package EconomicResearcher;

<<<<<<< HEAD
import javafx.scene.control.Label;
=======
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
>>>>>>> 2f7b428da25864eafa69eb5a19f073ee5c145b14

public class EResearcherDashViewController
{
    @javafx.fxml.FXML
    private Label AnalysisCompletedLabel;
    @javafx.fxml.FXML
    private Label ReportsPublishedLabel;
    @javafx.fxml.FXML
    private Label CollaborationsLabel;
    @javafx.fxml.FXML
    private AnchorPane EResearcherDashAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ExchangeAnalysisButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ExchangeAnalysisView.fxml"));
            Node node = loader.load();
            EResearcherDashAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void SummaryStatisticsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SummaryStatisticsView.fxml"));
            Node node = loader.load();
            EResearcherDashAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void ScheduleAnalysisButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ScheduleAnalysisView.fxml"));
            Node node = loader.load();
            EResearcherDashAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void ModelComparisonButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ModelComparisonView.fxml"));
            Node node = loader.load();
            EResearcherDashAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void CorrelationAnalysisButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CorrelationAnalysisView.fxml"));
            Node node = loader.load();
            EResearcherDashAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void CollaborationHubButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CollaborationHubView.fxml"));
            Node node = loader.load();
            EResearcherDashAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void ForecastModelsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ForecastModelView.fxml"));
            Node node = loader.load();
            EResearcherDashAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void PublishReportButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PublishReportView.fxml"));
            Node node = loader.load();
            EResearcherDashAnchorPane.getChildren().setAll(node);
        }
        catch(Exception e) {
            //
        }
    }
}