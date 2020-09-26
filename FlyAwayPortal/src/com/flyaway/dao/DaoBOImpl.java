package com.flyaway.dao;
import com.flyaway.dao.DaoBO;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.login.Login;
import com.flyaway.dbutil.DBConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DaoBOImpl implements DaoBO
{

	

	@Override
	public boolean isValidUser(Login l) throws FlyawayException {
		// TODO Auto-generated method stub
		boolean b=false;
		try( Connection conn=DBConnection.getConnection())
		{
		    
			String sql="select username from login where username=? and password=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, l.getUsername());
			ps.setString(2, l.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
			 b=true;	
			}
			else
			{
				throw new FlyawayException("Invalid User");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
	
	/**
	 * @param l
	 * @return
	 * @throws FlyawayException
	 * @throws SQLException
	 */
	public boolean insertUser(Login l) throws FlyawayException,SQLException
	{
		boolean b=false;
		try( Connection conn=DBConnection.getConnection())
		{
		    
			String sql="{CALL insert_login(?,?,?,?,?,?,?)}";
			CallableStatement cs=conn.prepareCall(sql);
			cs.setString(1,l.getName());
			cs.setString(2,l.getGender());
			cs.setString(3,l.getUsername());
			cs.setString(4,l.getContact());
			cs.setString(5,l.getPassword());
			cs.setString(6,l.getEmail());
			cs.setString(7,"user");		

			cs.execute();
			b=true;
			System.out.println("Call procedure :"+b);
		
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return b; 
		
	}
public boolean changePassword(String u, String p) throws FlyawayException
{
	boolean cp=false;
	try( Connection conn=DBConnection.getConnection())
	{
	    
		String sql="{CALL updatePassword(?,?)}";
		CallableStatement cs=conn.prepareCall(sql);
		cs.setString(1,u);
		cs.setString(2,p);		
		cs.execute();
		cp=true;
		System.out.println("Call procedure change password :"+cp);
	
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return cp;
	
}
		

	
}

	

