package week12.video13.controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import week12.video13.data.EmployeeRepository;
import week12.video13.model.Employee;

public class EmployeeController {

	@FXML
	TextField idTextField, nameTextField, icNumberTextField, salaryTextField;
	
	@FXML
	DatePicker startDateDatePicker;
	
	@FXML
	ListView<Employee> employeesListView;
	
	@FXML
	Button addButton, cancelEditButton, editButton, deleteButton;
	
	public void initialize() {
		employeesListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
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
			resetEmployeeFields();
			
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
			
			idTextField.setDisable(true);
			addButton.setDisable(true);
			cancelEditButton.setVisible(true);
			editButton.setDisable(false);
			deleteButton.setDisable(false);
		}
	}
	
	public void cancelEditEmployee() {
		employeesListView.getSelectionModel().clearSelection();
		resetEmployeeButtons();
		resetEmployeeFields();
	}
	
	public void editEmployee() {
		String newName = nameTextField.getText();
		String newIcNumber = icNumberTextField.getText();
		double newSalary = Double.parseDouble(salaryTextField.getText());
		Calendar newStartDate = datePickerToCalendar(startDateDatePicker.getValue());
		
		Employee employee = employeesListView.getSelectionModel().getSelectedItem();
		employee.setName(newName);
		employee.setIcNumber(newIcNumber);
		employee.setSalary(newSalary);
		employee.setStartDate(newStartDate);
		boolean success = EmployeeRepository.editEmployee(employee);
		if(success) {
			cancelEditEmployee();
			idTextField.requestFocus();
		}
	}
	
	public void deleteEmployees() {
		List<Employee> employees = employeesListView.getSelectionModel().getSelectedItems();
		boolean success = EmployeeRepository.deleteEmployees(employees);
		if(success) {
			employeesListView.getItems().removeAll(employees);
			cancelEditEmployee();
			idTextField.requestFocus();
		}
	}
	
	public Calendar datePickerToCalendar(LocalDate localDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(localDate.getYear(), localDate.getMonthValue()-1, localDate.getDayOfMonth());
		System.out.println(calendar);
		return calendar;
	}
	
	public void resetEmployeeFields() {
		idTextField.clear();
		nameTextField.clear();
		icNumberTextField.clear();
		salaryTextField.clear();
		startDateDatePicker.setValue(null);
	}
	
	public void resetEmployeeButtons() {
		idTextField.setDisable(false);
		addButton.setDisable(false);
		cancelEditButton.setVisible(false);
		editButton.setDisable(true);
		deleteButton.setDisable(true);
	}
	
}
