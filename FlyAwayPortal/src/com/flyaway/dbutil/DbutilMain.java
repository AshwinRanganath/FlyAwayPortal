package com.flyaway.dbutil;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DbutilMain {

	public static void main(String[] args) {
		
		System.out.println("Before");
		try {
			Connection con=DBConnection.getConnection();
			System.out.println(con);
			Statement st=con.createStatement();
			String sql="select * from login";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getString("username"));
			}
			con.close();
			System.out.println("You are here");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		
	}

}
