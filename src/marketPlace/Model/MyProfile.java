package marketPlace.Model;

public class MyProfile {
	private String fname;
	private String lname;
	private String username;
	private String email;
	private String password;
	private String phone;
	private String address;
	private int postalcode;
	private int balance;
	private String columnName;
	
	public MyProfile(String fname, String lname, String username, String pass, String email, String phone, String address,
			int postalcode, int balance) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.postalcode = postalcode;
		this.balance = balance;
		this.password = pass;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}
	
	
}
