package com.flyaway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.flyaway.dbutil.DBConnection;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.flight.Flights;

public class FlightsBODaoImpl implements FlightsBODao{

	@Override
	public List<Flights> searchFlights() throws FlyawayException {
		List<Flights> l=new ArrayList<Flights>();
		try(Connection conn=DBConnection.getConnection())
		{
		String sql="select master_s_d.source,master_s_d.destination,carrier.c_name,flights.fprice,flights.arrival_time_to_destination,flights.departure_from_source_time,flights.available,flights.f_id,flights.c_id,flights.m_sd_id from flights,master_s_d,carrier where flights.m_sd_id=sd_id and flights.c_id=carrier.cid";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			Flights f=new Flights();
			f.setSource(rs.getString("source"));				
		    f.setDestination(rs.getString("destination"));
		    f.setAirlines(rs.getString("c_name"));
		    f.setFprice(rs.getDouble("fprice"));
		    f.setArrival_time_to_destination(rs.getString("arrival_time_to_destination"));
		    f.setDestination_from_source_time(rs.getString("departure_from_source_time"));
		    f.setAvailable(rs.getString("available"));
		    f.setFid(rs.getInt("f_id"));
		    f.setCid(rs.getInt("c_id"));
		    f.setM_sd_id(rs.getInt("m_sd_id"));
			l.add(f);
			System.out.println(f);
		}
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	public static String lookupSource(int sid) throws FlyawayException
	{
		String s=null;
		try(Connection con=DBConnection.getConnection())
		{
		
	      String sql="select source from master_s_d where sd_id = ?";
	      PreparedStatement ps=con.prepareStatement(sql);
	      ps.setInt(1, sid);
	      ResultSet rs=ps.executeQuery();
	      s=rs.getString("source");
	      System.out.println("-----------source:"+s);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
	}
	public static String lookupDestination(int sid) throws FlyawayException
	{
		String s=null;
		try(Connection conn=DBConnection.getConnection())
		{
		
	      String sql="select destination from master_s_d where sd_id = ?";
	      PreparedStatement ps=conn.prepareStatement(sql);
	      ps.setInt(1, sid);
	      ResultSet rs=ps.executeQuery();	     
	      s=rs.getString("destination");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
	}
	public static String lookupCarrier(int cid) throws FlyawayException
	{
	    String s=null;
		try(Connection conn=DBConnection.getConnection())
		{
		
	      String sql="select c_name from carrier where cid=?";
	      PreparedStatement ps=conn.prepareStatement(sql);
	      ps.setInt(1, cid);
	      ResultSet rs=ps.executeQuery();
	      s=rs.getString("c_name");
	  
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	

}
