package marketPlace.Controller;

import marketPlace.Model.ClientAccount;
import marketPlace.Model.MyProfile;

public class MyProfileController {
	//MyProfile pro = new MyProfile("Esraa", "Mohamed", "esraa", "1234", "es@xyz.com", "01012345678", "xyz", 4321, 400);
	
	public int getBalance(String userName) {
//		prof.setBalance(pro.getBalance());
		
		return 900;
	}
	public String getFirstName(String userName) {
		return "Esraa";
	}
	public String getLastName(String userName) {
		return "Mohamed";
	}
	public String getUserName(String userName) {
		return "esraa";
	}
	public String getEmail(String userName) {
		return "es@xyz.com";
	}
	public String getPhone(String userName) {
		return "01012345678";
	}
	public String getAddress(String userName) {
		return "xyz";
	}
	public int getPostalCode(String userName) {
		return 4321;
	}
}
