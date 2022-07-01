package marketPlace.Controller;

public class CardController {
	// given client id and product id, retrieve the quantity of
	// that product in the cart of that client
	public int getProductQuantityInCart(String clientUserName, int productId) {
		// this is just a stub
		return 0;
	}
	
	public void addOneToProductQuantityInCart(String clientUserName, int productId) {
		// ProductQuantityInCart ++;
	}
	
	public void minusOneFromProductQuantityInCart(String clientUserName, int productId){
		// ProductQuantityInCart --;
	}
}
