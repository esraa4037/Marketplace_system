package marketPlace.Controller;

import java.util.ArrayList;
import java.util.List;

import marketPlace.Model.TableCartModel;

public class MyCartController {
	
	public List<TableCartModel> getCartTableContent(String clientUserName){
		
		TableCartModel entry1 = new TableCartModel(50, "pants", 20, 1, 20);
		TableCartModel entry2 = new TableCartModel(23, "X Box", 300, 1, 300);
	
		List<TableCartModel> list = new ArrayList<TableCartModel>();
		list.add(entry1);
		list.add(entry2);
		list.add(entry1);
		list.add(entry2);
		list.add(entry1);
		list.add(entry2);
		list.add(entry1);
		list.add(entry2);
		list.add(entry1);
		list.add(entry2);
		list.add(entry1);
		list.add(entry2);
		
		return list;
	}
	
	
}
