package marketPlace.Controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MyProfileController {

	    Statement s;
    ConnectionDB gh=new ConnectionDB();
    int h;
	Statement s1;
    ConnectionDB gh1=new ConnectionDB();
     Statement s2;
    ConnectionDB gh2=new ConnectionDB();
     Statement s3;
    ConnectionDB gh3=new ConnectionDB();
     Statement s4;
    ConnectionDB gh4=new ConnectionDB();
     Statement s5;
    ConnectionDB gh5=new ConnectionDB();
    String h1;
    String h2;
    String h3;
    String h4;
    int h5;
	public int getBalance(String username) throws SQLException {
		 s=gh.openconnection().createStatement();
		ResultSet res=s.executeQuery("select balance from billinginfo as b,client as c where b.ClientID=c.ClientID and c.UserName='"+username+"' " );
                while(res.next()){
                h=res.getInt("balance");
                }
	return h;
        
	}

	public String getFirstName(String userName) throws SQLException {
		
		 s1=gh1.openconnection().createStatement();
		ResultSet res1=s1.executeQuery("select c.Fname from client as c where c.UserName='"+userName+"' " );
                while(res1.next()){
                h1=res1.getString("Fname");
                }
	return h1;
	}

	public String getEmail(String userName) throws SQLException {
		 s2=gh2.openconnection().createStatement();
		ResultSet res2=s2.executeQuery("select c.Email from client as c where c.UserName='"+userName+"' " );
                while(res2.next()){
                h2=res2.getString("Email");
                }
	return h2;
	}

	public String getPhone(String userName) throws SQLException {
		 s3=gh3.openconnection().createStatement();
		ResultSet res3=s3.executeQuery("select c.Phone from client as c where c.UserName='"+userName+"' " );
                while(res3.next()){
                h3=res3.getString("Phone");
                }
	return h3;
	}

	public String getAddress(String userName) throws SQLException {
		 s4=gh4.openconnection().createStatement();
		ResultSet res4=s4.executeQuery("select c.Address from client as c where c.UserName='"+userName+"' " );
                while(res4.next()){
                h4=res4.getString("Address");
                }
	return h4;
	}

	public int getPostalCode(String userName) throws SQLException {
		 s5=gh5.openconnection().createStatement();
		ResultSet res5=s5.executeQuery("select c.PostalCode from client as c where c.UserName='"+userName+"' " );
                while(res5.next()){
                h5=res5.getInt("PostalCode");
                }
	return h5;
	}
}
