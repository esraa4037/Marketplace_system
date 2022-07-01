
package marketPlace.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import marketPlace.Model.ClientAccount;
import marketPlace.Model.ServerAccount;
import static marketPlace.MyInfo.socket;

public class SignUpController {
    public boolean isClient(ClientAccount account) throws IOException {

                String user = account.getUserName();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "signupclient";
                String data = request + ":" + user;
                System.out.println(data);
                out.println(data);
                String serverResponse = input.readLine();
                System.out.println("serverResponse is:" + serverResponse );
                 if ("0".equals(serverResponse))
                {
                    System.out.println("User name already exists, try again.");
			return true;
		}
                else 
                {
                  return false;
                }                                     
                              
	}
	
	public void create_client(ClientAccount account) throws IOException {

                 String fname = account.getFirstName();
                 String lname = account.getLastName();
                 String email = account.getEmail();
                 String phone = account.getPhone();
                 String postal = String.valueOf(account.getPostalCode());
                 String username = account.getUserName();
                 String password = account.getPassword();
          
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "createaccount";
                System.out.println("about to send data.");
                System.out.println(postal);
                System.out.println(account.getPostalCode());
                
                String data = request + ":" + fname + ":" + lname + ":" + email + ":" + phone + ":" + postal + ":" + username + ":" + password ;
                System.out.println(data);
                out.println(data);
//             
	}
	
    
}
