package marketPlace.Controller;

import java.util.ArrayList;
import java.util.List;

import marketPlace.Model.Product;

public class ProductController {
	
	public List<Product> getProductsList() {
		List<Product> productList = new ArrayList<>();
		Product product = new Product();
		
		product.setName("Donerton Smart Watch, Fitness Tracker for Android Phones");
		product.setQuantity(20);
		product.setPrice(37.99);
		product.setImageSrc("/marketPlace/Image/61VecbkgYjL._AC_SL1500_.jpg");
		productList.add(product);
		
		product.setName("Xbox Series s");
		product.setQuantity(20);
		product.setPrice(288.99);
		product.setImageSrc("/marketPlace/Image/71NBQ2a52CL._SL1500_.jpg");
		productList.add(product);
		
		return productList;
	}

}
