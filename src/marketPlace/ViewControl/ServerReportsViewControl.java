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
import javafx.scene.text.Text;
import javafx.stage.Stage;
import marketPlace.Controller.ServerHomeController;

public class ServerReportsViewControl implements Initializable {

	@FXML
	private Button logOutButton;
	@FXML
	private Button btnViewTransactions;
	@FXML
	private Button btnBack;
	@FXML
	private ComboBox comboReports;
	@FXML
	private Text accountName;
	
	ServerHomeController shcontroller = new ServerHomeController();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		accountName.setText(shcontroller.getServerFirstName(LoginViewControl.sAccount)+ " " + shcontroller.getServerLastName(LoginViewControl.sAccount));
		ObservableList<String> list = FXCollections.observableArrayList("Best seller products in each category", "Best selling suppliers", "Best selling suppliers for each product", "The most buying clients", "Stock of products with suppliers");
		comboReports.setItems(list);
	}
	
	public void logOut(Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
		
		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/Login.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void backToServerHome(Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
		
		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/ServerHomePage.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void openViewTransactions(Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
		
		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/TransactionsView.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
