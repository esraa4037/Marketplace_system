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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.scene.text.Text;
import javafx.stage.Stage;
import marketPlace.Controller.ServerHomeController;
import marketPlace.Controller.TransactionsController;

import marketPlace.Model.obj;

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
	private Text accountName;
	@FXML
	private TableView<obj> table;
	@FXML
	private TableColumn<obj, String> colClientName;
	@FXML
	private TableColumn<obj, Integer> colClientId;
	@FXML
	private TableColumn<obj, Integer> colOrderId;
	@FXML
	private TableColumn<obj, Integer> colProductId;
	@FXML
	private TableColumn<obj, Integer> colProductName;
	@FXML
	private TableColumn<obj, Integer> colQuantity;
	@FXML
	private TableColumn<obj, String> colDate;
	@FXML
	private TableColumn<obj, String> colSupplier;
	ObservableList<obj> obList = FXCollections.observableArrayList();

//	
//	ServerHomeController shcontroller = new ServerHomeController();
//	TransactionsController trcontroller = new TransactionsController();
//	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		accountName.setText(shcontroller.getServerFirstName(LoginViewControl.sAccount)+ " " + shcontroller.getServerLastName(LoginViewControl.sAccount));
		obList = (new TransactionsController()).historyOfClient(LoginViewControl.cAccount.getUserName());
		colOrderId.setCellValueFactory(new PropertyValueFactory<>("orderid"));
		colProductId.setCellValueFactory(new PropertyValueFactory<>("productid"));
		colProductName.setCellValueFactory(new PropertyValueFactory<>("name"));
		colQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
		colDate.setCellValueFactory(new PropertyValueFactory<>("ordereddate"));
		colSupplier.setCellValueFactory(new PropertyValueFactory<>("supplierName"));
		colClientName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		colClientId.setCellValueFactory(new PropertyValueFactory<>("clientid"));

		table.setItems(obList);
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

