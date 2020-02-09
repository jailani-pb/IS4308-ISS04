package week05.slot01.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LoginController {

	@FXML Label errorLabel;
	
	public void clear() {
//		System.out.println("Clear");
		errorLabel.setText("Clear");
	}
	
	public void submit() {
//		System.out.println("Submit");
		errorLabel.setText("Submit");
	}
	
}
