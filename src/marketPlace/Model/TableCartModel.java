package marketPlace.Model;

public class TableCartModel {
	private int productId;
	private String productName;
	private double price;
	private int noOfProducts;
	private double totalPrice;
	
	
	public TableCartModel(int productId, String productName, double price, int noOfProducts ,double totalPrice) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.totalPrice = totalPrice;
		this.noOfProducts = noOfProducts;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getNoOfProducts() {
		return noOfProducts;
	}

	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}
	
	
	
}
