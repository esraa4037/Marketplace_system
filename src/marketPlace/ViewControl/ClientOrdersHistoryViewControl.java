package marketPlace.ViewControl;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
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
import marketPlace.Controller.ClientHomeController;
import marketPlace.Controller.MyCartController;
import marketPlace.Controller.TransactionsController;
import marketPlace.Model.Obj;
import marketPlace.Model.TableCartModel;

public class ClientOrdersHistoryViewControl implements Initializable {
	@FXML
	private Button btnBack;
	@FXML
	private TextField txtSearch;
	@FXML
	private Button logOutButton;
	@FXML
	private Text accountName;
	@FXML
	private Button product;
	@FXML
	private Button MyProfile;
	@FXML
	private Button MyCart;
	@FXML
	private TableView<Obj> table;
	@FXML
	private TableColumn<Obj, Integer> colOrderId;
	@FXML
	private TableColumn<Obj, Integer> colProductId;
	@FXML
	private TableColumn<Obj, String> colProductName;
	@FXML
	private TableColumn<Obj, Integer> colQuantity;
	@FXML
	private TableColumn<Obj, String> colDate;
	@FXML
	private TableColumn<Obj, String> colSupplier;
	ObservableList<Obj> obList = FXCollections.observableArrayList();

	
	private SimpleStringProperty acName = new SimpleStringProperty(" ");
	private ClientHomeController clcontroller = new ClientHomeController();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String firstName = clcontroller.getFirst(LoginViewControl.cAccount);
		String lastName = clcontroller.getLast(LoginViewControl.cAccount);
		String name = firstName + " " + lastName;
		acName.set(name);
		accountName.textProperty().bind(acName);
		
		obList = (new TransactionsController()).historyOfClient(LoginViewControl.cAccount.getUserName());
		colOrderId.setCellValueFactory(new PropertyValueFactory<>("orderid"));
		colProductId.setCellValueFactory(new PropertyValueFactory<>("productid"));
		colProductName.setCellValueFactory(new PropertyValueFactory<>("name"));
		colQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
		colDate.setCellValueFactory(new PropertyValueFactory<>("ordereddate"));
		colSupplier.setCellValueFactory(new PropertyValueFactory<>("supplierName"));

		table.setItems(obList);

		
	}
	
	public void backToClientHome (Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/ClientHomePage.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void productClick (Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/ProductPage.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void myProfileclick (Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/MyProfilePage.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void myCartclick (Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/MyCartPage.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void logOut (Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
		
		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/Login.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	
	
}