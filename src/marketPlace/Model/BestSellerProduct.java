package marketPlace.Model;

public class BestSellerProduct {
	private String Category;
	private int ProductID;
	private String ProductName;
	
	public BestSellerProduct(String category, int id, String name) {
		Category = category;
		ProductID = id;
		ProductName = name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	
	
}
