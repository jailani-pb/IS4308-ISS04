package week12.video11.controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import week12.video11.data.EmployeeRepository;
import week12.video11.model.Employee;

public class EmployeeController {

	@FXML
	TextField idTextField, nameTextField, icNumberTextField, salaryTextField;
	
	@FXML
	DatePicker startDateDatePicker;
	
	@FXML
	ListView<Employee> employeesListView;
	
	public void initialize() {
		ArrayList<Employee> employees = EmployeeRepository.getEmployees();
		if(employees != null) {			
			employeesListView.getItems().addAll(employees);
		}
	}
	
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
	
	public void showEmployeeDetails() {
		Employee employee = employeesListView.getSelectionModel().getSelectedItem();
		if(employee != null) {
			idTextField.setText("" + employee.getId());
			nameTextField.setText(employee.getName());
			icNumberTextField.setText(employee.getIcNumber());
			salaryTextField.setText("" + employee.getSalary());
			startDateDatePicker.setValue(employee.getStartDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
		}
	}
	
	public Calendar datePickerToCalendar(LocalDate localDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
		return calendar;
	}
	
}
