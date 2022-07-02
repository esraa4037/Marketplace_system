package marketPlace.ViewControl;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import marketPlace.Controller.MyCartController;
import marketPlace.Model.TableCartModel;

public class MyCartViewController extends ClientHomeViewControl {
	@FXML
	private Button product;
	@FXML
	private Button MyCart;
	@FXML
	private Button MyProfile;
	@FXML
	private Button buyButton;
	@FXML
	private TableView<TableCartModel> table;
	@FXML
	private TableColumn<TableCartModel, String> columnProductName;
	@FXML
	private TableColumn<TableCartModel, String> columnPrice;
	@FXML
	private TableColumn<TableCartModel, Integer> columnProductId;
	@FXML
	private TableColumn<TableCartModel, Integer> columnNoOfProducts;
	@FXML
	private TableColumn<TableCartModel, CheckBox> columnSelect;
	@FXML
	private TableColumn<TableCartModel, Double> columnTotalPrice;
	static Stage confirmationStage = new Stage();
	private static Stage myStage = ClientHomeViewControl.myCartStage;
	static ObservableList<TableCartModel> obList = FXCollections.observableArrayList();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		super.initializeAccountName();
		buy();
		List<TableCartModel> cartList = (new MyCartController())
				.getCartTableContent(LoginViewControl.cAccount.getUserName());
		for (TableCartModel entry : cartList) {
			obList.add((new TableCartModel(entry.getProductId(), entry.getProductName(), entry.getPrice(),
					entry.getNoOfProducts(), entry.getTotalPrice())));
		}
		columnProductName.setCellValueFactory(new PropertyValueFactory<>("productName"));
		columnPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
		columnNoOfProducts.setCellValueFactory(new PropertyValueFactory<>("noOfProducts"));
		columnProductId.setCellValueFactory(new PropertyValueFactory<>("productId"));
		columnTotalPrice.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));
		columnSelect.setCellValueFactory(new PropertyValueFactory<>("select"));

		table.setItems(obList);
	}

	private void buy() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/marketPlace/View/Confirmation.fxml"));
		AnchorPane border;
		try {
			border = loader.load();
			Scene scene = new Scene(border);
			confirmationStage.setScene(scene);
			confirmationStage.setResizable(false);
			confirmationStage.initModality(Modality.WINDOW_MODAL);
			confirmationStage.initOwner(MyCartViewController.myStage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public void buyClicked(Event e) {

		confirmationStage.showAndWait();
	}
}
