package marketPlace.Controller;
import marketPlace.Model.ClientAccount;
import marketPlace.Model.ServerAccount;
//---------------------
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import marketPlace.Model.ClientAccount;
import marketPlace.Model.ServerAccount;
import static marketPlace.MyInfo.socket;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//---------------------
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
        

		
//		String user = account.getUserName();
//        String pass = account.getPassword();
//        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        String request = "loginclient";
//        String data = request + ":" + user + ":" + pass;
//        System.out.println(data);
//        out.println(data);
//        String serverResponse = input.readLine();
//        System.out.println("serverResponse is:" + serverResponse );                       
//        if ("1".equals(serverResponse))
//        {
//            System.out.println("Log in sucess");
//	return true;
//}
//        else 
//        {
//          return false;
//        }
	}
	
	public boolean isServer(ServerAccount account)throws SQLException {
		

		sta=aa.openconnection().createStatement();
		ResultSet resu=sta.executeQuery("select * from server where username='"+account.getUserName()+"'and pass='"+account.getPassword()+"'");
                if(resu.next())
                    return true;
	return false;
		
		
//		String user = account.getUserName();
//        String pass = account.getPassword();
//        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        String request = "loginadmin";
//        String data = request + ":" + user + ":" + pass;
//        System.out.println(data);
//        out.println(data);
//        String serverResponse = input.readLine();
//        System.out.println("serverResponse is:" + serverResponse );                       
//        if ("1".equals(serverResponse))
//        {
//            System.out.println("Log in sucess");
//	return true;
//}
//        else 
//        {
//          return false;
//        }
	}
	
}
