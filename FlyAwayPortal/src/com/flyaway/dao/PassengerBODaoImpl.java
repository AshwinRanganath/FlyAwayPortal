package com.flyaway.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.flyaway.dbutil.DBConnection;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.passenger.Passenger;

public class PassengerBODaoImpl implements PassengerBODao{

	@Override
	public boolean createPassenger(Passenger p) throws FlyawayException {
		boolean b=false;
		try(Connection conn=DBConnection.getConnection())
		{
			String sql= "{CALL insert_passenger(?,?,?,?)}";
			CallableStatement cs=conn.prepareCall(sql);
			cs.setString(1, p.getP_name());
			cs.setString(2, p.getP_sex());
			cs.setString(3, p.getUser_name());
			cs.setInt(4, p.getP_age());
			cs.execute();
			b=true;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public boolean updatePassenger(Passenger p) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePassenger(Passenger p) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean searchPassenger(Passenger p) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

}
