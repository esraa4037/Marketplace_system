package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDB {
Connection con=null;

   public  Connection openconnection()throws SQLException{
       
   if(con==null)
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ya","root","alaa1111");
   } catch (ClassNotFoundException ex) {
       Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
   }
   //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahah","root","Hager_Rafaat123");
   return con;
   }


}
