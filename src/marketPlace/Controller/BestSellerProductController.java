package marketPlace.Controller;

import java.util.ArrayList;
import java.util.List;

import marketPlace.Model.BestSellerProduct;

public class BestSellerProductController {
	public String getBestCategory(BestSellerProduct bsproduct) {
		bsproduct.setCategory("Fruits");
		return bsproduct.getCategory();
	}
	
	public int getBestProductID (BestSellerProduct bsproduct) {
		bsproduct.setProductID(15);
		return bsproduct.getProductID();
	}
	
	public String getBestProductName (BestSellerProduct bsproduct) {
		bsproduct.setProductName("Apple");
		return bsproduct.getProductName();
	}
	
	public List<BestSellerProduct> getListOfBestProducts() {
		List<BestSellerProduct> bpList = new ArrayList<BestSellerProduct>();
		bpList.add(new BestSellerProduct("Fruits", 13, "Apple"));
		bpList.add(new BestSellerProduct("Bakery", 100, "Cookies"));
		bpList.add(new BestSellerProduct("Toys", 168, "Doll"));
		bpList.add(new BestSellerProduct("Bakery", 100, "Cookies"));
		bpList.add(new BestSellerProduct("Toys", 168, "Doll"));
		bpList.add(new BestSellerProduct("Fruits", 13, "Apple"));
		bpList.add(new BestSellerProduct("Fruits", 13, "Apple"));
		bpList.add(new BestSellerProduct("Bakery", 100, "Cookies"));
		bpList.add(new BestSellerProduct("Toys", 168, "Doll"));
		bpList.add(new BestSellerProduct("Bakery", 100, "Cookies"));
		bpList.add(new BestSellerProduct("Toys", 168, "Doll"));
		bpList.add(new BestSellerProduct("Fruits", 13, "Apple"));
		bpList.add(new BestSellerProduct("Bakery", 100, "Cookies"));
		
		return bpList;
	}
}
