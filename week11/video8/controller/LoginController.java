package week11.video8.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import week11.video8.RunProgram;

public class LoginController {

	@FXML
	TextField usernameTextField;
	
	@FXML
	PasswordField passwordPasswordField;
	
	@FXML
	Label warningLabel;
	
	public void submitLogin() throws Exception {
		String username = usernameTextField.getText();
		String password = passwordPasswordField.getText();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://jailanirahman.com/ADP", "jailaniteachesmysql", 
				"abc123");
		PreparedStatement preparedStatement = connection.prepareStatement(
				"SELECT * FROM users WHERE username=? and password=SHA2(?,256)");
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/Dashboard.fxml"));
			Parent root = fxmlLoader.load();
			Scene scene = new Scene(root, 800, 600);
			RunProgram.primaryStage.setScene(scene);
		} else {
			warningLabel.setText("Unable to login");
			warningLabel.setStyle("-fx-text-fill: red");
		}
		
	}
	
	public void clear() {
		warningLabel.setText("");
		usernameTextField.setText("");
		passwordPasswordField.setText("");
	}
	
}
