package week09.slot02.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import week09.slot02.RunProgram;

public class LoginController {

	@FXML Label errorLabel;
	@FXML TextField usernameTextField;
	@FXML PasswordField passwordPasswordField;
	
	public void clear() {
		usernameTextField.setText("");
		passwordPasswordField.setText("");
		errorLabel.setText("");
	}
	
	public void submit() throws IOException {
		String username = usernameTextField.getText();
		String password = passwordPasswordField.getText();
		if(username.equals("jailani") 
				&& password.equals("rahman")) {
			FXMLLoader fxmlLoader = new FXMLLoader(
					getClass().getResource(
						"../view/Dashboard.fxml"));
			GridPane root = fxmlLoader.load();
			
			DashboardController controller =
					fxmlLoader.getController();
			controller.updateWelcomeLabel(username);
			
			Scene scene = new Scene(root, 600, 500);
			RunProgram.mainStage.setScene(scene);
			
			
		} else {
			errorLabel.setText("Wrong username and password.");	
			errorLabel.setStyle("-fx-background-color: red");
		}
	}
	
}
