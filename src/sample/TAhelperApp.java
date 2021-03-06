package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TAhelperApp extends Application {

    private AppView view;
    private UnzipUtility model;


    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(TAhelperApp.class.getResource("Main.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 740, 550);
        primaryStage.setTitle("TA Helper");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        // Give controller access to the main app
        Controller controller = loader.getController();
        controller.setMainApp(this, primaryStage, scene);

        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }
}
