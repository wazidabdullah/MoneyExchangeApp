package com.example.moneyexchangeapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
<<<<<<< HEAD
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/moneyexchangeapp/EconomicResearcher/EResearcherDashView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
=======
<<<<<<< HEAD
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Agent.fxml"));
=======
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BackupAndRestore.fxml"));
>>>>>>> 12cb7ffbe734528ef9b421d610790c4cc5e90fc5
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
>>>>>>> 4a6a6767bfe4d05fec9afcb2bc48da1e455026d4
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
