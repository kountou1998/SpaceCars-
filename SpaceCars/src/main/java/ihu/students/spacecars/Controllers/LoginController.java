package ihu.students.spacecars.Controllers;

import ihu.students.spacecars.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private Button loginBtn;
    @FXML
    private Button registerBtn;
    @FXML
    private Label loginFailed;

    public void loginBtnOnAction(ActionEvent e) {
        Parent root = null;
        try {
            root = FXMLLoader.load(Main.class.getResource("cars.fxml"));
        } catch (IOException x) {
            throw new RuntimeException(x);
        }
        Stage window = (Stage) loginBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1250, 750));




        loginFailed.setText("Authentication failed. Please try again.");
    }



    public void registerBtnOnAction(ActionEvent e) {
        Parent root = null;
        try {
            root = FXMLLoader.load(Main.class.getResource("register.fxml"));
        } catch (IOException x) {
            throw new RuntimeException(x);
        }
        Stage window = (Stage) registerBtn.getScene().getWindow();
        window.setScene(new Scene(root, 720, 500));
    }

}