package marketPlace.Controller;
import marketPlace.Model.UserAccount;

public class LoginController {
	
	public boolean isClient(UserAccount account) {
		if (account.getUserName().equals("esraa") && account.getPassword().equals("1234")) {
			return true;
		}
		return false;
	}
	
	public boolean isServer(UserAccount account) {
		if (account.getUserName().equals("admin") && account.getPassword().equals("1234")) {
			return true;
		}
		return false;
	}
	
}
