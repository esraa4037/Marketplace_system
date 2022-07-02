
package marketPlace.Controller;

import marketPlace.Model.ClientAccount;
import marketPlace.Model.ServerAccount;

public class SignUpController {
    public boolean isClient(ClientAccount account) {
		if (account.getUserName().equals("esraa") && account.getPassword().equals("1234")) {
			return false;
		}
		return true;
	}
	
	public boolean isServer(ServerAccount account) {
		if (account.getUserName().equals("admin") && account.getPassword().equals("1234")) {
			return false;
		}
		return true;
	}
	
    
}
