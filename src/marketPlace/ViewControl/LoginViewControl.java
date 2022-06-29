package marketPlace.ViewControl;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import marketPlace.Controller.LoginController;
import marketPlace.Model.ClientAccount;
import marketPlace.Model.ServerAccount;

public class LoginViewControl implements Initializable {
	private String userMode;
	@FXML
	private TextField userNameTextField;
	@FXML
	private PasswordField pwField;
	@FXML
	private Label errorMassageLabel;
	@FXML
	private Button signInButton;
	@FXML
	private Button signUpBotton;
	@FXML
	private ComboBox<String> userModeComboBox;
	
	static ClientAccount cAccount = new ClientAccount();
	static ServerAccount sAccount = new ServerAccount();
	LoginController lc = new LoginController();

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		ObservableList<String> list = FXCollections.observableArrayList("client mode", "server mode");
		userModeComboBox.setItems(list);

	}

	public void selectUserMode(Event e) {
		userMode = userModeComboBox.getSelectionModel().getSelectedItem().toString();
	}

	public void isSign(Event e) throws IOException {

		if (userMode == null) {
			errorMassageLabel.setText("You should select user mode");
		}
		if (userMode.equals("client mode")) {
			cAccount.setUserName(userNameTextField.getText());
			cAccount.setPassword(pwField.getText());
			if (lc.isClient(cAccount)) {
				Node node = (Node) e.getSource();
				Stage stage = (Stage) node.getScene().getWindow();

				Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/ClientHomePage.fxml"));
				Scene scene = new Scene(root);
				stage.setScene(scene);
				stage.show();
			}
		} else if (userMode.equals("server mode")) {
			sAccount.setUserName(userNameTextField.getText());
			sAccount.setPassword(pwField.getText());
			if(lc.isServer(sAccount)) {
			Node node = (Node) e.getSource();
			Stage stage = (Stage) node.getScene().getWindow();

			Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/ServerHomePage.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			}
		} else {
			errorMassageLabel.setText("User name or password is wrong");
		}

	}

	public void signUp(Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/SignUp.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
