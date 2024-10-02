package ihu.students.spacecars.Controllers;

import ihu.students.spacecars.DatabaseConnection;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import org.w3c.dom.events.MouseEvent;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AddCars implements Initializable {
    @FXML
    private TextField idAdd;

    @FXML
    private TextField madeAdd;

    @FXML
    private TextField modelAdd;

    @FXML
    private TextField yearAdd;

    @FXML
    private TextField priceAdd;





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    @FXML
    private void save() {
        String id = idAdd.getText();
        String made = madeAdd.getText();
        String model = modelAdd.getText();
        String year = yearAdd.getText();
        String price = priceAdd.getText();

        try {
            DatabaseConnection.statement.executeQuery("SELECT add_car("+id+", '"+made+"', '"+model+"', "+year+", "+price+");");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    private void clean() {
        idAdd.setText(null);
        madeAdd.setText(null);
        modelAdd.setText(null);
        yearAdd.setText(null);
        priceAdd.setText(null);

    }

}
