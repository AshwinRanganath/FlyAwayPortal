package com.flyaway.dao;
import com.flyaway.bo.CarrierBO;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.carrier.Carrier;
import com.flyaway.model.sd.Master_s_d;
import com.flyaway.dbutil.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CarrierBODaoImpl implements CarrierBO{

	@Override
	public boolean createCarrier(Carrier c) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCarrier(Carrier c) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCarrier(Carrier c) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Carrier> searchCarrier() throws FlyawayException {
		
		List<Carrier> ml=new ArrayList<Carrier>();
		try(Connection conn=DBConnection.getConnection())
		{
			String sql="select * from carrier";
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			//List<Carrier> ml=new ArrayList<Carrier>();
			
			while(rs.next())
			{
			  Carrier c=new Carrier();
			  c.setCid((rs.getInt("cid")));	
			  c.setCname((rs.getString("c_name")));
			  c.setFid((rs.getInt("fid")));
			  System.out.println("c:"+c);
			  ml.add(c);
			  System.out.println("ml in while"+ml);
			}
			System.out.println("List ml:"+ml); 
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ml;
	}
	

}
