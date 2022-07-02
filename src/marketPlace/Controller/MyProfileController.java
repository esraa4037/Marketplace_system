package marketPlace.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static marketPlace.MyInfo.socket;

/**
 *
 * @author Nadas
 */
public class MyProfileController {
    
	public int getBalance(String clientUserName) throws IOException{
            System.out.println("The get balance function was called ");
               
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "getbalance";
                String data = request + ":" + clientUserName;                               
                System.out.println(data);
                out.println(data);
                String serverResponse = input.readLine();
                System.out.println("serverResponse is:" + serverResponse );                       
                return Integer.parseInt(serverResponse);
		
	}

	public String getFirstName(String userName) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("The get first name function was called ");
              
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "clientfirstname";
                String data = request + ":" + userName;                               
                System.out.println(data);
                out.println(data);
                String serverResponse = input.readLine();
                System.out.println("serverResponse is:" + serverResponse );                       
                return serverResponse;
	}

	public String getEmail(String userName) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("The get email function was called ");
              
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "email";
                String data = request + ":" + userName;                               
                System.out.println(data);
                out.println(data);
                String serverResponse = input.readLine();
                System.out.println("serverResponse is:" + serverResponse );                       
                return serverResponse;
	}

	public String getPhone(String userName) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("The get phone function was called ");
              
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "phone";
                String data = request + ":" + userName;                               
                System.out.println(data);
                out.println(data);
                String serverResponse = input.readLine();
                System.out.println("serverResponse is:" + serverResponse );                       
                return serverResponse;
	}

	public String getAddress(String userName) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("The get address function was called ");
              
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "address";
                String data = request + ":" + userName;                               
                System.out.println(data);
                out.println(data);
                String serverResponse = input.readLine();
                System.out.println("serverResponse is:" + serverResponse );                       
                return serverResponse;
	}

	public String getPostalCode(String userName) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("The get postal function was called ");
               
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "getpostal";
                String data = request + ":" + userName;                               
                System.out.println(data);
                out.println(data);
                String serverResponse = input.readLine();
                System.out.println("serverResponse is:" + serverResponse );                       
                return serverResponse;
	}
}
