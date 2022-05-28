package marketPlace.Controller;

import marketPlace.Model.UserAccount;

public class ClientHomeController {
	public String getFirst(UserAccount acc) {
		acc.setFirstName("Esraa");
		return acc.getFirstName();
	}
	public String getLast(UserAccount acc) {
		acc.setLastName("Mohamed");
		return acc.getLastName();
	}
}
