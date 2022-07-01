package marketPlace.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import marketPlace.Model.ServerAccount;
import static marketPlace.MyInfo.socket;

public class ServerHomeController {
	public String getServerFirstName(ServerAccount saccount) throws IOException {

//		String fname = saccount.getFirstName();
//		return fname;
// send to database admin user
// get first name from database

/// get fname from database
//

                System.out.println("The get first name function was called ");
                String username = saccount.getUserName();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "adminfname";
                String data = request + ":" + username;                               
                System.out.println(data);
                out.println(data);
                String serverResponse = input.readLine();
                System.out.println("serverResponse is:" + serverResponse );                       
                return serverResponse;
                

	}
	public String getServerLastName(ServerAccount saccount) throws IOException {
//		saccount.setLastName("Nabil");
//		String lname = saccount.getLastName();
//		return lname;
                System.out.println("The get last name function was called ");
                String username = saccount.getUserName();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "adminlname";
                String data = request + ":" + username;                               
                System.out.println(data);
                out.println(data);
                String serverResponse = input.readLine();
                System.out.println("serverResponse is:" + serverResponse );                       
                return serverResponse;
	}
}
