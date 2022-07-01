/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


import server_supermarket.ServerThread;

public class Servermain {
    
    public static void main(String[] args){
        
        ServerSocket serverSocket =null;
        List<PrintWriter> listWriters = new ArrayList<PrintWriter>();

        try{
            
           serverSocket = new ServerSocket();
           String hostAddress = InetAddress.getLocalHost().getHostAddress();
           serverSocket.bind(new InetSocketAddress(hostAddress,8080));
           System.out.println("waiting..");
           
           while(true){
               Socket socket =serverSocket.accept();
               System.out.println("Client IP: "+socket.getInetAddress());
               
               new ServerThread(socket ,listWriters).start();
               
           }
            
            
        } catch (IOException ex) {
            Logger.getLogger(Servermain.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            try{
                if(serverSocket !=null && !serverSocket.isClosed()){
                    serverSocket.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        
    }
    
}
