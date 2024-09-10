package org.example.csc311_assignmentlab02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240); //set the scene size
        stage.setTitle("Loan Calculator"); //set the title of the stage
        stage.setScene(scene); //set the scene
        stage.show(); //show the stage
    }

    public static void main(String[] args) {
        launch();
    }
}