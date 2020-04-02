package week12.video10.controller;

import java.time.LocalDate;
import java.util.Calendar;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import week12.video10.data.EmployeeRepository;
import week12.video10.model.Employee;

public class EmployeeController {

	@FXML
	TextField idTextField, nameTextField, icNumberTextField, salaryTextField;
	
	@FXML
	DatePicker startDateDatePicker;
	
	@FXML
	ListView<Employee> employeesListView;
	
	public void addEmployee() {
		int id = Integer.parseInt(idTextField.getText());
		String name = nameTextField.getText();
		String icNumber = icNumberTextField.getText();
		double salary = Double.parseDouble(salaryTextField.getText());
		Calendar startDate = datePickerToCalendar(startDateDatePicker.getValue());
		
		Employee employee = new Employee(id, icNumber, name, salary, startDate);
		boolean success = EmployeeRepository.addEmployee(employee);
		if(success) {
			idTextField.clear();
			nameTextField.clear();
			icNumberTextField.clear();
			salaryTextField.clear();
			startDateDatePicker.setValue(null);
			
			employeesListView.getItems().add(employee);
		}
	}
	
	public Calendar datePickerToCalendar(LocalDate localDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
		return calendar;
	}
	
}
