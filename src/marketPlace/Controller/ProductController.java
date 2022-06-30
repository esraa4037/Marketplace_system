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

		product.setName("Donerton Smart Watch, Fitness Tracker for Android Phones");
		product.setQuantity(20);
		product.setPrice(37.99);
		product.setImageSrc("/marketPlace/Image/61VecbkgYjL._AC_SL1500_.jpg");
		productList.add(product);

		product.setName("Donerton Smart Watch, Fitness Tracker for Android Phones");
		product.setQuantity(20);
		product.setPrice(37.99);
		product.setImageSrc("/marketPlace/Image/61VecbkgYjL._AC_SL1500_.jpg");
		productList.add(product);

		product.setName("Donerton Smart Watch, Fitness Tracker for Android Phones");
		product.setQuantity(20);
		product.setPrice(37.99);
		product.setImageSrc("/marketPlace/Image/61VecbkgYjL._AC_SL1500_.jpg");
		productList.add(product);

		product.setName("Donerton Smart Watch, Fitness Tracker for Android Phones");
		product.setQuantity(20);
		product.setPrice(37.99);
		product.setImageSrc("/marketPlace/Image/61VecbkgYjL._AC_SL1500_.jpg");
		productList.add(product);

		Product product2 = new Product();
		product2.setName("Xbox Series s");
		product2.setQuantity(20);
		product2.setPrice(288.99);
		product2.setImageSrc("/marketPlace/Image/71NBQ2a52CL._SL1500_.jpg");
		productList.add(product2);

		product2.setName("Xbox Series s");
		product2.setQuantity(20);
		product2.setPrice(288.99);
		product2.setImageSrc("/marketPlace/Image/71NBQ2a52CL._SL1500_.jpg");
		productList.add(product2);

		product2.setName("Xbox Series s");
		product2.setQuantity(20);
		product2.setPrice(288.99);
		product2.setImageSrc("/marketPlace/Image/71NBQ2a52CL._SL1500_.jpg");
		productList.add(product2);

		product2.setName("Xbox Series s");
		product2.setQuantity(20);
		product2.setPrice(288.99);
		product2.setImageSrc("/marketPlace/Image/71NBQ2a52CL._SL1500_.jpg");
		productList.add(product2);

		product2.setName("Xbox Series s");
		product2.setQuantity(20);
		product2.setPrice(288.99);
		product2.setImageSrc("/marketPlace/Image/71NBQ2a52CL._SL1500_.jpg");
		productList.add(product2);

		product2.setName("Xbox Series s");
		product2.setQuantity(20);
		product2.setPrice(288.99);
		product2.setImageSrc("/marketPlace/Image/71NBQ2a52CL._SL1500_.jpg");
		productList.add(product2);
		
		product2.setName("Xbox Series s");
		product2.setQuantity(20);
		product2.setPrice(288.99);
		product2.setImageSrc("/marketPlace/Image/71NBQ2a52CL._SL1500_.jpg");
		productList.add(product2);
		
		product.setName("Donerton Smart Watch, Fitness Tracker for Android Phones");
		product.setQuantity(20);
		product.setPrice(37.99);
		product.setImageSrc("/marketPlace/Image/61VecbkgYjL._AC_SL1500_.jpg");
		productList.add(product);

		product.setName("Donerton Smart Watch, Fitness Tracker for Android Phones");
		product.setQuantity(20);
		product.setPrice(37.99);
		product.setImageSrc("/marketPlace/Image/61VecbkgYjL._AC_SL1500_.jpg");
		productList.add(product);


		return productList;
	}

	public List<Product> getGategoryList(String category) {
		if (category.equals("Games")) {
			List<Product> productList = new ArrayList<Product>();
			Product product2 = new Product();
			product2.setName("Xbox Series s");
			product2.setQuantity(20);
			product2.setPrice(288.99);
			product2.setImageSrc("/marketPlace/Image/71NBQ2a52CL._SL1500_.jpg");
			productList.add(product2);
			return productList;
		}
		if (category.equals("Food")) {
			List<Product> productList = new ArrayList<Product>();
			Product product2 = new Product();
			product2.setName("Bizza");
			product2.setQuantity(20);
			product2.setPrice(288.99);
			product2.setImageSrc("/marketPlace/Image/71NBQ2a52CL._SL1500_.jpg");
			productList.add(product2);
			return productList;
		}
		
		return getProductsList();
	}

//	public List<Product> searchByCatecory(String item, String category){
//		
//		
//	}
}
