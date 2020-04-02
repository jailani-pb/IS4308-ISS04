package week11.video7.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;

public class DashboardController {

	@FXML
	ScrollPane scrollPane;
	
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

}
