package week11.video7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RunProgram extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("./view/Login.fxml"));
		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root, 800, 600);
		arg0.setTitle("Login Page");
		arg0.setScene(scene);
		arg0.setResizable(false);
		arg0.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
