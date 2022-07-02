package marketPlace.ViewControl;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
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

public class ClientHomeViewControl implements Initializable {
	@FXML
	private Text accountName;
	@FXML
	private Button logOutButton;
	@FXML
	private Button products;
	@FXML
	private Button myCart;
	@FXML
	private Button myProfile;
	private SimpleStringProperty acName = new SimpleStringProperty(" ");
	private ClientHomeController clcontroller = new ClientHomeController();
	protected static Stage myCartStage = new Stage(); 
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			initializeAccountName();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initializeAccountName() throws SQLException {
		String firstName = clcontroller.getFirst(LoginViewControl.cAccount);
		String lastName = clcontroller.getLast(LoginViewControl.cAccount);
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

	public void productClick(Event e) {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/marketPlace/View/ProductPage.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void myCartclick(Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
		Parent root;

		root = FXMLLoader.load(getClass().getResource("/marketPlace/View/MyCartPage.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}

	public void myProfileclick(Event e) {
		Node node = (Node) e.getSource();
		myCartStage = (Stage) node.getScene().getWindow();
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/marketPlace/View/MyProfilePage.fxml"));
			Scene scene = new Scene(root);
			myCartStage.setScene(scene);
			myCartStage.show();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
