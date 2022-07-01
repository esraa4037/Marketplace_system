package marketPlace.Controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import marketPlace.Model.ClientAccount;
import marketPlace.Model.ServerAccount;
import static marketPlace.MyInfo.socket;

public class LoginController {
	
	public boolean isClient(ClientAccount account) throws IOException {
//		if (account.getUserName().equals("esraa") && account.getPassword().equals("1234")) {
//			return true;
//		}
//		return false;
          
              
                String user = account.getUserName();
                String pass = account.getPassword();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "loginclient";
                String data = request + ":" + user + ":" + pass;
                System.out.println(data);
                out.println(data);
                String serverResponse = input.readLine();
                System.out.println("serverResponse is:" + serverResponse );                       
                if ("1".equals(serverResponse))
                {
                    System.out.println("Log in sucess");
			return true;
		}
                else 
                {
                  return false;
                }
           
	        }
	
	public boolean isServer(ServerAccount account) throws IOException {
//		if (account.getUserName().equals("admin") && account.getPassword().equals("1234")) {
//			return true;
//		}
//		return false;
                String user = account.getUserName();
                String pass = account.getPassword();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "loginadmin";
                String data = request + ":" + user + ":" + pass;
                System.out.println(data);
                out.println(data);
                String serverResponse = input.readLine();
                System.out.println("serverResponse is:" + serverResponse );                       
                if ("1".equals(serverResponse))
                {
                    System.out.println("Log in sucess");
			return true;
		}
                else 
                {
                  return false;
                }
            

	}
	
}
