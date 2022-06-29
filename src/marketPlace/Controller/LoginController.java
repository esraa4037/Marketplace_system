package marketPlace.Controller;
import marketPlace.Model.ServerAccount;
import marketPlace.Model.UserAccount;

public class LoginController {
	
	public boolean isClient(UserAccount account) {
		if (account.getUserName().equals("esraa") && account.getPassword().equals("1234")) {
			return true;
		}
		return false;
	}
	
	public boolean isServer(ServerAccount account) {
		if (account.getUserName().equals("admin") && account.getPassword().equals("1234")) {
			return true;
		}
		return false;
	}
	
}
