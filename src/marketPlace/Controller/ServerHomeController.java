package marketPlace.Controller;

import marketPlace.Model.ServerAccount;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ServerHomeController {
     Statement s;
    ConnectionDB gh=new ConnectionDB();
    String h;
    String e;
     Statement t;
      ConnectionDB w=new ConnectionDB();
	public String getServerFirstName(ServerAccount saccount) throws SQLException {
		 s=gh.openconnection().createStatement();
		ResultSet res=s.executeQuery("select s.Fname from server as s where username='"+saccount.getUserName()+"'" );
                while(res.next()){
                h=res.getString("Fname");
                }
	return h;
        
	}
	public String getServerLastName(ServerAccount saccount) throws SQLException{
            t=w.openconnection().createStatement();
		ResultSet re=t.executeQuery("select s.Lname from server as s where username='"+saccount.getUserName()+"'" );
                while(re.next()){
                e=re.getString("Lname");
                }
	return e;
        
	}
}
