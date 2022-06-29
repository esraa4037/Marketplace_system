package marketPlace.ViewControl;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import marketPlace.Controller.CardController;
import marketPlace.Model.Product;

public class CardViewController {
	@FXML
	private ImageView image;
	@FXML
	private Text name;
	@FXML
	private Text quantity;
	@FXML
	private Text price;
	@FXML
	private Text cartQuantity;
	@FXML
	private Button plus;
	@FXML
	private Button minus;
	private int productId;

	public void setData(Product product) {
		productId = product.getId();
		Image productImage = new Image(getClass().getResourceAsStream(product.getImageSrc()));
		image.setImage(productImage);
		name.setText(product.getName());
		quantity.setText(((Integer) product.getQuantity()).toString());
		price.setText("$ " + ((Double) product.getPrice()).toString());
		int productQuantityInCart = (new CardController())
				.getProductQuantityInCart(LoginViewControl.cAccount.getUserName(), productId);
		cartQuantity.setText(((Integer) productQuantityInCart).toString());
	}

	public void plusClicked(Event e) {
		int productQuantityInCart = (new CardController())
				.getProductQuantityInCart(LoginViewControl.cAccount.getUserName(), productId);

		if (Integer.parseInt(quantity.getText()) > productQuantityInCart) {
			(new CardController()).addOneToProductQuantityInCart(LoginViewControl.cAccount.getUserName(), productId);
			productQuantityInCart++;
			cartQuantity.setText(((Integer) productQuantityInCart).toString());
		}
	}

	public void minusClicked(Event e) {
		int productQuantityInCart = (new CardController())
				.getProductQuantityInCart(LoginViewControl.cAccount.getUserName(), productId);

		if (productQuantityInCart > 0) {
			(new CardController()).minusOneFromProductQuantityInCart(LoginViewControl.cAccount.getUserName(),
					productId);
			productQuantityInCart--;
			cartQuantity.setText(((Integer) productQuantityInCart).toString());
		}
	}

}
