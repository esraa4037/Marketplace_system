package marketPlace.Controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import marketPlace.Model.ClientAccount;

public class LoginController {
	Statement st;
        ConnectionDB g=new ConnectionDB();
        Statement sta;
        ConnectionDB aa=new ConnectionDB() ;
        //ResultSet r;
	public boolean isClient(ClientAccount account) throws SQLException {
		st=g.openconnection().createStatement();
               
	ResultSet res=st.executeQuery("select * from client where Username='"+account.getUserName()+"'and pass='"+account.getPassword()+"'");
           
                if(res.next())
                    return true;
	return false;
        }
	
	public boolean isServer(ClientAccount account)throws SQLException {
		

		sta=aa.openconnection().createStatement();
		ResultSet resu=sta.executeQuery("select * from server where username='"+account.getUserName()+"'and pass='"+account.getPassword()+"'");
                if(resu.next())
                    return true;
	return false;
	
}
}
