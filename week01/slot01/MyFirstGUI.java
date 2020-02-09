package week01.slot01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MyFirstGUI extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		Button button = new Button("Hello");
		Scene scene = new Scene(button, 800, 600);
		arg0.setScene(scene);
		arg0.show();
		
		Stage secondStage = new Stage();
		TextField textField = new TextField();
		Scene secondScene = new Scene(textField, 400, 400);
		secondStage.setScene(secondScene);
		secondStage.show();
	}
	
}
