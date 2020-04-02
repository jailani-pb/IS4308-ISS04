package week11.video7.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

	@FXML
	TextField usernameTextField;
	
	@FXML
	PasswordField passwordPasswordField;
	
	public void submitLogin() throws Exception {
		String username = usernameTextField.getText();
		String password = passwordPasswordField.getText();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://jailanirahman.com/ADP", "jailaniteachesmysql", 
				"abc123");
		Statement statement = connection.createStatement();
		// SELECT * FROM users WHERE username='dsadsa' and password=SHA2('dasdas',256)
		ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE username='" + username + "' and password=SHA2('"
				+ password + "',256)");
		if(resultSet.next()) {
			System.out.println("Able to login");
		} else {
			System.out.println("Unable to login");
		}
		
	}
	
}
