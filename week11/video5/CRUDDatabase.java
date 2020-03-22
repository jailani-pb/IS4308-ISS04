package week11.video5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://jailanirahman.com/ADP", "jailaniteachesmysql", 
				"abc123");
		Statement statement = connection.createStatement();
		// Add data (C part of CRUD)
//		statement.executeUpdate("INSERT INTO employees VALUES (20001, '00-123456', 'Jailani', 2000.99, '2011-01-01')");
//		statement.executeUpdate("INSERT INTO employees VALUES (20002, '00-654321', 'Rahman', 3000.99, '2010-01-01')");
		
		// Retrieve data (R part of CRUD)
//		ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");
//		while(resultSet.next()) {
//			System.out.println(resultSet.getInt(1) + " " + resultSet.getString(3) + " " + resultSet.getString(2) + " "
//					+ resultSet.getDouble(4) + " " + resultSet.getString(5));
//		}
//		
//		ResultSet resultSet2 = statement.executeQuery("SELECT id, name, salary FROM employees WHERE id=20001");
//		while(resultSet2.next()) {
//			System.out.println(resultSet2.getInt(1) + " " + resultSet2.getString(2) + " " + resultSet2.getDouble(3));
//		}
		
		// Update data (U part of CRUD)
//		statement.executeUpdate("UPDATE employees SET name='Abdul' WHERE id=20001");
		
		// Delete data (D part of CRUD)
//		statement.executeUpdate("DELETE FROM employees WHERE id=20001");
	}
	
}








