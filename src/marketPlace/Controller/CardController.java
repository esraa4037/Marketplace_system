package marketPlace.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static marketPlace.MyInfo.socket;

public class CardController {
	// given client id and product id, retrieve the quantity of
	// that product in the cart of that client
	public int getProductQuantityInCart(String clientUserName, int productId) throws IOException {
		// this is just a stub
		//return 0;
                 
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "getproductquantity";
                String id = String.valueOf(productId);
                String data = request + ":" + clientUserName + ":" + productId;
                System.out.println(data);
                out.println(data);
                String serverResponse = input.readLine();
                System.out.println("serverResponse is:" + serverResponse );
                return Integer.parseInt(serverResponse);
	}
	
	public void addOneToProductQuantityInCart(String clientUserName, int productId) throws IOException {
		// ProductQuantityInCart ++;
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "plusone";
                String id = String.valueOf(productId);
                String data = request + ":" + clientUserName + ":" + id;
                System.out.println(data);
                out.println(data);
	}
	
	public void minusOneFromProductQuantityInCart(String clientUserName, int productId) throws IOException{
		 
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = "minusone";
                String id = String.valueOf(productId);
                String data = request + ":" + clientUserName + ":" + id;
                System.out.println(data);
                out.println(data);
                         
                
           
	}
