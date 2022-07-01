/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_supermarket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import database.*;
import database.LoginController;
import java.sql.SQLException;
import javafx.collections.ObservableList;
import marketPlace.Model.TableCartModel;
  
/**
 *
 * @author win10
 */
public class ServerThread extends Thread {
    private Socket socket =null;
    private String id =null;
    List<PrintWriter> listWriters =null;
    
    public ServerThread(Socket socket, List<PrintWriter> listWriters){
        this.socket =socket;
        this.listWriters =listWriters;
    }
    
    @Override
    public void run(){
        
        try{
            BufferedReader bufferedReader =
                 new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            PrintWriter printWriter = 
                 new PrintWriter(socket.getOutputStream(),true);
        while(true){
            String request =bufferedReader.readLine();
            System.out.println(request);
            if( request ==null){
            System.out.println("Lost connection from client");
            doQuit(printWriter);
            break;
            }        
            
            String[] tokens =request.split(":");
            
            if("loginclient".equals(tokens[0])){
                String r="";
                boolean result = (new LoginController()).isClient(tokens[1],tokens[2]);
                PrintWriter out =new PrintWriter(socket.getOutputStream(),true);
        
                if( result){
                  r="1";
                 out.println(r);
                 
                }
                else{
                    r="0";
                     out.println(r);
                }
            
                
            }
            else if("loginadmin".equals(tokens[0])){
                  String r="";
                boolean result = (new LoginController()).isServer(tokens[1],tokens[2]);
                PrintWriter out =new PrintWriter(socket.getOutputStream(),true);
        
                if( result){
                  r="1";
                 out.println(r);
                 
                }
                else{
                    r="0";
                     out.println(r);
                }
            
                
                
            }
            else if("createaccount".equals(tokens[0])){
                
                String r="";
                 (new SignUpController()).create_client (tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6],tokens[7]);
               System.out.print(tokens);
                 
            }
            else if("signupclient".equals(tokens[0])){
               
                String r="";
                boolean result = (new LoginController()).isclient_account(tokens[1]);
                PrintWriter out =new PrintWriter(socket.getOutputStream(),true);
        
                if( result){
                  r="1";
                 out.println(r);
                 
                }
                else{
                    r="0";
                    out.println(r);
                }
            }
            
              else if("signupadmin".equals(tokens[0])){
       
               String r="";
                boolean result = (new LoginController()).isserver_account(tokens[1]);
                PrintWriter out =new PrintWriter(socket.getOutputStream(),true);
        
                if( result){
                  r="1";
                 out.println(r);
                 
                }
                else{
                    r="0";
                    out.println(r);
                }
            }
            else if("adminfname".equals(tokens[0])){
                String r=(new ServerHomeController()).getServerFirstName(tokens[1]);
                System.out.println(r);
                PrintWriter out =new PrintWriter(socket.getOutputStream(),true);
                out.println(r);
                
            }
             else if("adminlname".equals(tokens[0])){
                String r=(new ServerHomeController()).getServerLastName(tokens[1]);
                 System.out.println(r);
                PrintWriter out =new PrintWriter(socket.getOutputStream(),true);
                out.println(r);
                
            }
            else if("clientfname".equals(tokens[0])){
                String r=(new ClientHomeController()).getFirst(tokens[1]);
                System.out.println(r);
                PrintWriter out =new PrintWriter(socket.getOutputStream(),true);
                out.println(r);
                
            }
             else if("clientlname".equals(tokens[0])){
                String r=(new ClientHomeController()).getLast(tokens[1]);
                 System.out.println(r);
                PrintWriter out =new PrintWriter(socket.getOutputStream(),true);
                out.println(r);
                
            }
             else if("getcarttablecontent".equals(tokens[0])){
                 List<TableCartModel> a;
                a=(new MyCartController()).getCartTableContent(tokens[1]);
                 
                PrintWriter out =new PrintWriter(socket.getOutputStream(),true);
                out.println(a);
                 
             }
             else if("MyProfileController".equals(tokens[0])){
                  int a;
                  a=(new MyProfileController()).getbalance(tokens[1]);
                 
                PrintWriter out =new PrintWriter(socket.getOutputStream(),true);
                out.println(a);        
                 
             }
             else if("client_history".equals(tokens[0])){
                 
                 ObservableList<obj> a;
                 a=(new client_history()).client_history(tokens[1]);
                 
                PrintWriter out =new PrintWriter(socket.getOutputStream(),true);
                out.println(a);        
                       
                 
             }
            
             
        }
        
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    private void removeWriter(PrintWriter writer) {
        synchronized (listWriters) {
            listWriters.remove(writer);
        }
    }
    
    private void doQuit(PrintWriter writer){
        removeWriter(writer);
        
        String data =this.id +"End Connection";
        broadcast(data);
    }
    
    private void broadcast(String data){
        synchronized (listWriters){
            for(PrintWriter writer : listWriters){
                writer.println(data);
                writer.flush();
            }
        }
        
    }
    
}
