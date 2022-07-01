package marketPlace.Controller;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import marketPlace.Model.Product;

public class ProductController {
 Statement y;
 ConnectionDB d=new ConnectionDB();
	 Statement s1;
    ConnectionDB s2 =new ConnectionDB();
 ResultSet u;
	public List<Product> getProductsList() throws SQLException, ClassNotFoundException  {
		 y=d.openconnection().createStatement();
        ResultSet res=y.executeQuery("select * from product");
        List<Product> Product = new ArrayList<Product>();
        
          while (res.next()) {
               Product person = new Product();
            person.setId(res.getInt("ProductID"));
               person.setName(res.getString("ProductName"));
           person.setSupplierName(res.getString("SupplierName"));
              person.setQuantity(res.getInt("Quantity"));
               person.setCategoryId(res.getInt("CategoryID"));
               person.setPrice(res.getInt("Price"));
               // TODO add your handling code here:
           // byte [] imageBytes;
            //String productId = name.getText();
            
            //if(name.getText().length()> 0){
                //String sql = "SELECT * FROM product WHERE ProductID = ' "+ productId +" '";
                //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinesupermarket",user,pass);
                //PreparedStatement st= conn.prepareStatement(sql);
                //st.setString(1, s);
                //eeResultSet rs = st.executeQuery(sql);
           
                               
                Product.add(person); 
            }
        
        return Product;
                                          
    
}



	 public List< Product> getproductcategory(String categoryname) throws SQLException, ClassNotFoundException {
        if(categoryname.equals("All"))
            return getProductsList();
        else{
       s1=s2.openconnection().createStatement();
        ResultSet res=s1.executeQuery("select p.ProductName,p.Price,p.Quantity from product as p,category as c where p.CategoryID=c.ID and c.Name='"+categoryname+"' ");
        List<Product> Product = new ArrayList<Product>();
         
          while (res.next()) {
               Product person = new Product();
            //person.setId(res.getInt("ProductID"));
               person.setName(res.getString("ProductName"));
          // person.setSupplierName(res.getString("SupplierName"));
              person.setQuantity(res.getInt("Quantity"));
              // person.setCategoryId(res.getInt("CategoryID"));
               person.setPrice(res.getInt("Price"));
                
                Product.add(person); 
            }
        
        return Product;
                                          
    
}
    
    }

public List<Product> searchByCatecory(String item, String category) throws SQLException{
        Statement BT;
    ConnectionDB WE4 =new ConnectionDB();
    Statement BT1;
    ConnectionDB WE3 =new ConnectionDB();
		if (category.equals("All")) {
                     BT=WE4.openconnection().createStatement();
        ResultSet we=BT.executeQuery("select p.ProductName,p.Price,p.Quantity from product as p where p.ProductName like '%%' '"+item+"' '%%' " );
        List<Product> Product1 = new ArrayList<Product>();
          
          while (we.next()) {
               Product person1 = new Product();
            //person.setId(res.getInt("ProductID"));
               person1.setName(we.getString("ProductName"));
          // person.setSupplierName(res.getString("SupplierName"));
              person1.setQuantity(we.getInt("Quantity"));
              // person.setCategoryId(res.getInt("CategoryID"));
               person1.setPrice(we.getInt("Price"));
                
                Product1.add(person1); 
            }
        
        return Product1;
                                            
}
			
		 else {
		        BT1=WE3.openconnection().createStatement();
        ResultSet ui=BT1.executeQuery("select p.ProductName,p.Price,p.Quantity from product as p,category as c where p.CategoryID=c.ID  and c.Name='"+category+"' " + "and p.ProductName like '%%' '"+item+"' '%%' ");
        List<Product> Product2 = new ArrayList<Product>();
          
          while (ui.next()) {
               Product person2 = new Product();
            //person.setId(res.getInt("ProductID"));
               person2.setName(ui.getString("ProductName"));
          // person.setSupplierName(res.getString("SupplierName"));
              person2.setQuantity(ui.getInt("Quantity"));
              // person.setCategoryId(res.getInt("CategoryID"));
               person2.setPrice(ui.getInt("Price"));
                
                Product2.add(person2); 
            }
        
        return Product2;	
		}
		
	}
}
