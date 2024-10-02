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

public class RegisterController {

    @FXML
    private Button loginBtn;
    @FXML
    private Button registerBtn;
    @FXML
    private Label registerFailed;

    public void loginBtnOnAction(ActionEvent e) {
        Parent root = null;
        try {
            root = FXMLLoader.load(Main.class.getResource("login.fxml"));
        } catch (IOException x) {
            throw new RuntimeException(x);
        }
        Stage window = (Stage) registerBtn.getScene().getWindow();
        window.setScene(new Scene(root, 720, 500));

    }
    public void registerBtnOnAction(ActionEvent e) {

        registerFailed.setText("Register Completed. Please login.");

    }


}
