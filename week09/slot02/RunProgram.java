package week09.slot02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class RunProgram extends Application {

	public static Stage mainStage;
	
	@Override
	public void start(Stage arg0) throws Exception {
//		FXMLLoader fxmlLoader = 
//			new FXMLLoader(
//					getClass().getResource("./view/Login.fxml"));
//		VBox root = fxmlLoader.load();
		
		FXMLLoader fxmlLoader =
			new FXMLLoader(
					getClass().getResource(
							"./view/Dashboard.fxml"));
		GridPane root = fxmlLoader.load();
		
//		Scene scene = new Scene(root, 500, 500);
		Scene scene = new Scene(root, 600, 500);
		arg0.setScene(scene);
		mainStage = arg0;
		arg0.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
