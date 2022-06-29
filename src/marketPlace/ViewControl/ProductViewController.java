package marketPlace.ViewControl;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import marketPlace.Controller.ProductController;
import marketPlace.Model.Product;

public class ProductViewController extends ClientHomeViewControl implements Initializable {
	@FXML
	private HBox cardLayout = new HBox();
	@FXML
	private GridPane productContainer;
	private List<Product> productsList;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		productsList = new ArrayList<>((new ProductController()).getProductsList());
		try {
			for (int i = 0; i < productsList.size(); i++) {
				FXMLLoader fxmlLoader = new FXMLLoader();
				fxmlLoader.setLocation(getClass().getResource("/marketPlace/View/Product.fxml"));
				VBox cardBox = fxmlLoader.load();
				CardViewController cardViewController = fxmlLoader.getController();
				cardViewController.setData(productsList.get(i));
				cardLayout.getChildren().add(cardBox);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
