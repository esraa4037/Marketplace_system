package marketPlace.Controller;

import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.util.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import marketPlace.Model.TableCartModel;

public class MyCartController {
	 Statement y;
    ConnectionDB d =new ConnectionDB();
     Statement s;
    ConnectionDB gh=new ConnectionDB();
Statement siu;
    ConnectionDB ghp=new ConnectionDB(); 
    Statement y1;
    ConnectionDB d1 =new ConnectionDB();
	public List<TableCartModel> getCartTableContent(String clientUserName) throws SQLException{
		
 y=d.openconnection().createStatement();
        ResultSet res=y.executeQuery( "select c.ProductID,p.ProductName,p.Price,c.NumberOfProducts,c.TotalPrice from cart as c,product as p,client  as cu where c.ProductID=p.ProductID and c.ClientID=cu.ClientID and cu.UserName='"+clientUserName+"' ");
        List<TableCartModel> Product = new ArrayList<TableCartModel>();
         
          while (res.next()) {
             TableCartModel person=new TableCartModel();
           person.setProductId(res.getInt("ProductID"));
               person.setProductName(res.getString("ProductName"));
           person.setPrice(res.getInt("Price"));
             person.setNoOfProducts(res.getInt("NumberOfProducts"));
              person.setTotalPrice(res.getInt("TotalPrice"));
               //person.setPrice(res.getInt("Price"));
                
                Product.add(person); 
            }
        
        return Product;
                        
	}
	
	public void deleteProductsFromCartTable(String clientUserName ,List<TableCartModel> deleteItems,int size) throws SQLException {
 y1=d1.openconnection().createStatement();
                 for(int i=0;i<size;i++){
		 
    y1.execute("delete from cart as c where c.ClientID in(select cu.ClientID from client as cu  where cu.UserName='"+clientUserName+"'  )");
                
            }
                
	}
	
	public void addProducstoOrder(String clientUserName ,List<TableCartModel> deleteItems, int i) {
		
	}
}
