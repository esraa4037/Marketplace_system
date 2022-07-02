package marketPlace.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import marketPlace.Model.ClientAccount;

public class ClientHomeController {
    Statement s;
    ConnectionDB gh=new ConnectionDB();
    String h;
    String e;
     Statement t;
      ConnectionDB w=new ConnectionDB();
	public String getFirst(ClientAccount acc) throws SQLException {
            s=gh.openconnection().createStatement();
		ResultSet res=s.executeQuery("select c.Fname from client as c where c.UserName='"+acc.getUserName()+"'" );
                while(res.next()){
                h=res.getString("Fname");
                }
	return h;
        }
	public String getLast(ClientAccount acc) throws SQLException {
            t=w.openconnection().createStatement();
		ResultSet res=t.executeQuery("select c.Lname from client as c where c.UserName='"+acc.getUserName()+"'" );
                while(res.next()){
                e=res.getString("Lname");
                }
	return e;
	}


       
}
