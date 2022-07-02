package marketPlace.Model;

public class Obj {

	private int orderid;
	private String ordereddate;
	private int productid;
	private String name;
	private int quantity;
	private String supplierName;
	private int clientid;
	private String firstName;
	private String lastName;
	private int product_quantity;
	private int id;
	private double totalprice;

	
	public Obj() {
		
	}
	
	public Obj(int orderid, String ordereddate, int productid, String name, int quantity, String supplierName,
			int clientid, String firstName, String lastName, int product_quantity, int id, double totalprice) {
		super();
		this.orderid = orderid;
		this.ordereddate = ordereddate;
		this.productid = productid;
		this.name = name;
		this.quantity = quantity;
		this.supplierName = supplierName;
		this.clientid = clientid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.product_quantity = product_quantity;
		this.id = id;
		this.totalprice = totalprice;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getOrdereddate() {
		return ordereddate;
	}

	public void setOrdereddate(String ordereddate) {
		this.ordereddate = ordereddate;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
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

	public int getClientid() {
		return clientid;
	}

	public void setClientid(int clientid) {
		this.clientid = clientid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	
}