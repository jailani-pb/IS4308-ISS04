package week12.video13.data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import week12.video13.model.Employee;

public class EmployeeRepository {

	public static Connection connectDatabase() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://jailanirahman.com/ADP", "jailaniteachesmysql", "abc123");
		return connection;
	}
	
	public static boolean addEmployee(Employee employee) {
		if(employee != null) {
			try {
				PreparedStatement preparedStatement = connectDatabase().prepareStatement(
						"INSERT INTO employees VALUES (?, ?, ?, ?, ?)");
				preparedStatement.setInt(1, employee.getId());
				preparedStatement.setString(2, employee.getIcNumber());
				preparedStatement.setString(3, employee.getName());
				preparedStatement.setDouble(4, employee.getSalary());
				preparedStatement.setDate(5, new Date(employee.getStartDate().getTimeInMillis()));
				preparedStatement.executeUpdate();
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		return false;
	}
	
	public static ArrayList<Employee> getEmployees() {
		try {
			ArrayList<Employee> employees = new ArrayList<Employee>();
			Statement statement = connectDatabase().createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");
			while(resultSet.next()) {
				Calendar startDate = Calendar.getInstance();
				startDate.setTime(resultSet.getDate(5));
				Employee employee = new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getDouble(4), startDate);
				employees.add(employee);
			}
			return employees;
		} catch (Exception e) {
			return null;
		}
	}
	
	public static boolean editEmployee(Employee employee) {
		if(employee != null) {
			try {
				PreparedStatement preparedStatement = connectDatabase().prepareStatement(
						"UPDATE employees SET ic_number=?, name=?, salary=?, start_date=? WHERE id=?");
				preparedStatement.setString(1, employee.getIcNumber());
				preparedStatement.setString(2, employee.getName());
				preparedStatement.setDouble(3, employee.getSalary());
				preparedStatement.setDate(4, new Date(employee.getStartDate().getTimeInMillis()));
				preparedStatement.setInt(5, employee.getId());
				preparedStatement.executeUpdate();
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		return false;
	}
	
	public static boolean deleteEmployees(List<Employee> employees) {
		if(employees != null) {
			for(Employee employee : employees) {
				try {
					PreparedStatement preparedStatement = connectDatabase().prepareStatement(
							"DELETE FROM employees WHERE id=?");
					preparedStatement.setInt(1, employee.getId());
					preparedStatement.executeUpdate();
				} catch (Exception e) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
}
