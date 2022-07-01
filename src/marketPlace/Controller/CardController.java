package marketPlace.Controller;

//import com.mysql.cj.xdevapi.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
public class CardController {
    Statement io;
        ConnectionDB po=new ConnectionDB();
         Statement k;
        ConnectionDB z=new ConnectionDB();
        Statement B;
        ConnectionDB BH=new ConnectionDB();
        int y;
	// given client id and product id, retrieve the quantity of
	// that product in the cart of that client
	public int getProductQuantityInCart(String clientUserName, int productId) throws SQLException {
		io= po.openconnection().createStatement();
       // ResultSet resu=sta.executeQuery("select * from server where Username='"+account.getUserName()+"'and pass='"+account.getPassword()+"'");       
	ResultSet res=io.executeQuery("select NumberOfProducts from cart as ca,client as cu where ca.ClientID=cu.ClientID and ProductID='"+productId+"''"+"and cu.UserName="+clientUserName+"'");
	//ResultSet res=s.executeQuery("select Fname from customer as c where c.UserName='"+acc.getUserName()+"'" );
        if(res.next())
            y=res.getInt("NumberOfProducts");
        return y;
	}
	
	public void addOneToProductQuantityInCart(String clientUserName, int productId) throws SQLException {
		k=z.openconnection().createStatement();
             // k.execute( "update cart as c,customer as r set NumberOfProducts=NumberOfProducts+1 where c.CustomerID=r.CustomerID and c.ProductID='"+productId+"''"+"and r.UserName='"+clientUserName+"'");
      k.execute("update cart as c set NumberOfProducts=NumberOfProducts+1 where c.ProductID=' "+productId+"' and C.ClientID in(select ClientID from client as r where r.UserName='"+clientUserName+"' )");
              
              //String query="update cart as c"+"set NumberOfProducts=NumberOfProducts+1"+"where y.CustomerID=c.CustomerID"+" and c.ProductID=1" ;
     // String query="update cart as c set NumberOfProducts=NumberOfProducts+1 where c.ProductID= productId and C.CustomerID in(select CustomerID from customer as r where r.UserName=clientUserName";
             // k.executeQuery(query);
        }
	
	public void minusOneFromProductQuantityInCart(String clientUserName, int productId) throws SQLException{
		B=BH.openconnection().createStatement();
                 B.execute("update cart as c set NumberOfProducts=NumberOfProducts-1 where c.ProductID=' "+productId+"' and C.ClientID in(select ClientID from client as r where r.UserName='"+clientUserName+"' )");
	
        }
}
