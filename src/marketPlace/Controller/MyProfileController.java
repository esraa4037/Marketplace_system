package marketPlace.Controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MyProfileController {

	    Statement s;
    ConnectionDB gh=new ConnectionDB();
    int h;
	public int getBalance(String username) throws SQLException {
		 s=gh.openconnection().createStatement();
		ResultSet res=s.executeQuery("select balance from billinginfo as b,client as c where b.ClientID=c.ClientID and c.UserName='"+username+"' " );
                while(res.next()){
                h=res.getInt("balance");
                }
	return h;
        
	}

	public String getFirstName(String userName) {
		// TODO Auto-generated method stub
		return "Esraa";
	}

	public String getEmail(String userName) {
		// TODO Auto-generated method stub
		return "esraa@gmail.com";
	}

	public String getPhone(String userName) {
		// TODO Auto-generated method stub
		return "01154638421";
	}

	public String getAddress(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPostalCode(String userName) {
		// TODO Auto-generated method stub
		return "4578";
	}
}
