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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import marketPlace.Controller.ClientHomeController;
import marketPlace.Controller.MyProfileController;

public class MyProfileViewController extends ClientHomeViewControl implements Initializable{
	@FXML
	private Button product;
	@FXML
	private Button MyCart;
	@FXML
	private Button MyProfile;
	@FXML
	private TableView table;
	@FXML
	private TableColumn col1;
	@FXML
	private TableColumn col2;
	@FXML
	private Button btnViewHistory;
	@FXML
	private Text txtBalance;
	@FXML
	private Button btnDeposit;
	@FXML
	private TextField txtDeposit;
	@FXML
	private Label lblMsg;
	@FXML
	private Label txtname;
	@FXML
	private Label txtusername;
	@FXML
	private Label txtemail;
	@FXML
	private Label txtphone;
	@FXML
	private Label txtaddress;
	@FXML
	private Label txtpostalcode;
	@FXML
	private Text accountName;
	
	
	private SimpleStringProperty acName = new SimpleStringProperty(" ");
	private ClientHomeController clcontroller = new ClientHomeController();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		super.initializeAccountName();
		String userName = LoginViewControl.cAccount.getUserName();
		int balance = (new MyProfileController()).getBalance(userName);
		txtBalance.setText(String.valueOf(balance));
		
		String firstName = clcontroller.getFirst(LoginViewControl.cAccount);
		String lastName = clcontroller.getLast(LoginViewControl.cAccount);
		String name = firstName + " " + lastName;
		acName.set(name);
		accountName.textProperty().bind(acName);
		
		lblMsg.setText("");
		txtname.setText((new MyProfileController()).getFirstName(userName)+ " " + (new MyProfileController()).getLastName(userName));
		txtusername.setText((new MyProfileController()).getUserName(userName));
		txtemail.setText((new MyProfileController()).getEmail(userName));
		txtphone.setText((new MyProfileController()).getPhone(userName));
		txtaddress.setText((new MyProfileController()).getAddress(userName));
		txtpostalcode.setText(String.valueOf((new MyProfileController()).getPostalCode(userName)));
	}
	
	public void productClick(Event e) {
		super.productClick(e);
	}

	public void myCartclick(Event e) throws IOException {
		super.myCartclick(e);
	}

	public void myProfileclick(Event e) {
		super.myProfileclick(e);
	}
	public void viewHistoryClicked (Event e) throws IOException {
		Node node = (Node) e.getSource();
		Stage stage = (Stage) node.getScene().getWindow();

		Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/ClientOrdersHistory.fxml"));
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
	
	public void depositClicked (Event e) {
		if (txtDeposit.getText().isBlank() || Integer.parseInt(txtDeposit.getText()) <= 0) {
			lblMsg.setText("Please enter a valid value");
		} else {
			String userName = LoginViewControl.cAccount.getUserName();
			int balance = (new MyProfileController()).getBalance(userName);
			int deposit = Integer.parseInt(txtDeposit.getText());
			LoginViewControl.cAccount.setBalance(balance + deposit);
			txtBalance.setText(String.valueOf(LoginViewControl.cAccount.getBalance()));
			lblMsg.setText("Deposit added successfully!");
		}
	}
	
}
