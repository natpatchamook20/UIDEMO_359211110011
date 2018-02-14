import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.loginModel;
import sun.security.util.Password;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

private loginModel model = new loginModel();

@FXML
private Label dbStatus;
@FXML
private Label loginStatus;
@FXML
    private TextField username;
@FXML
private PasswordField password;
@FXML
private Button btnLogin;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (this.model.isDatabaseConnection()) {

            this.dbStatus.setText("Connected to DB");
        }else {
            this.dbStatus.setText("Not Connect to DB");
        }

    }
}//class
