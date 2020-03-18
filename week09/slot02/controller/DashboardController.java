package week09.slot02.controller;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import week09.slot02.model.Student;

public class DashboardController {

	@FXML Label welcomeLabel;
	@FXML TextField idTextField, firstNameTextField, lastNameTextField, icNumberTextField;
	@FXML ComboBox<String> icColourComboBox;
	@FXML RadioButton maleRadioButton, femaleRadioButton;
	@FXML CheckBox activeCheckBox;
	@FXML ListView<Student> studentsListView;
	
	public void addStudent() {
		String id = idTextField.getText();
		String firstName = firstNameTextField.getText();
		String lastName = lastNameTextField.getText();
		String icNumber = icNumberTextField.getText();
		String icColour = icColourComboBox.getSelectionModel().getSelectedItem();
		String gender = "";
		if(maleRadioButton.isSelected()) {
			gender = "male";
		}
		if(femaleRadioButton.isSelected()) {
			gender = "female";
		}
		boolean active = activeCheckBox.isSelected();
		
//		System.out.println(id + ", " + firstName + ", " + lastName + ", " + icNumber
//				+ ", " + icColour + ", " + gender + ", " + active);
		Student addStudent = new Student(id, firstName, lastName, icNumber, icColour,
				gender, active);
		studentsListView.getItems().add(addStudent);
		
		idTextField.setText("");
		firstNameTextField.setText("");
		lastNameTextField.setText("");
		icNumberTextField.setText("");
		icColourComboBox.getSelectionModel().clearSelection();
		maleRadioButton.setSelected(true);
		activeCheckBox.setSelected(true);
	}
	
	public void deleteStudent() {
		int index = studentsListView.getSelectionModel().getSelectedIndex();
		if(index >= 0) {			
			studentsListView.getItems().remove(index);
		}
	}
	
	public void updateWelcomeLabel(String username) {
		welcomeLabel.setText(welcomeLabel.getText() + ", " + username);
	}
	
}
