
package marketPlace.Controller;

import marketPlace.Model.ClientAccount;
import marketPlace.Model.ServerAccount;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SignUpController {
    Statement z;
    ConnectionDB ll=new ConnectionDB();
    Statement o;
    ConnectionDB pp=new ConnectionDB();
    public boolean isclient(ClientAccount acc) throws SQLException{
    o=pp.openconnection().createStatement();
               
	ResultSet sss=o.executeQuery("select * from client where Username='"+acc.getUserName()+"'");
           
                if(sss.next())
                    return false;
	return true;
    
    }
    
  public void create_client(ClientAccount acc) throws SQLException{
  z=ll.openconnection().createStatement();
      z.execute("insert into client(ClientID,Fname,Lname,Email,Phone,PostalCode,UserName,Pass) values(null,'"+acc.getFirstName()+"','"+acc.getLastName()+"','"+acc.getEmail()+"','"+acc.getPhone()+"','"+acc.getPostalCode()+"','"+acc.getUserName()+"','"+acc.getPassword()+"')");
  
  }
	
    
}

