package week12.video12.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import week12.video12.RunProgram;

public class DashboardController {

	@FXML
	ScrollPane scrollPane;
	
	@FXML
	Label welcomeLabel;
	
	@FXML public void departmentPage() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/Department.fxml"));
		Parent root = fxmlLoader.load();
		scrollPane.setContent(root);
	}

	@FXML public void employeePage() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/Employee.fxml"));
		Parent root = fxmlLoader.load();
		scrollPane.setContent(root);
	}
	
	@FXML public void appraisalPage() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/Appraisal.fxml"));
		Parent root = fxmlLoader.load();
		scrollPane.setContent(root);
	}
	
	@FXML public void workAtPage() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/WorkAt.fxml"));
		Parent root = fxmlLoader.load();
		scrollPane.setContent(root);
	}
	
	public void logout() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/Login.fxml"));
		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root, 800, 600);
		RunProgram.primaryStage.setScene(scene);
		RunProgram.primaryStage.show();
	}
	
	public void setUsername(String username) {
		welcomeLabel.setText("Welcome " + username);
	}

}
