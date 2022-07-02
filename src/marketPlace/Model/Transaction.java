package marketPlace.Model;

public class Transaction {
	private int ClientID;
	private String ClientName;
	private int OrderID;
	private int ProductID;
	private String ProductName;
	private int Quantity;
	private String Date;
	private String Supplier;
	
	public Transaction(int clientID, String clientName, int orderID, int productID, String productName, int quantity,
			String date, String supplier) {
		super();
		ClientID = clientID;
		ClientName = clientName;
		OrderID = orderID;
		ProductID = productID;
		ProductName = productName;
		Quantity = quantity;
		Date = date;
		Supplier = supplier;
	}
	public int getClientID() {
		return ClientID;
	}
	public void setClientID(int clientID) {
		ClientID = clientID;
	}
	public String getClientName() {
		return ClientName;
	}
	public void setClientName(String clientName) {
		ClientName = clientName;
	}
	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
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
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getSupplier() {
		return Supplier;
	}
	public void setSupplier(String supplier) {
		Supplier = supplier;
	}
	
	
}
