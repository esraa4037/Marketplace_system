package marketPlace.Model;

import javafx.scene.control.CheckBox;

public class TableCartModel {
	private int productId;
	private String productName;
	private double price;
	private int noOfProducts;
	private double totalPrice;
	private CheckBox select;
	public TableCartModel(){
        }
	public TableCartModel(int productId, String productName, double price, int noOfProducts ,double totalPrice) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.totalPrice = totalPrice;
		this.noOfProducts = noOfProducts;
		this.select = new CheckBox();
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

	public CheckBox getSelect() {
		return select;
	}

	public void setSelect(CheckBox select) {
		this.select = select;
	}
	
	
	
}
