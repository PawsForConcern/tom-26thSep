package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecord {
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/javadb";
			String userName="root";
			String password="pass";
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connected successfully");
			String query = "delete from customer where id=107;";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Customer 107 deleted successfully");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Something went wrong");
		}
	}
}
