package week12.video10.data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import week12.video10.model.Employee;

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
	
}
