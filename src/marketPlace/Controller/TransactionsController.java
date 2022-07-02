package marketPlace.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import marketPlace.Model.*;

public class TransactionsController {
	  Statement y;
    ConnectionDB d =new ConnectionDB();
	Statement r;
        ConnectionDB r1=new ConnectionDB();
		
	
	
	public ObservableList<obj> historyOfClient(String clientusername) throws SQLException {
          r=r1.openconnection().createStatement();
          ResultSet y1=r.executeQuery("select o.OrderID,od.ProductID,p.ProductName,od.Quantity,o.OrderedDate,p.SupplierName from order_ as o,orderdetails as od,product as p,client as c where o.OrderID=od.OrderID and o.ClientID=c.ClientID and od.ProductID=p.ProductID and c.UserName='"+clientusername+"' ");
        
        ObservableList c7=FXCollections.observableArrayList();
        while(y1.next()){
        obj obj7=new obj();
        obj7.setOrderid(y1.getInt("OrderID"));
        obj7.setProductid(y1.getInt("ProductID"));
        obj7.setName(y1.getString("ProductName"));
        obj7.setQuantity(y1.getInt("Quantity"));
        obj7.setOrdereddate(y1.getString("OrderedDate"));
        obj7.setSupplierName(y1.getString("SupplierName"));
       
       
        
        
        c7.add(obj7);
        }
        return c7;
     }
        
        
	public ObservableList<obj> historyTransaction() throws SQLException {
	 y=d.openconnection().createStatement();
        ResultSet res=y.executeQuery("select o.ClientID,c.Fname,o.OrderID,od.ProductID,p.ProductName,od.Quantity,o.OrderedDate,p.SupplierName from order_ as o,orderdetails as od,product as p,client as c where o.OrderID=od.OrderID and p.ProductID=od.ProductID and o.ClientID=c.ClientID group by o.OrderID order by o.OrderedDate DESC");
        ObservableList c=FXCollections.observableArrayList();
        while(res.next()){
        obj obj=new obj();
        obj.setOrderid(res.getInt("OrderID"));
        obj.setProductid(res.getInt("ProductID"));
        obj.setName(res.getString("ProductName"));
        obj.setQuantity(res.getInt("Quantity"));
        obj.setOrdereddate(res.getString("OrderedDate"));
        obj.setSupplierName(res.getString("SupplierName"));
       obj.setClientid(res.getInt("ClientID"));
       obj.setFirstName(res.getString("Fname"));
       
        
        
        c.add(obj);
        }
        return c;
     }
	}
	
	



