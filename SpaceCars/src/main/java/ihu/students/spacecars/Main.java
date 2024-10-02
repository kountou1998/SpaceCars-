package ihu.students.spacecars;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 500);

        Image image = new Image("file:icon.png");
        stage.getIcons().add(image);
        stage.setTitle("SpaceCars");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) throws Exception{

        DatabaseConnection.getDBConnection();
        launch();

    }
}