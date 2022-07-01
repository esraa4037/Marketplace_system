package marketPlace.Model;

public class ProductStock {
	private int id;
	private String name;
	private int quantity;
	private String supplierName;

	public ProductStock(int id, String name, int quantity, String supplierName) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.supplierName = supplierName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
}
