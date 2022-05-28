package marketPlace.ViewControl;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import marketPlace.Controller.ClientHomeController;

public class ClientHomeViewControl implements Initializable{
	@FXML
	private Text accountName;
	@FXML
	private Button logOutButton;
	private SimpleStringProperty acName = new SimpleStringProperty(" ");
	private ClientHomeController clcontroller = new ClientHomeController();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String firstName = clcontroller.getFirst(LoginViewControl.account);
		String lastName = clcontroller.getLast(LoginViewControl.account);
		String name = firstName + " " + lastName;
		acName.set(name);
		accountName.textProperty().bind(acName);
	}
	
	public void logOut(Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
		
		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/Login.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
