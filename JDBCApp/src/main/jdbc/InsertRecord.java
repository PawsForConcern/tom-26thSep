package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/javadb";
			String userName="root";
			String password="pass";
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connected successfully");
			String query = "insert into customer values(106,'Edith',9999,'e@gmail.com');";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Edith added successfully");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Something went wrong");
		}
	}
}
