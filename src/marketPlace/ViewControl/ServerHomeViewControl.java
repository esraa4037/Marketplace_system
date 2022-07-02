package marketPlace.ViewControl;

import java.io.IOException;
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

import javafx.scene.text.Text;
import javafx.stage.Stage;
import marketPlace.Controller.ServerHomeController;

public class ServerHomeViewControl implements Initializable {	
	
	@FXML
	private Text accountName;
	@FXML
	private Button btnHistory;
	@FXML
	private Button btnReports;
	@FXML
	private Button logOutButton;
		
	ServerHomeController shcontroller = new ServerHomeController();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		accountName.setText(shcontroller.getServerFirstName(LoginViewControl.sAccount)+ " " + shcontroller.getServerLastName(LoginViewControl.sAccount));
	}
	
	public void logOut(Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
		
		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/Login.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void isTransView(Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/TransactionsView.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void isGenReports (Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/ServerReports.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}

