package com.flyaway.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.flyaway.dbutil.DBConnection;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.ticket.Ticket;

public class TicketBODaoImpl implements TicketBODao{

	@Override
	public Ticket createTicket(Ticket t) throws FlyawayException {
		boolean b=false;
		
		try(Connection conn=DBConnection.getConnection())
		{
		String sql="{CALL insert_tickets(?,?,?,?,?,?,?,?)}"	;
		CallableStatement cs=conn.prepareCall(sql);
		cs.setInt(1,t.getFlight_id());
		cs.setString(2,t.getU_name());
		cs.setString(3, t.getDate_of_travel());
		cs.setInt(4,t.getPassenger_age());
		cs.setString(5, t.getPassenger_name());
		cs.setString(6, t.getPassenger_sex());
		cs.setString(7, t.getPayment_status());
		cs.registerOutParameter(8, java.sql.Types.NUMERIC);
		//cs.registerOutParameter("tid", java.sql.Types.NUMERIC);
		cs.execute();
		b=true;
		t.setTid(cs.getInt(8));
		if(b==false)
		{
			throw new FlyawayException("Issue with DB");
		}
		System.out.println(cs.getInt(8)+"");
		//t.setTid(cs.getInt("tid"));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

	@Override
	public boolean deleteTicket(Ticket t) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTicket(Ticket t) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean searchTicket(Ticket t) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

}
