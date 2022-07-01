package marketPlace.Controller;

import marketPlace.Model.ClientAccount;

public class ClientHomeController {
	public String getFirst(ClientAccount acc) {
		acc.setFirstName("Esraa");
		return acc.getFirstName();
	}
	public String getLast(ClientAccount acc) {
		acc.setLastName("Mohamed");
		return acc.getLastName();
	}
}
