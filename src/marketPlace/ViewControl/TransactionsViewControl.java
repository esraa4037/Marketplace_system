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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import marketPlace.Controller.ServerHomeController;

public class TransactionsViewControl implements Initializable {
	@FXML
	private Button logOutButton;
	@FXML
	private TextField txtSearch;
	@FXML
	private Button btnBack;
	@FXML
	private Button btnSearch;
	@FXML
	private Button btnGenRep;
	@FXML
	private TableView table;
	@FXML
	private TableColumn colClientId;
	@FXML
	private TableColumn colClientName;
	@FXML
	private TableColumn colOrderId;
	@FXML
	private TableColumn colProductId;
	@FXML
	private TableColumn colProductName;
	@FXML
	private TableColumn colQuantity;
	@FXML
	private TableColumn colDate;
	@FXML
	private TableColumn colTime;
	@FXML
	private TableColumn colSupplier;
	@FXML
	private Text accountName;
	
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
	
	
	public void backToServerHome(Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
		
		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/ServerHomePage.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void openGenRep(Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
		
		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/ServerReports.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}
