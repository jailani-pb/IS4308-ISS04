package week05.slot02.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DashboardController {

	@FXML Label welcomeLabel;
	
	public void updateWelcomeLabel(String username) {
		welcomeLabel.setText(welcomeLabel.getText() + ", " + username);
	}
	
}
