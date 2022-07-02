package marketPlace.ViewControl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import marketPlace.Controller.MyCartController;
import marketPlace.Controller.MyProfileController;
import marketPlace.Model.TableCartModel;

public class BuyConfirmation {

	@FXML
	private Button cancelBtn;
	@FXML
	private Button yesBtn;

	public void clickCancel(Event e) {
		MyCartViewController.confirmationStage.close();
	}

	public void clickYes(Event e) throws SQLException {
		if (enoughBalance() != -1) {
			// delete from cart
			List<TableCartModel> deleteItems = deleteSelectedAndCloseWindow();
			(new MyCartController()).deleteProductsFromCartTable(LoginViewControl.cAccount.getUserName(), deleteItems, deleteItems.size());
			// add to order
			(new MyCartController()).addProducstoOrder(LoginViewControl.cAccount.getUserName(), deleteItems, deleteItems.size());
		} else {
			JOptionPane.showMessageDialog(null, "You don't have enough balance.", "Error", JOptionPane.ERROR_MESSAGE);

		}

	}

	public int enoughBalance() throws SQLException {
		ObservableList<TableCartModel> obList = MyCartViewController.obList;
		int totalPrice = 0;
		int balance = (new MyProfileController()).getBalance(LoginViewControl.cAccount.getUserName());

		for (TableCartModel row : obList) {
			if (row.getSelect().isSelected()) {
				totalPrice += row.getTotalPrice();
			}
		}
		if (balance > totalPrice) {
			return totalPrice;
		}

		return -1;
	}

	public List<TableCartModel> deleteSelectedAndCloseWindow() {
//		ObservableList<TableCartModel> selectedProducts = FXCollections.observableArrayList();
		List<TableCartModel> selectedProducts = new ArrayList<TableCartModel>();
		ObservableList<TableCartModel> obList = MyCartViewController.obList;
		for (TableCartModel row : obList) {
			if (row.getSelect().isSelected()) {
				selectedProducts.add(row);
			}
		}
		obList.removeAll(selectedProducts);
		MyCartViewController.confirmationStage.close();
		return selectedProducts;
	}

}
