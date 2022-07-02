package marketPlace.Controller;

import marketPlace.Model.ServerAccount;

public class ServerHomeController {
	public String getServerFirstName(ServerAccount saccount) {
		saccount.setFirstName("Maram");
		String fname = saccount.getFirstName();
		return fname;
	}
	public String getServerLastName(ServerAccount saccount) {
		saccount.setLastName("Nabil");
		String lname = saccount.getLastName();
		return lname;
	}
}
