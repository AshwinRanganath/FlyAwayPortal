package com.flyaway.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
 private static Connection conn;
 public static Connection getConnection() throws SQLException, ClassNotFoundException
 {
	//Class.forName("com.mysql.jdbc.Driver");//com.mysql.cj.jdbc.Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/flyaway?noAccessToProcedureBodies=true";
	String username="root";
	String password="admin";
	
			
	return conn=DriverManager.getConnection(url, username, password);
	 
 }
}
