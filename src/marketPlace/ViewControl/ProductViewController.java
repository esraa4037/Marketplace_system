package marketPlace.ViewControl;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import marketPlace.Controller.ProductController;
import marketPlace.Model.Product;

public class ProductViewController extends ClientHomeViewControl implements Initializable {
	@FXML
	private Button product;
	@FXML
	private Button MyCart;
	@FXML
	private Button MyProfile;
	@FXML
	private String category = "All";
	@FXML
	private ComboBox<String> categoryCombo = new ComboBox<String>();
	@FXML
	private HBox cardLayout = new HBox();
	@FXML
	private GridPane productContainer = new GridPane();
	private List<Product> productsList;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		super.initializeAccountName();
		initializeCombo();
		selectCat();
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
	
	private void initializeCombo() {
		ObservableList<String> list = FXCollections.observableArrayList("All", "Electronics", "Games", "Sports",
				"Beauty Care", "Clothes", "Food");

		categoryCombo.setItems(list);
	}

	public void selectCat() {
		productsList = new ArrayList<>((new ProductController()).getGategoryList(category));
		int column = 0;
		int row = 1;
		try {
			for (Product product : productsList) {
				FXMLLoader fxmlLoader = new FXMLLoader();
				fxmlLoader.setLocation(getClass().getResource("/marketPlace/View/Product.fxml"));
				VBox cardBox;

				cardBox = fxmlLoader.load();

				CardViewController cardViewController = fxmlLoader.getController();
				cardViewController.setData(product);

				if (column == 4) {
					column = 0;
					++row;
		}

				productContainer.add(cardBox, column++, row);
				GridPane.setMargin(cardBox, new Insets(10));

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showAllProducts() {

		productsList = new ArrayList<>((new ProductController()).getProductsList());
		int column = 0;
		int row = 1;
		try {
			for (Product product : productsList) {
				FXMLLoader fxmlLoader = new FXMLLoader();
				fxmlLoader.setLocation(getClass().getResource("/marketPlace/View/Product.fxml"));
				VBox cardBox = fxmlLoader.load();
				CardViewController cardViewController = fxmlLoader.getController();
				cardViewController.setData(product);

				if (column == 4) {
					column = 0;
					++row;
				}

				productContainer.add(cardBox, column++, row);
				GridPane.setMargin(cardBox, new Insets(10));
//				cardLayout.getChildren().add(cardBox);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectCategory(Event e) throws IOException {
		category = categoryCombo.getSelectionModel().getSelectedItem().toString();
		if (category != null) {
			if (category.equals("All")) {
				showAllProducts();
				return;
			}
			selectCat();
		}
	}

	public void searchByCatecory() {

	}

}
