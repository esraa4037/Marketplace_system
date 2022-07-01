package marketPlace.Controller;

import java.util.ArrayList;
import java.util.List;

import marketPlace.Model.ProductStock;

public class ProductStockController {
	public int getProductId(ProductStock product) {
		product.setId(12);
		return product.getId();
	}
	
	public String getProductName(ProductStock product) {
		product.setName("Banana");
		return product.getName();
	}
	
	public int getProductQuantity(ProductStock product) {
		product.setQuantity(18);
		return product.getQuantity();
	}
	public String getProductSupplier(ProductStock product) {
		product.setSupplierName("xyz");
		return product.getSupplierName();
	}
	
	public List<ProductStock> getListOfProductStock() {
		List<ProductStock> bpList = new ArrayList<ProductStock>();
		bpList.add(new ProductStock(12, "Banana", 18, "xyz"));
		bpList.add(new ProductStock(13, "Apple", 24, "ayz"));
		bpList.add(new ProductStock(17, "Cookies", 198, "abc"));
		bpList.add(new ProductStock(12, "Banana", 18, "xyz"));
		bpList.add(new ProductStock(13, "Apple", 24, "ayz"));
		bpList.add(new ProductStock(17, "Cookies", 198, "abc"));
		bpList.add(new ProductStock(12, "Banana", 18, "xyz"));
		bpList.add(new ProductStock(13, "Apple", 24, "ayz"));
		bpList.add(new ProductStock(17, "Cookies", 198, "abc"));
		bpList.add(new ProductStock(12, "Banana", 18, "xyz"));
		bpList.add(new ProductStock(13, "Apple", 24, "ayz"));
		bpList.add(new ProductStock(17, "Cookies", 198, "abc"));
		
		return bpList;
	}
	
}
