package marketPlace.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import marketPlace.Model.obj;

public class TransactionsController {

	public ObservableList<obj> historyOfClient(String clientUserName) {
		ObservableList<obj> obList = FXCollections.observableArrayList();
		obj obj = new obj();
		obj.setOrderid(0);
		obj.setProductid(697);
		obj.setName("Galaxy A-51");
		obj.setQuantity(90);
		obj.setOrdereddate("5-12-2022");
		obj.setSupplierName("Samsung");
		obList.add(obj);

		obj.setOrderid(0);
		obj.setProductid(697);
		obj.setName("Galaxy A-51");
		obj.setQuantity(90);
		obj.setOrdereddate("5-12-2022");
		obj.setSupplierName("Samsung");
		obList.add(obj);

		obj.setOrderid(0);
		obj.setProductid(697);
		obj.setName("Galaxy A-51");
		obj.setQuantity(90);
		obj.setOrdereddate("5-12-2022");
		obj.setSupplierName("Samsung");
		obList.add(obj);

		obj.setOrderid(0);
		obj.setProductid(697);
		obj.setName("Galaxy A-51");
		obj.setQuantity(90);
		obj.setOrdereddate("5-12-2022");
		obj.setSupplierName("Samsung");
		obList.add(obj);
		
		return obList;
	}
	
	public ObservableList<obj> historyTransaction(String clientUserName) {
		ObservableList<obj> obList = FXCollections.observableArrayList();
		obj obj = new obj();
		obj.setOrderid(0);
		obj.setProductid(697);
		obj.setName("Galaxy A-51");
		obj.setQuantity(90);
		obj.setOrdereddate("5-12-2022");
		obj.setSupplierName("Samsung");
		obj.setFirstName("Ahmed");
		obj.setClientid(150);
		obList.add(obj);

		obj.setFirstName("Ahmed");
		obj.setClientid(150);
		obj.setOrderid(0);
		obj.setProductid(697);
		obj.setName("Galaxy A-51");
		obj.setQuantity(90);
		obj.setOrdereddate("5-12-2022");
		obj.setSupplierName("Samsung");
		obList.add(obj);

		obj.setFirstName("Ahmed");
		obj.setClientid(150);
		obj.setOrderid(0);
		obj.setProductid(697);
		obj.setName("Galaxy A-51");
		obj.setQuantity(90);
		obj.setOrdereddate("5-12-2022");
		obj.setSupplierName("Samsung");
		obList.add(obj);

		obj.setFirstName("Ahmed");
		obj.setClientid(150);
		obj.setOrderid(0);
		obj.setProductid(697);
		obj.setName("Galaxy A-51");
		obj.setQuantity(90);
		obj.setOrdereddate("5-12-2022");
		obj.setSupplierName("Samsung");
		obList.add(obj);
		
		return obList;
	}
	
	
}
