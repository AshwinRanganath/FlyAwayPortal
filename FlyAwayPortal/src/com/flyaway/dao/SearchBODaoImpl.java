package com.flyaway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.flyaway.dbutil.DBConnection;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.flight.Flights;
import com.flyaway.model.search.Search;

public class SearchBODaoImpl implements SearchBODao{

	@Override
	public List<Flights> searchFlyaway(Search s) throws FlyawayException {
		List<Flights> l=new ArrayList<Flights>();
		try(Connection conn=DBConnection.getConnection())
		{
		  String sql="select master_s_d.source,master_s_d.destination,carrier.c_name,flights.fprice,flights.arrival_time_to_destination,flights.departure_from_source_time,flights.available,flights.f_id,flights.c_id,flights.m_sd_id from flights,master_s_d,carrier where flights.m_sd_id=sd_id and flights.c_id=carrier.cid and master_s_d.source=? and master_s_d.destination=?";
		  PreparedStatement ps=conn.prepareStatement(sql);
		  ps.setString(1,s.getSource());
		  ps.setString(2, s.getDestination());
		  ResultSet rs=ps.executeQuery();
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
		  }
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	public Flights getFlight(int flid) throws FlyawayException
	{
		Flights f=new Flights();
		try(Connection conn=DBConnection.getConnection())
		{
		  String sql="select master_s_d.source,master_s_d.destination,carrier.c_name as airlines,flights.fprice,flights.arrival_time_to_destination as arrival,flights.departure_from_source_time as departure,flights.available,flights.f_id from flights,master_s_d,carrier where flights.m_sd_id=sd_id and flights.c_id=carrier.cid and flights.f_id=?;";
		  PreparedStatement ps=conn.prepareStatement(sql);
		  ps.setInt(1, flid);
		  ResultSet rs=ps.executeQuery();
		  while(rs.next())
		  {
			  f.setSource(rs.getString("source"));
			  f.setDestination(rs.getString("destination"));
			  f.setAirlines(rs.getString("airlines"));
			  f.setFprice(rs.getDouble("fprice"));
			  f.setFid(rs.getInt("f_id"));
			  f.setArrival_time_to_destination(rs.getString("arrival"));
			  f.setDestination_from_source_time(rs.getString("departure"));
			  f.setAvailable(rs.getString("available"));			  
			  
		  }
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return f;
		
	}


}
