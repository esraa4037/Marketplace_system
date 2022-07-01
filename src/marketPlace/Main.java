package marketPlace;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//------------
import java.io.IOException;
import java.net.Socket;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static marketPlace.MyInfo.socket;
//-------------

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/marketPlace/View/Login.fxml"));
			Scene scene = new Scene(root);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Market Place");
			primaryStage.setScene(scene);
			primaryStage.show();
			//------------------
//			if(!MyInfo.socketConnect) {
//		        final String SERVER_IP = "192.168.1.16";
//		        final int SERVER_PORT = 8080;
//		        socket = new Socket();
//                        try { 
//                               socket = new Socket(SERVER_IP,SERVER_PORT);       
//                             // socket.connect( new InetSocketAddress(SERVER_IP, SERVER_PORT) );
//                               System.out.println("success connection to server");
//                              MyInfo.setConnect(true);
//                              MyInfo.setSocket(socket);
//                            }
//                        catch (IOException e) {
//                             e.printStackTrace();
//                         }
//	         }
			
			
			
			//-------------------
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
