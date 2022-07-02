package marketPlace.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import marketPlace.Model.ClientAccount;
import static marketPlace.MyInfo.socket;

public class ClientHomeController {
	public String getFirst(ClientAccount acc) throws IOException {
//		acc.setFirstName("Esraa");
//		return acc.getFirstName();
                System.out.println("The get first name function was called ");
                String username = acc.getUserName();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "clientfname";
                String data = request + ":" + username;                               
                System.out.println(data);
                out.println(data);
                String serverResponse = input.readLine();
                System.out.println("serverResponse is:" + serverResponse );                       
                return serverResponse;
	}
	public String getLast(ClientAccount acc) throws IOException {
//		acc.setLastName("Mohamed");
//		return acc.getLastName();
                System.out.println("The get last name function was called ");
                String username = acc.getUserName();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "clientlname";
                String data = request + ":" + username;                               
                System.out.println(data);
                out.println(data);
                String serverResponse = input.readLine();
                System.out.println("serverResponse is:" + serverResponse );                       
                return serverResponse;
	}
}
