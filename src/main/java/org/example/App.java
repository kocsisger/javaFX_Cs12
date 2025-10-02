package org.example;

import java.io.IOException;

import com.sun.tools.javac.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.model.Model;
import org.example.model.SubModel;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        //View
        var loader = new FXMLLoader(getClass().getResource("main.fxml"));
        var scene = new Scene(loader.load());
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        //Controller
        MainController controller = (MainController) loader.getController();
        //Model
        Model model = new SubModel();
        controller.setModel(model);

        stage.setScene(scene);
        stage.setTitle("New title");
        //This is a commit
        stage.show();
    }

}
