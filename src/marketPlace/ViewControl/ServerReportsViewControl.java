package marketPlace.ViewControl;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import marketPlace.Controller.BestSellerProductController;
import marketPlace.Controller.ProductStockController;
import marketPlace.Controller.ServerHomeController;
import marketPlace.Model.BestSellerProduct;
import marketPlace.Model.ProductStock;

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
	@FXML
	private TableView table;
	@FXML
	private TableColumn col1;
	@FXML
	private TableColumn col2;
	@FXML
	private TableColumn col3;
	@FXML
	private TableColumn col4;
	//s@FXML
	//private TextField txtSearch;
	@FXML
	private Button btnSearch;
	
	//private String comboChoice;
	
	ServerHomeController shcontroller = new ServerHomeController();
	ObservableList<BestSellerProduct> bList1 = FXCollections.observableArrayList();
	ObservableList<ProductStock> bList5 = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			accountName.setText(shcontroller.getServerFirstName(LoginViewControl.sAccount)+ " " + shcontroller.getServerLastName(LoginViewControl.sAccount));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObservableList<String> list = FXCollections.observableArrayList("Best seller products in each category", "The most buying clients", "Stock of Remaining Products");
		//comboReports.setItems(list);
		col1.setVisible(false);
		col2.setVisible(false);
		col3.setVisible(false);
		col4.setVisible(false);
		
		//txtSearch.setPromptText("Search");
		
		List<BestSellerProduct> bslist1 = (new BestSellerProductController()).getListOfBestProducts();
		List<ProductStock> bslist5 = (new ProductStockController()).getListOfProductStock();
		
		
		for (BestSellerProduct entry : bslist1) {
			bList1.add(new BestSellerProduct(entry.getCategory(), entry.getProductID(), entry.getProductName()));
		}
		for (ProductStock entry : bslist5) {
			bList5.add(new ProductStock(entry.getId(), entry.getName(), entry.getQuantity(), entry.getSupplierName()));
		}
		
		col1.setVisible(true);
		col1.setText("Product ID");
		col1.setMinWidth(200);
		col2.setVisible(true);
		col2.setText("Product Name");
		col2.setMinWidth(200);
		col3.setVisible(true);
		col3.setText("Remaining Quantity");
		col3.setMinWidth(200);
		col4.setVisible(true);
		col4.setText("Supplier");
		col4.setMinWidth(200);
		
		//txtSearch.setPromptText("Search with Product ID");
		
		
		col1.setCellValueFactory(new PropertyValueFactory<ProductStock, Integer>("id"));
		col2.setCellValueFactory(new PropertyValueFactory<ProductStock, String>("name"));
		col3.setCellValueFactory(new PropertyValueFactory<ProductStock, Integer>("quantity"));
		col4.setCellValueFactory(new PropertyValueFactory<ProductStock, Integer>("supplierName"));
		
		table.setItems(FXCollections.observableArrayList());
		table.setItems(bList5);

	}
//	public void searchClicked (Event e) {
//		String txt = txtSearch.getText();
//		
//	}
	
	
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
