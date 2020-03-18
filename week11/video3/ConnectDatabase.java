package week11.video3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Connecting to Own Laptop MySQL server.
//		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/adp", "root", "Mypassword123-");
		// Connecting to MySQL server at jailanirahman.com
		Connection connection = DriverManager.getConnection("jdbc:mysql://jailanirahman.com/ADP", "jailaniteachesmysql", 
				"temppassword");
	}
	
}
