package marketPlace.ViewControl;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import marketPlace.Controller.SignUpController;

import marketPlace.Model.ClientAccount;

public class SignUpViewController implements Initializable {
    @FXML
    private TextField Username;
    @FXML
    private TextField pwfield;
    @FXML
    private TextField FirstName;
    @FXML
    private TextField LastName;
    @FXML 
    private TextField PostalCode;
    @FXML
    private TextField email;
    @FXML
    private Button SignUp;
    @FXML
    private Button Login;
    @FXML
    private Label errorMessageLabel;
    @FXML
    private TextField Phone;
    @FXML
    private TextField Address;
    static ClientAccount cAccount = new ClientAccount();
    SignUpController Signup = new SignUpController();
    public void SignUp(Event e) throws IOException{
        cAccount.setUserName(Username.getText());
        cAccount.setPassword(pwfield.getText());
        cAccount.setFirstName(FirstName.getText());
        cAccount.setLastName(LastName.getText());
        cAccount.setPostalCode(parseInt(PostalCode.getText()));
        cAccount.setEmail(email.getText());
        cAccount.setPhone(Phone.getText());
        cAccount.setAddress(Address.getText());
       
    }
    @FXML
    public void signUp(Event e) throws IOException {
            if(Username.getText().isEmpty()||pwfield.getText().isEmpty()||FirstName.getText().isEmpty()){
                errorMessageLabel.setText("Please fill the required fields!");
                }
            else{   
                Node node = (Node) e.getSource();
                Stage stage = (Stage) node.getScene().getWindow();

                Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/Congrats.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }    
                
        } 
    @FXML
    public void logIn(Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/Login.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
        }    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
    
    
    

}
