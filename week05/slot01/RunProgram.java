package week05.slot01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RunProgram extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		FXMLLoader fxmlLoader = 
			new FXMLLoader(
					getClass().getResource("./view/Login.fxml"));
		VBox root = fxmlLoader.load();
		Scene scene = new Scene(root, 500, 500);
		arg0.setScene(scene);
		arg0.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
